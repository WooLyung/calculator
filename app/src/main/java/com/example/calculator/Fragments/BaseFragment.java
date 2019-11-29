package com.example.calculator.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.calculator.R;

public class BaseFragment extends Fragment {
    public DisplayFragment displayFragment;
    public RecordFragment recordFragment;

    public BaseFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_base, container, false);

        view.findViewById(R.id.button_clear).setOnClickListener(new View.OnClickListener() { // 지우기
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText("");
            }
        });
        view.findViewById(R.id.button_bracketL).setOnClickListener(new View.OnClickListener() { // (
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "(");
            }
        });
        view.findViewById(R.id.button_bracketR).setOnClickListener(new View.OnClickListener() { // )
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + ")");
            }
        });
        view.findViewById(R.id.button_PI).setOnClickListener(new View.OnClickListener() { // π
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "π");
            }
        });
        view.findViewById(R.id.button_squared).setOnClickListener(new View.OnClickListener() { // ^
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "^");
            }
        });
        view.findViewById(R.id.button_root).setOnClickListener(new View.OnClickListener() { // √
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "√");
            }
        });
        view.findViewById(R.id.button_backspace).setOnClickListener(new View.OnClickListener() { // ←
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText().subSequence(0, displayFragment.expression.getText().length() - 1));
            }
        });

        view.findViewById(R.id.button_zerozero).setOnClickListener(new View.OnClickListener() { // 00
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "00");
            }
        });
        view.findViewById(R.id.button_zero).setOnClickListener(new View.OnClickListener() { // 0
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "0");
            }
        });
        view.findViewById(R.id.button_one).setOnClickListener(new View.OnClickListener() { // 1
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "1");
            }
        });
        view.findViewById(R.id.button_two).setOnClickListener(new View.OnClickListener() { // 2
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "2");
            }
        });
        view.findViewById(R.id.button_three).setOnClickListener(new View.OnClickListener() { // 3
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "3");
            }
        });
        view.findViewById(R.id.button_four).setOnClickListener(new View.OnClickListener() { // 4
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "4");
            }
        });
        view.findViewById(R.id.button_five).setOnClickListener(new View.OnClickListener() { // 5
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "5");
            }
        });
        view.findViewById(R.id.button_six).setOnClickListener(new View.OnClickListener() { // 6
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "6");
            }
        });
        view.findViewById(R.id.button_seven).setOnClickListener(new View.OnClickListener() { // 7
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "7");
            }
        });
        view.findViewById(R.id.button_eight).setOnClickListener(new View.OnClickListener() { // 8
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "8");
            }
        });
        view.findViewById(R.id.button_nine).setOnClickListener(new View.OnClickListener() { // 9
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "9");
            }
        });

        view.findViewById(R.id.button_dot).setOnClickListener(new View.OnClickListener() { // .
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + ".");
            }
        });
        view.findViewById(R.id.button_divison).setOnClickListener(new View.OnClickListener() { // ÷
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "÷");
            }
        });
        view.findViewById(R.id.button_multiply).setOnClickListener(new View.OnClickListener() { // ×
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "×");
            }
        });
        view.findViewById(R.id.button_minus).setOnClickListener(new View.OnClickListener() { // -
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "-");
            }
        });
        view.findViewById(R.id.button_plus).setOnClickListener(new View.OnClickListener() { // +
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "+");
            }
        });
        view.findViewById(R.id.button_equals).setOnClickListener(new View.OnClickListener() { // =
            @Override
            public void onClick(View v) {
                calc(displayFragment.expression.getText().toString());
            }
        });

        return view;
    }

    String calc(String expression) {
        String result = "NaN";
        displayFragment.result.setText("= " + result);

        recordFragment.addData(expression, result);

        return result;
    }
}
