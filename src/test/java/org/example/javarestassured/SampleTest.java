package org.example.javarestassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SampleTest {

    @Test
    public void testGetEndpoint() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given().
                when().
                get("/posts/1").
                then().
                statusCode(200).
                body("userId", equalTo(1)).
                body("title", notNullValue());
    }
}
