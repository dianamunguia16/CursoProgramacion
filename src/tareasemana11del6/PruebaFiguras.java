/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasemana11del6;

/**
 *
 * @author diana
 */
import javax.swing.JFrame; // maneja la visualización
 import javax.swing.JOptionPane;

 public class PruebaFiguras
 {
 public static void main(String[] args)
 {
 // obtiene la opción del usuario
 String entrada = JOptionPane.showInputDialog("Escriba 1 para dibujar rectangulos\n" + "Escriba 2 para dibujar ovalos");

 int opcion = Integer.parseInt(entrada); // convierte entrada en int

 // crea el panel con la entrada del usuario
 Figuras2 panel = new Figuras2(opcion);

 JFrame aplicacion = new JFrame(); // crea un nuevo objeto JFrame

 aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 aplicacion.add(panel);
 aplicacion.setSize(300, 300);
 aplicacion.setVisible(true);
 }
 } 