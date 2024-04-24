import java.util.Scanner;

public class NumerosEnBucleAscendente {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int num = opc.nextInt();
        
        System.out.println("Numeros del 0 al " + num + ":");
        imprimirNumeros(num);
        
        opc.close();
    }
    
    public static void imprimirNumeros(int nume) {
        if (nume >= 0) {
            imprimirNumeros(nume - 1);
            System.out.print(nume + " ");
        }
    }
}
