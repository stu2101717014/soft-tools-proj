package com.example.modulea;

import com.example.moduleb.IntermediateGreeting;

public class AdvancedGreeting {
    private IntermediateGreeting intermediateGreeting;

    private String prerequisite;

    public AdvancedGreeting(IntermediateGreeting intermediateGreeting, String prerequisite) {
        this.intermediateGreeting = intermediateGreeting;
        this.prerequisite = prerequisite;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public IntermediateGreeting getIntermediateGreeting() {
        return intermediateGreeting;
    }

    public void setIntermediateGreeting(IntermediateGreeting intermediateGreeting) {
        this.intermediateGreeting = intermediateGreeting;
    }
}
