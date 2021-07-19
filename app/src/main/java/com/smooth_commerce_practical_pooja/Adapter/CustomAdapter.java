package com.smooth_commerce_practical_pooja.Adapter;


import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.smooth_commerce_practical_pooja.Model.Colors;
import com.smooth_commerce_practical_pooja.R;

import java.util.ArrayList;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    Activity context;
    public static boolean flag =false;
    ArrayList<Colors> colorsnewlist;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private RelativeLayout rlColor;
        private ImageView ivFav;
        private LinearLayout llTitle;
        private TextView tvTitle;
        private LinearLayout llHex;
        private TextView tvHex;



        public MyViewHolder(View itemView) {
            super(itemView);
            rlColor = (RelativeLayout) itemView.findViewById(R.id.rlColor);
            ivFav = (ImageView) itemView.findViewById(R.id.ivFav);
            llTitle = (LinearLayout) itemView.findViewById(R.id.llTitle);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            llHex = (LinearLayout) itemView.findViewById(R.id.llHex);
            tvHex = (TextView) itemView.findViewById(R.id.tvHex);
        }
    }

    public CustomAdapter(Activity mContext, ArrayList<Colors> colors) {
        this.context = mContext;
        colorsnewlist=colors;


    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_colors, parent, false);


        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {
        holder.tvHex.setText(colorsnewlist.get(listPosition).getHex());
        holder.tvTitle.setText(colorsnewlist.get(listPosition).getTitle());
        holder.rlColor.setBackgroundColor(Color.parseColor("#"+colorsnewlist.get(listPosition).getHex()));
        holder.ivFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==true){
                    holder.ivFav.setImageDrawable(context.getResources().getDrawable(R.drawable.like));
                    flag=false;
                }else{
                    holder.ivFav.setImageDrawable(context.getResources().getDrawable(R.drawable.dislike));
                    flag=true;
                }
            }
        });




    }

    @Override
    public int getItemCount() {
        return colorsnewlist.size();
    }

}