package com.example.android.infinitytechapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products_activity);
        final ArrayList<Info> names = new ArrayList<Info>();

        names.add(new Info("Lego Toys", "$25", R.drawable.lego));
        names.add(new Info("Robots", "$100", R.drawable.robot));
        names.add(new Info("Smart Kitchen Machine", "$350",  R.drawable.machine));
        names.add(new Info("Avometer", "$20", R.drawable.avometer));
        names.add(new Info("Creative Mug", "$15", R.drawable.mugs));
        names.add(new Info("Mentssori Toys", "$50", R.drawable.toys));
        names.add(new Info("Motor Driver", "$25", R.drawable.motordriver));
        names.add(new Info("Doctor Tools", "$70", R.drawable.dentist_tools));
        names.add(new Info("Gift Boxes", "$10", R.drawable.gift_boxes));
        names.add(new Info("Geometry Tools", "$40", R.drawable.tools));
        names.add(new Info("Laptops for Children", "$100", R.drawable.laptop));

        InfoAdapter adapter = new InfoAdapter(this, names, R.color.category_products);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
