package com.reydenx.exceptions;

public class BadRequestException extends ReydenXException {
    public BadRequestException() {};

    public BadRequestException(Throwable throwable) {
        super(throwable);
    };
}
