package com.petstore.client.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.petstore.client.model.User;

import io.swagger.annotations.ApiParam;

@Controller
public class UserApiController implements UserApi {

    @Override
    public ResponseEntity<Void> createUser(@ApiParam(value = "Created user object", required = true) @Valid @RequestBody final User body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createUsersWithArrayInput(@ApiParam(value = "List of user object", required = true) @Valid @RequestBody final List<User> body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createUsersWithListInput(@ApiParam(value = "List of user object", required = true) @Valid @RequestBody final List<User> body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteUser(
            @ApiParam(value = "The name that needs to be deleted", required = true) @PathVariable("username") final String username) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> getUserByName(
            @ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ", required = true) @PathVariable("username") final String username) {
        // do some magic!
        return new ResponseEntity<User>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> loginUser(
            @NotNull @ApiParam(value = "The user name for login", required = true) @RequestParam(value = "username", required = true) final String username,
            @NotNull @ApiParam(value = "The password for login in clear text", required = true) @RequestParam(value = "password", required = true) final String password) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> logoutUser() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be updated", required = true) @PathVariable("username") final String username,
            @ApiParam(value = "Updated user object", required = true) @Valid @RequestBody final User body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
