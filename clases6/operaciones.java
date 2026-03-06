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
public class operaciones {
    
    public void RFC(String n, String ap, String am, String fecha){
        String rfc = "";
        
        //System.out.println(n.toUpperCase() + " " + ap.toUpperCase() + " " + am.toUpperCase() + " " + fecha);
        
        n = n.toLowerCase();
        ap = ap.toLowerCase();
        am = am.toLowerCase();
        n = n.replace("de", "");
        n = n.replace("ma de", "");
        n = n.replace("la", "");
        ap = ap.replaceAll("de", "");
        ap = ap.replaceAll("la", "");
        am = am.replaceAll("de", "");
        am = am.replaceAll("la", "");
        
        n = n.toUpperCase();
        ap = ap.toUpperCase();
        am = am.toUpperCase();
        
        if(ap.codePointAt(1) == 65 || ap.codePointAt(1) == 69 || ap.codePointAt(1) == 73 || ap.codePointAt(1) == 79 || ap.codePointAt(1) == 85){
            rfc = ap.substring(0, 2);
        }else{
            rfc = rfc + ap.charAt(0);
            rfc = rfc + ap.charAt(2);
        }
        rfc = rfc + am.charAt(0);
        rfc = rfc + n.charAt(0);
        
        System.out.println(rfc);
        
        String [] f = fecha.split("/");
        rfc = rfc + f[0].substring(2);
        rfc = rfc + f[1];
        rfc = rfc + f[2];
        
        System.out.println(rfc);
    }
}