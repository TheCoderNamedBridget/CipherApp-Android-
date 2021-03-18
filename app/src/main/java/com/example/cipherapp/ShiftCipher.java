package com.example.cipherapp;

public class ShiftCipher implements Cipher{
    String [] alphabet = new String[26];
    String [] cipherbet = new String[26];
    String name;
    String message;
    int shiftAmount;

    //initiatizes ShiftCipher bet
    ShiftCipher( String name, int shiftAmount, String message )
    {
        this.name = name;
        this.shiftAmount = shiftAmount;
        this.message = message;
    }

    //get's the user information: kind of cipher and message, decrypt or encrypt
    @Override
    public void getUserInput()
    {
        System.out.println("will get user input from text fields and then initialize a shft cipher object");
    }

    //displays for the user the way that th cipher works
    //in android studio will access text fields and change them to show steps
    @Override
    public void displaySteps()
    {
        System.out.println("steps");
    }

    //encrypts the message
    @Override
    public void encrypt( String message )
    {
//        return message;
    }

    //decrypts the message
    @Override
    public void decrypt( String message )
    {
//        return message;
    }
}
