import java.util.ArrayList;
import java.util.List;

public class Exemplo {
    public static void main(String[] Args){

        List<String> nomes = new ArrayList<>();        //Adicionar os nomes Juliana, Pedro, Carlos, Larissa e João

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);                      //Navegar na lista, exibindo cada nome no console
         for(String NomeDoItem: nomes) {
             System.out.println("--->" + NomeDoItem);
         }

        nomes.set(2,"Roberto");                          //Substitua Carlos por Roberto
        System.out.println(nomes);

        System.out.println(nomes.get(0));                //Retorne o nome na posição 1

        nomes.remove(3);                           //Remova o nome na posição 4
        System.out.println(nomes);

        nomes.remove("João");                         //Remova o nome João
        System.out.println(nomes);

        int tamanho = nomes.size();                      //Retorne a quantidade de itens na sua lista
        System.out.println(tamanho);

        System.out.println(nomes.contains("Juliano"));    //verifique se o nome Juliano está na lista

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        List<String> Nomes = new ArrayList<>();
        System.out.println(Nomes);




    }
}
