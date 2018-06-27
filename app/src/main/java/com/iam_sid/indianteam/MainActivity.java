package com.iam_sid.indianteam;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<players> itemArray=new ArrayList<players>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        itemArray.add(new players(R.drawable.player_kohli,"Virat"));
        itemArray.add(new players(R.drawable.player_dhoni,"Dhoni"));
        itemArray.add(new players(R.drawable.player_raina,"Raina"));
        itemArray.add(new players(R.drawable.player_bhuvi,"Bhuvi"));
        itemArray.add(new players(R.drawable.player_yadav,"Yadav"));


        lv=(ListView)findViewById(R.id.lvIndianTeam);

        lv.setAdapter(new CustomAdap(itemArray,this));


    }

/*
    private class GetContact extends AsyncTask<Void,Void,Void>
    {
        @Override
        protected Void doInBackground(Void... argso) {

            String url=


            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(MainActivity.this,"JSON data in downloading",Toast.LENGTH_SHORT).show();
        }
    }
*/
}
