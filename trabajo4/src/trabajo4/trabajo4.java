package trabajo4;

	import java.util.Random;
	import java.util.Scanner;

	public class trabajo4 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			   
			 Random random = new Random();
		      int numeroSecreto = random.nextInt(100) + 1; 
		        int intentos = 0;

		        System.out.println("Adivina el número secreto del 1 al 100");

		        while (true) {
		            try {
		                int numero = entrada.nextInt();
		                intentos++;

		                if (numero < numeroSecreto) {
		                    System.out.println("El número secreto es más alto. Intenta de nuevo: ");
		                } else if (numero > numeroSecreto) {
		                    System.out.println("El número secreto es más bajo. Intenta de nuevo: ");
		                } else {
		                    System.out.println("¡Ganaste! El número secreto era " + numeroSecreto + ".");
		                    System.out.println("Cantidad de intentos: " + intentos);
		                    break; 
		                }

		                if (intentos == 10) {
		                    System.out.println("Agotaste tus 10 intentos. El número secreto era " + numeroSecreto);
		                    break; 
		                }
		            } catch (java.util.InputMismatchException e) {
		                System.out.println("Por favor, ingresa un número válido.");
		                entrada.next(); 
		            }
		        }

		        entrada.close();
		    }
	}

}
