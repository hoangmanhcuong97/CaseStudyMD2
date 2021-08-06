package model;

import java.io.Serializable;

public class Product implements Serializable {
    private String nameProduct;
    private String describeProduct;
    private double priceProduct;
    private int numberOfProduct;

    public Product() {
    }

    public Product(String nameProduct, String describeProduct, double priceProduct, int numberOfProduct ) {
        this.nameProduct = nameProduct;
        this.describeProduct = describeProduct;
        this.priceProduct = priceProduct;
        this.numberOfProduct = numberOfProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescribeProduct() {
        return describeProduct;
    }

    public void setDescribeProduct(String describeProduct) {
        this.describeProduct = describeProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "nameProduct='" + nameProduct + '\'' +
                ", describeProduct='" + describeProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", numberOfProduct=" + numberOfProduct +
                '}';
    }
}
