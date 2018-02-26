package com.arunans23.mms.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arunans23.mms.core.*;

@RestController
public class MovieController{
    private final AtomicLong counter = new AtomicLong();

    Movie demoMovie = new Movie(counter.incrementAndGet(), "Sample Movie");

    @RequestMapping(method = RequestMethod.GET, value="/movie")
    public Movie getMovie(@RequestParam(value="id", defaultValue = "0") int id){
        return demoMovie;
    }
}