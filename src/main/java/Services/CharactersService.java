package Services;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CharactersService extends BaseService {

    public Response getCharactersById(String id){
        return given()
                .param("ts", timestamp)
                .param("apikey", api_key)
                .param("hash", hash)
                .baseUri(base_url + "characters/")
                .when()
                .log().uri()
                .get(id);
    }
}
