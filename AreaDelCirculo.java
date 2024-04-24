import java.util.Scanner;

public class AreaDelCirculo {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo:");
        double radio = opc.nextDouble();
        
        double area = calcularAreaCirculo(radio);
        
        System.out.println("El area del circulo es: " + area);
        
        opc.close();
    }
    
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
}
