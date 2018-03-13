package com.example.kamil.newyorkguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kamil on 2018-02-28.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<Location> mData;

    public RecyclerViewAdapter(Context mContext, List<Location> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.nameLocationTextView.setText(mData.get(position).getName());
        holder.descriptionLocationTextView.setText(mData.get(position).getDescription());
        holder.addressLocationTextView.setText(mData.get(position).getAddress());
        holder.scheduleLocationTextView.setText(mData.get(position).getSchedule());
        holder.priceLocationTextView.setText(mData.get(position).getPrice());
        holder.phoneLocationTextView.setText(mData.get(position).getPhone());
        holder.photoLocationImageView.setImageResource(mData.get(position).getImageResourceId());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nameLocationTextView = (TextView) itemView.findViewById(R.id.nameTextView);
        TextView descriptionLocationTextView = (TextView) itemView.findViewById(R.id.descriptionTextView);
        TextView addressLocationTextView = (TextView) itemView.findViewById(R.id.addressTextView);
        TextView scheduleLocationTextView = (TextView) itemView.findViewById(R.id.scheduleTextView);
        TextView priceLocationTextView = (TextView) itemView.findViewById(R.id.priceTextView);
        TextView phoneLocationTextView = (TextView) itemView.findViewById(R.id.phoneTextView);
        ImageView photoLocationImageView = (ImageView) itemView.findViewById(R.id.photoImageView);

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }


}
