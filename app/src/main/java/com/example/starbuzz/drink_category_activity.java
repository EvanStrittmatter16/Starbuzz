package com.example.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class drink_category_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category_activity);

        ArrayAdapter listAdapter = new ArrayAdapter<Drink>(
                this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);
        ListView listDrinks = (ListView) findViewById(R.id.list_drinks);
        listDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(drink_category_activity.this, drink_activity.class);

                intent.putExtra(drink_activity.EXTRA_DRINKID, (int) id);
                startActivity(intent);
            }
        };
        listDrinks.setOnItemClickListener(itemClickListener);
    }
}
