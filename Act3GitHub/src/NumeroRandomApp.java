import java.util.Random;

public class NumeroRandomApp {

  public static void main(String[] args) {
    
    // Imprime la cabecera
    System.out.println("20 Numeros aleatorios entre 0 y 10");
    
    int primerIntervalo = 0;
    int segundoIntervalo = 10;
    int i = 0;
    
    do {
      // Creamos un objeto de clase Random para generar el número aleatorio
      Random generadorNumerosAleatorios = new Random();
      // Obtenemos el valor del lado vertical
      int numero = generadorNumerosAleatorios.nextInt(primerIntervalo, segundoIntervalo);
      // Y lo mostramos
      System.out.println("La longitud del lado vertical obtenida al azar es de: " + numero);
      i++;
    } while (i <= 19);
    

  }

}