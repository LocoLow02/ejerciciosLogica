import java.util.Scanner;

public class Validacion {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int num1 = opc.nextInt();
        
        if (esPar(num1)) {
            System.out.println(num1 + " Es par.");
        } else {
            System.out.println(num1 + " Es impar.");
        }
        
        opc.close();
    }
    
    public static boolean esPar(int num2) {
        if (num2 == 0) {
            return true;
        } else if (num2 == 1) {
            return false;
        } else {
            return esPar(num2 - 2);
        }
    }
}
