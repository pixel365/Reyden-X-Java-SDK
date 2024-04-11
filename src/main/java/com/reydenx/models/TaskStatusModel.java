package com.reydenx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Task status model
 * 
 * @since 1.0
 * @see com.reydenx.impl.Action#taskStatus(Integer, String)
 */
@Getter
public class TaskStatusModel {
    /**
     * Task status
     */
    @JsonProperty("status")
    protected String status;
}
