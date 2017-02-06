package com.teamandroidangel.iamangelauditor.miwoklanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Red", "Weteti", R.drawable.color_red));
        words.add(new Word("Green", "Chokokki", R.drawable.color_green));
        words.add(new Word("Brown", "Takaakki", R.drawable.color_brown));
        words.add(new Word("Gray", "Topoppi", R.drawable.color_gray));
        words.add(new Word("Black", "Kululli", R.drawable.color_black));
        words.add(new Word("White", "Kelleli", R.drawable.color_white));
        words.add(new Word("Dusty Yellow", "Toppisә", R.drawable.color_dusty_yellow));
        words.add(new Word("Mustard Yellow", "Chiwiitә", R.drawable.color_mustard_yellow));


        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.color_list);
        listView.setAdapter(adapter);
    }
}
