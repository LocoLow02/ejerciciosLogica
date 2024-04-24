import java.util.Scanner;

public class NumerosEnBucleDescendente {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int numero = opc.nextInt();
        
        System.out.println("Numeros desde " + numero + " hasta 0:");
        imprimirNumerosDesc(numero);
        
        opc.close();
    }
    
    public static void imprimirNumerosDesc(int numero) {
        if (numero >= 0) {
            System.out.print(numero + " ");
            imprimirNumerosDesc(numero - 1);
        }
    }
}
