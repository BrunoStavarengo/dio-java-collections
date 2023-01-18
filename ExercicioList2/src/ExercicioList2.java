import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class ExercicioList2 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Perguntas: (Responder com 's' ou 'n') ");
        System.out.print("\n1 - Telefonou para vítima? ");
        String resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("2 - Esteve no local do crime? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("3 - Mora perto da vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("4 - Devia para vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());
        
        System.out.print("5 - Já trabalhou com a vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(" SUSPEITA "); 
                break;
            case 3:
            case 4:
                System.out.println(" CÚMPLICE ");
                break;
            case 5:
                System.out.println(" ASSASSINO "); 
                break;
            default:
                System.out.println(" INOCENTE "); 
                break;
        }
    }
}
