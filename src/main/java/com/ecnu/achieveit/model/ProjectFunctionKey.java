package com.ecnu.achieveit.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * This class corresponds to the database table project_function
 */
@Getter
@Setter
@ToString
public class ProjectFunctionKey implements Serializable {

    private String projectId;

    private String primaryFunction;

    private String secondaryFunction;

    private static final long serialVersionUID = 1L;

}