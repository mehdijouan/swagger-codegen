/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.15-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Client;
import io.swagger.model.OuterComposite;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
@Api(value = "fake", description = "the fake API")
public interface FakeApi {

    @ApiOperation(value = "", nickname = "fakeOuterBooleanSerialize", notes = "Test serialization of outer boolean types", response = Boolean.class, tags={ "fake", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Output boolean", response = Boolean.class) })
    @RequestMapping(value = "/fake/outer/boolean",
        produces = { "*/*" },
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> fakeOuterBooleanSerialize(@ApiParam(value = "Input boolean as post body"  )  @Valid @RequestBody Boolean body);


    @ApiOperation(value = "", nickname = "fakeOuterCompositeSerialize", notes = "Test serialization of object with outer number type", response = OuterComposite.class, tags={ "fake", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Output composite", response = OuterComposite.class) })
    @RequestMapping(value = "/fake/outer/composite",
        produces = { "*/*" },
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<OuterComposite> fakeOuterCompositeSerialize(@ApiParam(value = "Input composite as post body"  )  @Valid @RequestBody OuterComposite body);


    @ApiOperation(value = "", nickname = "fakeOuterNumberSerialize", notes = "Test serialization of outer number types", response = BigDecimal.class, tags={ "fake", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Output number", response = BigDecimal.class) })
    @RequestMapping(value = "/fake/outer/number",
        produces = { "*/*" },
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<BigDecimal> fakeOuterNumberSerialize(@ApiParam(value = "Input number as post body"  )  @Valid @RequestBody BigDecimal body);


    @ApiOperation(value = "", nickname = "fakeOuterStringSerialize", notes = "Test serialization of outer string types", response = String.class, tags={ "fake", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Output string", response = String.class) })
    @RequestMapping(value = "/fake/outer/string",
        produces = { "*/*" },
        consumes = { "*/*" },
        method = RequestMethod.POST)
    ResponseEntity<String> fakeOuterStringSerialize(@ApiParam(value = "Input string as post body"  )  @Valid @RequestBody String body);


    @ApiOperation(value = "To test \"client\" model", nickname = "testClientModel", notes = "To test \"client\" model", response = Client.class, tags={ "fake", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    @RequestMapping(value = "/fake",
        produces = { "application/json" },
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Client> testClientModel(@ApiParam(value = "client model" ,required=true )  @Valid @RequestBody Client body);


    @ApiOperation(value = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", nickname = "testEndpointParameters", notes = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", authorizations = {
        @Authorization(value = "http_basic_test")    }, tags={ "fake", })
    @ApiResponses(value = {
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/fake",
        consumes = { "application/xml; charset=utf-8", "application/json; charset=utf-8" },
        method = RequestMethod.POST)
    ResponseEntity<Void> testEndpointParameters(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Object body);


    @ApiOperation(value = "To test enum parameters", nickname = "testEnumParameters", notes = "To test enum parameters", tags={ "fake", })
    @ApiResponses(value = {
        @ApiResponse(code = 400, message = "Invalid request"),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/fake",
        consumes = { "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<Void> testEnumParameters(@ApiParam(value = ""  )  @Valid @RequestBody Object body,@ApiParam(value = "Header parameter enum test (string array)" , allowableValues=">, $") @RequestHeader(value="enum_header_string_array", required=false) List<String> enumHeaderStringArray,@ApiParam(value = "Header parameter enum test (string)" , allowableValues="_abc, -efg, (xyz)") @RequestHeader(value="enum_header_string", required=false) String enumHeaderString,@ApiParam(value = "Query parameter enum test (string array)", allowableValues = ">, $") @Valid @RequestParam(value = "enum_query_string_array", required = false) List<String> enumQueryStringArray,@ApiParam(value = "Query parameter enum test (string)", allowableValues = "_abc, -efg, (xyz)") @Valid @RequestParam(value = "enum_query_string", required = false) String enumQueryString,@ApiParam(value = "Query parameter enum test (double)", allowableValues = "1, -2") @Valid @RequestParam(value = "enum_query_integer", required = false) Integer enumQueryInteger);


    @ApiOperation(value = "test inline additionalProperties", nickname = "testInlineAdditionalProperties", notes = "", tags={ "fake", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/fake/inline-additionalProperties",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> testInlineAdditionalProperties(@ApiParam(value = "request body" ,required=true )  @Valid @RequestBody Map<String, String> body);


    @ApiOperation(value = "test json serialization of form data", nickname = "testJsonFormData", notes = "", tags={ "fake", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/fake/jsonFormData",
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> testJsonFormData(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Object body);

}
