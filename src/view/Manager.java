package view;

import controller.ManagerListProduct;
import storage.FileManagerListProduct;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        int number = -1;
        while (number != 0){
            System.out.println("Menu:");
            System.out.println("1.Quan ly danh muc san pham");
            System.out.println("2.Quan ly san pham");
            System.out.println("0.Thoat");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            switch (number){
                case 1:
                    managerListProduct();
                    break;
                case 2:
            }
        }
    }

    static void managerListProduct(){
        Scanner scanner = new Scanner(System.in);
        ManagerListProduct managerListProduct = new ManagerListProduct();

        int chose = -1;
        while (chose != 0){
            System.out.println("Quan ly danh muc san pham:");
            System.out.println("1.Them loai san pham");
            System.out.println("2.Xoa loai san pham");
            System.out.println("3.Sua loai san pham");
            System.out.println("4.Sap xep loai san pham theo ten");
            System.out.println("5.Hien thi danh muc san pham");
            System.out.println("0.Thoat");
            chose = scanner.nextInt();
            switch (chose){
                case 1:
                    managerListProduct.addListProduct();
                    break;
                case 2:
                    System.out.println("Nhap ten can xoa:");
                    String name = scanner.nextLine();
                    managerListProduct.deleteListProduct(name);
                    break;
                case 3:
                    System.out.println("Nhap ten can sua:");
                    String name1 = scanner.nextLine();
                    managerListProduct.editListProduct(name1);
                    break;
                case 4:
                    managerListProduct.sortListProduct();
                    break;
                case 5:
                    managerListProduct.showAll();
                    break;
            }
        }
    }
}
