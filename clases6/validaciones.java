/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases6;

/**
 *
 * @author perez
 */
public class validaciones {
    
    public boolean ValidarNombreYApellidos(String dato){
        int c = 0;
        
        for(int i=0; i<dato.length(); i++){
            //97-122 minusculas: codigo ASKII
            //32 espacio
            //65-90 mayusculas
            if(dato.codePointAt(i) >= 97 && dato.codePointAt(i) <= 122){
                c++;
            }
            if(dato.codePointAt(i) >= 65 && dato.codePointAt(i) <= 90){
                c++;
            }
            if(dato.codePointAt(i) == 32){
                c++;
            }
        }
        
        if(c == dato.length()){
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean ValidarFecha(String f){
        boolean r = false;
        int c = 0;
        
        /*int p = f.indexOf("/");
        int p2 = f.indexOf("/", p + 1);*/
        
        String [] n = f.split("/");
        
        if(n.length == 3){
            
            for(int x=0; x<3;x++){
                r = ValidarNumeros(n[x]);
                if(r == true){
                    c++;
                }
            }
            
            if(c == 3){
                return true;
            }else{
                return false;
            }
            
        }else{
            return false;
        }
    }
    
    private boolean ValidarNumeros(String d){
        
        try{
            int a = Integer.parseInt(d);
            return true;
        }catch(Exception e){
            return false;
        }
        
    }
    
}
