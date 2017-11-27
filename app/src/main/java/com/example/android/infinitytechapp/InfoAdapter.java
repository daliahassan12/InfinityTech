package com.example.android.infinitytechapp;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class InfoAdapter extends ArrayAdapter<Info> {
    private int mColorResourceId;

    public InfoAdapter(Context context, ArrayList<Info> names, int colorResourceId) {
        super(context, 0, names);
        mColorResourceId = colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        Info currentName= (Info) getItem(position);

        TextView nNameTextView = (TextView) listItemView.findViewById(R.id.nName_text_view);
        nNameTextView.setText(currentName.getmName());

        TextView positionNameTextView = (TextView) listItemView.findViewById(R.id.positionName_text_view);
        positionNameTextView.setText(currentName.getmPositionName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentName.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentName.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {// Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}
