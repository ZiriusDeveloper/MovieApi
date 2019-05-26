package com.zirius.zerp.movieApi.feign;

import com.zirius.zerp.movieApi.model.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@FeignClient(name = "omdb",url = "${app.omdb.url}")
public interface OMDBClient {

    @RequestMapping(value = "/?apikey={apikey}&s={s}&type={type}&y={year}", method = GET)
    @ResponseBody
    public String get(@PathVariable(value = "apikey",required = true) String apikey,
                                 @PathVariable(value = "s",required = true) String title,
                                 @PathVariable(value = "type") String type,
                                 @PathVariable("y") Integer year);

}
