/**
 * This simple calculator implements both a standard and scientific display orientation.
 * It follows standard conventions for order of operations
 * When in portrait orientation the calculator will be in standard mode.
 * When in landscape orientation the calculator will be in scientific mode.
 * Operations available in both modes:
 *      numbers 0-9
 *      addition
 *      clear
 *      division
 *      equals
 *      multiplication
 *      additive inverse
 *      subtraction
 * Operations only available in scientific mode:
 *      factorials
 *      natural logarithm
 *      logarithm base 10
 *      modulo
 *      power
 *      square root
 *      scientific notation
 *      square
 *
 * @author Adam Nykorak
 * @version 1.0
 * @since 2020-07-13
 */

package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.lang.Math;
import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    //region STATIC DECLARATIONS FOR STATE RETENTION
    static final String STATE_ADD = "add";
    static final String STATE_DEC = "dec";
    static final String STATE_DIV = "div";
    static final String STATE_ERROR = "error";
    static final String STATE_LIST = "numList";
    static final String STATE_MOD = "mod";
    static final String STATE_MUL = "mul";
    static final String STATE_POW = "pow";
    static final String STATE_SUB = "sub";
    static final String STATE_TEXT = "textOne";
    static final String STATE_TEXT2 = "textTwo";
    static final String STATE_TOTAL = "total";
    static final String STATE_VAL1 = "valOne";
    static final String STATE_VAL2 = "valTwo";
    static final String STATE_STORE = "store";
    static final String STATE_PI = "pi";
    static final String STATE_NUM = "num";
    static final String STATE_EUL = "eul";
    static final String STATE_SCI = "sci";
    static final String STATE_ROOT = "root";
    static final String STATE_SQR = "sqr";
    static final String STATE_LOG = "log";
    static final String STATE_LN = "ln";
    static final String STATE_FACT = "fact";
    static final String STATE_ABS = "abs";
    static final String STATE_INV = "inv";
    static final String STATE_EQL = "eql";
    //endregion

    //region DECLARATION AND INITIALIZATION OF VARIABLES
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, buttonPi, buttonEul, buttonAbs, buttonAdd, buttonC, buttonDivision, buttonEqual, buttonMul, buttonNeg, buttonSub, buttonFact, buttonLn, buttonLog, buttonMod, buttonPow, buttonRoot, buttonSci, buttonSqr, buttonInv;
    TextView edttxt, edttxt2;
    float val_one = 0, val_two = 0, total = 0;
    String store = "";
    boolean add, sub, mul, div, dec, pow, mod, pi, num, eul, sci, root, sqr, log, ln, fact, abs, inv, eql;
    boolean error=false;
    ArrayList<String> list = new ArrayList<>();
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //region INITIALIZATION OF BUTTONS
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
        buttonPi=(Button)findViewById(R.id.btn_Pi);
        buttonEul=(Button)findViewById(R.id.btn_E);
        buttonInv=(Button)findViewById(R.id.btn_Inv);
        buttonAbs=(Button)findViewById(R.id.btn_Abs);
        buttonAdd=(Button)findViewById(R.id.btn_add);
        buttonSub=(Button)findViewById(R.id.btn_sub);
        buttonMul=(Button)findViewById(R.id.btn_mul);
        buttonDivision=(Button)findViewById(R.id.btn_div);
        buttonC=(Button)findViewById(R.id.btn_clr);
        button10=(Button)findViewById(R.id.btn_dec);
        buttonEqual=(Button)findViewById(R.id.btn_EQ);
        buttonSqr=(Button)findViewById(R.id.btn_sqr);
        buttonPow=(Button)findViewById(R.id.btn_pow);
        buttonSci=(Button)findViewById(R.id.btn_sci);
        buttonRoot=(Button)findViewById(R.id.btn_root);
        buttonFact=(Button)findViewById(R.id.btn_fact);
        buttonMod=(Button)findViewById(R.id.btn_mod);
        buttonLn=(Button)findViewById(R.id.btn_ln);
        buttonLog=(Button)findViewById(R.id.btn_log);
        buttonNeg=(Button)findViewById(R.id.btn_neg);
        //endregion

        /**
        * INITIALIZATION OF TEXT SCREENS
        * SCREEN 1: INPUT AND TOTAL SCREEN
        * SCREEN 2: RUNNING CALCULATION SCREEN
        */
        edttxt=(TextView)findViewById(R.id.screen);
        edttxt2=(TextView)findViewById(R.id.screen2);

        /**
        * STATE RETENTION CALL IF PREVIOUS SAVED STATE EXISTS
        */
        if(savedInstanceState!=null){
            list.addAll((ArrayList<String>) savedInstanceState.getSerializable(STATE_LIST));
            edttxt.setText(savedInstanceState.getString(STATE_TEXT));
            edttxt2.setText(savedInstanceState.getString(STATE_TEXT2));
            val_one = savedInstanceState.getFloat(STATE_VAL1);
            val_two = savedInstanceState.getFloat(STATE_VAL2);
            total = savedInstanceState.getFloat(STATE_TOTAL);
            store = savedInstanceState.getString(STATE_TOTAL);
            add = savedInstanceState.getBoolean(STATE_ADD);
            sub = savedInstanceState.getBoolean(STATE_SUB);
            mul = savedInstanceState.getBoolean(STATE_MUL);
            div = savedInstanceState.getBoolean(STATE_DIV);
            dec = savedInstanceState.getBoolean(STATE_DEC);
            pow = savedInstanceState.getBoolean(STATE_POW);
            mod = savedInstanceState.getBoolean(STATE_MOD);
            error = savedInstanceState.getBoolean(STATE_ERROR);
            pi = savedInstanceState.getBoolean(STATE_PI);
            num = savedInstanceState.getBoolean(STATE_NUM);
            eul = savedInstanceState.getBoolean(STATE_EUL);
            sci = savedInstanceState.getBoolean(STATE_SCI);
            root = savedInstanceState.getBoolean(STATE_ROOT);
            sqr = savedInstanceState.getBoolean(STATE_SQR);
            log = savedInstanceState.getBoolean(STATE_LOG);
            ln = savedInstanceState.getBoolean(STATE_LN);
            fact = savedInstanceState.getBoolean(STATE_FACT);
            abs = savedInstanceState.getBoolean(STATE_ABS);
            inv = savedInstanceState.getBoolean(STATE_INV);
            eql = savedInstanceState.getBoolean(STATE_EQL);
        }

        /**
        * ALL ACTIONS AFTER THIS COMMENT ARE SHARED BETWEEN BOTH PORTRAIT (NORMAL) AND LANDSCAPE (SCIENTIFIC) STATES.
        * ANY INPUT WILL BE EITHER RETAINED ON THE SCREENS OR IN THE LIST OF VARIABLES
        */

        /**
        * BUTTON 0 THROUGH 9 ACTION ON CLICK
        * WHEN BUTTON PRESSED OUTPUTS SPECIFIED NUMBER TO BOTH SCREENS
        */
        //region Button 0 through 9 click listener
        button0.setOnClickListener((v) -> {
            if(error){ edttxt.setText(""); error=false;}
            if(!specialTest()&&!abs&&!eql) {
                edttxt.setText(edttxt.getText() + "0");
                edttxt2.setText(edttxt2.getText() + "0");
                num=true;
            }
        });
        button1.setOnClickListener((v) -> {
            if(error){ edttxt.setText(""); error=false;}
            if(!specialTest()&&!abs&&!eql) {
                edttxt.setText(edttxt.getText() + "1");
                edttxt2.setText(edttxt2.getText() + "1");
                num=true;
            }
        });
        button2.setOnClickListener((v) -> {
            if(error){ edttxt.setText(""); error=false;}
            if(!specialTest()&&!abs&&!eql) {
                edttxt.setText(edttxt.getText() + "2");
                edttxt2.setText(edttxt2.getText() + "2");
                num=true;
            }
        });
        button3.setOnClickListener((v) -> {
            if(error){ edttxt.setText(""); error=false;}
            if(!specialTest()&&!abs&&!eql) {
                edttxt.setText(edttxt.getText() + "3");
                edttxt2.setText(edttxt2.getText() + "3");
                num=true;
            }
        });
        button4.setOnClickListener((v) -> {
            if(error){ edttxt.setText(""); error=false;}
            if(!specialTest()&&!abs&&!eql) {
                edttxt.setText(edttxt.getText() + "4");
                edttxt2.setText(edttxt2.getText() + "4");
                num=true;
            }
        });
        button5.setOnClickListener((v) -> {
            if(error){ edttxt.setText(""); error=false;}
            if(!specialTest()&&!abs&&!eql) {
                edttxt.setText(edttxt.getText() + "5");
                edttxt2.setText(edttxt2.getText() + "5");
                num=true;
            }
        });
        button6.setOnClickListener((v) -> {
            if(error){ edttxt.setText(""); error=false;}
            if(!specialTest()&&!abs&&!eql) {
                edttxt.setText(edttxt.getText() + "6");
                edttxt2.setText(edttxt2.getText() + "6");
                num=true;
            }
        });
        button7.setOnClickListener((v) -> {
            if(error){ edttxt.setText(""); error=false;}
            if(!specialTest()&&!abs&&!eql) {
                edttxt.setText(edttxt.getText() + "7");
                edttxt2.setText(edttxt2.getText() + "7");
                num=true;
            }
        });
        button8.setOnClickListener((v) -> {
            if(error){ edttxt.setText(""); error=false;}
            if(!specialTest()&&!abs&&!eql) {
                edttxt.setText(edttxt.getText() + "8");
                edttxt2.setText(edttxt2.getText() + "8");
                num=true;
            }
        });
        button9.setOnClickListener((v) -> {
            if(error){ edttxt.setText(""); error=false;}
            if(!specialTest()&&!abs&&!eql) {
                edttxt.setText(edttxt.getText() + "9");
                edttxt2.setText(edttxt2.getText() + "9");
                num=true;
            }
        });
        //endregion

        /**
        * DECIMAL ACTION ON CLICK
        * INPUTS A DECIMAL ON BOTH SCREENS AFTER THE PREVIOUSLY PRESSED NUMBER
        */
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(dec)
                    assert true;
                else{
                    edttxt.setText(edttxt.getText()+".");
                    edttxt2.setText(edttxt2.getText()+".");
                    dec=true;
                }
            }
        });

        /**
        * ADD ACTION ON CLICK
        * ADDS THE PREVIOUSLY PRESSED NUMBER TO THE LIST,
        * FOLLOWED BY THE SYMBOL +
        * THEN ADDS THE SYMBOL + AT THE END OF SCREEN 2
        */
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(error){ edttxt.setText("0"); error=false;}
                if(edttxt.getText().length()!=0){
                    list.add((String)edttxt.getText());
                    list.add("+");
                    add=true;
                    dec=false;
                    eql=false;
                    negateBool("special");
                    edttxt.setText(null);
                    edttxt2.setText(edttxt2.getText()+"+");
                }
            }
        });

        /**
        * CLEARS ALL DATA ON CLICK, I.E.:
        *    CLEARS BOTH SCREENS(BLANK)
        *  RESETS THE VARIABLES TO START VALUES
        *    CLEARS THE LIST, RESETTING IT TO EMPTY
        */
        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edttxt.setText("");
                edttxt2.setText("");
                val_one=val_two=total=Float.parseFloat("0");
                negateBool("all");
                list=new ArrayList<>();
            }
        });

        /**
        * DIVIDE ACTION ON CLICK
        * ADDS THE PREVIOUSLY PRESSED NUMBER TO THE LIST,
        * FOLLOWED BY THE SYMBOL /
        * THEN ADDS TEH SYMBOL / AT THE END OF SCREEN 2
        */
        buttonDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(error){ edttxt.setText("0"); error=false;}
                if(edttxt.getText().length()!=0) {
                    list.add((String)edttxt.getText());
                    list.add("/");
                    div=true;
                    dec=false;
                    eql=false;
                    negateBool("special");
                    edttxt.setText(null);
                    edttxt2.setText(edttxt2.getText()+"/");
                }
            }
        });

        /**
        * EQUAL ACTION ON CLICK
        * IF ONE OF THE BOOLEAN ACTIONS IS ACTIVE IT ADDS THE PREVIOUSLY PRESSED NUMBER TO THE LIST
        * IF THE LIST IS EVEN LENGTH THEN EQUALS IS NOT CARRIED OUT,
        * AS THIS MEANS THERE ARE NOT ENOUGH VARIABLE IN THE LIST
        * THE ACTION WILL THEN GO THROUGH THE LIST FOLLOWING ORDER OF OPERATIONS,
        * REMOVING OPERATION SYMBOLS AS THEY COME UP FOLLOWED BY SURROUNDING NUMBERS.
        * THE EQUATION IS THEN CARRIED OUT AND THE NEXT OPERATION IS FOUND.
        *     IF 2 OPERATIONS ARE FOUND TOGETHER AND ERROR OCCURS
        *     IF THE USER ATTEMPTS TO DIVIDE BY 0 AN ERROR OCCURS
        *     THIS CALCULATOR HAS CHOSEN TO GO BY THE COMMON CONCEPTION THAT MOD0 WILL PRODUCE AN ERROR
        * ADDS THE SYMBOL = TO SCREEN 2, THEN OUTPUT THE TOTAL TO BOTH SCREENS
        *
        * @exception Symbols Out Of Sequence if user inputs two sequential operators
        * @exception Cannot Divide by 0 if user attempts to divide by 0
        * @exception Mod 0 Undifined if user attempts Mod 0
        */
        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(error){ edttxt.setText("0"); error=false;}
                if (add || sub || mul || div || pow || mod)
                    list.add((String)edttxt.getText());
                if(list.size()%2==0) return;
                for(int i=0; i<list.size()-1;i++){
                    if(list.get(i).equals("^X")){
                        try {
                            val_one = Float.parseFloat(list.remove(--i));
                        }
                        catch(Exception e){
                            edttxt.setText("Symbols Out Of Sequence");
                            error=true;
                            list=new ArrayList<>();
                            val_one=val_two=total=Float.parseFloat("0");
                            return;
                        }
                        try {
                            val_two = Float.parseFloat(list.remove(i + 1));
                        }
                        catch(Exception e){
                            edttxt.setText("Symbols Out Of Sequence");
                            error=true;
                            list=new ArrayList<>();
                            val_one=val_two=total=Float.parseFloat("0");
                            return;
                        }
                        total=(float)Math.pow((double)val_one,(double)val_two);
                        list.set(i,String.valueOf(total));
                    }
                }
                for(int i=0; i<list.size()-1;i++){
                    if(list.get(i).equals("*")||list.get(i).equals("/")||list.get(i).equals("%")) {
                        try {
                            val_one = Float.parseFloat(list.remove(--i));
                        }
                        catch(Exception e){
                            edttxt.setText("Symbols Out Of Sequence");
                            error=true;
                            list=new ArrayList<>();
                            val_one=val_two=total=Float.parseFloat("0");
                            return;
                        }
                        try {
                            val_two = Float.parseFloat(list.remove(i + 1));
                        }
                        catch(Exception e){
                            edttxt.setText("Symbols Out Of Sequence");
                            error=true;
                            list=new ArrayList<>();
                            val_one=val_two=total=Float.parseFloat("0");
                            return;
                        }
                        if (list.get(i).equals("*"))
                            total = val_one * val_two;
                        if (list.get(i).equals("/"))
                            if(val_two==0) {
                                edttxt.setText("Cannot Divide By 0");
                                error=true;
                                list=new ArrayList<>();
                                val_one=val_two=total=Float.parseFloat("0");
                                return;
                            }
                            else
                                total = val_one / val_two;
                        if(list.get(i).equals("%")){
                            if(val_two==0) {
                                edttxt.setText("Mod 0 Undefined");
                                error=true;
                                list=new ArrayList<>();
                                val_one=val_two=total=Float.parseFloat("0");
                                return;
                            }
                            else
                                total=val_one%val_two;
                        }
                        list.set(i,String.valueOf(total));
                    }
                }
                for(int j=0; j<list.size()-1;j++){
                    if(list.get(j).equals("+")||list.get(j).equals("-")) {
                        try {
                            val_one = Float.parseFloat(list.remove(--j));
                        }
                        catch(Exception e){
                            edttxt.setText("Symbols Out Of Sequence");
                            error=true;
                            list=new ArrayList<>();
                            val_one=val_two=total=Float.parseFloat("0");
                            return;
                        }
                        try {
                            val_two = Float.parseFloat(list.remove(j + 1));
                        }
                        catch(Exception e){
                            edttxt.setText("Symbols Out Of Sequence");
                            error=true;
                            list=new ArrayList<>();
                            val_one=val_two=total=Float.parseFloat("0");
                            return;
                        }
                        if (list.get(j).equals("+"))
                            total = val_one + val_two;
                        if (list.get(j).equals("-"))
                            total = val_one - val_two;
                        list.set(j,String.valueOf(total));
                    }
                }
                edttxt.setText(total+"");
                edttxt2.setText(total+"");
                dec=true;
                eql=true;
                pow=false;
            }
        });

        /**
        * MULTIPLICATION ACTION ON CLICK
        * ADDS THE PREVIOUSLY PRESSED NUMBER TO THE LIST
        * FOLLOWED BY THE SYMBOL *
        * THEN ADDS THE SYMBOL * AT THE END OF SCREEN 2
        */
        buttonMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(error){ edttxt.setText("0"); error=false;}
                if(edttxt.getText().length()!=0) {
                    list.add((String)edttxt.getText());
                    list.add("*");
                    mul=true;
                    dec=false;
                    eql=false;
                    negateBool("special");
                    edttxt.setText(null);
                    edttxt2.setText(edttxt2.getText()+"*");
                }
            }
        });

        /**
        * ADDITIVE INVERSE ACTION ON CLICK
        * SCREEN 1: DISPLAYS THE ADDITIVE INVERSE OF THE DISPLAYED NUMBER, POSITIVE -> NEGATIVE, NEGATIVE -> POSITIVE
        *             EG: 2 -> -2, -3 -> 3
        * SCREEN 2: REMOVES THE LAST NUMBER PRESSED AND REPLACES IT WITH ITS ADDITIVE INVERSE
        *             EG: 2+2 -> 2+-2
        */
        buttonNeg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(error){ edttxt.setText("0"); error=false;}
                if(((String) edttxt.getText()).equals("")){
                }
                else if(specialTest()){
                    String base = (String)edttxt2.getText();
                    int pos=position();
                    String edit=base.substring(pos);
                    if(Float.parseFloat((String)edttxt.getText())<0) {
                        base=base.substring(0,pos-1);
                        edttxt2.setText(base + edit);
                    }
                    else {
                        base=base.substring(0,pos);
                        edttxt2.setText(base + "-" + edit);
                    }
                    edttxt.setText(String.valueOf(Float.parseFloat((String)edttxt.getText())*-1));
                }
                else{
                    String base = (String)edttxt2.getText();
                    String edit = (String)edttxt.getText();
                    int pos = base.lastIndexOf(edit);
                    base=base.substring(0,pos);
                    edttxt.setText(String.valueOf(Float.parseFloat((String)edttxt.getText())*-1));
                    edttxt2.setText(base+edttxt.getText());
                }
            }
        });

        /**
        * SUBTRACTION ACTION ON CLICK
        * ADDS THE PREVIOUSLY PRESSED NUMBER TO THE LIST
        * FOLLOWED BY THE SYMBOL -
        * THEN ADDS THE SYMBOL - AT THE END OF SCREEN 2
        */
        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(error){ edttxt.setText("0"); error=false;}
                if(edttxt.getText().length()!=0) {
                    list.add((String)edttxt.getText());
                    list.add("-");
                    sub=true;
                    dec=false;
                    eql=false;
                    negateBool("special");
                    edttxt.setText(null);
                    edttxt2.setText(edttxt2.getText()+"-");
                }
            }
        });

        /**
        * BUTTONS ACTIVE WHEN IN LANDSCAPE MODE
        * THE FOLLOWING BUTTONS ARE ONLY AVAILABLE WHEN IN LANDSCAPE, OR "SCIENTIFIC" MODE
        * THEIR SCREEN AND LIST INPUTS WILL CARRY OVER TO PORTRAIT MODE WHEN ACTIVATED,
        * BUT THE BUTTONS THEMSELVES WILL BE UNAVAILABLE
        */

        if(getResources().getConfiguration().orientation==2) {

            buttonPi.setOnClickListener((v) -> {
                if(error){ edttxt.setText(""); error=false;}
                if(edttxt==null|| dec || num){assert true;}
                else {
                    edttxt.setText(String.valueOf(Math.PI));
                    edttxt2.setText(edttxt2.getText() + "π");
                    dec=true;
                    pi=true;
                }
            });

            buttonEul.setOnClickListener((v) -> {
                if(error){ edttxt.setText(""); error=false;}
                if(edttxt==null|| dec || num){assert true;}
                else {
                    edttxt.setText(String.valueOf(Math.exp(1)));
                    edttxt2.setText(edttxt2.getText() + "e");
                    dec=true;
                    eul=true;
                }
            });

            buttonAbs.setOnClickListener((v) -> {
                if(error){ edttxt.setText("0"); error=false;}
                if(((String) edttxt.getText()).equals("") ||Float.parseFloat((String)edttxt.getText())>=0){assert true;}
                else if(specialTest()){
                    String base = (String)edttxt2.getText();
                    int pos=position();
                    String edit = base.substring(pos);
                    base=base.substring(0,pos-1);
                    edttxt2.setText(base+edit);
                    edttxt.setText(String.valueOf(Float.parseFloat((String)edttxt.getText())*-1));
                }
                else {
                    String base = (String)edttxt2.getText();
                    String edit = (String)edttxt.getText();
                    int pos=base.lastIndexOf(edit);
                    base=base.substring(0,pos);
                    edttxt.setText(String.valueOf(Float.parseFloat((String)edttxt.getText())*-1));
                    edttxt2.setText(base+edttxt.getText());
                    abs=true;
                }
            });

            buttonInv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                        Float.parseFloat((String) edttxt.getText());
                    }
                    catch(Exception e){
                        edttxt.setText("Attempted Multiplicative Inverse on operator not number");
                        error=true;
                        list=new ArrayList<>();
                        val_one=val_two=total=Float.parseFloat("0");
                        return;
                    }
                    if (error) {
                        edttxt.setText("0");
                        error = false;
                    }
                    if (((String) edttxt.getText()).equals("")) {
                    }
                    else if(Float.parseFloat((String) edttxt.getText()) == 0) {
                        edttxt.setText("Cannot divide by 0");
                        error=true;
                        list=new ArrayList<>();
                        val_one=val_two=total=Float.parseFloat("0");
                        return;
                    }
                    else {
                        if(specialTest()){
                            String base = (String) edttxt2.getText();
                            int pos = position();
                            String edit=base.substring(pos);
                            base=base.substring(0,pos);
                            edttxt2.setText(base+"1/"+edit);
                        }
                        else {
                            String base = (String) edttxt2.getText();
                            String edit = (String) edttxt.getText();
                            int pos = base.lastIndexOf(edit);
                            base = base.substring(0, pos);
                            edttxt2.setText(base + "1/" + edit);
                        }
                        edttxt.setText(String.valueOf(1 / Float.parseFloat((String) edttxt.getText())));
                        inv = true;
                    }
                }
            });

            /**
            * FACTORIAL ACTION ON CLICK
            * SET I EQUAL TO 1
            * INCREMENTS THE VALUE I, MULTIPLYING IT BY ITSELF UNTIL I IS EQUAL TO OR GREATER THAN THE LAST NUMBER PRESSED
            * OUTPUTS THE TOTAL TO SCREEN 1
            * ADDS THE SYMBOL ! TO THE END OF SCREEN 2
            * NOTE: DOES NOT IMPLEMENT THE GAMMA FUNCTION, SO ALL DECIMAL VALUES WILL RESULT IN INCORRECT RESULTS
            */
            buttonFact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (error) {
                        edttxt.setText("0");
                        error = false;
                    }
                    if (((String) edttxt.getText()).equals("")) {
                    } else {
                        float end=Float.parseFloat((String) edttxt.getText());
                        store = (String)edttxt.getText();
                        BigInteger sum = BigInteger.ONE;
                        for (int i = 1; i <= end; i++) {
                            sum=sum.multiply(BigInteger.valueOf(i));
                        }
                        edttxt.setText(String.valueOf(sum));
                        edttxt2.setText((String)edttxt2.getText()+(char)33);
                        fact=true;
                    }
                }
            });

            /**
            * NATURAL LOGARITHM ON CLICK
            * ATTEMPTS TO CARRY OUT THE NATURAL LOG OF THE LAST INPUT
            * IF THE LAST INPUT WAS AN OPERATOR OR A 0, AN ERROR WILL OCCUR
            *     INPUT WAS OPERATOR: ATTEMPTED LN ON OPERATOR NOT NUMBER
            *     0: LN 0 IS UNDEFINED
            * OTHERWISE, TAKES THE NATURAL LOG OF THE INPUT AND OUTPUTS IT TO SCREEN 1
            * THEN DELETES THE LAST INPUT FROM SCREEN 2 AND REPLACES IT WITH LN(N)
            * WHERE N IS THE LAST INPUT
            *
            * @exception Attempted Ln on operator not number if user inputs operator before ln
            * @exception ln 0 is Undefined if user attempts to ln 0
            */
            buttonLn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                        Float.parseFloat((String) edttxt.getText());
                    }
                    catch(Exception e){
                        edttxt.setText("Attempted Ln on operator not number");
                        error=true;
                        list=new ArrayList<>();
                        val_one=val_two=total=Float.parseFloat("0");
                        return;
                    }
                    if (error) {
                        edttxt.setText("0");
                        error = false;
                    }
                    if (((String) edttxt.getText()).equals("")) {
                    }
                    else if(Float.parseFloat((String) edttxt.getText()) <= 0) {
                        edttxt.setText("Ln 0 or less is Undefined");
                        error=true;
                        list=new ArrayList<>();
                        val_one=val_two=total=Float.parseFloat("0");
                        return;
                    }
                    else {
                        if(specialTest()){
                            String base = (String) edttxt2.getText();
                            int pos = position();
                            String edit=base.substring(pos);
                            base=base.substring(0,pos);
                            edttxt2.setText(base+"Ln("+edit+")");
                        }
                        else {
                            String base = (String) edttxt2.getText();
                            String edit = (String) edttxt.getText();
                            int pos = base.lastIndexOf(edit);
                            base = base.substring(0, pos);
                            edttxt2.setText(base + "Ln(" + edit + ")");
                        }
                        edttxt.setText(String.valueOf(Math.log(Float.parseFloat((String) edttxt.getText()))));
                        ln = true;
                    }
                }
            });
            /**
            * LOGARITHM BASE 10 ON CLICK
            * ATTEMPTS TO CARRY OUT THE LOG10 OF THE LAST INPUT
            * IF THE LAST INPUT WAS AN OPERATOR OR A 0, AN ERROR WILL OCCUR
            *     INPUT WAS OPERATOR: ATTEMPTED LOG ON OPERATOR NOT NUMBER
            *     0: LOG 0 IS UNDEFINED
            * OTHERWISE, TAKES THE LOG BASE 10 OF THE INPUT AND OUTPUTS IT TO SCREEN 1
            * THEN DELETES THE LAST INPUT FROM SCREEN 2 AND REPLACES IT WITH LOG(N)
            * WHERE N IS THE LAST INPUT
            *
            * @exception Attempted Log on operator not number if user inputs operator before log
            * @exception log 0 is Undefined if user attempts to log 0
            * */
            buttonLog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                        Float.parseFloat((String) edttxt.getText());
                    }
                    catch(Exception e){
                        edttxt.setText("Attempted Log on operator not number");
                        error=true;
                        list=new ArrayList<>();
                        val_one=val_two=total=Float.parseFloat("0");
                        return;
                    }
                    if (error) {
                        edttxt.setText("0");
                        error = false;
                    }
                    if (((String) edttxt.getText()).equals("")) {
                    }
                    else if(Float.parseFloat((String) edttxt.getText()) == 0) {
                        edttxt.setText("Log 0 is Undefined");
                        error=true;
                        list=new ArrayList<>();
                        val_one=val_two=total=Float.parseFloat("0");
                        return;
                    }
                    else {
                        if(specialTest()){
                            String base = (String) edttxt2.getText();
                            int pos = position();
                            String edit=base.substring(pos);
                            base=base.substring(0,pos);
                            edttxt2.setText(base+"Log("+edit+")");
                        }
                        else {
                            String base = (String) edttxt2.getText();
                            String edit = (String) edttxt.getText();
                            int pos = base.lastIndexOf(edit);
                            base = base.substring(0, pos);
                            edttxt2.setText(base + "Log(" + edit + ")");
                        }
                        edttxt.setText(String.valueOf(Math.log10(Float.parseFloat((String)edttxt.getText()))));
                        log=true;
                    }
                }
            });

            /**
            * MODULO ACTION ON CLICK
            * ADDS THE PREVIOUSLY PRESSED NUMBER TO THE LIST
            * FOLLOWED BY THE SYMBOL %
            * THEN ADDS MOD AT THE END OF SCREEN 2
            */
            buttonMod.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    if(error){ edttxt.setText("0"); error=false;}
                    if(edttxt.getText().length()!=0) {
                        list.add((String)edttxt.getText());
                        list.add("%");
                        mod=true;
                        dec=false;
                        eql=false;
                        negateBool("special");
                        edttxt2.setText((String)edttxt2.getText()+"Mod");
                        edttxt.setText(null);
                    }
                }
            });

            /**
            * POWER OF ACTION ON CLICK
            * ADDS THE PREVIOUSLY PRESSED NUMBER TO THE LIST
            * FOLLOWED BY THE SYMBOL ^X
            * THEN ADDS THE SYMBOL ^ AT THE END OF SCREEN 2
            */
            buttonPow.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    if(error){ edttxt.setText("0"); error=false;}
                    if(edttxt.getText().length()!=0) {
                        list.add((String)edttxt.getText());
                        list.add("^X");
                        pow=true;
                        dec=false;
                        eql=false;
                        dec=pi=num=eul=sci=root=sqr=log=ln=fact=abs=inv=false;
                        edttxt2.setText((String)edttxt2.getText()+"^");
                        edttxt.setText(null);
                    }
                }
            });

            /**
            * SQUARE ROOT ACTION ON CLICK
            * ATTEMPTS TO CARRY OUT THE SQUARE ROOT OF THE LAST INPUT
            * IF THE LAST INPUT WAS AN OPERATOR AN ERROR OCCURS
            * OTHERWISE, OUTPUTS THE RESULT TO SCREEN 1
            * THEN DELETES THE PREVIOUS INPUT FROM SCREEN 2 AND ADDS THE RESULT TO THE END
            * NOTE: ROOT OF ROOT CURRENTLY CRASHES PROGRAM
            *
            * @exception Attempted sqr root on operator not number if user inputs operator before root
            */
            buttonRoot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                        Float.parseFloat((String) edttxt.getText());
                    }
                    catch(Exception e){
                        edttxt.setText("Attempted sqr root on operator not number");
                        error=true;
                        list=new ArrayList<>();
                        val_one=val_two=total=Float.parseFloat("0");
                        return;
                    }
                    if (error) {
                        edttxt.setText("0");
                        error = false;
                    }
                    if (((String) edttxt.getText()).equals("")) {
                    } else {
                        if(specialTest()){
                            String base = (String) edttxt2.getText();
                            int pos = position();
                            String edit=base.substring(pos);
                            base=base.substring(0,pos);
                            edttxt2.setText(base+"("+(char)8730+edit+")");
                        }
                        else {
                            String base = (String) edttxt2.getText();
                            String edit = (String) edttxt.getText();
                            int pos = base.lastIndexOf(edit);
                            base = base.substring(0, pos);
                            edttxt2.setText(base+"("+(char)8730+edit+")");
                        }
                        edttxt.setText(String.valueOf((Math.sqrt(Float.parseFloat((String) edttxt.getText())))));
                        root=true;
                    }
                }
            });

            /**
            * SCIENTIFIC NOTATION ACTION BUTTON
            * TAKES BASE 10 TO THE POWER OF THE PREVIOUS INPUT
            * THE RESULT IS THEN SENT TO SCREEN 1
            * THE INPUT IS CONVERTED TO SUPERSCRIPT USING DECIMAL CHARACTER VALUES
            * THEN 10 FOLLOWED BY THE SUPERSCRIPT INPUT IS ADDED TO THE END OF SCREEN 2
            */
            buttonSci.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (error) {
                        edttxt.setText("0");
                        error = false;
                    }
                    if (((String) edttxt.getText()).equals("")||((String) edttxt.getText()).equals("Infinity")) {
                    }
                    else {
                        String base = (String) edttxt2.getText();
                            int pos=0;
                              String edit="";
                              if(specialTest()) {
                                  pos = position();
                                  edit=base.substring(pos);
                              }
                              else {
                                  edit = (String) edttxt.getText();
                                  pos = base.lastIndexOf(edit);
                              }
                              base = base.substring(0, pos);
                              edit="10^(" + edit+")";
                              edttxt2.setText(base + edit);
                              store=edit;
                          }
                        edttxt.setText(String.valueOf((float) Math.pow(10, (double) (Float.parseFloat((String) edttxt.getText())))));
                        negateBool("special");
                        sci = true;
                    }
            });

            /**
            * SQUARED ACTION ON CLICK
            * ATTEMPTS TO MULTIPLY THE PREVIOUSLY PRESSED NUMBER BY ITSELF
            * IF THE LAST INPUT WAS AN OPERATOR AN ERROR OCCURS
            * OUTPUTS THE RESULT TO SCREEN 1 AND ADDS A SUPERSCRIPT 2 TO THE END OF SCREEN 2
            *
            * @exception Attempted sqr  on operator not number if user inputs operator before sqr
            */
            buttonSqr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                        Float.parseFloat((String) edttxt.getText());
                    }
                    catch(Exception e){
                        edttxt.setText("Attempted sqr on operator not number");
                        error=true;
                        list=new ArrayList<>();
                        val_one=val_two=total=Float.parseFloat("0");
                        return;
                    }
                    if (error) {
                        edttxt.setText("0");
                        error = false;
                    }
                    if (((String) edttxt.getText()).equals("")) {
                    } else {
                        String base = (String) edttxt2.getText();
                        int pos=0;
                        String edit="";
                        if(specialTest()) {
                            pos = position();
                            edit=base.substring(pos);
                        }
                        else {
                            edit = (String) edttxt.getText();
                            pos = base.lastIndexOf(edit);
                        }
                        base = base.substring(0, pos);
                        edit="(" + edit+")²";
                        edttxt2.setText(base + edit);
                        store=edit;
                    }
                        edttxt.setText(String.valueOf((Float.parseFloat((String) edttxt.getText())) * (Float.parseFloat((String) edttxt.getText()))));
                    negateBool("Special");
                        sqr=true;
                    }
            });
        }
    }

    protected int position () {
        String base = (String)edttxt2.getText();
        int pos=0;
        if(pi||eul)
            pos=base.length()-1;
        if(root)
            pos=base.lastIndexOf("("+(char)8730);
        if(log)
            pos=base.lastIndexOf("Log");
        if(ln)
            pos=base.lastIndexOf("Ln");
        if(sqr||fact||sci)
            pos=base.lastIndexOf(store);
        if(inv)
            pos=base.lastIndexOf("1/");
        return pos;
    }

    protected boolean specialTest(){

        return pi||eul||sci||root||sqr||log||ln||fact||inv;
    }

    protected void negateBool(String check){
        if(check.equals("all"))
            add=sub=mul=div=dec=pow=mod=pi=num=eul=sci=root=sqr=log=ln=fact=abs=inv=eql=false;
        else if(check.equals("special"))
            pi=num=eul=sci=root=sqr=log=ln=fact=abs=inv=false;
    }

        /**
        * OVERRIDE METHOD FOR SAVING THE INSTANCE STATE
        * SAVES ALL VARIABLES INCLUDING THE LIST AND SCREENS FOR USE AFTER ORIENTATION CHANGE
        */
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putSerializable(STATE_LIST, list);
        outState.putString(STATE_TEXT, edttxt.getText().toString());
        outState.putString(STATE_TEXT2, edttxt2.getText().toString());
        outState.putFloat(STATE_VAL1, val_one);
        outState.putFloat(STATE_VAL2, val_two);
        outState.putFloat(STATE_TOTAL, total);
        outState.putBoolean(STATE_ADD, add);
        outState.putBoolean(STATE_SUB, sub);
        outState.putBoolean(STATE_MUL, mul);
        outState.putBoolean(STATE_DIV, div);
        outState.putBoolean(STATE_DEC, dec);
        outState.putBoolean(STATE_POW, pow);
        outState.putBoolean(STATE_MOD, mod);
        outState.putBoolean(STATE_ERROR, error);
        outState.putString(STATE_STORE, store);
        outState.putBoolean(STATE_PI, pi);
        outState.putBoolean(STATE_NUM, num);
        outState.putBoolean(STATE_EUL, eul);
        outState.putBoolean(STATE_SCI, sci);
        outState.putBoolean(STATE_ROOT, root);
        outState.putBoolean(STATE_SQR, sqr);
        outState.putBoolean(STATE_LOG, log);
        outState.putBoolean(STATE_LN, ln);
        outState.putBoolean(STATE_FACT, fact);
        outState.putBoolean(STATE_ABS, abs);
        outState.putBoolean(STATE_INV, inv);
        outState.putBoolean(STATE_EQL, eql);
    }

    /**
    * OVERRIDE METHOD FOR RESTORING THE INSTANCE STATE
    * RESTORES ALL VARIABLES INCLUDING THE LIST AND SCREENS FOR USE AFTER ORIENTATION CHANGE
    */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        list.addAll((ArrayList<String>) savedInstanceState.getSerializable(STATE_LIST));
        edttxt.setText(savedInstanceState.getString(STATE_TEXT));
        edttxt2.setText(savedInstanceState.getString(STATE_TEXT2));
        val_one = savedInstanceState.getFloat(STATE_VAL1);
        val_two = savedInstanceState.getFloat(STATE_VAL2);
        total = savedInstanceState.getFloat(STATE_TOTAL);
        add = savedInstanceState.getBoolean(STATE_ADD);
        sub = savedInstanceState.getBoolean(STATE_SUB);
        mul = savedInstanceState.getBoolean(STATE_MUL);
        div = savedInstanceState.getBoolean(STATE_DIV);
        dec = savedInstanceState.getBoolean(STATE_DEC);
        pow = savedInstanceState.getBoolean(STATE_POW);
        mod = savedInstanceState.getBoolean(STATE_MOD);
        error = savedInstanceState.getBoolean(STATE_ERROR);
        store = savedInstanceState.getString(STATE_STORE);
        pi = savedInstanceState.getBoolean(STATE_PI);
        num = savedInstanceState.getBoolean(STATE_NUM);
        eul = savedInstanceState.getBoolean(STATE_EUL);
        sci = savedInstanceState.getBoolean(STATE_SCI);
        root = savedInstanceState.getBoolean(STATE_ROOT);
        sqr = savedInstanceState.getBoolean(STATE_SQR);
        log = savedInstanceState.getBoolean(STATE_LOG);
        ln = savedInstanceState.getBoolean(STATE_LN);
        fact = savedInstanceState.getBoolean(STATE_FACT);
        abs = savedInstanceState.getBoolean(STATE_ABS);
        inv = savedInstanceState.getBoolean(STATE_INV);
        eql = savedInstanceState.getBoolean(STATE_EQL);
    }
}