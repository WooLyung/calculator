package com.example.calculator.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculator.R;
import com.example.calculator.RecordData;
import com.example.calculator.VarData;

import java.util.ArrayList;

public class VarAdapter extends  RecyclerView.Adapter<VarAdapter.VarHolder> {

    ArrayList<VarData> datas = new ArrayList<>();

    public VarAdapter() {
        for (char c = 'z'; c >= 'a'; c--)
            datas.add(new VarData(c, 0));
    }

    @NonNull
    @Override
    public VarHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.list, viewGroup, false);
        VarHolder holder = new VarHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull VarHolder varHolder, int i) {
        varHolder.var.setText(datas.get(i).var + "");
        varHolder.value.setText(datas.get(i).value + "");
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class VarHolder extends RecyclerView.ViewHolder {
        TextView var;
        EditText value;

        public VarHolder(@NonNull View itemView) {
            super(itemView);

            var = itemView.findViewById(R.id.var);
            value = itemView.findViewById(R.id.value);
        }
    }
}
