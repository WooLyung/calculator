package com.example.calculator.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculator.Fragments.DisplayFragment;
import com.example.calculator.R;
import com.example.calculator.RecordData;
import com.example.calculator.VarData;

import java.util.ArrayList;

public class VarAdapter extends  RecyclerView.Adapter<VarAdapter.VarHolder> {

    public ArrayList<VarData> datas = new ArrayList<>();
    DisplayFragment displayFragment;

    public VarAdapter(DisplayFragment displayFragment) {
        for (char c = 'z'; c >= 'a'; c--)
            datas.add(new VarData(c, "0"));

        this.displayFragment = displayFragment;
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
        varHolder.index = i;
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class VarHolder extends RecyclerView.ViewHolder {
        TextView var;
        EditText value;
        Button add;
        int index = 0 ;

        public VarHolder(@NonNull View itemView) {
            super(itemView);

            var = itemView.findViewById(R.id.var);
            value = itemView.findViewById(R.id.value);
            add = itemView.findViewById(R.id.var_add);

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    displayFragment.expression.setText(displayFragment.expression.getText().toString() + datas.get(index).var);
                }
            });

            value.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (!editable.toString().equals("") && value.hasFocus()) {
                        datas.get(index).value = editable.toString();
                    }
                }
            });
        }
    }
}
