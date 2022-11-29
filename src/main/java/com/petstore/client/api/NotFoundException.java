package com.petstore.client.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-26T15:18:15.327+01:00")

public class NotFoundException extends ApiException {

    private final int code;

    public NotFoundException(final int code, final String msg) {
        super(code, msg);
        this.code = code;
    }
}
