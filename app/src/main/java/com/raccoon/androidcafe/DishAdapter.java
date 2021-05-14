package com.raccoon.androidcafe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DishAdapter extends RecyclerView.Adapter<DishAdapter.DishViewHolder> {

    private Dish dishes[];

    public DishAdapter(Dish[] dishes) {
        this.dishes = dishes;
    }

    @Override
    public int getItemCount() {

        return dishes.length;
    }

    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new DishViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {
        holder.bind(dishes[position]);

    }



    static class DishViewHolder extends RecyclerView.ViewHolder{

        private TextView dishTitle;
        private TextView dishPrice;
        public DishViewHolder(@NonNull View itemView) {
            super(itemView);

            dishTitle=itemView.findViewById(R.id.dish_title);
            dishPrice=itemView.findViewById(R.id.dish_price);
        }

        public void bind(Dish dishes)
        {
            String price=Integer.toString(dishes.cost);
            dishTitle.setText(dishes.title);
            dishPrice.setText(price);
        }
    }

}
