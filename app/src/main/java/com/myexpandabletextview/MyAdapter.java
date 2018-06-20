package com.myexpandabletextview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bill on 2018/6/20.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<String> list = new ArrayList<>();
    private SparseBooleanArray sparseBooleanArray;

    public MyAdapter(Context context) {
        this.context = context;
        sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < 20; i++) {
            list.add(context.getResources().getString(R.string.dummy_text1));
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.update(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView2;
        private ExpandableTextView expandableTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            expandableTextView = itemView.findViewById(R.id.expand_text_view);
            this.textView2 = itemView.findViewById(R.id.textview2);
        }

        private void update(final int position) {
            expandableTextView.setText(list.get(position), sparseBooleanArray, position);
            textView2.setText("" + position);
        }

    }

}
