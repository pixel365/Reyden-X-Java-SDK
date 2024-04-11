package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Abstract Class for datetime
 * 
 * @since 1.0
 */
@Getter
public abstract class ADate extends AId {
    /**
     * DateTime
     */
    @JsonProperty("created_at")
    protected String createdAt;

    /**
     * DateTime
     */
    @JsonProperty("updated_at")
    protected String updatedAt;
}
