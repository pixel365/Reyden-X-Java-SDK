package com.reydenx.exceptions;

public class InternalErrorException extends ReydenXException {
    public InternalErrorException() {};

    public InternalErrorException(Throwable throwable) {
        super(throwable);
    };
}
