package com.example.android.infinitytechapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView customers = (TextView)findViewById(R.id.customers);
        customers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customersIntent = new Intent(MainActivity.this, CustomersActivity.class);
                startActivity(customersIntent);
            }
        });
        TextView products = (TextView) findViewById(R.id.products);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent productsIntent = new Intent(MainActivity.this, ProductsActivity.class);
                startActivity(productsIntent);
            }
        });

        TextView services = (TextView) findViewById(R.id.service);
        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent serviceIntent = new Intent(MainActivity.this, ServiceActivity.class);
                startActivity(serviceIntent);
            }
        });
        TextView aboutUs = (TextView) findViewById(R.id.about);
        // Set a click listener on that View
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
            }
        });
    }

        public void facebook(View view) {
            String url = "https://www.facebook.com/infinitytech100/";
            Uri webpage = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }


    public void youtube (View view){
        String url = "https://www.youtube.com/user/infinitytech100";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
