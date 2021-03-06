/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFearResource;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author fjcamillo
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {
    
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(SFearResource.ChangeResource.class);
        resources.add(SFearResource.ChangesResource.class);
        resources.add(SFearResource.HelloWorld.class);
        resources.add(SFearResource.HouseResource.class);
        resources.add(SFearResource.HousesResource.class);
        resources.add(SFearResource.RestaurantResource.class);
        resources.add(SFearResource.RestaurantsResource.class);
        resources.add(SFearResource.hiworldResource.class);
        resources.add(SFearResource.testResource.class);
    }
    
}
