package com.reydenx.exceptions;

public class NotFoundException extends ReydenXException {
    public NotFoundException() {};

    public NotFoundException(Throwable throwable) {
        super(throwable);
    };
}
