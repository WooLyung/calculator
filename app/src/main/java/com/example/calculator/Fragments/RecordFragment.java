package com.example.calculator.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calculator.Adapters.RecordAdapter;
import com.example.calculator.R;

public class RecordFragment extends Fragment {

    RecyclerView recyclerView;

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

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new RecordAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}
