package com.example.quinn.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.InputStream;
import java.net.URL;

import static com.example.quinn.myapplication.R.layout.my_page;

/**
 * Created by quinn on 6/5/17.
 */

public class MyPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(my_page);

        Intent intent = getIntent();
    }

    public static Drawable LoadImageFromWebOperations(String url) {

//        http://api.hoopstacam.sashimiblade.com/parse
//        https://github.com/parse-community/Parse-SDK-Android
        try {
            InputStream is = (InputStream) new URL("http://api.hoopstacam.sashimiblade.com/parse").getContent();
            Drawable d = Drawable.createFromStream(is, "src name");
            return d;
        } catch (Exception e) {
            return null;
        }
        finally {
        }
    }
}