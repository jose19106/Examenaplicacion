package com.escobedo.jees.examenaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void calcular(View view) {
        Button botonCalcu = (Button) findViewById(R.id.botonCalcu);
        Button botonReset = (Button) findViewById(R.id.botonReset);
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);
        TextView labelError = (TextView) findViewById(R.id.labelError);
        final TextView suma = (TextView) findViewById(R.id.suma);
        TextView resta = (TextView) findViewById(R.id.resta);
        TextView multi = (TextView) findViewById(R.id.multi);
        TextView division = (TextView) findViewById(R.id.division);
        TextView compa = (TextView) findViewById(R.id.compa);

        int aux0 = 0;
        int aux01 = Integer.valueOf(numero2.getText().toString().trim());
        if (aux01 != aux0) {


            int aux1 = Integer.valueOf(numero1.getText().toString().trim());
            int aux2 = Integer.valueOf(numero2.getText().toString().trim());
            int resultado = aux1 + aux2;

            suma.setText("" + resultado);

            int aux3 = Integer.valueOf(numero1.getText().toString().trim());
            int aux4 = Integer.valueOf(numero2.getText().toString().trim());
            int resultado2 = aux3 - aux4;

            resta.setText("" + resultado2);

            int aux5 = Integer.valueOf(numero1.getText().toString().trim());
            int aux6 = Integer.valueOf(numero2.getText().toString().trim());
            int resultado3 = aux5 * aux6;

            multi.setText("" + resultado3);

            float aux7 = Integer.valueOf(numero1.getText().toString().trim()+);
            float aux8 = Integer.valueOf(numero2.getText().toString().trim());
            float resultado4 = aux7 / aux8;

            division.setText("" + resultado4);

            int aux9 = Integer.valueOf(numero1.getText().toString().trim());
            int aux10 = Integer.valueOf(numero2.getText().toString().trim());
            if (aux9 > aux10) {
                compa.setText("El numero 1 es mayor que el nuemro 2");
            } else {
                if (aux10 > aux9) {
                    compa.setText("El numero 2 es mayor que el numero 1");
                } else {
                    compa.setText("Los numeros son iguales");
                }
            }

            botonCalcu.setEnabled(false);
            botonCalcu.setVisibility(View.INVISIBLE);

            botonReset.setEnabled(true);
            botonReset.setVisibility(View.VISIBLE);

            numero1.setEnabled(false);
            numero2.setEnabled(false);
        }else{
            labelError.setText("Fatal Error");
            botonCalcu.setEnabled(false);
            botonCalcu.setVisibility(View.INVISIBLE);

            botonReset.setEnabled(true);
            botonReset.setVisibility(View.VISIBLE);

            numero1.setEnabled(false);
            numero2.setEnabled(false);
        }
    }
        public void reset (View view) {
            Button botonCalcu = (Button) findViewById(R.id.botonCalcu);
            Button botonReset = (Button) findViewById(R.id.botonReset);
            numero1 = (EditText) findViewById(R.id.numero1);
            numero2 = (EditText) findViewById(R.id.numero2);
            TextView labelError = (TextView) findViewById(R.id.labelError);
            final TextView suma = (TextView) findViewById(R.id.suma);
            TextView resta = (TextView) findViewById(R.id.resta);
            TextView multi = (TextView) findViewById(R.id.multi);
            TextView division = (TextView) findViewById(R.id.division);
            TextView compa = (TextView) findViewById(R.id.compa);

            botonCalcu.setVisibility(View.VISIBLE);
            botonCalcu.setEnabled(true);
            botonReset.setVisibility(View.INVISIBLE);
            botonReset.setEnabled(false);
            numero1.setEnabled(true);
            numero1.setText("");
            numero2.setEnabled(true);
            numero2.setText("");
            labelError.setText("");
            suma.setText("");
            resta.setText("");
            multi.setText("");
            division.setText("");
            compa.setText("Comparison");


        }

}


        
