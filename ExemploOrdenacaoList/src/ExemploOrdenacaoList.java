import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) throws Exception {
        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("--\t Ordem de inserção\t--");
        System.out.println(meusGatos);

        System.out.println("--\t Ordem Aleatoria\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\t Ordem Natural (Nome)\t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\t Ordem Idade\t--");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\t Ordem Cor\t--");
        //Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\t Ordem Nome/Cor/Idade (Nome)\t--");
        //Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return " [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
       return this.getNome().compareToIgnoreCase(gato.getNome());
    }
   

}

/* 
Class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compareTo(Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
    
}*/