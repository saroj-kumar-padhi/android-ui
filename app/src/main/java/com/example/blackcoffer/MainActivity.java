package com.example.blackcoffer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<model> arr = new ArrayList<model>();
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContect);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        TextView name = findViewById(R.id.marphy1);
        TextView subname = findViewById(R.id.marp1);
        ImageView img = findViewById(R.id.img);
        toolbar = findViewById(R.id.toolbar);
        SearchView searchView = findViewById(R.id.searchView);
//        TabLayout tablayout = findViewById(R.id.tab);
//        ViewPager viewPager = findViewById(R.id.viewPager);
//
//        viewPagerAdapter viewPagerAdapteradapter = new viewPagerAdapter(getSupportFragmentManager());
//        viewPager.setAdapter(viewPagerAdapteradapter);
//        tablayout.setupWithViewPager(viewPager);


        setSupportActionBar(toolbar); // Set the toolbar as the action bar

        arr.add(new model(R.drawable.img, "Michael Murphy", "San Francisco"));
        arr.add(new model(R.drawable.img, "John Doe", "San Francisco"));
        arr.add(new model(R.drawable.img, "Jennifer", "San Francisco"));
        arr.add(new model(R.drawable.img, "Michael Murphy", "San Francisco"));
        arr.add(new model(R.drawable.img, "John Doe", "San Francisco"));
        arr.add(new model(R.drawable.img, "Jennifer", "San Francisco"));
        arr.add(new model(R.drawable.img, "Michael Murphy", "San Francisco"));
        arr.add(new model(R.drawable.img, "John Doe", "San Francisco"));
        arr.add(new model(R.drawable.img, "Jennifer", "San Francisco"));

        recyclerAdpater adapter = new recyclerAdpater(this, arr);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appmenu, menu); // Inflate the menu items
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_search:
//                // Handle the search action
//                // Add your search functionality here
//                return true;
//            case android.R.id.home:
//                // Handle the drawer icon click (if you have a navigation drawer)
//                // Add your drawer open/close logic here
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
}
