package main;
import java.util.Random;

public class main {
	 public static void main(String[] args) {
	        Random rand = new Random();
	        
	        // Generamos un número aleatorio entre 0 y 100
	        int randomNumber = rand.nextInt(101);
	        
	        // Imprimimos el número aleatorio generado
	        System.out.println("Número aleatorio: " + randomNumber);
	    }
}
