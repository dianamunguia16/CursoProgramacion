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
 // Fig. 5.27: Figuras.java
 /// Cómo dibujar una cascada de figuras con base en la elección del usuario.
 import java.awt.Graphics;
 import javax.swing.JPanel;

import java.awt.Graphics;
import javax.swing.JPanel;

 public class Figuras2 extends JPanel
 {
 private int opcion; // opción del usuario acerca de cuál figura dibujar

 // el constructor establece la opción del usuario
 public Figuras2(int opcionUsuario)
 {
 opcion = opcionUsuario;
 }

 // dibuja una cascada de figuras, empezando desde la esquina superior izquierda
 public void paintComponent(Graphics g)
 {
 super.paintComponent(g);

 for (int i = 0; i < 10; i++)
 {
 // elige la figura con base en la opción del usuario
 switch (opcion)
 {
 case 1: // dibuja rectángulos
 g.drawRect(10 + i * 10, 10 + i * 10,
 50 + i * 10, 50 + i * 10);
 break;
 case 2: // dibuja óvalos
 g.drawOval(10 + i * 10, 10 + i * 10,
 50 + i * 10, 50 + i * 10);
 break;
 }
 }
 }
 } // fin de la clase Figuras
