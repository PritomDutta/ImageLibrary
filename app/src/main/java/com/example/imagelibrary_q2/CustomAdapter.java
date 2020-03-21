package com.example.imagelibrary_q2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.customclass> {

    private Context context;
    private int []Image;

    public CustomAdapter(Context context, int[] image) {
        this.context = context;
        Image = image;
    }

    @NonNull
    @Override
    public customclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.itemlayout,parent,false);

        return new customclass(view);

    }

    @Override
    public void onBindViewHolder(@NonNull customclass holder, int position) {

        // Picaso image library used here

        Picasso.with(context).load(Image[position]).placeholder(R.drawable.img1).error(R.drawable.img1).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return Image.length;
    }

    public class customclass extends RecyclerView.ViewHolder {

        ImageView imageView;
        public customclass(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview);


        }
    }
}
