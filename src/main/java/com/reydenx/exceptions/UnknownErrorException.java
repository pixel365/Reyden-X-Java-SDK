package com.reydenx.exceptions;

public class UnknownErrorException extends ReydenXException {
    public UnknownErrorException() {};

    public UnknownErrorException(Throwable throwable) {
        super(throwable);
    };
}
