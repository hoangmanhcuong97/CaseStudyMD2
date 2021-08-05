package model;

import java.util.List;

public class ListProduct {
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
        return "ListProduct{" +
                "typeProduct='" + typeProduct + '\'' +
                ", totalNumber=" + totalNumber +
                '}';
    }
}
