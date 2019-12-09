/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.st52530.citest;

import javax.swing.text.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author tomas
 */
@RestController
public class Requests {
    
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap map){
        
        return "LOGIN PAGE.";
    }
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String showRootPage(){
        return "Root";
    }
}
