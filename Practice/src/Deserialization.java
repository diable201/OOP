import java.io.*;

public class Deserialization {
   	public static void main(String[] args) throws IOException, ClassNotFoundException {
       FileInputStream fis = new FileInputStream("info.out");
       ObjectInputStream ois = new ObjectInputStream(fis);
       StudentSer studentInfo = (StudentSer) ois.readObject();
       System.out.println(studentInfo);
       ois.close();
   	}
}
