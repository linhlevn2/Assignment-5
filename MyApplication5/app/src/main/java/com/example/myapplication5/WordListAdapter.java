package com.example.myapplication5;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static androidx.core.content.ContextCompat.startActivity;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder>{
    private final String[] mTitleList;
    private final String[] mDescriptionList;
    private LayoutInflater mInflater;

    public WordListAdapter(Context context, String[] titleList, String[] descriptionList) {

        mInflater = LayoutInflater.from(context);
        this.mTitleList = titleList;
        this.mDescriptionList = descriptionList;
    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item,
                parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        holder.wordItemView.setText(mTitleList[position]);
        holder.descItemView.setText(mDescriptionList[position]);
    }

    @Override
    public int getItemCount() {
        return mTitleList.length;
    }


    private void getLayoutPosition() {
    }

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView wordItemView;
        public final TextView descItemView;
        final WordListAdapter mAdapter;
        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.title);
            descItemView = itemView.findViewById(R.id.description);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent1 = new Intent(wordItemView.getContext(), MainActivity2.class);
            Intent intent2 = new Intent(wordItemView.getContext(), MainActivity3.class);
            Intent intent3 = new Intent(wordItemView.getContext(), MainActivity4.class);
            Intent intent4 = new Intent(wordItemView.getContext(), MainActivity5.class);
            Intent intent5 = new Intent(wordItemView.getContext(), MainActivity6.class);
            Intent intent6 = new Intent(wordItemView.getContext(), MainActivity7.class);
            if (getLayoutPosition()==0){
                startActivity(wordItemView.getContext(), intent1, null);
            } else if (getLayoutPosition()==1){
                startActivity(wordItemView.getContext(), intent2, null);
            } else if (getLayoutPosition()==2){
                startActivity(wordItemView.getContext(), intent3, null);
            } else if (getLayoutPosition()==3){
                startActivity(wordItemView.getContext(), intent4, null);
            } else if (getLayoutPosition()==4){
                startActivity(wordItemView.getContext(), intent5, null);
            } else if (getLayoutPosition()==5){
                startActivity(wordItemView.getContext(), intent6, null);
            }
        }
    }

}

