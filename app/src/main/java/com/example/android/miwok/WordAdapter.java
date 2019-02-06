package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NISHTHA PAUL on 20-12-2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mcolorResourceId;
    public WordAdapter(Context context, ArrayList<Word> words,int colorId){
        super(context,0,words);
        mcolorResourceId=colorId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //convertView is the recycle view which has to be populated
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWord=getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_word);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.default_word);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView iconView = listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getmImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else
            iconView.setVisibility(View.GONE);
            //gone ...... not invisible
            //invisible - no image but space is still there
            //gone - no image with space also removed

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mcolorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
