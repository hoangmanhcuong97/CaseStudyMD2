package controller;

import model.Product;
import storage.FileManagerProduct;

import java.io.IOException;
import java.util.*;

public class ManagerProduct {
    private String nameTypeProduct;
    private List<Product> products;

    {
        try {
            products = FileManagerProduct.readFileProduct();
        }  catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    public ManagerProduct() {
    }

    public ManagerProduct(String nameTypeProduct, List<Product> products) {
        this.nameTypeProduct = nameTypeProduct;
        this.products = products;
    }

    public String getNameTypeProduct() {
        return nameTypeProduct;
    }

    public void setNameTypeProduct(String nameTypeProduct) {
        this.nameTypeProduct = nameTypeProduct;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public static Product creatProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm:");
        String nameProduct = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Miêu tả sản phẩm:");
        String describeProduct = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Giá bán 1 sản phẩm:");
        double priceProduct = sc2.nextDouble();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Số lượng:");
        int numberOfProduct = sc3.nextInt();

        Product product = new Product(nameProduct, describeProduct, priceProduct, numberOfProduct);
        return product;
    }

    public void addProduct() {
        products.add(creatProduct());
        try {
            FileManagerProduct.writeFileProduct(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if(name.equals(products.get(i).getNameProduct())){
                products.set(i, creatProduct());
            }
        }
        try {
            FileManagerProduct.writeFileProduct(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if(name.equals(products.get(i).getNameProduct())){
                products.remove(i);
                break;
            }
        }
        try {
            FileManagerProduct.writeFileProduct(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortProduct() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPriceProduct() > o2.getPriceProduct() ? -1 : 1;
            }
        });
    }


    public void showAll1(){
        try {
            List<Product> products = FileManagerProduct.readFileProduct();
            for (Product p : products) {
                System.out.println(p);
            }
        }  catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }


}
