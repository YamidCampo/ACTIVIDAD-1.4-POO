import java.util.Scanner;
public class Main{
    static public void main(String[] args) {
        float numero, cubo, cuadrado;
        System.out.println("Escrbie el numero:");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextFloat();
        cuadrado = (float) Math.pow(numero,2);
        cubo = (float) Math.pow(numero,3);
        System.out.println("El cuadrado del numero "+numero+" es: "+cuadrado);
        System.out.println("El cubo de "+numero+" es: "+cubo);
    }
}