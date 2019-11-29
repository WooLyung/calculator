package com.example.calculator.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calculator.Adapters.RecordAdapter;
import com.example.calculator.R;
import com.example.calculator.RecordData;

import java.util.ArrayList;

public class RecordFragment extends Fragment {

    RecyclerView recyclerView;
    RecordAdapter recordAdapter;

    public RecordFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_record, container, false);

        recordAdapter = new RecordAdapter();
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(recordAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

    void addData(String expression, String result) {
        RecordData recordData = new RecordData(expression, result);

        RecordAdapter.datas.add(recordData);
        if (RecordAdapter.able) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
            ft.detach(this).attach(this).commit();
        }
    }
}
