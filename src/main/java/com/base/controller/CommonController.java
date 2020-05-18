
package com.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author TungAnhFaber
 * @email phamtunganh@fabercompany.co.jp
 */
@Controller
public class CommonController {
    
    @GetMapping("/")
    public String hello(){
        return "index";
    }
}
