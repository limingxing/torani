package org.coffeehouse.torani.supplier.repository;

import org.coffeehouse.torani.core.domain.supplier.Supplier;

/**
 * Created by limingxing on 1/3/15.
 */
@MyBatisRepository
public interface SupplierDao {
    Supplier get(Long supplierId);
}
