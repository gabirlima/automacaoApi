package Steps;

import Models.Characters.CharactersModel;
import Models.Characters.ResultModel;
import Services.CharactersService;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import gherkin.deps.com.google.gson.Gson;
import io.restassured.response.Response;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CharactersSteps {

    private static Response response;
    private final CharactersService charactersServiceService = new CharactersService();

    @Quando("consulto o id {string}")
    public void consultoOId(String id) {
        response = charactersServiceService.getCharactersById(id);
    }

    @Entao("o status code do retorno deve ser {int}")
    public void oStatusCodeDoRetornoDeveSer(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @E("deve ser retornado o personagem {string}")
    public void deveSerRetornadoOPersonagem(String personagem) {
        if(!personagem.equals("nenhum")){
            Gson gson = new Gson();
            CharactersModel character = gson.fromJson(response.getBody().asString(), CharactersModel.class);
            List<ResultModel> resultado = character.getData().getResults();
            assertTrue(resultado.size() > 0);
            assertEquals(personagem, resultado.get(0).getName());
        }
    }
}
