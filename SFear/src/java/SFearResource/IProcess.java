/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFearResource;

import org.json.JSONObject;
/**
 *
 * @author fjcamillo
 */
public interface IProcess {
    
    //Creating a generic request parameter which is Object
    public JSONObject process(Object obj);

    //Method overload.
    public JSONObject process();
}
