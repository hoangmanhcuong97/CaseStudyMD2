package view;

import controller.ManagerAccount;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerAccount managerAccount = new ManagerAccount();
        int chose = -1;
        while (chose != 0){
            System.out.println("1.Sign Account");
            System.out.println("2.Login");
            System.out.println("0.Exit");
            chose = sc.nextInt();
            switch (chose){
                case 1:
                    managerAccount.addAccount();
                    System.out.println("Dang ky thanh cong!");
                    break;
                case 2:
                    managerAccount.login();
                    break;
            }
        }
    }

}
