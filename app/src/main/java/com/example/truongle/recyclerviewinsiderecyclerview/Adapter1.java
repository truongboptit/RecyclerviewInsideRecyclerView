package com.example.truongle.recyclerviewinsiderecyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TruongLe on 28/08/2017.
 */

public class Adapter1 extends RecyclerView.Adapter<Adapter1.ViewHolder1> {
    ArrayList<Model> list1;
    ArrayList<Model2> list;
    Context context;
    LinearLayoutManager layoutManager;
    int k=0;

    public Adapter1(ArrayList<Model> list1, ArrayList<Model2> list, Context context) {
        this.list1 = list1;
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater  = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_row, parent, false);
        return new ViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder1 holder, int position) {
        layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        holder.recyclerView.setLayoutManager(layoutManager);
        ArrayList<String> list3 = new ArrayList<>();
        int sl = list1.get(position).getA();

        for(int i=position*sl;i<sl+k;i++){
            list3.add(list.get(i).getA());
        }
        k+=sl;
        for(int i=0;i<list3.size();i++) Log.d("AAA", "onBindViewHolder: "+list3.get(i));
        Adapter2 adapter2 = new Adapter2(list3,context);
        holder.recyclerView.setAdapter(adapter2);
        holder.txt2.setText(""+list1.get(position).getB());
    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public class ViewHolder1 extends RecyclerView.ViewHolder{
        TextView txt2;
        RecyclerView recyclerView;
        public ViewHolder1(View itemView) {
            super(itemView);
            txt2 = (TextView) itemView.findViewById(R.id.textViewDate);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerView2);
        }
    }
}
