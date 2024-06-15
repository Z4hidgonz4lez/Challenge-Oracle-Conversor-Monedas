import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ClienteApi {
    private static final String URL_API = "https://v6.exchangerate-api.com/v6/7158b666216f7718876030e6/latest/";

    public double obtenerTasa(String deMoneda, String aMoneda) throws Exception {
        String urlString = URL_API + deMoneda;
        URI uri = new URI(urlString);

        // Se crea el HttpClient y HttpRequest

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

        // en esta parte lo que busque fue verificar la respuesta para asegurarme que no hubiera un error


        if (respuesta.statusCode() != 200) {
            throw new RuntimeException("Error al obtener respuesta de la API: " + respuesta.statusCode());
        }

        String respuestaJson = respuesta.body();
        JsonObject jsonObject = JsonParser.parseString(respuestaJson).getAsJsonObject();

        if (!jsonObject.getAsJsonObject("conversion_rates").has(aMoneda)) {
            throw new RuntimeException("Moneda destino no encontrada en la respuesta de la API");
        }

        return jsonObject.getAsJsonObject("conversion_rates").get(aMoneda).getAsDouble();
    }
}

