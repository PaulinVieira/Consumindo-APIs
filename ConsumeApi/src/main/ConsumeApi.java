package main;

import models.Address;
import apis.Connection.ChuckNorris;
import apis.Connection.ViaCep;

public class ConsumeApi {

    public static void main(String[] args) throws Exception {

        ChuckNorris chuckNorris = new ChuckNorris();
        chuckNorris.consume();

        ViaCep viaCep = new ViaCep();
        Address address = viaCep.consume("04463-110");
        System.out.println("\n" + address.toString());
        

    }

}
