package com.petstore.client.model;

import java.util.Objects;

import javax.validation.Valid;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * Order
 */
public class Order {

    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("petId")
    private Long petId = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    @JsonProperty("shipDate")
    private DateTime shipDate = null;

    /**
     * Order Status
     */
    public enum StatusEnum {
        PLACED("placed"),

        APPROVED("approved"),

        DELIVERED("delivered");

        private final String value;

        StatusEnum(final String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(final String text) {
            for (final StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("status")
    private StatusEnum status = null;

    @JsonProperty("complete")
    private Boolean complete = null;

    public Order id(final Long id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(value = "")
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Order petId(final Long petId) {
        this.petId = petId;
        return this;
    }

    @ApiModelProperty(value = "")
    public Long getPetId() {
        return petId;
    }

    public void setPetId(final Long petId) {
        this.petId = petId;
    }

    public Order quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public Order shipDate(final DateTime shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    @ApiModelProperty(value = "")
    @Valid
    public DateTime getShipDate() {
        return shipDate;
    }

    public void setShipDate(final DateTime shipDate) {
        this.shipDate = shipDate;
    }

    public Order status(final StatusEnum status) {
        this.status = status;
        return this;
    }

    @ApiModelProperty(value = "Order Status", allowableValues = "placed,approved,delivered")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(final StatusEnum status) {
        this.status = status;
    }

    public Order complete(final Boolean complete) {
        this.complete = complete;
        return this;
    }

    /**
     * Get complete
     *
     * @return complete
     **/
    @ApiModelProperty(value = "")

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(final Boolean complete) {
        this.complete = complete;
    }

    @Override
    public boolean equals(final java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Order order = (Order) o;
        return Objects.equals(this.id, order.id) && Objects.equals(this.petId, order.petId) && Objects.equals(this.quantity, order.quantity)
                && Objects.equals(this.shipDate, order.shipDate) && Objects.equals(this.status, order.status) && Objects.equals(this.complete, order.complete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, petId, quantity, shipDate, status, complete);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class Order {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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
