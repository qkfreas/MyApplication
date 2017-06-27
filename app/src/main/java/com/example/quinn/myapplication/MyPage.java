package com.example.quinn.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Transformation;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static android.R.attr.width;
import static com.example.quinn.myapplication.R.layout.my_page;

/**
 * Created by quinn on 6/5/17.
 */

public class MyPage extends AppCompatActivity {
    MyPage() {
        getUserContent();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(my_page);

        Intent intent = getIntent();
    }

    protected void getUserContent()  {
        try {
//            ImageView imageView = new ImageView();

            URL url = new URL("http://api.hoopstacam.sashimiblade.com/parse");
            InputStream content = (InputStream) url.getContent();
            Drawable d = Drawable.createFromStream(content, "src");
//            imageView.setImageDrawable(d);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

 abstract class getImageTask extends AsyncTask {
     protected Bitmap doInBackground(String... "http://api.hoopstacam.sashimiblade.com/parse") {
         return loadImageFromNetwork(urls[0])
     }
        }