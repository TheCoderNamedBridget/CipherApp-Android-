package com.example.cipherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.nio.file.SimpleFileVisitor;

/**
 * The goal of this app is to make the user care about their personal data security
 * encrypt and decrypt messages in using various different ciphers
 * and show people how hackers might decrypt their encrypted messages
 * Bug fixes:
 * When edittext is unfilled and you press any button it quits app
 * When a letter isn't uppercase it quits
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    ShiftCipher ciphy = new ShiftCipher( 5 );
    String value = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void encrypt(View view)
    {
        Log.v( TAG, "boo1");
        EditText editText=findViewById(R.id.Msg);
        Log.v( TAG, "boo2");
        value=editText.getText().toString();
        Log.v( TAG, "boo555" + value);
        if ( !value.equals(""))
        {
            editText.setText(ciphy.encrypt(value));
        }

    }

    public void decrypt(View view)
    {

        EditText editText=findViewById(R.id.Msg);

        value=editText.getText().toString();

        if ( !value.equals(""))
        {
            editText.setText(ciphy.decrypt(value));
        }

    }

    public void clear(View view)
    {
        EditText editText=findViewById(R.id.Msg);
        editText.getText().clear();
        value = "";
//        ciphy.clear();

    }
}