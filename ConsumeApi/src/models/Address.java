package models;

public class Address {
    
    String logradouro;
    String bairro;
    String localidade;
    String cep;
    String uf;

    @Override
    public String toString() {
        return "Address: " + "\nlogradouro = " + logradouro + "\nbairro = " + bairro + "\nlocalidade = " + localidade + "\ncep = " + cep + "\nuf = " + uf;
    }
    
    
    
}
