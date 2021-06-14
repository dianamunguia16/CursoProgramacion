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
public class PruebaPolizaAuto
 {
 public static void main(String[] args)
 {
 // crea dos objetos PolizaAuto
 PolizaAuto poliza1 = new PolizaAuto(11111111, "Toyota Camry", "NJ");
 PolizaAuto poliza2 = new PolizaAuto(22222222, "Ford Fusion", "ME");

 // muestra en pantalla si cada poliza está en un estado sin culpa
 polizaEnEstadoSinCulpa(poliza1);
 polizaEnEstadoSinCulpa(poliza2);
 }

 // método que muestra en pantalla si una PolizaAuto
 // se encuentra en un estado con seguro de auto sin culpa
 public static void polizaEnEstadoSinCulpa(PolizaAuto poliza)
 {
 System.out.println("La poliza de auto");
 System.out.printf("Cuenta #: %d; Auto: %s; Estado %s %s un estado sin culpa%n%n", poliza.obtenerNumeroCuenta(), poliza.obtenerMarcaYModelo(), poliza.obtenerEstado(),(poliza.esEstadoSinCulpa()));
 }
 } // 