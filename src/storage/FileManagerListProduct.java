package storage;

import model.ListProduct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerListProduct {
    public static void writeFileListProduct(List<ListProduct> managerListProduct) throws IOException {
        FileOutputStream fos = new FileOutputStream("ListProduct.txt",true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(managerListProduct);
        oos.close();
        fos.close();
    }

    public static void writeFileListProduct1(List<ListProduct> managerListProduct) throws IOException {
        FileOutputStream fos = new FileOutputStream("ListProduct.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(managerListProduct);
        oos.close();
        fos.close();
    }

    public static List<ListProduct> readFileListProduct() throws IOException, ClassNotFoundException {
        List<ListProduct> readListProduct = new ArrayList<>();
        File file = new File("ListProduct.txt");
        if(file.length() > 0){
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            readListProduct = (List<ListProduct>) o;
            ois.close();
            fis.close();
        }
        return readListProduct;
    }
}
