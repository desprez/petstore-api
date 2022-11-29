package com.petstore.client.api;

import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.petstore.client.model.Order;

import io.swagger.annotations.ApiParam;

@Controller
public class StoreApiController implements StoreApi {

    @Override
    public ResponseEntity<Void> deleteOrder(
            @Min(1) @ApiParam(value = "ID of the order that needs to be deleted", required = true) @PathVariable("orderId") final Long orderId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Map<String, Integer>> getInventory() {
        // do some magic!
        return new ResponseEntity<Map<String, Integer>>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Order> getOrderById(
            @Min(1) @Max(10) @ApiParam(value = "ID of pet that needs to be fetched", required = true) @PathVariable("orderId") final Long orderId) {
        // do some magic!
        return new ResponseEntity<Order>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet", required = true) @Valid @RequestBody final Order body) {
        // do some magic!
        return new ResponseEntity<Order>(HttpStatus.OK);
    }

}
