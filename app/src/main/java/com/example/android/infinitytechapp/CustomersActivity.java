package com.example.android.infinitytechapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customers_activity);
        final ArrayList<Info> names = new ArrayList<Info>();
        names.add(new Info("Ali Mohamed Fawzy", "Android Developer" , R.drawable.male));
        names.add(new Info("Ahmed Hamdy Masoud", "Business Manager", R.drawable.male));
        names.add(new Info("Reham El-Sayed Ahmed", "House Wife" , R.drawable.female));
        names.add(new Info("Rana Khaled Hosny", "Web Designer", R.drawable.female));
        names.add(new Info("Omar Ahmed Mohamed", "Civil Engineer", R.drawable.male));
        names.add(new Info("Ola Yasser Ibrahim", "Science Teacher", R.drawable.female));
        names.add(new Info("Mohamed Reda Ibrahim ", "Doctor", R.drawable.male));

        InfoAdapter adapter = new InfoAdapter(this, names, R.color.category_customers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
