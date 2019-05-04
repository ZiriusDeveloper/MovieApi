package com.zirius.zerp.movieApi.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public abstract class ApiStepHandler {

    Gson gson;

    public ApiStepHandler(){
        this.gson = new Gson();
    }
    
    public abstract Object createRequest(Map<String, Object> inputs) throws Exception;
    public abstract Object callService(Object request) throws Exception;

    protected String getResponse(InputStream input) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(input));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		return response.toString();
	}
	
	protected Object deserializeResponse(String jsonString, Class classObj) {
		JsonObject respObject = new JsonParser().parse(jsonString).getAsJsonObject();
        Object deserializedObject = this.gson.fromJson(respObject.toString(), classObj);
		return deserializedObject;
    }
    
}