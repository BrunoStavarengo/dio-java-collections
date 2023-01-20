import java.util.*;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {
        System.out.println("--\t Ordem aleatoria (exiba somente o nome do livro e do autor) \t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah ", new Livro("21 liçoes para o seculo 21", 432));
        }};

        for (Map.Entry<String, Livro> livro: meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println("-------------------------------------------");

        System.out.println("--\t Ordem de inserção \t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Harari, Yuval Noah ", new Livro("21 liçoes para o seculo 21", 432));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
        }};

        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println("-------------------------------------------");

        System.out.println("--\t Ordem alfabetica autores \t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro: meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\t Ordem alfabetica nomes dos livros \t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro: meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

    }
}