package controller;

import model.Product;

import java.util.*;

public class ManagerProduct {
    private String nameTypeProduct;
    private List<Product> products = new ArrayList<>();

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
    }

    public void editProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if(name.equals(products.get(i).getNameProduct())){
                products.set(i, creatProduct());
            }
        }
    }

    public void deleteProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if(name.equals(products.get(i).getNameProduct())){
                products.remove(i);
                break;
            }
        }
    }

    public void sortProduct() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPriceProduct() > o2.getPriceProduct() ? -1 : 1;
            }
        });
    }
//    public int findNameProduct(String nameProduct){
//        int index = -1;
//        for (int i = 0; i < products.size(); i++) {
//            if(nameProduct.equals(products.get(i).getNameProduct())){
//                index = i;
//            }
//        }
//        return index;
//    }

    public static void showAll(ManagerProduct managerProduct){
        for (Product a: managerProduct.getProducts()) {
            System.out.println(a);
        }
    }


}
