package model;

import java.io.Serializable;


public class ListProduct implements Serializable {
    private String typeProduct;
    private int totalNumber;

    public ListProduct(String typeProduct, int totalNumber) {
        this.typeProduct = typeProduct;
        this.totalNumber = totalNumber;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    @Override
    public String toString() {
        return "\ntypeProduct='" + typeProduct + '\'' +
                ", totalNumber=" + totalNumber ;
    }
}
