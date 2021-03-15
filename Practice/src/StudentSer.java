import java.util.Base64;
import java.io.*;


public class StudentSer implements Externalizable {
    private String name;
    private String secret;

    public StudentSer() {}

    public StudentSer (String name, String secret) {
        this.name = name;
        this.secret = secret;
    }

    public String getName() {
        return name;
    }

    public String getSecret() {
        return secret;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getName());
        out.writeObject(this.encryptString(this.getSecret()));
    }

    @Override
    public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
        name = (String) in.readObject();
        secret = this.decryptString((String) in.readObject());
    }

    private String encryptString(String data) {
        String encryptedData = Base64.getEncoder().encodeToString((data.getBytes()));
        System.out.println("Encryption is succesful: " + encryptedData);
        return encryptedData;
    }
 
    private String decryptString(String data) {
        String decryptedData = new String(Base64.getDecoder().decode(data));
        System.out.println("Decryption is succesful: " + decryptedData);
        return decryptedData;
    }
    
    public String toString() {
    	return "Name: " + name + " Secret: " + secret;
    }
}
