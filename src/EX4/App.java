package EX4;

/*- Exercici 4
Crea una llista que contingui algunes cadenes de text i nombres.

Ordena-les per:
Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del
primer  caràcter)
Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi
directament a la lambda.
Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un
‘4’.
Mostra només els elements que són numèrics. (Encara que estiguin guardats com
 Strings).   */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Pepe", "Mateo", "Pedro", "Rosario", "Mariona", "María", "Ana", "Ani", "Pep", "Java in love", "Es un bonito día para programar");
        List<String> streamList1 = stringList.stream()
                .sorted()
                .collect(Collectors.toList());
        streamList1.forEach(System.out::println);

        System.out.println("-----");

        List<String> streamList2 = stringList.stream()
                .filter(n-> n.contains("e"))
                .sorted()
                .collect(Collectors.toList());

        List<String> streamList3 = stringList.stream()
                .filter(n-> !n.contains("e"))
                .sorted()
                .collect(Collectors.toList());

        List<String> resultList = Stream.concat(streamList2.stream(), streamList3.stream()).collect(Collectors.toList());
        resultList.forEach(System.out::println);

        System.out.println("-----");

        List<String> streamList4 = stringList.stream()
                .filter(n-> n.contains("a"))
                .map(n-> n.replace('a', '4'))
                .collect(Collectors.toList());

        streamList4.forEach(System.out::println);

        System.out.println("-----");

        StringBuilder strbuild = new StringBuilder();
        for (String n:streamList4) {
            char [] c = n.toCharArray();
            for (char a: c) {
                if (Character.isDigit(a)){
                    strbuild.append(a);
                }
            }
        }
        System.out.println(strbuild);

    }
}
