package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RameeAdapter extends RecyclerView.Adapter<RameeAdapter.MyViewHolder> {
    private List<String> headings;
    private List<String> details;


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView heading,details;
        ImageView imageView;
        public MyViewHolder(@NonNull View view) {
            super(view);
            heading=view.findViewById(R.id.heading);
            details=view.findViewById(R.id.details);
            imageView=view.findViewById(R.id.imageView);
        }
    }

    public RameeAdapter(List<String> headings, List<String> details) {
        this.headings = headings;
        this.details = details;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.heading.setText( headings.get(position));
        holder.details.setText(details.get(position));
        //holder.imageView.setImageDrawable(R.drawable.ic_launcher_foreground);

    }

    @Override
    public int getItemCount() {
        return headings.size();
    }

}
