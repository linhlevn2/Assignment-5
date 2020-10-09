package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] mTitleList = new String[]{getResources().getString(R.string.dish1), getResources().getString(R.string.dish2),
                getResources().getString(R.string.dish3), getResources().getString(R.string.dish4), getResources().getString(R.string.dish5), getResources().getString(R.string.dish6)};
        String[] mDescription = new String[]{getResources().getString(R.string.dish11), getResources().getString(R.string.dish22),
                getResources().getString(R.string.dish33), getResources().getString(R.string.dish44), getResources().getString(R.string.dish55), getResources().getString(R.string.dish66)};
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, mTitleList, mDescription);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}