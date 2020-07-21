package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonDivision, buttonMul, button10, buttonC, buttonEqual;
    TextView edttxt;
    float val_one = 0, val_two = 0, total = 0;
    boolean add, sub, mul, div, dec;
    ArrayList<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=(Button)findViewById(R.id.btn0);
        button1=(Button)findViewById(R.id.btn1);
        button2=(Button)findViewById(R.id.btn2);
        button3=(Button)findViewById(R.id.btn3);
        button4=(Button)findViewById(R.id.btn4);
        button5=(Button)findViewById(R.id.btn5);
        button6=(Button)findViewById(R.id.btn6);
        button7=(Button)findViewById(R.id.btn7);
        button8=(Button)findViewById(R.id.btn8);
        button9=(Button)findViewById(R.id.btn9);
        buttonAdd=(Button)findViewById(R.id.btn_add);
        buttonSub=(Button)findViewById(R.id.btn_sub);
        buttonMul=(Button)findViewById(R.id.btn_mul);
        buttonDivision=(Button)findViewById(R.id.btn_div);
        buttonC=(Button)findViewById(R.id.btn_clr);
        button10=(Button)findViewById(R.id.btn_dec);
        buttonEqual=(Button)findViewById(R.id.btn_EQ);
        edttxt=(TextView)findViewById(R.id.screen);

        button0.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+"0");
        });
        button1.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+"1");
        });
        button2.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+"2");
        });
        button3.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+"3");
        });
        button4.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+"4");
        });
        button5.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+"5");
        });
        button6.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+"6");
        });
        button7.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+"7");
        });
        button8.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+"8");
        });
        button9.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText()+"9");
        });

        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(edttxt.getText().length()!=0){
                    list.add((String)edttxt.getText());
                    list.add("+");
                    add=true;
                    dec=false;
                    edttxt.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(edttxt.getText().length()!=0) {
                    list.add((String)edttxt.getText());
                    list.add("-");
                    sub=true;
                    dec=false;
                    edttxt.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(edttxt.getText().length()!=0) {
                    list.add((String)edttxt.getText());
                    list.add("*");
                    mul=true;
                    dec=false;
                    edttxt.setText(null);
                }
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(edttxt.getText().length()!=0) {
                    list.add((String)edttxt.getText());
                    list.add("/");
                    div=true;
                    dec=false;
                    edttxt.setText(null);
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (add || sub || mul || div)
                    list.add((String)edttxt.getText());
                for(int i=0; i<list.size()-1;i++){
                    if(list.get(i).equals("*")||list.get(i).equals("/")) {
                        val_one = Float.parseFloat(list.remove(--i));
                        val_two = Float.parseFloat(list.remove(i + 1));
                        if (list.get(i).equals("*"))
                            total = val_one * val_two;
                        if (list.get(i).equals("/"))
                            total = val_one / val_two;
                        list.set(i,String.valueOf(total));
                    }
                }
                for(int j=0; j<list.size()-1;j++){
                    if(list.get(j).equals("+")||list.get(j).equals("-")) {
                        val_one = Float.parseFloat(list.remove(--j));
                        val_two = Float.parseFloat(list.remove(j + 1));
                        if (list.get(j).equals("+"))
                            total = val_one + val_two;
                        if (list.get(j).equals("-"))
                            total = val_one - val_two;
                        list.set(j,String.valueOf(total));
                    }
                }
                edttxt.setText(total+"");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edttxt.setText("");
                val_one=val_two=total=Float.parseFloat("0");
                add=sub=mul=div=dec=false;
                list=new ArrayList<>();
            }
        });
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(dec)
                    assert true;
                else{
                    edttxt.setText(edttxt.getText()+".");
                    dec=true;
                }
            }
        });
    }
}