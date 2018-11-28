package com.example.starbuzz;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class drink_activity extends Activity {

    public static final String EXTRA_DRINKID = "drinkID";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_activity);

        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(drink.getDescription());

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceID());
        photo.setContentDescription(drink.getName());

    }




}
