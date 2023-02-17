package com.example.calculadora;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.CalcStepsRegister;
import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    // Declarar variables para los widgets.
    private TextView tvDisplay, tvDisplay1;
    private TextView btnClear, btnDivide, btnMultiply, btnMinus, btnPlus, btnDecimal, btnEquals, btnDelete, btnSquare, btnSquareRoot, btnPercentage, btnLog, btnFactorial;
    private TextView btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;

    private String operations = "";

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asignar los widgets a las variables.
        tvDisplay = findViewById(R.id.tvDisplay);
        tvDisplay1 = findViewById(R.id.tvDisplay1);
        btnClear = findViewById(R.id.btnClear);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnEquals = findViewById(R.id.btnEquals);
        btnDelete = findViewById(R.id.btnDelete);
        btnSquare = findViewById(R.id.btnSquare);
        btnSquareRoot = findViewById(R.id.btnSquareRoot);
        btnPercentage = findViewById(R.id.btnPercentage);
        btnLog = findViewById(R.id.btnLog);
        btnFactorial = findViewById(R.id.btnFactorial);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);

        // Asignar los listeners a los botones.
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDisplay.setText("");
                tvDisplay1.setText("");
                operations = "";
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operations.length() > 0) {
                    operations = operations.substring(0, operations.length() - 1);
                    tvDisplay.setText(operations);
                }
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "0";
                tvDisplay.setText(operations);
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "1";
                tvDisplay.setText(operations);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "2";
                tvDisplay.setText(operations);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "3";
                tvDisplay.setText(operations);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "4";
                tvDisplay.setText(operations);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "5";
                tvDisplay.setText(operations);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "6";
                tvDisplay.setText(operations);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "7";
                tvDisplay.setText(operations);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "8";
                tvDisplay.setText(operations);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "9";
                tvDisplay.setText(operations);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "/";
                tvDisplay.setText(operations);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "*";
                tvDisplay.setText(operations);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "-";
                tvDisplay.setText(operations);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "+";
                tvDisplay.setText(operations);
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += ".";
                tvDisplay.setText(operations);
            }
        });

        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "^2";
                tvDisplay.setText(operations);
            }
        });

        btnSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "√";
                tvDisplay.setText(operations);
            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "%";
                tvDisplay.setText(operations);
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "log";
                tvDisplay.setText(operations);
            }
        });

        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operations += "!";
                tvDisplay.setText(operations);
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Expression e = new Expression(operations);
                CalcStepsRegister steps = new CalcStepsRegister();
                String result = e.calculate(steps) + "";
                tvDisplay1.setText(result);
            }
        });
    }

}
