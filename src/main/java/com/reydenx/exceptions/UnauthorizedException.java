package com.reydenx.exceptions;

public class UnauthorizedException extends ReydenXException {
    public UnauthorizedException() {};

    public UnauthorizedException(Throwable throwable) {
        super(throwable);
    };
}
