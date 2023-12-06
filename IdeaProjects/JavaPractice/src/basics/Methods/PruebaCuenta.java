package Practice.Methods;

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float numero;
        int dni;
        //String dni = "21345";
        double saldo;
        double interes;




        //Cuenta cuenta1 = new Cuenta(123456789, 987654321, 1000, 5);

        Cuenta p1 = new Cuenta(123456789, 987654321, 1000, 5);


        System.out.println("introduzca su numero de cuenta");
        numero = scanner.nextFloat();
        System.out.println("introduzca su dni");
        dni = scanner.nextInt();
        System.out.println("introduzca su saldo actual");
        saldo = scanner.nextDouble();
        System.out.println("interes anual");
        interes = scanner.nextDouble();

    }


}
