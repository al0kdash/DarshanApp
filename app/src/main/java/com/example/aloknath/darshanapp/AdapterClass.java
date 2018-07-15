package com.example.aloknath.darshanapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterClass extends ArrayAdapter<Data> {
    public AdapterClass(@NonNull Context context,  @NonNull ArrayList<Data> data) {
        super(context, 0, data);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        Data data = getItem(position);

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(data.getImageid());

        TextView imagetitle = (TextView) listItemView.findViewById(R.id.imagetitle);
        imagetitle.setText(data.getImagetitle());

        TextView imagebody = (TextView)listItemView.findViewById(R.id.imagebody);
        imagebody.setText(data.getImagebody());
        return listItemView;
    }
}

