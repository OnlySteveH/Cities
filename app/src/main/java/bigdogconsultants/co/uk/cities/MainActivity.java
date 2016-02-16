package bigdogconsultants.co.uk.cities;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.widget.AdapterView.*;
import android.content.*;
import android.widget.ListView;
import android.view.*;
import android.view.View;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android. view.View;
import android. widget. AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity
{
    ListView aListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//get list view from xml
        aListView = (ListView) findViewById(R.id.mainListView1);

        String[] Cities = {
                "New York",
                "Miami",
                "Atlanta",
                "Orlando",
                "Calgary",
                "Toronto",
                "Dallas",
                "Austin",
                "San Diego",
                "Las Vegas"};
        ListAdapter aAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Cities);
        ListView aListView = (ListView) findViewById(R.id.mainListView1);
        aListView.setAdapter(aAdapter);


        aListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String cities = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, cities, Toast.LENGTH_SHORT).show();

                        if (position == 0) {

                            Intent intent = new Intent(MainActivity.this, NewActivity.class);
                            startActivity(intent);
                        }
                    }
                });
    }
}
