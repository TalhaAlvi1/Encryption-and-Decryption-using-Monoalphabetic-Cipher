# Monoalphabetic Cipher in Java

This project demonstrates a simple implementation of encryption and decryption using a monoalphabetic cipher in Java. A monoalphabetic cipher maps each letter in the plaintext alphabet to a unique letter in the ciphertext alphabet.

## Project Overview

This Java program performs encryption and decryption without using any additional libraries or complex functions. It provides a basic understanding of how monoalphabetic substitution ciphers work, making it an excellent resource for beginners interested in cryptography.

## Features

- **Encrypts plaintext** using a predefined substitution alphabet.
- **Decrypts ciphertext** back to plaintext.
- Keeps non-alphabet characters (e.g., spaces, punctuation) unchanged.

# Algorithm

**1. Set up your alphabet and cipher key:**

   - Create a string containing the alphabet in order, e.g., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'.

   - Create another string for the cipher key, a shuffled version of the alphabet (e.g., 'QWERTYUIOPLKJHGFDSAZXCVBNM').

**2. Get user input:**

   - Ask the user to enter a message they want to encrypt using only uppercase letters.

**3. Encrypt each letter:**

   - For each letter in the user’s message:

      - Find the letter's position (index) in the alphabet.

      - Replace it with the letter at the same position in the cipher key.

      - If a character (like a space) isn't in the alphabet, keep it as is.

**4. Show the encrypted message:**

   - Display the encrypted version of the message to the user.

# Explanation


The monoalphabetic cipher is a substitution cipher where each letter in the plaintext message is mapped to a unique letter 

in the ciphertext based on a predefined key. This approach only requires two sets of characters: 

1) The standard alphabet and 

2) A shuffled version of this alphabet as the cipher key.

In this cipher, each character in the plaintext is substituted based on its position in the standard alphabet. 

For example, if the key is "QWERTYUIOPLKJHGFDSAZXCVBNM" and the message is "TALHA" then:
   - 'T' is mapped to 'Z',
   - 'A' is mapped to 'Q',
   - 'L' is mapped to 'K', and
   - 'H' is mapped to 'I',
resulting in the encrypted message "ZQKIQ".
