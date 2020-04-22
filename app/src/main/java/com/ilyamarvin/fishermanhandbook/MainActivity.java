package com.ilyamarvin.fishermanhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar toolbar;
    private DrawerLayout drawer;
    private ListView list;
    private String[] array;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.listView);
        array = getResources().getStringArray(R.array.starter_array);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new ArrayList<String>(Arrays.asList(array)));
        list.setAdapter(adapter);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toogle);
        toogle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, text_content_activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        toolbar.setTitle(R.string.menu_starter);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.nav_starter) {
            toolbar.setTitle(R.string.menu_starter);
            array = getResources().getStringArray(R.array.starter_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.nav_fish) {
            toolbar.setTitle(R.string.menu_fish);
            array = getResources().getStringArray(R.array.fish_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.nav_hooks) {
            toolbar.setTitle(R.string.menu_hooks);
            array = getResources().getStringArray(R.array.hooks_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.nav_artbait) {
            toolbar.setTitle(R.string.menu_artbait);
            array = getResources().getStringArray(R.array.artbait_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.nav_rig) {
            toolbar.setTitle(R.string.menu_rig);
            array = getResources().getStringArray(R.array.rig_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.nav_lure) {
            toolbar.setTitle(R.string.menu_lure);
            array = getResources().getStringArray(R.array.lure_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.nav_tips) {
            toolbar.setTitle(R.string.menu_tips);
            array = getResources().getStringArray(R.array.tips_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.nav_weather) {
            toolbar.setTitle(R.string.menu_weather);
            array = getResources().getStringArray(R.array.weather_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
