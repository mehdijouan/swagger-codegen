/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.15-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
@Api(value = "user", description = "the user API")
public interface UserApi {

    Logger log = LoggerFactory.getLogger(UserApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Create user", nickname = "createUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> createUser(@ApiParam(value = "Created user object" ,required=true )  @Valid @RequestBody User body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Creates list of users with given input array", nickname = "createUsersWithArrayInput", notes = "", tags={ "user", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/createWithArray",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody List<User> body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Creates list of users with given input array", nickname = "createUsersWithListInput", notes = "", tags={ "user", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/createWithList",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody List<User> body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = {
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("username") String username) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get user by user name", nickname = "getUserByName", notes = "", response = User.class, tags={ "user", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/xml", "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<User> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathVariable("username") String username) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"password\" : \"password\",\n  \"userStatus\" : 6,\n  \"phone\" : \"phone\",\n  \"id\" : 0,\n  \"email\" : \"email\",\n  \"username\" : \"username\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Logs user into the system", nickname = "loginUser", notes = "", response = String.class, tags={ "user", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid username/password supplied") })
    @RequestMapping(value = "/user/login",
        produces = { "application/xml", "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<String> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Logs out current logged in user session", nickname = "logoutUser", notes = "", tags={ "user", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/logout",
        method = RequestMethod.GET)
    default ResponseEntity<Void> logoutUser() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Updated user", nickname = "updateUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = {
        @ApiResponse(code = 400, message = "Invalid user supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        consumes = { "*/*" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateUser(@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body,@ApiParam(value = "name that need to be deleted",required=true) @PathVariable("username") String username) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
