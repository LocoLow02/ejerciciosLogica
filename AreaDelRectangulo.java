import java.util.Scanner;

public class AreaDelRectangulo {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo:");
        double base = opc.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo:");
        double altura = opc.nextDouble();
        
        double area = calcularAreaRectangulo(base, altura);
        
        System.out.println("El area del rectangulo es: " + area);
        
        opc.close();
    }
    
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}
