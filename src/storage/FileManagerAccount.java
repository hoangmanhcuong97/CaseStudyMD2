package storage;

import model.Account;
import model.ListProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerAccount {
    public static void writeFileAccount(List<Account> managerAccount) throws IOException {
        FileOutputStream fos = new FileOutputStream("Account.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(managerAccount);
        oos.close();
        fos.close();
    }

    public static List<Account> readFileAccount() throws IOException, ClassNotFoundException {
        List<Account> readListAccount = new ArrayList<>();
        File file = new File("Account.txt");
        if(file.length() > 0){
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            readListAccount = (List<Account>) o;
            ois.close();
            fis.close();
        }
        return readListAccount;
    }
}
