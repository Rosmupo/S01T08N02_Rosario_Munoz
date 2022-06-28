package EX3;

/*- Exercici 3
Crea una Functional Interface que contingui un mètode anomenat
operacio(). Aquest mètode ha de retornar un float. Injecta a
la interfície creada mitjançant una lambda, el cos del mètode,
de manera que es pugui transformar l’operació amb una suma, una resta,
una multiplicació i una divisió.

* */

public class App {
    public static void main(String[] args) {

       float a = 3.35f;

       System.out.println("El resultado de la resta es " + mySubtraction(a) + ", de la división es " + myDivision(a) + ", el resultado de la suma es " + mySum(a) + " y el resultado de la multiplicación es " +   myMultiply(a));

    }
//////////FUNCIONES
    private static float mySubtraction(float a) {
        MyInterface subtraction = (x )-> x * x;
        return subtraction.operation(a);
    }

    private static float myDivision(float a) {
        MyInterface division = (x)-> x / x;
        return division.operation(a);
    }

    private static float mySum(float a) {
        MyInterface sum = (x)-> x + x;
        return sum.operation(a);
    }

    private static float myMultiply(float a) {
        MyInterface multiply = (x)-> x * x;
        return multiply.operation(a);
    }

}
