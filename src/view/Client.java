package view;

import controller.ManagerListProduct;
import controller.ManagerProduct;

import java.util.Scanner;

public class Client {
    public Client() {
    }

    public void viewClient() {
        ManagerListProduct man = new ManagerListProduct();
        ManagerProduct mana = new ManagerProduct();
        int number = -1;
        while (number != 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1.Hien thi danh sach san pham ");
            System.out.println("2.Hien thi thong tin san pham");
            System.out.println("3.Hien thi danh sach san pham ban muon tim:");
            System.out.println("4.Hien thi danh sach san pham duoc sap xep theo gia");
            System.out.println("5.Tim kiem san pham theo ten");
            System.out.println("6.Dat mua san pham");
            System.out.println("0.Thoat");
            number = scan.nextInt();
            switch (number){
                case 1:
                    man.showAll();
                    break;
                case 2:
                    mana.showAll1();
                    break;
                case 3:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhap ten danh muc san pham ban muon tim:");
                    String nameListProduct = sc.nextLine();
                    mana.showNameListProduct(nameListProduct);
                    break;
                case 4:
                    mana.sortProduct();
                    mana.showAll1();
                    break;
                case 5:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Nhap ten san pham ban muon tim");
                    String nameProduct = sc1.nextLine();
                    mana.findNameProduct(nameProduct);
                    break;
                case 6:
                    mana.showAll1();
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhap ten san pham ban muon mua");
                    String name = scanner.nextLine();
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Nhap so luong ban muon mua");
                    int amount = scanner1.nextInt();
                    mana.buyProduct(name, amount);
                    System.out.println("Tong so tien:");
                    mana.countMoney(name,amount);
                    mana.showAll1();
                    break;
            }
        }
    }

}
