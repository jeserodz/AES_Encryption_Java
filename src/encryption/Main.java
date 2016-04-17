package encryption;


public class Main {

    public static void main(String[] args) {
        // AES PARAMS (DO NOT MODIFY)
        final String IV = "F27D5C9927726BCEFE7510B1BDD3D137";
        final String SALT = "3FF2EC019C627B945225DEBAD71A01B6985FE84C95A70EB132882F88C0A59A55";
        final int KEY_SIZE = 128;
        final int ITERATION_COUNT = 10;
        // END-OF AES PARAMS
        
        // INITIALIZE THE AES ENCRYPTION UTILITY OBJECT
        AesUtil util = new AesUtil(KEY_SIZE, ITERATION_COUNT);
        
        // THE PASSPHRASE WILL BE THE USER PASSWORD
        String PASSPHRASE = "secret";
        
        // ENCRYPT
        final String PLAIN_TEXT = "{ message: 'my message' }";
        String encrypt = util.encrypt(SALT, IV, PASSPHRASE, PLAIN_TEXT);
        System.out.println("Encrypted: " + encrypt);
        
        // DECRYPT
        final String CIPHER_TEXT = "FAtrpfFFUoEBqC1hspiT2JwiPAfCGlQ7YBYCO7z17dI=";
        String decrypt = util.decrypt(SALT, IV, PASSPHRASE, CIPHER_TEXT);
        System.out.println("Decrypted: " + decrypt);
    }
    
}