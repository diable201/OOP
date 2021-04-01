import java.io.*;

public class Serialization {
   	public static void main(String[] args) throws IOException, ClassNotFoundException {
       FileOutputStream fos = new FileOutputStream("info.out");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       StudentSer studentInfo = new StudentSer("Rias", "My Secret");
       oos.writeObject(studentInfo);
       oos.flush();
       oos.close();
   	}
}
