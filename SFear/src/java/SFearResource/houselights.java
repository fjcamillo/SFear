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
public class houselights {
    private static String kitchenBulb = "off";    
    private static String livingBulb= "off"; 
    private static String bedroomBulb= "off"; 
    private static String crBulb= "off"; 
    
    public houselights(){    }
    
    public static String getKitchenBulb(){return kitchenBulb;}
    public static String getLivingBulb(){return livingBulb;}
    public static String getBedRoomBulb(){return bedroomBulb;}
    public static String getCRBulb(){return crBulb;}
    
    public static void setKitchenBulb(String bulbs){kitchenBulb=bulbs;}
    public static void setLivingBulb(String bulbs){livingBulb=bulbs;}
    public static void setBedRoomBulb(String bulbs){bedroomBulb=bulbs;}
    public static void setCRBulb(String bulbs){crBulb=bulbs;}
}
