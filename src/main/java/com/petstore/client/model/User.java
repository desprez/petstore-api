package com.petstore.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * User
 */
public class User {

    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("username")
    private String username = null;

    @JsonProperty("firstName")
    private String firstName = null;

    @JsonProperty("lastName")
    private String lastName = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("password")
    private String password = null;

    @JsonProperty("phone")
    private String phone = null;

    @JsonProperty("userStatus")
    private Integer userStatus = null;

    public User id(final Long id) {
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

    public User username(final String username) {
        this.username = username;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public User firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public User lastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public User email(final String email) {
        this.email = email;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public User password(final String password) {
        this.password = password;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public User phone(final String phone) {
        this.phone = phone;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public User userStatus(final Integer userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    @ApiModelProperty(value = "User Status")
    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(final Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public boolean equals(final java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final User user = (User) o;
        return Objects.equals(this.id, user.id) && Objects.equals(this.username, user.username) && Objects.equals(this.firstName, user.firstName)
                && Objects.equals(this.lastName, user.lastName) && Objects.equals(this.email, user.email) && Objects.equals(this.password, user.password)
                && Objects.equals(this.phone, user.phone) && Objects.equals(this.userStatus, user.userStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, firstName, lastName, email, password, phone, userStatus);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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
