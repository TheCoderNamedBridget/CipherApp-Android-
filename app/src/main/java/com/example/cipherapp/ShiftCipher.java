package com.example.cipherapp;

public class ShiftCipher implements Cipher{
    final int lengthOfAlphabet = 52;
    String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
    String cipherbet = "";
    String name = "";
    String encryptedMessage = "";
    String decryptedMessage = "";
    int shiftAmount;

    //initiatizes ShiftCipher bet
    ShiftCipher( int shiftAmount )
    {
        this.name = "shift";
        this.shiftAmount = shiftAmount;

        for ( int i = 0; i < lengthOfAlphabet; i ++ )
        {
            // System.out.println( cipherbet + " " + (shiftAmount + i) % lengthOfAlphabet + " " + alphabet.substring((shiftAmount + i) % lengthOfAlphabet,((shiftAmount + i) % lengthOfAlphabet) + 1));
            cipherbet += alphabet.substring((shiftAmount + i) % lengthOfAlphabet,((shiftAmount + i) % lengthOfAlphabet) + 1);
        }


    }

    //get's the user information: kind of cipher and message, decrypt or encrypt
    public void getUserInput()
    {
        System.out.println("will get user input from text fields and then initialize a shft cipher object");
    }

    //displays for the user the way that th cipher works
    //in android studio will access text fields and change them to show steps
    public void displaySteps()
    {
        System.out.println("steps");
    }

    //encrypts the message
    public String encrypt( String message )
    {
        String nextChar = "";
        encryptedMessage="";
        for ( int i = 0; i < message.length(); i++ )
        {
            nextChar = message.substring(i,i+1);
            if ( nextChar.equals(" "))
            {
                encryptedMessage += " ";
            }
            else
            {
                encryptedMessage += cipherbet.substring(alphabet.indexOf(nextChar, 0),alphabet.indexOf(nextChar, 0)+1);
            }

        }
        // System.out.println(encryptedMessage);
        return encryptedMessage;
    }

    //decrypts the message
    public String decrypt( String message )
    {
        String nextChar = "";
        decryptedMessage="";
        for ( int i = 0; i < message.length(); i++ )
        {
            nextChar = message.substring(i,i+1);
            if ( nextChar.equals(" "))
            {
                decryptedMessage += " ";
            }
            else
            {
                decryptedMessage += alphabet.substring(cipherbet.indexOf(nextChar, 0),cipherbet.indexOf(nextChar, 0)+1);
            }

        }
        // System.out.println(decryptedMessage);
        return decryptedMessage;
    }

}
