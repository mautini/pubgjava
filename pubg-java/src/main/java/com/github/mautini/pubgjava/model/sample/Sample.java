package com.github.mautini.pubgjava.model.sample;

import com.github.mautini.pubgjava.model.generic.Entity;
import com.google.gson.annotations.SerializedName;

public class Sample extends Entity {

    @SerializedName("attributes")
    private SampleAttributes sampleAttributes;

    @SerializedName("relationships")
    private SampleRelationships sampleRelationships;

    public Sample() {
    }

    public SampleAttributes getSampleAttributes() {
        return sampleAttributes;
    }

    public void setSampleAttributes(SampleAttributes sampleAttributes) {
        this.sampleAttributes = sampleAttributes;
    }

    public SampleRelationships getSampleRelationships() {
        return sampleRelationships;
    }

    public void setSampleRelationships(SampleRelationships sampleRelationships) {
        this.sampleRelationships = sampleRelationships;
    }
}
