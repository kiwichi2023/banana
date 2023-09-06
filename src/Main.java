
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alumnog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

     System.out.println("Ingrese los nombres de los alumnos ");

     Scanner entrada = new Scanner (System.in);

String alumnos = entrada.nextLine();

String [] resultado = new Operacion ().separar(alumnos);

for (String s : resultado){
String []datosSeparados = new Operacion().determinar (s);
    System.out.println("[id: "+ datosSeparados[0]+"]"+ " [nombre: "+ datosSeparados[3]+"]"+ " [apellido: "+datosSeparados [1]+"]");
    System.out.println(s);
}
/*String [] alumnos = oracion.split (" , ");
for (String a : alumno){
String[] alumno = a.split (" ");
String id = alumno[0];
String primerNombre = alumno [3];
String primerApellido = alumno [1];
System.out.println ("ID: "+ id + " - "+ primerNombre+ " "+ primerApellido0);
}


  */  
    }
    
}
