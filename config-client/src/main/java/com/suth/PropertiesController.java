package com.suth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Autowired
    private DbConfiguration dbConfiguration;

    @GetMapping("/config")
    public DbConfiguration getDbConfiguration(){
        return dbConfiguration;
    }
}
