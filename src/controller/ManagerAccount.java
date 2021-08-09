package controller;

import model.Account;
import storage.FileManagerAccount;
import view.Client;
import view.Manager;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ManagerAccount {
    private List<Account> accounts;

    {
        try {
            accounts = FileManagerAccount.readFileAccount();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    public ManagerAccount() {
    }

    public ManagerAccount(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public static Account creatAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String name = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter password");
        int password = sc1.nextInt();

        Account account = new Account(name, password);
        return account;
    }

    public void addAccount() {
        accounts.add(creatAccount());
        try {
            FileManagerAccount.writeFileAccount(accounts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteAccount(String username) {
        for (int i = 0; i < accounts.size(); i++) {
            if (username.equals(accounts.get(i).getUserName())) {
                accounts.remove(i);
                break;
            }
        }
        try {
            FileManagerAccount.writeFileAccount(accounts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void directional(String username, int password) {
        Manager manager = new Manager();
        Client client = new Client();
        String condition = "quanly";
        try {
            List<Account> accounts = FileManagerAccount.readFileAccount();
            int indexAcc = -1;
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getUserName().equals(username) && accounts.get(i).getPassWord() == password) {
                    indexAcc = i;
                }
            }
            if (indexAcc != -1) {
                if (accounts.get(indexAcc).getUserName().contains(condition)) {
                    manager.viewManager();
                } else {
                    client.viewClient();
                }
            } else {
                System.out.println("Sai roi nhap lai di");
                login();
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Password");
        int password = scanner1.nextInt();

        directional(username, password);
    }

    public void showListAccount() {
        try {
            List<Account> accounts = FileManagerAccount.readFileAccount();
            for (Account a : accounts) {
                System.out.println(a);
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
