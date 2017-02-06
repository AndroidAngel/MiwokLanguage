package com.teamandroidangel.iamangelauditor.miwoklanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "Minto Wuksus"));
        words.add(new Word("What is you name?", "Tinnә Oyaase'nә"));
        words.add(new Word("My name is...", "Oyaaset..."));
        words.add(new Word("How are your feeling?", "Michәksәs?"));
        words.add(new Word("I'm feeling good", "uchi Achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I'm coming.", "әәnәm"));
        words.add(new Word("Let's go.", "Yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.phrases_list);
        listView.setAdapter(adapter);

    }
}
