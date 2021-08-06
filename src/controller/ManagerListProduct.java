package controller;

import model.ListProduct;
import storage.FileManagerListProduct;

import java.io.IOException;
import java.util.*;

public class ManagerListProduct {

    private List<ListProduct> productList;

    {
        try {
            productList = FileManagerListProduct.readFileListProduct();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ManagerListProduct() {
    }

    public ManagerListProduct(List<ListProduct> productList) {
        this.productList = productList;
    }

    public List<ListProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<ListProduct> productList) {
        this.productList = productList;
    }

    public static ListProduct creatListProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai san pham");
        String nameTypeProduct = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhap tong so luong san pham");
        int totalProduct = sc1.nextInt();

        ListProduct list = new ListProduct(nameTypeProduct, totalProduct);
        return list;
    }

    public void addListProduct() {
        ListProduct newList = creatListProduct();
        productList.add(newList);
        try {
            FileManagerListProduct.writeFileListProduct(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editListProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getTypeProduct())) {
                productList.set(i, creatListProduct());
                break;
            }
        }
        try {
            FileManagerListProduct.writeFileListProduct1(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void deleteListProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getTypeProduct())) {
                productList.remove(i);
            }
        }
        try {
            FileManagerListProduct.writeFileListProduct1(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void sortListProduct() {
        Collections.sort(productList, new Comparator<ListProduct>() {
            @Override
            public int compare(ListProduct o1, ListProduct o2) {
                return o1.getTypeProduct().compareTo(o2.getTypeProduct());
            }
        });
    }

    public void showAll() {
        try {
            List<ListProduct> listProducts = FileManagerListProduct.readFileListProduct();
            for (ListProduct listProduct : listProducts) {
                System.out.println(listProduct);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ManagerListProduct managerListProduct = new ManagerListProduct();
        managerListProduct.addListProduct();
        System.out.println(managerListProduct.productList);
        managerListProduct.addListProduct();
        System.out.println(managerListProduct.productList);
        List<ListProduct> listProducts = FileManagerListProduct.readFileListProduct();
        System.out.println(listProducts);
    }
}
