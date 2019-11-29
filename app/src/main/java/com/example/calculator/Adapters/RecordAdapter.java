package com.example.calculator.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.calculator.R;
import com.example.calculator.RecordData;

import java.util.ArrayList;

public class RecordAdapter extends  RecyclerView.Adapter<RecordAdapter.RecordHolder> {

    static public ArrayList<RecordData> datas = new ArrayList<>();
    static public boolean able = false;

    public RecordAdapter() {
        able = true;
    }

    @NonNull
    @Override
    public RecordHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.record, viewGroup, false);
        RecordHolder holder = new RecordHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecordHolder recordHolder, int i) {
        recordHolder.expression.setText(datas.get(i).expression);
        recordHolder.result.setText("= " + datas.get(i).result);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class RecordHolder extends  RecyclerView.ViewHolder {
        TextView expression, result;

        public RecordHolder(@NonNull View itemView) {
            super(itemView);

            expression = itemView.findViewById(R.id.expression);
            result = itemView.findViewById(R.id.result);
        }
    }
}
