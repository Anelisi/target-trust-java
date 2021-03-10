package collectionsJava;

import java.util.*;

public class ListaPessoa {

    public static void main(String[] args) {
        List<String> pessoas = Arrays
                .asList("Kiersten", "Zaneta", "Frank", "Tedi", "Bryana", "Marigold", "Devan", "Jerrilyn", "Kathrine", "Bryana");
        TreeSet<String> people = new TreeSet<>(pessoas);

        for (String pple: people) {
            System.out.println(pple);
        }

        int c = 0;
        for (String p : people) {
            if (c >= 3) {
                break;
            } else {
                System.out.printf("\n%dº Elemento: %s",c + 1, p);
                c++;
            }
        }
    }
}
