package com.petstore.client.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.petstore.client.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = Void.class, tags = { "user", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = Void.class) })

    @RequestMapping(value = "/user", produces = { "application/json", "application/xml" }, consumes = { "application/json" }, method = RequestMethod.POST)
    ResponseEntity<Void> createUser(@ApiParam(value = "Created user object", required = true) @Valid @RequestBody User body);

    @ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class, tags = { "user", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = Void.class) })

    @RequestMapping(value = "/user/createWithArray", produces = { "application/json", "application/xml" }, consumes = {
            "application/json" }, method = RequestMethod.POST)
    ResponseEntity<Void> createUsersWithArrayInput(@ApiParam(value = "List of user object", required = true) @Valid @RequestBody List<User> body);

    @ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class, tags = { "user", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = Void.class) })

    @RequestMapping(value = "/user/createWithList", produces = { "application/json", "application/xml" }, consumes = {
            "application/json" }, method = RequestMethod.POST)
    ResponseEntity<Void> createUsersWithListInput(@ApiParam(value = "List of user object", required = true) @Valid @RequestBody List<User> body);

    @ApiOperation(value = "Delete user", notes = "This can only be done by the logged in user.", response = Void.class, tags = { "user", })
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
            @ApiResponse(code = 404, message = "User not found", response = Void.class) })

    @RequestMapping(value = "/user/{username}", produces = { "application/json", "application/xml" }, method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted", required = true) @PathVariable("username") String username);

    @ApiOperation(value = "Get user by user name", notes = "", response = User.class, tags = { "user", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = User.class),
            @ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
            @ApiResponse(code = 404, message = "User not found", response = Void.class) })

    @RequestMapping(value = "/user/{username}", produces = { "application/json", "application/xml" }, method = RequestMethod.GET)
    ResponseEntity<User> getUserByName(
            @ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ", required = true) @PathVariable("username") String username);

    @ApiOperation(value = "Logs user into the system", notes = "", response = String.class, tags = { "user", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = String.class),
            @ApiResponse(code = 400, message = "Invalid username/password supplied", response = Void.class) })

    @RequestMapping(value = "/user/login", produces = { "application/json", "application/xml" }, method = RequestMethod.GET)
    ResponseEntity<String> loginUser(
            @NotNull @ApiParam(value = "The user name for login", required = true) @RequestParam(value = "username", required = true) String username,
            @NotNull @ApiParam(value = "The password for login in clear text", required = true) @RequestParam(value = "password", required = true) String password);

    @ApiOperation(value = "Logs out current logged in user session", notes = "", response = Void.class, tags = { "user", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = Void.class) })

    @RequestMapping(value = "/user/logout", produces = { "application/json", "application/xml" }, method = RequestMethod.GET)
    ResponseEntity<Void> logoutUser();

    @ApiOperation(value = "Updated user", notes = "This can only be done by the logged in user.", response = Void.class, tags = { "user", })
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid user supplied", response = Void.class),
            @ApiResponse(code = 404, message = "User not found", response = Void.class) })

    @RequestMapping(value = "/user/{username}", produces = { "application/json", "application/xml" }, consumes = {
            "application/json" }, method = RequestMethod.PUT)
    ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be updated", required = true) @PathVariable("username") String username,
            @ApiParam(value = "Updated user object", required = true) @Valid @RequestBody User body);

}
