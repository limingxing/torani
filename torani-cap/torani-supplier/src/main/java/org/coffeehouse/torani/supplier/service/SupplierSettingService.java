package org.coffeehouse.torani.supplier.service;

import org.coffeehouse.torani.core.domain.supplier.Supplier;
import org.coffeehouse.torani.supplier.repository.SupplierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by limingxing on 1/2/15.
 */
@Service
public class SupplierSettingService {

    @Autowired
    private SupplierDao supplierDao;

    public Supplier getSupplier(Long supplierId){
        return supplierDao.get(supplierId);
    }
}
