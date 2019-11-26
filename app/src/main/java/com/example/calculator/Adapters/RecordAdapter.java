package com.example.calculator.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.calculator.R;

import java.util.ArrayList;

public class RecordAdapter extends  RecyclerView.Adapter<RecordAdapter.RecordHolder> {

    ArrayList<RecordData> datas = new ArrayList<>();

    public RecordAdapter() {
        datas.add(new RecordData("2+2", "4"));
        datas.add(new RecordData("2*2", "4"));
        datas.add(new RecordData("2^2", "4"));
        datas.add(new RecordData("2-2+4", "4"));
        datas.add(new RecordData("4-0", "4"));
        datas.add(new RecordData("16/4", "4"));
        datas.add(new RecordData("8-4", "4"));
        datas.add(new RecordData("2*2+0", "4"));
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

    public class RecordData {
        String expression;
        String result;

        RecordData(String expression, String result) {
            this.expression = expression;
            this.result = result;
        }
    }
}
