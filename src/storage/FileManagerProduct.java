package storage;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerProduct {
    public static void writeFileProduct(List<Product> managerProduct) throws IOException {
        FileOutputStream fos = new FileOutputStream("Product.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(managerProduct);
        oos.close();
        fos.close();
    }

    public static List<Product> readFileProduct() throws IOException, ClassNotFoundException {
        List<Product> readProduct = new ArrayList<>();
        File file = new File("Product.txt");
        if(file.length() > 0){
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            readProduct = (List<Product>) o;
            System.out.println(readProduct);
            ois.close();
            fis.close();
        }
        return readProduct;
    }
}
