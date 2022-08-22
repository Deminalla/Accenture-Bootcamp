package com.example.springboot;

public class Greeting {

    private final long id; // unique identifier for the greeting
    private final String content; // textual representation of the greeting

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}