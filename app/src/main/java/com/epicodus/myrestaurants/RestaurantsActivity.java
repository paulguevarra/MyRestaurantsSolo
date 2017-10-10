package com.epicodus.myrestaurants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class RestaurantsActivity extends AppCompatActivity {
    private String[] restaurants = new String[]{"Mi Mero Mole", "Mother's Bistro", "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil", "Slappy Cakes", "Equinox", "Miss Delta's", "Andrina", "Lardo", "Portland City Grill", "Fat Head's Brewery", "Chipotle", "subway"};
    private TextView mLocationTextView;
    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        mLocationTextView = (TextView) findViewById(R.id.locationTextView);
        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, restaurants);
        mListView.setAdapter(adapter);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the restaurants near: " + location);
    }
}
