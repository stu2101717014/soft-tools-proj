package com.example.modulec;

public class BasicGreeting {

    private String basicGreetingMessage;

    public BasicGreeting(String basicGreetingMessage) {
        this.setBasicGreetingMessage(basicGreetingMessage);
    }

    public String getBasicGreetingMessage() {
        return basicGreetingMessage;
    }

    public void setBasicGreetingMessage(String basicGreetingMessage) {
        this.basicGreetingMessage = basicGreetingMessage;
    }
}
