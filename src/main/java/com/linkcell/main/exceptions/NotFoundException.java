package com.linkcell.main.exceptions;

import com.linkcell.main.dtos.ErrorDto;
import org.springframework.http.HttpStatus;

import java.util.Arrays;

public class NotFoundException extends GeneralException{
    public NotFoundException(String code, String message) {
        super(code, HttpStatus.NOT_FOUND.value(),message);
    }
    public NotFoundException(String code, String message, ErrorDto data) {
        super(code, HttpStatus.NOT_FOUND.value(),message, Arrays.asList(data));
    }


}
