import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os modelos de veiculos e seu consumo");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());
        System.out.println("---------------------------------------");

        System.out.println("Substitua o consumo do gol para 15.2");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println("---------------------------------------");

        System.out.println("Confira se o modelo tucson esta na lista de veiculos: " + carrosPopulares.containsKey("tucson"));
        System.out.println("---------------------------------------");

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
        System.out.println("---------------------------------------");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("---------------------------------------");

        System.out.println("Exiba os consumos: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println("---------------------------------------");

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        System.out.println("---------------------------------------");

        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        System.out.println("---------------------------------------");

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);
        System.out.println("---------------------------------------");

        System.out.println("Exiba a media de consumo:" + soma/carrosPopulares.size());
        System.out.println("---------------------------------------");

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("---------------------------------------");

        System.out.println("Exiba os modelos na ordem que foram inseridos: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());
        System.out.println("---------------------------------------");

        System.out.println("Exiba o dicionario ordenado pelos modelos: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague a lista de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se a lista esta vazia: " + carrosPopulares.isEmpty());
    }
}
