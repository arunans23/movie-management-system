package com.arunans23.mms.core;

public class Movie {
    private final long id;
    private final String name;

    public Movie(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}