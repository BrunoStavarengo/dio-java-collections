import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Temperatura {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<Double>();

        //Listando as temperaturas
        int meses = 1;
        while(true){
            if(meses == 7) break;
            System.out.println("Digite a Temperatura do mes " + meses + ":");
            double temp = scan.nextDouble();
            temperatura.add(temp);
            meses++;
        }

        //Calculando a media semestral
        Iterator<Double> iterator = temperatura.iterator();
        Double soma = 0d;
        Double media;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        media = soma/temperatura.size();
        System.out.printf("A media de temperatura do Primeiro semestre foi:" + Math.round(media) + "ºc");

        //temperaturas acima da media
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator1 = temperatura.iterator();

        meses = 0;
        while (iterator1.hasNext()) {    
            Double temp = iterator1.next();
            if (temp > media) {
                switch (meses) {
                    case (0):
                        System.out.println("1 - Janeiro: " + Math.round(temp) + "ºc");
                        break;
                    case (1):
                        System.out.println("2 - Fevereiro: " + Math.round(temp) + "ºc");
                        break;
                    case (2):
                        System.out.println("3 - Março: " + Math.round(temp) + "ºc");
                        break;
                    case (3):
                        System.out.println("4 - Abril: " + Math.round(temp) + "ºc");
                        break;
                    case (4):
                        System.out.println("5 - Maio: " + Math.round(temp) + "ºc");
                        break;
                    case (5):
                        System.out.println("6 - Junho: " + Math.round(temp) + "ºc");
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            meses++;
        }

    }
}

