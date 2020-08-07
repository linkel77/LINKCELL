package com.linkcell.main.dtos;

import java.io.Serializable;

public class ErrorDto implements Serializable {

    private String name;

    private String value;

    public String getName() {
        return name;
    }

    public ErrorDto(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
