package EX2;

/*- Exercici 2
Programa un mètode que retorna una cadena separada per comes, basada en
una llista d’Integers. Cada element ha d’anar precedit per lletra “e” si
el nombre és parell, o per la lletra “o” si el nombre és imparell. Per
exemple, si la llista d’entrada és (3, 55, 44), la sortida ha de ser
“o3, o55, e44”. Imprimeix el resultat.*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<Integer> listNum = Arrays.asList(50, 51, 30, 33, 20, 27);
        List<String> listNumToStream = listNum.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> String.valueOf("e " + n))
                .collect(Collectors.toList());


        List<String> listNumToStream2 = listNum.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> String.valueOf("o " + n))
                .collect(Collectors.toList());

        List<String> resultList = Stream.concat(listNumToStream.stream(), listNumToStream2.stream()).collect(Collectors.toList());

        System.out.println(resultList);

    }

}
