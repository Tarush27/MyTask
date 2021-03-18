package com.example.mytask;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    public Adapter(Context context, List<ListItem> list) {
        this.context = context;
        this.list = list;
    }

    Context context;
    private List<ListItem> list;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListItem listItem = list.get(position);
        holder.textView.setText(listItem.getText());
        holder.date.setText(listItem.getDate());
        holder.linearLayout.setOnClickListener(v -> {
            context.startActivity(new Intent(context,NewActivity.class));
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        TextView textView;
        TextView date;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.linear);
            textView = itemView.findViewById(R.id.text);
            date = itemView.findViewById(R.id.date);
        }
    }
}
