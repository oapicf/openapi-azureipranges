package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.ServiceTagsPublic20240318JsonApiServiceImpl;

@ApplicationPath("/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(ServiceTagsPublic20240318JsonApiServiceImpl.class);

        return resources;
    }




}