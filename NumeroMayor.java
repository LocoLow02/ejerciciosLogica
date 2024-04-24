import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero:");
        int num1 = opc.nextInt();
        
        System.out.println("Ingrese el segundo numero:");
        int num2 = opc.nextInt();
        
        int mayor = encontrarMayor(num1, num2);
        
        System.out.println("El numero mayor es: " + mayor);
        
        opc.close();
    }
    
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
