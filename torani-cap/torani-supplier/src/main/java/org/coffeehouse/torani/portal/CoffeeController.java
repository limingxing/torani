package org.coffeehouse.torani.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by limingxing on 12/15/14.
 */
@Controller
@RequestMapping(value = "/coffee")
public class CoffeeController {

    @RequestMapping
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("coffee/latte");
        return  mav;
    }
}
