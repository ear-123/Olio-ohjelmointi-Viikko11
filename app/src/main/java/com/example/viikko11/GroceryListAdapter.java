package com.example.viikko11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GroceryListAdapter extends RecyclerView.Adapter<GroceryViewHolder> {
    private Context context;

    private ArrayList<Grocery> groceries = new ArrayList<Grocery>();


    public GroceryListAdapter (Context context, ArrayList<Grocery> groceries){
        this.context = context;
        this.groceries = groceries;
    }

    public GroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        return new GroceryViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_grocery_view_holder, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        holder.textGroceryName.setText(groceries.get(position).getName());
        holder.editTextGroceryNote.setText(groceries.get(position).getNote());

    }

    @Override
    public int getItemCount() {
        return groceries.size();
    }

}
