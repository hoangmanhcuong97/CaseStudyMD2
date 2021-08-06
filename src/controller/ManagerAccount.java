package controller;

import model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerAccount {
    private List<Account> accounts = new ArrayList<>();

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

    public static Account creatAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap usename:");
        String name = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhap password");
        int password = sc1.nextInt();

        Account account = new Account(name, password);
        return account;
    }

    public void addAccount(){
        accounts.add(creatAccount());
    }
    public void deleteAccount(String username){
        for (int i = 0; i < accounts.size(); i++) {
            if(username.equals(accounts.get(i).getUserName())){
                accounts.remove(i);
                break;
            }
        }
    }
}
