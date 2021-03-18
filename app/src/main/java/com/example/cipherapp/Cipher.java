package com.example.cipherapp;
/**
 * The base interface class for all the future Ciphers
 */
public interface Cipher
{
    //get's the user information: kind of cipher and message, decrypt or encrypt
    void getUserInput();

    //displays for the user the way that th cipher works
    void displaySteps();

    //encrypts the message
    String encrypt( String message );

    //decrypts the message
    String decrypt( String message );
}
