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
public class PolizaAuto
 {
 private int numeroCuenta; // número de cuenta de la póliza
 private String marcaYModelo; // auto al que se aplica la póliza
 private String estado; // abreviación del estado en dos letras

 // constructor
 public PolizaAuto(int numeroCuenta, String marcaYModelo, String estado)
 {
 this.numeroCuenta = numeroCuenta;
 this.marcaYModelo = marcaYModelo;
 this.estado = estado;
 }

 // establece el numeroCuenta
 public void establecerNumeroCuenta(int numeroCuenta)
 {
 this.numeroCuenta = numeroCuenta;
 }

 // devuelve el numeroCuenta
 public int obtenerNumeroCuenta()
 {
 return numeroCuenta;
 }

 // establece la marcaYModelo
 public void establecerMarcaYModelo(String marcaYModelo)
 {
 this.marcaYModelo = marcaYModelo;
 }

 // devuelve la marcaYModelo
 public String obtenerMarcaYModelo()
 {
 return marcaYModelo;
 }

 // establece el estado
 public void establecerEstado(String estado)
 {
     this.estado = estado;
 }
  public String obtenerEstado()
 {
 return estado;
 }

 // método predicado que devuelve si el estado tiene seguro sin culpa
 public boolean esEstadoSinCulpa()
 {
 boolean estadoSinCulpa;

 // determina si el estado tiene seguro de auto sin culpa
 switch (obtenerEstado()) // obtiene la abreviación del estado del objeto
 {
 case "MA": case "NJ": case "NY": case "PA":
 estadoSinCulpa = true;
 break;
 default:
 estadoSinCulpa = false;
 break;
 }

 return estadoSinCulpa;
 }
 }
 //NOTA IMPORTANTE SWITCH ES COMO UN IF EN CASOS, QUE PASA SI
 