package com.example.truongle.recyclerviewinsiderecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TruongLe on 28/08/2017.
 */

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder2>{

    ArrayList<String> list;
    Context context;

    public Adapter2(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_row, parent,false);
        return new ViewHolder2(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder2 holder, int position) {
        holder.txt.setText(""+list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder2 extends RecyclerView.ViewHolder{

        TextView txt;
        public ViewHolder2(View itemView) {
            super(itemView);
            txt = (TextView) itemView.findViewById(R.id.textView2);
        }
    }
}
