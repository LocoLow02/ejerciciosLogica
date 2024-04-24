import java.util.Scanner;

public class NumerosIguales {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero:");
        int num1 = opc.nextInt();
        
        System.out.println("Ingrese el segundo numero:");
        int num2 = opc.nextInt();
        
        if (sonIguales(num1, num2)) {
            System.out.println("Los numeros son iguales.");
        } else {
            System.out.println("Los numeros son diferentes.");
        }
        
        opc.close();
    }
    
    public static boolean sonIguales(int num1, int num2) {
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
}
