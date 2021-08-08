package view;

import controller.ManagerAccount;
import controller.ManagerListProduct;
import controller.ManagerProduct;

import java.util.Scanner;

public class Manager {
    public Manager() {
    }

    public void viewManager() {
        ManagerAccount managerAccount = new ManagerAccount();
        int number = -1;
        while (number != 0){
            System.out.println("Menu:");
            System.out.println("1.Quan ly danh muc san pham");
            System.out.println("2.Quan ly san pham");
            System.out.println("3.Xoa tai khoan");
            System.out.println("0.Thoat");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            switch (number){
                case 1:
                    managerListProduct();
                    break;
                case 2:
                    managerMethodProduct();
                    break;
                case 3:
                    managerAccount.showListAccount();
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhap ten tai khoan can xoa");
                    String name1 = scanner.nextLine();
                    managerAccount.deleteAccount(name1);
                    managerAccount.showListAccount();
                    break;
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
                    System.out.println("Nhap so san pham muon them");
                    int number = scanner.nextInt();
                    for (int i = 0; i < number; i++) {
                        managerListProduct.addListProduct();
                    }
                    break;
                case 2:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Nhap ten can xoa:");
                    String name = scanner1.nextLine();
                    managerListProduct.deleteListProduct(name);
                    break;
                case 3:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Nhap ten can sua:");
                    String name1 = scanner2.nextLine();
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

    static void managerMethodProduct(){
        Scanner sc = new Scanner(System.in);
        ManagerProduct managerProduct = new ManagerProduct();

        int chose = -1;
        while (chose != 0){
            System.out.println("Quan ly san pham");
            System.out.println("1.Them san pham");
            System.out.println("2.Xoa san pham");
            System.out.println("3.Sua san pham");
            System.out.println("4.Sap xep san pham theo gia");
            System.out.println("5.Hien thi chi tiet san pham");
            System.out.println("6.Loc danh sach hien thi theo ten danh muc");
            System.out.println("0.Thoat");
            chose = sc.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Nhap so luong san pham muon them:");
                    int number = sc.nextInt();
                    for (int i = 0; i < number; i++) {
                        managerProduct.addProduct();
                    }
                    break;
                case 2:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Nhap ten san pham muon sua:");
                    String name = sc1.nextLine();
                    managerProduct.editProduct(name);
                    break;
                case 3:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Nhap ten san pham muon xoa:");
                    String name1 = sc2.nextLine();
                    managerProduct.deleteProduct(name1);
                    break;
                case 4:
                    managerProduct.sortProduct();
                    managerProduct.showAll1();
                    break;
                case 5:
                    managerProduct.showAll1();
                    break;
                case 6:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Nhap ten san pham can tim");
                    String name2 = sc3.nextLine();
                    managerProduct.showNameListProduct(name2);
                    break;
            }
        }
    }
}
