package com.teamandroidangel.iamangelauditor.miwoklanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static android.text.method.TextKeyListener.Capitalize.WORDS;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an arrayList of words

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One", "Lutti", R.drawable.number_one));
        words.add(new Word("Two", "Ottiko", R.drawable.number_two));
        words.add(new Word("Three", "Tolookosu", R.drawable.number_three));
        words.add(new Word("Four", "Oyyisa", R.drawable.number_four));
        words.add(new Word("Five", "Massokka", R.drawable.number_five));
        words.add(new Word("Six", "Temmokka", R.drawable.number_six));
        words.add(new Word("Seven", "Kenekaku", R.drawable.number_seven));
        words.add(new Word("Eight", "Kawinta", R.drawable.number_eight));
        words.add(new Word("Nine", "Wo'e", R.drawable.number_nine));
        words.add(new Word("Ten", "Na'aacha", R.drawable.number_ten));



            // Create a new TextView by listView
            WordAdapter adapter =
                    new WordAdapter(this, words);

            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(adapter);
        }
    }

