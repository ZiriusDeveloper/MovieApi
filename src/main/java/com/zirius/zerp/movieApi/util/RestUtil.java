package com.zirius.zerp.movieApi.util;

import java.nio.charset.Charset;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestUtil.class);

    public static final String SUCCESS = "SUCCESS";
    public static final String ERROR = "ERROR";

    public static final String IN_PROGRESS = "INPROGRESS";
    public static final String IN_QUEUE = "REQUEST_IN_QUEUE";
    public static final String FAILED = "FAILED";

    /* Error codes Starts */
    public static final String MESSAGE_QUEUE_SEND_ERROR = "MESSAGE_QUEUE_SEND_ERROR";
    public static final String MESSAGE_QUEUE_RECEIVE_ERROR = "MESSAGE_QUEUE_RECEIVE_ERROR";

    /* Constants */
    public static final int MESSAGE_RETRY_DELAY = 5000;

    @Autowired
    static RestTemplate restTemplate;

    @Autowired
    static ObjectMapper objectMapper = new ObjectMapper();
    
    public static RestTemplate getInstance(String charset) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter(Charset.forName(charset)));
        return restTemplate;
    }

    /**
     * @param commonResponse
     * @param method
     * @param msgObject
     * @return
     * @throws ResponseEntity<Object>
     */
    public static ResponseEntity<Object> commonResponse(HttpStatus method, Object msgObject,String msg)
            throws JsonProcessingException {
        ApiResultCommon apiResultCommon = new ApiResultCommon();
        try {
            apiResultCommon.setStatus(""+method.value());
            apiResultCommon.setData(msgObject);
            apiResultCommon.setMessage(msg);

        } catch (Exception e) {
            LOGGER.error("Error while Constructing response {} method.", method, e);

        }
        return new ResponseEntity<Object>(objectMapper.writeValueAsString(apiResultCommon), method);
    }

    /**
     * @param commonWarning
     * @param http          method
     * @param warning       message
     * @return ResponseEntity<Object>
     * @throws JsonProcessingException
     */
    public static ResponseEntity<Object> commonWarning(HttpStatus method, String warning)
            throws JsonProcessingException {
        ApiResultWarning apiResultWarning = new ApiResultWarning();
        try {
            apiResultWarning.setStatus(""+method.value());
            apiResultWarning.setMessage(warning);

        } catch (Exception e) {
            LOGGER.error("Error while Constructing response {} method.", method, e);
        }
        return new ResponseEntity<Object>(objectMapper.writeValueAsString(apiResultWarning), method);
    }

    /**
     * @param callRestMethods
     * @param method
     * @param url
     * @param requestPayload
     * @return response from given url
     */
    public static ResponseEntity<String> callRestMethods(HttpMethod method, String url, HttpEntity<?> requestPayload) {
        ResponseEntity<String> response = null;

        LOGGER.info("callRestMethods url : {}", url);

        restTemplate = getInstance("utf-8");
        try {
            response = restTemplate.exchange(url, method, requestPayload, String.class);

        } catch (Exception e) {
            LOGGER.error("Error while calling REST {} method.", method, e);

        }
        return response;
    }
    
    public static String callRestMethods(String url, Object body, Map<String, Object> map) {
        String response = null;

        LOGGER.info("callRestMethods url : {}", url);

        restTemplate = getInstance("utf-8");
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
            HttpEntity<?> entity = new HttpEntity<>(body, headers);
            response = restTemplate.postForObject(url, entity, String.class, map);

        } catch (Exception e) {
            LOGGER.error("Error while calling REST {} method.", e);

        }
        return response;
    }


}
