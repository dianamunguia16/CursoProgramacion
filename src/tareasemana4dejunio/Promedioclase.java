package tareasemana4dejunio;
// Fig. 4.8: PromedioClase.java
 // Cómo solucionar el problema del promedio de la clase mediante la repetición
 //controlada por contador.
 import java.util.Scanner; // el programa usa la clase Scanner

public class Promedioclase {

    public static void main(String[] args) {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        // fase de inicialización
        int total = 0; // inicializa la suma de calificaciones introducidas por el usuario
        int contadorCalificaciones = 1; // inicializa # de calificación a
        //introducir a continuación  la fase de procesamiento usa la repetición controlada por contador
        while (contadorCalificaciones <= 10) // itera 10 veces
        {
            System.out.print("Escriba la calificacion: "); // indicador
            int calificacion = entrada.nextInt(); // recibe siguiente calificación
             total = total + calificacion; // suma calificación al total
            contadorCalificaciones = contadorCalificaciones + 1; // incrementa el
 }
        //Saca el promedio de las calificaciones
        
        
        //Imprimir las variables
        
        
      }
     }
