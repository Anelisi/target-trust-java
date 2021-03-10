package colecoes;

import java.util.*;

public class ExemplosMap {

    public static void main(String[] args) {
        hashMapNormalString();
//        hashMapMultidimensional();
    }

    private static void hashMapNormalString() {
        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianópolis");
        capitais.put("RR", "Porto Alegre");

        //Substitui pois já existe a chave RS
        capitais.put("RS", "Canoas");

        //System.out.println(capitais.get("RS"));

//        for(String cidade : capitais){ Não pode

        System.out.println("Pega só as chaves: ");
        for(String capital : capitais.keySet()){//Set<String> sem duplicidades
            System.out.println(capital);
        }

        System.out.println("\nPega só os valores: ");
        for(String cidade : capitais.values()){//Collection<String> sem descartar duplicidades
            System.out.println(cidade);
        }

        //Pega todo o registro
        System.out.println("\nEntries: ");
        for(Map.Entry<String, String> entryCidades : capitais.entrySet()){
            System.out.printf("Estado: %s - Cidade: %s\n", entryCidades.getKey(), entryCidades.getValue());
        }
    }

    private static void hashMapMultidimensional() {
        HashMap<String, List<String>> capitais = new HashMap<>();

        List<String> cidadesRS = new ArrayList<>();
        cidadesRS.add("Porto Alegre");
        cidadesRS.add("Canoas");

        capitais.put("RS", cidadesRS);

        System.out.println(capitais.get("RS"));

        capitais.get("RS").add("Viamão");

        System.out.println(capitais.get("RS"));

        List<String> itemRs = capitais.get("RS");
        itemRs.add("Bento");
        capitais.put("RS", itemRs);

        System.out.println(capitais.get("RS"));
    }
}
