package com.pulkit4tech.footzy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.pulkit4tech.footzy.adapter.Score_Recycler_adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView rcv;
    private Score_Recycler_adapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        rcv = (RecyclerView) findViewById(R.id.score_recycler_view);
        myAdapter = new Score_Recycler_adapter(getApplicationContext(),getData());
        rcv.setAdapter(myAdapter);
        rcv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }

    private List<match_detail_data> getData() {

        List<match_detail_data> list = new ArrayList<>();

        for(int i=0;i<50;i++){
            match_detail_data data = new match_detail_data();
            data.setTeam1("Team"+i);
            data.setTeam2("Team" + (i + 1));
            data.setScore(""+ new Random().nextInt(10)+"-"+new Random().nextInt(10));
            list.add(data);
        }

        return list;
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
