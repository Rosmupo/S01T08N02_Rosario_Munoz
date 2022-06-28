package EX1;

/*- Exercici 1
Crea una llista de cadenes amb noms propis. Escriu un mètode que
retorna una llista de totes les cadenes que comencen amb la lletra
'A' (majúscula) i  tenen exactament 3 lletres. Imprimeix el resultat.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Pepe", "Mateo", "Pedro", "Rosario", "Mariona", "María", "Ana", "Ani", "Pep");

        List<String> streamList = stringList.stream()
                .filter(name -> name.length() == 3)
                .filter(name -> name.charAt(0) == 'A')
                .collect(Collectors.toList());

        streamList.forEach(System.out::println);

    }
}


