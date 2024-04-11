package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Abstract Class for Identifier
 * 
 * @since 1.0
 */
@Getter
public abstract class AId {
    /**
     * Id
     */
    @JsonProperty("id")
    protected Integer id;
}
