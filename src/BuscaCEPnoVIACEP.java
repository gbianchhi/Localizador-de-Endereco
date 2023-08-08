import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class BuscaCEPnoVIACEP {

    public Endereco buscarCEP(String CEPfinal) {

        String API = "https://viacep.com.br/ws/" + CEPfinal + "/json/";

        HttpResponse<String> response = null;
        Endereco endereco = null;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(API)).build();
            response = client.send(request, BodyHandlers.ofString());

            Gson gson = new Gson();
            endereco = gson.fromJson(response.body(), Endereco.class);

        } catch (IOException | InterruptedException | IllegalStateException | JsonSyntaxException e) {
            System.out.println("Não foi possivel localizar o endereço!");
        }

        return endereco;

    }
}
