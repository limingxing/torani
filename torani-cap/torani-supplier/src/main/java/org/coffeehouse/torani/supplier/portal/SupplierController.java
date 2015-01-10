package org.coffeehouse.torani.supplier.portal;

import org.coffeehouse.torani.core.domain.supplier.Supplier;
import org.coffeehouse.torani.supplier.service.SupplierSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by limingxing on 12/15/14.
 */
@RestController
@RequestMapping(value = "/suppliers")
public class SupplierController {

    @Autowired
    private SupplierSettingService supplierSettingService;

    @RequestMapping
    @ResponseStatus(HttpStatus.OK)
    public Set<Supplier> index(){
        long supplierId = 1;
        Set<Supplier> suppliers = new HashSet<Supplier>();
        Supplier s = supplierSettingService.getSupplier(supplierId);
        suppliers.add(s);
        return suppliers;
    }

    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public Supplier get(@PathVariable Long id){
        Supplier supplier = supplierSettingService.getSupplier(id);
        return supplier;
    }
}
