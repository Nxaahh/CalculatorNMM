package com.example.calculatornmm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Float Total;
    Float number1;
    Float number2;
    String simbol;
    StringBuilder currentInput = new StringBuilder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        TextView textView = findViewById(R.id.textView);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button0 = findViewById(R.id.button0);
        Button buttonC = findViewById(R.id.buttonC);
        Button buttonminus = findViewById(R.id.buttonminus);
        Button buttonPOR = findViewById(R.id.buttonPOR);
        Button buttonDivi = findViewById(R.id.buttonDivi);
        Button buttonmore = findViewById(R.id.buttonmore);
        Button button1 = findViewById(R.id.button1);
        Button butonEqual = findViewById(R.id.buttonEqual);

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Añadir "0" al texto actual del TextView
                textView.setText("0");

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Añadir "1" al texto actual del TextView
                textView.setText("1");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Añadir "2" al texto actual del TextView
                textView.setText("2");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Añadir "3" al texto actual del TextView
                textView.setText("3");


            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Añadir "4" al texto actual del TextView
                textView.setText("4");

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Añadir "5" al texto actual del TextView
                textView.setText("5");

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Añadir "6" al texto actual del TextView
                textView.setText("6");

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Añadir "7" al texto actual del TextView
                textView.setText("7");

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Añadir "8" al texto actual del TextView
                textView.setText("8");

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Añadir "9" al texto actual del TextView
                textView.setText("9");

            }
        });

        buttonmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbol = "+";
                if (textView.getTextSize() > 0) {

                    try {
                        String textViewcontent = textView.getText().toString();
                        number1 = Float.parseFloat(textViewcontent);
                        textView.setText("");

                        // Mostrar un mensaje de error si hay un problema con la conversión

                    } catch (Exception e) {
                        textView.setText("Error: Número no válido");
                    }
                }


            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbol = "-";

                String textViewcontent = textView.getText().toString();
                number1 = Float.parseFloat(textViewcontent);
                textView.setText("");


            }
        });
        buttonDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbol = "/";

                String textViewcontent = textView.getText().toString();
                number1 = Float.parseFloat(textViewcontent);
                textView.setText("");

            }
        });
        buttonPOR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbol = "*";

                String textViewcontent = textView.getText().toString();
                number1 = Float.parseFloat(textViewcontent);
                textView.setText("");

            }
        });

        butonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textViewcontent = textView.getText().toString();

                if (!textViewcontent.isEmpty()) {
                    try {
                        number2 = Float.parseFloat(textViewcontent);
                    } catch (Exception e) {
                        textView.setText("Error");
                        return;
                    }

                    switch (simbol) {
                        case "+":
                            Total = number1 + number2;
                            break;
                        case "-":
                            Total = number1 - number2;
                            break;
                        case "*":
                            Total = number1 * number2;
                            break;
                        case "/":
                            if (number2 != 0) {
                                Total = number1 / number2;
                            } else {
                                textView.setText("Error");
                                return;
                            }
                            break;
                        default:
                            Total = 0f; // El resultado es 0
                            break;
                    }
                    // Mostrar el resultado en el TextView
                    textView.setText(String.valueOf(Total));
                }
            }
        });


    }
}


