/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;

import java.io.File;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import io.swagger.model.util.ModelTestUtils;

/**
 * Model tests for entity User
 */
// @Ignore
public class UserTest {

    @Test
    public void testInstance() {
        new User();
    }

    @Test
    public void testObfuscation_password() {
        User model = new User();
        assertTrue("Unexpected toString() for null obfuscated property: " + model.toString(), model.toString().contains("password: null"));
        String value = ModelTestUtils.getInstanceOf(String.class);
        model.setPassword(value);
        assertTrue("Unexpected toString() for non-null obfuscated property: " + model.toString(), model.toString().contains("password: ***"));
        assertTrue("Unexpected toString() for non-null obfuscated property: " + model.toString(), !model.toString().contains(Objects.toString(value)));
    }

}
