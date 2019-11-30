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

import java.util.Scanner;

public class BaseFragment extends Fragment {
    public DisplayFragment displayFragment;
    public RecordFragment recordFragment;
    public VarFragment varFragment;

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
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_bracketL).setOnClickListener(new View.OnClickListener() { // (
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "(");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_bracketR).setOnClickListener(new View.OnClickListener() { // )
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + ")");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_PI).setOnClickListener(new View.OnClickListener() { // π
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "π");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_squared).setOnClickListener(new View.OnClickListener() { // ^
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "^");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_root).setOnClickListener(new View.OnClickListener() { // √
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "√");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_backspace).setOnClickListener(new View.OnClickListener() { // ←
            @Override
            public void onClick(View v) {
                displayFragment.result.setText("");
                if (!displayFragment.expression.getText().toString().equals(""))
                    displayFragment.expression.setText(displayFragment.expression.getText().subSequence(0, displayFragment.expression.getText().length() - 1));
            }
        });
        view.findViewById(R.id.button_zerozero).setOnClickListener(new View.OnClickListener() { // 00
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "00");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_zero).setOnClickListener(new View.OnClickListener() { // 0
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "0");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_one).setOnClickListener(new View.OnClickListener() { // 1
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "1");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_two).setOnClickListener(new View.OnClickListener() { // 2
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "2");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_three).setOnClickListener(new View.OnClickListener() { // 3
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "3");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_four).setOnClickListener(new View.OnClickListener() { // 4
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "4");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_five).setOnClickListener(new View.OnClickListener() { // 5
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "5");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_six).setOnClickListener(new View.OnClickListener() { // 6
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "6");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_seven).setOnClickListener(new View.OnClickListener() { // 7
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "7");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_eight).setOnClickListener(new View.OnClickListener() { // 8
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "8");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_nine).setOnClickListener(new View.OnClickListener() { // 9
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "9");
                displayFragment.result.setText("");
            }
        });

        view.findViewById(R.id.button_dot).setOnClickListener(new View.OnClickListener() { // .
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + ".");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_divison).setOnClickListener(new View.OnClickListener() { // ÷
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "÷");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_multiply).setOnClickListener(new View.OnClickListener() { // ×
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "×");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_minus).setOnClickListener(new View.OnClickListener() { // -
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "-");
                displayFragment.result.setText("");
            }
        });
        view.findViewById(R.id.button_plus).setOnClickListener(new View.OnClickListener() { // +
            @Override
            public void onClick(View v) {
                displayFragment.expression.setText(displayFragment.expression.getText() + "+");
                displayFragment.result.setText("");
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

    public String calc(String expression) {
        boolean isRevise = true;

        String expression_ = expression;
        expression = expression.replace("π", "P");
        expression = expression.replace("√", "R");

        while (isRevise) { // 곱셈 기호 생략된걸 다시 부활시킴
            isRevise = false;

            for (int i = 1; i < expression.length(); i++) {
                if (expression.charAt(i) >= 'a' && expression.charAt(i) <= 'z'
                    || expression.charAt(i) == 'P') { // 문자일 경우
                    char k = expression.charAt(i - 1);

                    if (k >= 'a' && k <= 'z'
                            || k >= '0' && k <= '9'
                            || k == 'P') { // 왼쪽이 문자 혹은 숫자일 경우
                        String newExpression = expression.substring(0, i) + "*" + expression.charAt(i) + expression.substring(i + 1);
                        expression = newExpression;

                        isRevise = true;
                        break;
                    }
                }
                else if (expression.charAt(i) == 'R') {
                    char k = expression.charAt(i - 1);

                    if (k >= 'a' && k <= 'z'
                            || k >= '0' && k <= '9'
                            || k == 'P') { // 왼쪽이 문자 혹은 숫자일 경우
                        String newExpression = expression.substring(0, i) + "*R" + expression.substring(i + 1);
                        expression = newExpression;

                        isRevise = true;
                        break;
                    }
                }
            }
        }

        for (char c = 'a'; c <= 'z'; c++) { // 변수와 상수, 곱셈, 나눗셈 치환
            expression = expression.replace(c + "", varFragment.varAdapter.datas.get('z' - c).value + "");
        }
        expression = expression.replace("P", "3.1415926535");
        expression = expression.replace("×", "*");
        expression = expression.replace("÷", "/");
        expression = expression.replace("R", "√");

        String result = "NaN";

        try {
            double res = calculater(expression);

            if (Math.round(res) == res) {
                result = Math.round(res) + "";
            }
            else {
                result = res + "";
            }
        }
        catch (Exception e) {
            result = "NaN";
        }
        displayFragment.result.setText("= " + result);

        recordFragment.addData(expression_, result);

        return result;
    }

    public static double calculater(String string2) {

        Double[] num = new Double[100];
        Double[] num2= new Double[100];
        char[] op=new char[100];
        char[] op2=new char[100];
        int numi=0;
        int opi=0;
        String s="";

        if(string2==""){
            Scanner sc = new Scanner(System.in);

            s = sc.nextLine();
        }
        if(string2!="")s=string2;
        char test=' ';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '+' || s.charAt(i) =='-' || s.charAt(i) == '*' || s.charAt(i) == '/'||s.charAt(i)=='^'||s.charAt(i)=='√')
                test=s.charAt(i);
        }
        if(test=='^'||test=='√'){
            s+="+0";
        }
        String string = "";

        for(int i = 0; i < s.length(); i++) {


            if(s.charAt(i)=='('){
                int j=0;
                int sans = 0;

                for(j=i; ; j++) {
                    if (s.charAt(j) == '(') {
                        sans++;
                    }

                    if (s.charAt(j) == ')') {
                        sans--;
                        if (sans == 0) {
                            break;
                        }
                    }
                }
                string=Double.toString(calculater(s.substring(i+1,j)));

                i=j;
            }
            else if(s.charAt(i) == '+' || s.charAt(i) =='-' || s.charAt(i) == '*' || s.charAt(i) == '/'||s.charAt(i)=='^'||s.charAt(i)=='√') {

                if(s.charAt(i)=='^')
                {
                    Double a;
                    Double b=0.0;
                    int flag=0;
                    String string1="";
                    a=Double.parseDouble(string);
                    i++;

                    for(;s.charAt(i)!='+' && s.charAt(i) !='-' && s.charAt(i) != '*' && s.charAt(i) != '/'&&s.charAt(i)!='^'&&s.charAt(i)!='√';i++){
                        if(s.charAt(i)=='('){

                            int q=i;
                            for(;s.charAt(i)!=')';i++);
                            b=(calculater(s.substring(q+1,i)));
                            flag=1;
                            break;
                        }
                        else{
                            string1+=s.charAt(i);
                        }


                    }
                    if(flag==0){
                        b=Double.parseDouble(string1);
                    }

                    double ab=a;
                    for(int q=1;q<b;q++){
                        a*=ab;
                    }
                    i--;
                    string=Double.toString(a);
                }
                else if(s.charAt(i)=='√')
                {
                    Double a=0.0;
                    String string1="";
                    int flag=0;
                    i++;
                    for(;s.charAt(i)!='+' && s.charAt(i) !='-' && s.charAt(i) != '*' && s.charAt(i) != '/'&&s.charAt(i)!='^'&&s.charAt(i)!='√';i++){
                        if(s.charAt(i)=='('){
                            int q=i;
                            for(;s.charAt(i)!=')';i++);
                            a=(calculater(s.substring(q+1,i)));
                            flag=1;
                        }
                        else{
                            string1+=s.charAt(i);
                        }
                    }
                    if(flag==0){
                        a=Double.parseDouble(string1);
                    }
                    string=Double.toString(Math.sqrt(a));

                }
                if(s.charAt(i)=='+'|| s.charAt(i) =='-' || s.charAt(i) == '*' ||s.charAt(i)=='/'){

                    if(string!=""){
                        op[opi]=s.charAt(i);
                        opi++;
                        num[numi]=Double.parseDouble(string);
                        numi++;
                        string="";
                    }
                }


            }
            else if(s.charAt(i)=='('|| s.charAt(i) ==')'||s.charAt(i) == '^' ||s.charAt(i)=='√'){

            }
            else{
                string += s.charAt(i);

            }
            if(i+1==s.length()&&(s.charAt(i)!='+'|| s.charAt(i) !='-' || s.charAt(i) != '*' ||  s.charAt(i)!= '/'||s.charAt(i)!='^'||s.charAt(i)!='√')){
                //System.out.println(string);
                num[numi]=Double.parseDouble(string);
                numi++;
            }

        }
        int numi2=0;
        int opi2=0;



        Integer returnvalue=0;
        for(int i=0;i<=opi;i++){
            num2[numi2]=num[i];
            numi2++;
            if(op[i]=='*'||op[i]=='/'){
                for(;op[i]=='*'||op[i]=='/';i++){
                    if(op[i]=='*')
                        num2[numi2-1]*=num[i+1];
                    if(op[i]=='/')
                        num2[numi2-1]/=num[i+1];

                }
            }
            op2[opi2]=op[i];
            opi2++;
            if(i==opi){
                num2[numi2]=num[numi-1];
                numi2++;
            }
        }
        double sum=0;
        sum+=num2[0];
        for(int i=0;i<numi2;i++){
            if(op2[i]=='+'){
                sum+=num2[i+1];
            }
            if(op2[i]=='-'){
                sum-=num2[i+1];
            }
            //System.out.println(i);
        }
        System.out.println(sum);
        return sum;
    }
}