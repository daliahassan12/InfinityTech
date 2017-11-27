package com.example.android.infinitytechapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ServiceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service_activity);
        final ArrayList<Info> names = new ArrayList<Info>();
        names.add(new Info("Courses", "Courses in all subtitles", R.drawable.courses));
        names.add(new Info("Youtube Studio", "A photography studio in which you can imagine your videos", R.drawable.youtube_studio));
        names.add(new Info("Work-Shops", "Workshops in variety fields",  R.drawable.workshops));
        names.add(new Info("Projects Support", "Mentor Support in Engineering Projects" , R.drawable.projects));
        names.add(new Info("Meeting Rooms", "Fully equipped and air conditioned rooms", R.drawable.rooms));
        names.add(new Info("Fabrication Lab", "A well-equipped laboratory", R.drawable.lab));

        InfoAdapter adapter = new InfoAdapter(this, names, R.color.category_products);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
