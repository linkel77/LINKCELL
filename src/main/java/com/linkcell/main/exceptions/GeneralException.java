package com.linkcell.main.exceptions;

import com.linkcell.main.dtos.ErrorDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Case para manejar los errores de Card
 */
public class GeneralException extends Exception{

    private final String code;

    private final int responseCode;

    private final List<ErrorDto> errorList = new ArrayList<>();

    public GeneralException(String code, int responseCode, String message) {
        super(message);
        this.code = code;
        this.responseCode = responseCode;
    }
    public GeneralException(String code, int responseCode, String message, List<ErrorDto> errorList) {
        super(message);
        this.code = code;
        this.responseCode = responseCode;
        errorList = errorList;
    }

    public String getCode() {
        return code;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public List<ErrorDto> getErrorList() {
        return errorList;
    }
}
