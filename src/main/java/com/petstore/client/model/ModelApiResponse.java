package com.petstore.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ModelApiResponse
 */
public class ModelApiResponse {

    @JsonProperty("code")
    private Integer code = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("message")
    private String message = null;

    public ModelApiResponse code(final Integer code) {
        this.code = code;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getCode() {
        return code;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public ModelApiResponse type(final String type) {
        this.type = type;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public ModelApiResponse message(final String message) {
        this.message = message;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public boolean equals(final java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final ModelApiResponse _apiResponse = (ModelApiResponse) o;
        return Objects.equals(this.code, _apiResponse.code) && Objects.equals(this.type, _apiResponse.type)
                && Objects.equals(this.message, _apiResponse.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, type, message);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class ModelApiResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(final java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
