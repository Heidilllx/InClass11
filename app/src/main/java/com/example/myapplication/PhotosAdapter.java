package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.List;

public class PhotosAdapter extends ArrayAdapter<Photos> {
    ImageView iv_photos;
    public PhotosAdapter(@NonNull Context context, int resource, @NonNull List<Photos> objects) {
        super(context, resource, objects);
    }
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Photos photos = getItem(position);


        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.photo_adapter, parent, false);

        }
        iv_photos = convertView.findViewById(R.id.iv_photos);
        Picasso.get().load(photos.url).into(iv_photos);


        return convertView;
    }


}
