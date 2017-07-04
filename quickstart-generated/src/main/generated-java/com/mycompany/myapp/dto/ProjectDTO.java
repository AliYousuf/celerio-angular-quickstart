/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/dto/EntityDTO.java.e.vm
 */
package com.mycompany.myapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Simple DTO for Project.
 */
public class ProjectDTO {
    public Integer id;
    public String name;
    public String url;
    public Boolean openSource;
    public AuthorDTO author;

    @JsonIgnore
    public boolean isIdSet() {
        return id != null;
    }
}