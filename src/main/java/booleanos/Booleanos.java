package booleanos;

public class Booleanos {
    public static void main(String[] args) {
        exemploComBoolean();
    }
    private static void exemploComBoolean() {
        String entrada =  "Em terra de cego quem tem um olho é rei";
        String[] palavras = entrada.split(" ");

        boolean ehAPrimeira = true;

        for (String palavra : palavras){
            if(ehAPrimeira){
                System.out.println(palavra.toUpperCase() + " ");
                ehAPrimeira = false;
            }

            System.out.print(palavra.toLowerCase() + " ");
        }
        System.out.println("\n" + palavras[5].toUpperCase());


        StringBuilder builder = new StringBuilder();
        builder.append("Itens: ");
        for(int i = 0; i< 10;i++) {
            builder
                    .append(i)
                    .append("-");
        }
        System.out.println(builder.toString());

    }

}
