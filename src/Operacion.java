/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumnog
 */
public class Operacion {
    public String [] separar (String oracion){

   String [] resultado = oracion.split(",");

  
       return resultado;

}
public String []determinar (String datos){
String []conjuntoDatos = datos.split(" ");
return conjuntoDatos;
}

}
