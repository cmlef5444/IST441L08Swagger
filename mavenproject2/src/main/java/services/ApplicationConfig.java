/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.wordnik.swagger.jaxrs.config.BeanConfig;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Chris Lefebvre
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
        resources.add(Resources.OrderResource.class);
        
        resources.add(com.wordnik.swagger.jersey.listing.ApiListingResourceJSON.class);
        resources.add(com.wordnik.swagger.jersey.listing.JerseyApiDeclarationProvider.class);
        resources.add(com.wordnik.swagger.jersey.listing.JerseyResourceListingProvider.class);
    }
    
    public ApplicationConfig(){
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("http://localhost:8080/mavenproject2/webresources");
        beanConfig.setResourcePackage("Resources, Data");
        beanConfig.setScan(true);
    }
    
}
