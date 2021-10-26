package apis.Connection;

import models.Address;
import static apis.Connection.Util.jsonToString;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// https://jar-download.com/artifacts/com.google.code.gson/gson/2.8.2/source-code
// http://viacep.com.br/ws/
public class ViaCep {

    static String webService = "http://viacep.com.br/ws/";

    public Address consume(String cep) {
        String urlCep = webService + cep + "/json";

        try {
            URL url = new URL(urlCep);
            URLConnection urlConnection = url.openConnection();

            BufferedReader resp = new BufferedReader(new InputStreamReader((urlConnection.getInputStream())));
            String json = jsonToString(resp);

            Gson gson = new Gson();
            Address address = gson.fromJson(json, Address.class);

            return address;

        } catch (IOException e) {
            System.out.println("ERRO: " + e);
        }
        return null;
    }
    
}
