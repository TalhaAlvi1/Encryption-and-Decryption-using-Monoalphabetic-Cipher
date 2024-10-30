import java.util.Scanner;

public class MonoalphabeticCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String plainAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cipherAlphabet = "QWERTYUIOPASDFGHJKLZXCVBNM"; 
        System.out.print("Enter plaintext (in uppercase): ");
        String plaintext = scanner.nextLine();

        String encryptedText = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char plainChar = plaintext.charAt(i);
            int index = plainAlphabet.indexOf(plainChar);
            if (index != -1) { // Check if the character is a letter
                encryptedText += cipherAlphabet.charAt(index);
            } else {
                encryptedText += plainChar; 
            }
        }

        System.out.println("Encrypted text: " + encryptedText);

        String decryptedText = "";
        for (int i = 0; i < encryptedText.length(); i++) {
            char cipherChar = encryptedText.charAt(i);
            int index = cipherAlphabet.indexOf(cipherChar);
            if (index != -1) { // Check if the character is a letter
                decryptedText += plainAlphabet.charAt(index);
            } else {
                decryptedText += cipherChar; 
            }
        }

        System.out.println("Decrypted text: " + decryptedText);

        scanner.close();
    }
}
