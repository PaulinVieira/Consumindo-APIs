package apis.Connection;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {
    
        public static String jsonToString(BufferedReader buffereReader) throws IOException {
        String resp, json = "";

        while ((resp = buffereReader.readLine()) != null) {
            json += resp;

        }

        return json;

    }
    
}
