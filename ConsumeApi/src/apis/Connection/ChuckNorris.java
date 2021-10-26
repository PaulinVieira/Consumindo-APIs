package apis.Connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ChuckNorris {

//    http://api.icndb.com/jokes/random
    public void consume() {

        String json;

        try {

            URL url = new URL("http://api.icndb.com/jokes/random");

            URLConnection urlConnection = url.openConnection();

            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));

            json = jsonSb.toString();
            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");

            String array[];
            array = json.split("\n");

            System.out.println("ID: " + array[8]);
            System.out.println("JOKE: " + array[11]);

        } catch (IOException e) {

            System.out.println("Erro não documentado: " + e);

        }

    }

}
