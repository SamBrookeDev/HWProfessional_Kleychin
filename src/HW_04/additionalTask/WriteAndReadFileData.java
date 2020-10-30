package HW_04.additionalTask;

import java.awt.image.DataBuffer;
import java.io.*;

public class WriteAndReadFileData {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\Google Диск\\J\\ITVDN\\HWProfessional_Kleychin\\src\\HW_04\\additionalTask\\data.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\Google Диск\\J\\ITVDN\\HWProfessional_Kleychin\\src\\HW_04\\additionalTask\\data.txt")))) {
            out.writeUTF("Меня зовут Виталий и я реальный кекс");
            out.flush();
            System.out.println("Read text " + in.readUTF());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
