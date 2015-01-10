package org.coffeehouse.torani.supplier.portal;

import org.coffeehouse.torani.core.domain.supplier.Supplier;
import org.coffeehouse.torani.supplier.service.SupplierSettingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by limingxing on 12/15/14.
 */
@RestController
@RequestMapping(value = "/suppliers")
public class SupplierController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SupplierSettingService supplierSettingService;

    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public Supplier get(@PathVariable Long id){
        logger.info(MessageFormat.format("get id:{0}", id));
        Supplier supplier = supplierSettingService.getSupplier(id);
        return supplier;
    }
}
