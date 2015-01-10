package org.coffeehouse.torani.management.portal;

import org.coffeehouse.torani.management.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by limingxing on 12/15/14.
 */
@Controller
@RequestMapping(value = "suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @RequestMapping
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView("supplier/list");
        supplierService.getAllSuppliers();
        return mav;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView add(){
        ModelAndView mav = new ModelAndView("supplier/add");
        return  mav;
    }

    @RequestMapping(value = "/modify/{supplierId}", method = RequestMethod.GET)
    public ModelAndView modify(@PathVariable Long supplierId){
        ModelAndView mav = new ModelAndView("supplier/modify");
        return  mav;
    }
}