/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFearResource;
import java.util.ArrayList;
/**
 *
 * @author fjcamillo
 */
public class holder {
    private static ArrayList<variableholder> vart = new ArrayList<variableholder>();
    private static String bulb;
    public holder(){
        variableholder var1 = new variableholder("off");
        variableholder var2 = new variableholder("off");
        variableholder var3 = new variableholder("off");
        variableholder var4 = new variableholder("off");
        bulb = "off";
        if(vart.size() == 0){
            vart.add(var1);
            vart.add(var2);
            vart.add(var3);
            vart.add(var4);
//            System.out.println("4");
        }
    }
    
    public static ArrayList<variableholder> getVar(){
            return vart;
        }
    public static String getBulb(){
        return bulb;
    }
    
    public static void setBulb(String bulbs){
        bulb = bulbs;
    }
}
