package com.edw.controller;

import com.edw.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    
    @Autowired
    private IndexService indexService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap, String username){
        if(username != null)
            modelMap.put("username", indexService.doSomething(username));
        return "index";
    }
}
