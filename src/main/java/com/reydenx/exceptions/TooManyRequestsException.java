package com.reydenx.exceptions;

public class TooManyRequestsException extends ReydenXException {
    public TooManyRequestsException() {};

    public TooManyRequestsException(Throwable throwable) {
        super(throwable);
    };
}
