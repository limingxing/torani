package org.coffeehouse.torani.core.domain.supplier;

/**
 * Created by limingxing on 12/25/14.
 */
public class Supplier {
    private Integer supplierId;
    private String supplierName;

    public Supplier() {
    }

    public Supplier(Integer supplierId, String supplierName) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }
}
