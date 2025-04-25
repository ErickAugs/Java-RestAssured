package tests;

import constantes.Constantes;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SampleTest {

    @Test
    public void testGetEndpoint() {

        given().baseUri(Constantes.BASE_URL).
                when().
                get("/posts/1").
                then().
                statusCode(200).
                body("userId", equalTo(1)).
                body("title", notNullValue());
    }
}
