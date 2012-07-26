/*
—Una universidad desea una aplicación que le permita a un alumno comprobar los resultados 
 * de las siguientes operaciones:
-— Cálculo del área de un círculo.
—- Cálculo del área de un cuadrado.
—- Factorial de un número
—- Determinar si un número es primo.
—Las operaciones matemáticas deberán estar implementadas como métodos de clase en una clase llamada Calculadora.  
 * Adicionalmente deberá indicar cuantas operaciones se han realizado incrementándose 
 * de uno en uno cada vez que se invoca una operación.
 */
package calculadoraoperacion;

import java.util.Scanner;

public class CalculadoraOperacion {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        Integer[] contador = {0,0,0,0};
        String opcion="";

        Calculadora operaciones = new Calculadora();



        do {

            System.out.println("Seleccione una operacion");
            System.out.println("------------------------");
            System.out.println("Seleccione una operacion");
            System.out.println("1. Area del Circulo");
            System.out.println("2. Area del Cuadrado");
            System.out.println("3. Factorial");
            System.out.println("4. Primo");

            System.out.print("Ingrese opcion: ");
            opcion = valor.next();

            switch (Integer.parseInt(opcion)) {

                case 1:
                    System.out.println("1. Area del Circulo");
                    System.out.println("Ingrese el radio: ");
                    opcion = valor.next();
                    System.out.println(operaciones.areaCirculo(Integer.parseInt(opcion)));
                    
                    contador[0] = contador[0] + 1;
                    break;
                case 2:
                    System.out.println("2. Area del Cuadrado");
                    System.out.println("Ingrese el lado del cuadrado: ");
                    opcion = valor.next();
                    System.out.println(operaciones.areaCuadrado(Integer.parseInt(opcion)));
                    contador[1] = contador[1] + 1;
                    break;

                case 3:
                    System.out.println("3. Factorial");
                    System.out.println("Ingrese numero: ");
                    opcion = valor.next();
                    System.out.println(operaciones.factorial(Integer.parseInt(opcion)));
                    contador[2] = contador[2] + 1;
                    break;
                case 4:
                    System.out.println("4. Primo");
                    System.out.println("Ingrese numero: ");
                    opcion = valor.next();
                    System.out.println(operaciones.numeroPrimo(Integer.parseInt(opcion)));
                    contador[3] = contador[3] + 1;
                    break;

            }


            System.out.println("Si desea salir ingrese 'S' sino 'N':");
            opcion = valor.next();

        } while (!opcion.equals("S"));

        System.out.println("-------------Totales------------");
        System.out.println("Area del Circulo nro de veces: " + contador[0]);
        System.out.println("Area del Cuadrado nro de veces: " + contador[1]);
        System.out.println("Factorial nro de veces: " + contador[2]);
        System.out.println("Primo nro de veces: " + contador[3]);

    }
}
