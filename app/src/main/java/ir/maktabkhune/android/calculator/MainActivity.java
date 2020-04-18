package ir.maktabkhune.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.Editable;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText display;
    Button zero, one, two, three, four, five, six, seven, eight,
            nine, clear, multiplication, division, plus, subtract, equal;
    int op1, op2;
    String optr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Definition();

        display.setEnabled(false);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        clear.setOnClickListener(this);
        plus.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        division.setOnClickListener(this);
        equal.setOnClickListener(this);


    }

    public void Definition() {
        display = findViewById(R.id.display);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        clear = findViewById(R.id.clear);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        plus = findViewById(R.id.plus);
        subtract = findViewById(R.id.subtract);
        equal = findViewById(R.id.equal);
    }

    public void operation() {
        if (optr.equals("+")) {
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 = op1 + op2;
            display.setText("Result : " + Integer.toString(op1));
        } else if (optr.equals("-")) {
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 = op1 - op2;
            display.setText("Result : " + Integer.toString(op1));
        } else if (optr.equals("*")) {
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 = op1 * op2;
            display.setText("Result : " + Integer.toString(op1));
        } else if (optr.equals("/")) {
            op2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            op1 = op1 / op2;
            display.setText("Result : " + Integer.toString(op1));
        }
    }

    @Override
    public void onClick(View arg0) {
        Editable str = display.getText();

        switch (arg0.getId()) {

            case R.id.one:
                str = str.append(one.getText());
                display.setText(str);
                break;

            case R.id.two:
                str = str.append(two.getText());
                display.setText(str);
                break;

            case R.id.three:
                str = str.append(three.getText());
                display.setText(str);
                break;

            case R.id.four:
                str = str.append(four.getText());
                display.setText(str);
                break;

            case R.id.five:
                str = str.append(five.getText());
                display.setText(str);
                break;

            case R.id.six:
                str = str.append(six.getText());
                display.setText(str);
                break;

            case R.id.seven:
                str = str.append(seven.getText());
                display.setText(str);
                break;

            case R.id.eight:
                str = str.append(eight.getText());
                display.setText(str);
                break;

            case R.id.nine:
                str = str.append(nine.getText());
                display.setText(str);
                break;

            case R.id.zero:
                str = str.append(zero.getText());
                display.setText(str);
                break;

            case R.id.clear:
                op1 = 0;
                op2 = 0;
                display.setText("");
                break;

            case R.id.add:
                optr = "+";
                if (op1 == 0) {
                    op1 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                } else if (op2 != 0) {
                    op2 = 0;
                    display.setText("");
                } else {
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 + op2;
                    display.setText("Result : " + Integer.toString(op1));
                }
                break;


            case R.id.subtract:
                optr = "-";
                if (op1 == 0) {
                    op1 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                } else if (op2 != 0) {
                    op2 = 0;
                    display.setText("");
                } else {
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 - op2;
                    display.setText("Result : " + Integer.toString(op1));
                }
                break;

            case R.id.multiplication:
                optr = "*";
                if (op1 == 0) {
                    op1 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                } else if (op2 != 0) {
                    op2 = 0;
                    display.setText("");
                } else {
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 * op2;
                    display.setText("Result : " + Integer.toString(op1));
                }
                break;

            case R.id.division:
                optr = "/";
                if (op1 == 0) {
                    op1 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                } else if (op2 != 0) {
                    op2 = 0;
                    display.setText("");
                } else {
                    op2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    op1 = op1 / op2;
                    display.setText("Result : " + Integer.toString(op1));
                }
                break;


            case R.id.equal:
                if (!optr.equals(null)) {
                    if (op2 != 0) {
                        if (optr.equals("+")) {
                            display.setText("");
                            display.setText("Result : " + Integer.toString(op1));
                        } else if (optr.equals("-")) {
                            display.setText("");
                            display.setText("Result : " + Integer.toString(op1));
                        } else if (optr.equals("*")) {
                            display.setText("");
                            display.setText("Result : " + Integer.toString(op1));
                        } else if (optr.equals("/")) {
                            display.setText("");
                            display.setText("Result : " + Integer.toString(op1));
                        }
                    } else {
                        operation();
                    }
                }
                break;
        }
    }
}


