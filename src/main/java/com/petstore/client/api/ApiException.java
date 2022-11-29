package com.petstore.client.api;

public class ApiException extends Exception {

    private static final long serialVersionUID = 6189532417950183160L;

    protected final int code;

    public ApiException(final int code, final String msg) {
        super(msg);
        this.code = code;
    }
}
