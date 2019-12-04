package io.swagger.api;

import io.swagger.api.NotFoundException;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;
import io.swagger.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.List;


@Path("/user")


public class UserApi  {
   private final UserApiService delegate;

   public UserApi(@Context ServletConfig servletContext) {
      UserApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UserApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UserApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = UserApiServiceFactory.getUserApi();
      }

      this.delegate = delegate;
   }

    @POST

    @Consumes({ "*/*" })

    @Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response createUser(@Parameter(ParameterIn.DEFAULT, description = "Created user object" ,required=true) User body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUser(body,securityContext);
    }
    @POST
    @Path("/createWithArray")
    @Consumes({ "*/*" })

    @Operation(summary = "Creates list of users with given input array", description = "", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response createUsersWithArrayInput(@Parameter(ParameterIn.DEFAULT, description = "List of user object" ,required=true) List<User> body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUsersWithArrayInput(body,securityContext);
    }
    @POST
    @Path("/createWithList")
    @Consumes({ "*/*" })

    @Operation(summary = "Creates list of users with given input array", description = "", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response createUsersWithListInput(@Parameter(ParameterIn.DEFAULT, description = "List of user object" ,required=true) List<User> body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUsersWithListInput(body,securityContext);
    }
    @DELETE
    @Path("/{username}")


    @Operation(summary = "Delete user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),

        @ApiResponse(responseCode = "404", description = "User not found") })
    public Response deleteUser(@Parameter(ParameterIn.PATH, description = "The name that needs to be deleted",required=true) @PathParam("username") String username
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUser(username,securityContext);
    }
    @GET
    @Path("/{username}")

    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Get user by user name", description = "", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = User.class))),

        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),

        @ApiResponse(responseCode = "404", description = "User not found") })
    public Response getUserByName(@Parameter(ParameterIn.PATH, description = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathParam("username") String username
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserByName(username,securityContext);
    }
    @GET
    @Path("/login")

    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Logs user into the system", description = "", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = String.class))),

        @ApiResponse(responseCode = "400", description = "Invalid username/password supplied") })
    public Response loginUser(@Parameter(ParameterIn.QUERY, description = "The user name for login",required=true) @QueryParam("username") String username
,@Parameter(ParameterIn.QUERY, description = "The password for login in clear text",required=true) @QueryParam("password") String password
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loginUser(username,password,securityContext);
    }
    @GET
    @Path("/logout")


    @Operation(summary = "Logs out current logged in user session", description = "", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation") })
    public Response logoutUser(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.logoutUser(securityContext);
    }
    @PUT
    @Path("/{username}")
    @Consumes({ "*/*" })

    @Operation(summary = "Updated user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid user supplied"),

        @ApiResponse(responseCode = "404", description = "User not found") })
    public Response updateUser(@Parameter(ParameterIn.DEFAULT, description = "Updated user object" ,required=true) User body

,@Parameter(ParameterIn.PATH, description = "name that need to be deleted",required=true) @PathParam("username") String username
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUser(body,username,securityContext);
    }
}
