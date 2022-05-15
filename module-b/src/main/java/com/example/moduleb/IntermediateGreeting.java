package com.example.moduleb;

import com.example.modulec.BasicGreeting;

public class IntermediateGreeting {

    private BasicGreeting basicGreeting;

    private String additionalMessage;

    public IntermediateGreeting(BasicGreeting basicGreeting, String additionalMessage) {
        this.basicGreeting = basicGreeting;
        this.additionalMessage = additionalMessage;
    }

    public BasicGreeting getBasicGreeting() {
        return basicGreeting;
    }

    public void setBasicGreeting(BasicGreeting basicGreeting) {
        this.basicGreeting = basicGreeting;
    }

    public String getAdditionalMessage() {
        return additionalMessage;
    }

    public void setAdditionalMessage(String additionalMessage) {
        this.additionalMessage = additionalMessage;
    }
}
