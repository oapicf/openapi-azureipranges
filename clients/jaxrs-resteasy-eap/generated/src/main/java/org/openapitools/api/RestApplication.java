package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.DefaultApiServiceImpl;

@ApplicationPath("/download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(DefaultApiServiceImpl.class);

        return resources;
    }




}