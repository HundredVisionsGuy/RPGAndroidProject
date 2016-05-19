package com.hundredvisions.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Declare programmable UI components
    TextView main_screen_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect UI elements from the view
        main_screen_text = (TextView) findViewById(R.id.main_screen_text_output);

        String output;
        // Create an entity object (e1)
        Entity e1 = new Entity();
        Item axe = new Item();
        axe.setName("axe of destiny");
        axe.setDescription("A double-headed axe of iron.");
        axe.setCost(25);

        // Set e1's name
        e1.setName("Entity #1");

        // Set e1's description
        e1.setDescription("An entity (not much to look at");

        // Get e1's name & description
        output = e1.toString();
        output += "\n\n";
        output += axe.toString();

        // Display on screen
        main_screen_text.setText(output);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
