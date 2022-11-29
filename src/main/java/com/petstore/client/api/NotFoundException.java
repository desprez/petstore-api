package com.petstore.client.api;

public class NotFoundException extends ApiException {

    private static final long serialVersionUID = -2831632075153675660L;

    public NotFoundException(final int code, final String msg) {
        super(code, msg);
    }
}
