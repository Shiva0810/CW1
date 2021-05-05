import java.io.File;
 
/**
 * A tester for the CryptoUtils class.
 * @author www.codejava.net
 *
 */
public class test {
    public static void main(String[] args) {
        String key = "he has only one dog";
        File inputFile = new File("plain.txt");
        File encryptedFile = new File("document.encrypted");
        File decryptedFile = new File("document.decrypted");
         
        test.encrypt(key, inputFile, encryptedFile);
        test.decrypt(key, encryptedFile, decryptedFile);
    }

    private static void encrypt(String key, File inputFile, File encryptedFile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void decrypt(String key, File encryptedFile, File decryptedFile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    