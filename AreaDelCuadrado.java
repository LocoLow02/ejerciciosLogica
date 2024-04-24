import java.util.Scanner;

public class AreaDelCuadrado {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = opc.nextDouble();
        
        double area = calcularAreaCuadrado(lado);
        
        System.out.println("El area del cuadrado es: " + area);
        
        opc.close();
    }
    
    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }
}
