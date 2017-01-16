package com.example.volmopc1.myfeed4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static com.example.volmopc1.myfeed4.R.id.imageView;

public class Main3Activity extends AppCompatActivity {
    ImageView img;
    Bitmap bmp = null;
    URL url = null;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        // Toast.makeText(this.getApplicationContext(), "Name is "+superHero.getName()+"service is "+superHero.getPublisher()+"hbfgh"+superHero.getImageUrl(), Toast.LENGTH_LONG).show();
        img = (ImageView) findViewById(R.id.imageView2);
        tv = (TextView) findViewById(R.id.textView2);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        String value3 = extras.getString("Value3");
        Toast.makeText(getApplicationContext(), "Values are:\n First value: " + value1 + "\n Second Value: " + value2 + "\n image is " + value3, Toast.LENGTH_LONG).show();
        tv.setText(value1);
       /* try {
            url = new URL(value3);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        img.setImageBitmap(bmp);*/



        ImageRequest request = new ImageRequest(value3,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap bitmap) {
                        img.setImageBitmap(bitmap);
                    }
                }, 0, 0, null,
                new Response.ErrorListener() {
                    public void onErrorResponse(VolleyError error) {
                        img.setImageResource(R.drawable.image_load_error);
                    }
                });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}
