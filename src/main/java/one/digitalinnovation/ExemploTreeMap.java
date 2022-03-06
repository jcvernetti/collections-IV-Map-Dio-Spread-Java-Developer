package one.digitalinnovation;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class ExemploTreeMap {

    public static void main(String[] args){

        TreeMap<String, String> treeCapitais = new TreeMap<>();
        //Monta a árvore com as capitais
        treeCapitais.put("RS","Porto Alegre");
        treeCapitais.put("SC","Florianópolis");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP","São Paulo");
        treeCapitais.put("RJ","Rio de Janeiro");
        treeCapitais.put("MG","Belo Horizonte");

        //Map.Entry<String,String> firstEntry = treeCapitais.pollFirstEntry();
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higherKey("SC"));

        //Exibe todas
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstEntry().getKey() + "--" + treeCapitais.firstEntry().getValue());

        System.out.println(treeCapitais.lastEntry().getKey() + "--" + treeCapitais.lastEntry().getValue());

        //Retorna a primeira capital abaixo na árvore da capital paramerizada
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + "--" + treeCapitais.lowerEntry("SC").getValue());

        System.out.println("ANTES POLLFIRST E POLLLAST:");
        System.out.println(treeCapitais);

        System.out.println("AQUI POLLFIRST E POLLLAST:  Remove o primeiro e o último");

        Map.Entry<String,String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String,String> lastEntry = treeCapitais.pollLastEntry();

        System.out.println("DEPOIS POLLFIRST E POLLLAST:");
        System.out.println(treeCapitais);

        System.out.println(" ");
        System.out.println("First iterator");
        //Navega em todos os itens do iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }

        System.out.println("Second iterator");
        for (String capital: treeCapitais.keySet()){
            System.out.println(capital + " -- " + treeCapitais.get(capital));
        }

        System.out.println("Third iterator");
        for (Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey() + " -- " + capital.getValue());
        }
    }
}
