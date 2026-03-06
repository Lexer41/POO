/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *rfc
 * primera letra del apellido paterno y la primera vocal
 * primera letra del apellido materno
 * primera letra del primer nombre
 * de la fecha de nacimiento dos del año 'año final', dos del mes y dos del dia
 * la homoclave son los ultimos 3 digitos asignados por el sat
 */
public class principal {
    
    public static void main(String[] args) throws IOException {
        String ap="", am="", nombre="", fecha="";
        validaciones val = new validaciones();
        operaciones oper = new operaciones();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            System.out.println("Escribe el nombre sin apellidos");
            nombre = leer.readLine();
            
            if(val.ValidarNombreYApellidos(nombre)){
                break;
            }else{
                System.out.println("Error, vuelve a introducirlo");
            }
        }
        
        while(true){
            System.out.println("Escribe el apellidos Paterno");
            ap = leer.readLine();
            
            if(val.ValidarNombreYApellidos(ap)){
                break;
            }else{
                System.out.println("Error, vuelve a introducirlo");
            }
        }
        
        while(true){
            System.out.println("Escribe el apellidos materno");
            am = leer.readLine();
            
            if(val.ValidarNombreYApellidos(am)){
                break;
            }else{
                System.out.println("Error, vuelve a introducirlo");
            }
        }
        System.out.println(" El nombre es: " + nombre + "\n y el apellido paterno: " + ap + "\n y el materno es: " + am);
        
        while(true){
            System.out.println("Escribe la fecha de nacimiento AAAA/MM/DD");
            fecha = leer.readLine();
            
            if(val.ValidarFecha(fecha)){
                break;
            }else{
                System.out.println("Error, vuelve a intentarlo");
            }
        }
        System.out.println("Fecha: " + fecha);
        
        oper.RFC(nombre, ap, am, fecha);
    }
}
