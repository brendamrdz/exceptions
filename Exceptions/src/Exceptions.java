import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws Exception {
    	try {
    	System.out.println("Ingresa un numero");
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int cuadrado = num * num;
    	System.out.println("El cuadrado de " + num + "" + "es " + cuadrado);
    	}
    	catch (InputMismatchException ex) {
    		System.out.println("Debes ingresar un valor numerico");
    		
    	}
      }
    }
    
