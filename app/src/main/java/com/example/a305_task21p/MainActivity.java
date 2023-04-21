package com.example.a305_task21p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button myBtn;
    EditText myInput;
    //
    Spinner spinner;
    Spinner spinner2;
    
    Spinner spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBtn = findViewById(R.id.button3);
        myInput = findViewById(R.id.editTextTextPersonName);
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);

        myBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                String inputValue = myInput.getText().toString();
                int convertTheInput = Integer.parseInt(inputValue);
                /*String sourceUnit = spinner.getItemAtPosition(1).toString();
                String destinationUnit = spinner2.getItemAtPosition().toString();*/

                int spinner_pos = spinner.getSelectedItemPosition();
                int spinner2_pos = spinner2.getSelectedItemPosition();
                int spinner3_pos = spinner3.getSelectedItemPosition();

                if (spinner3_pos == 1){
                    if (spinner_pos == 0 && spinner2_pos == 1){
                        double result = convertTheInput * 0.453592;
                        Toast.makeText(MainActivity.this,"Result is:" + result, Toast.LENGTH_LONG).show();
                    } else if (spinner_pos == 0 && spinner2_pos == 2) {
                        double result = convertTheInput * 16;
                        Toast.makeText(MainActivity.this,"Result is: " + result,Toast.LENGTH_LONG).show();
                    } else if (spinner_pos == 0 && spinner2_pos == 3) {
                        double result = convertTheInput * 453.592;
                        Toast.makeText(MainActivity.this,"Result is: " + result,Toast.LENGTH_LONG).show();
                    } else if (spinner_pos == 1 && spinner2_pos == 2) {
                        double result = convertTheInput * 35.274;
                        Toast.makeText(MainActivity.this,"Result is: " + result,Toast.LENGTH_LONG).show();
                    } else if (spinner_pos == 1 && spinner2_pos == 3) {
                        double result = convertTheInput * 1000;
                        Toast.makeText(MainActivity.this,"Result is: " + result,Toast.LENGTH_LONG).show();
                    } else if (spinner_pos == 2 && spinner2_pos == 3) {
                        double result = convertTheInput * 28.3495;
                        Toast.makeText(MainActivity.this,"Result is: " + result,Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(MainActivity.this,"Error..Something is wrong. You may have entered an invalid number.Please try again.",Toast.LENGTH_LONG).show();
                    }

                }
                else if (spinner3_pos == 0){
                    if(spinner_pos == 4 && spinner2_pos == 5){
                        double result = convertTheInput * 2.54;
                        Toast.makeText(MainActivity.this,"Result is:" + result, Toast.LENGTH_LONG).show();
                    } else if (spinner_pos == 6 && spinner2_pos == 5) {
                        double result = convertTheInput * 30.48;
                        Toast.makeText(MainActivity.this,"Result is:" + result, Toast.LENGTH_LONG).show();
                    }else if (spinner_pos == 7 && spinner2_pos == 5) {
                        double result = convertTheInput * 91.44;
                        Toast.makeText(MainActivity.this,"Result is:" + result, Toast.LENGTH_LONG).show();
                    }else if (spinner_pos == 8 && spinner2_pos == 9) {
                        double result = convertTheInput * 1.60934;
                        Toast.makeText(MainActivity.this,"Result is:" + result, Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(MainActivity.this,"Error..Something is wrong. You may have entered an invalid number.Please try again.",Toast.LENGTH_LONG).show();
                    }
                }
                else if (spinner3_pos == 2){
                    if(spinner_pos == 10 && spinner2_pos == 11){
                        double result = convertTheInput * 1.8 + 32;
                        Toast.makeText(MainActivity.this,"Result is:" + result, Toast.LENGTH_LONG).show();
                    } else if (spinner_pos == 11 && spinner2_pos == 10) {
                        double result = (convertTheInput - 32 ) / 1.8;
                        Toast.makeText(MainActivity.this,"Result is:" + result, Toast.LENGTH_LONG).show();
                    }else if (spinner_pos == 10 && spinner2_pos == 12) {
                        double result = convertTheInput + 273.15;
                        Toast.makeText(MainActivity.this,"Result is:" + result, Toast.LENGTH_LONG).show();
                    }else if (spinner_pos == 12 && spinner2_pos == 10) {
                        double result = convertTheInput - 273.15;
                        Toast.makeText(MainActivity.this,"Result is:" + result, Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(MainActivity.this,"Error..Something is wrong. You may have entered an invalid number.Please try again.",Toast.LENGTH_LONG).show();
                    }

                }
                else {
                    Toast.makeText(MainActivity.this,"Please enter a valid number and try again..",Toast.LENGTH_LONG).show();
                }


            }
        });

        //Spinner spinner = (Spinner) findViewById(R.id.spinner);// it's as same as mySpinner = findViwById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array/*get the array by its name*/, android.R.layout.simple_spinner_item);// get the elements from the array in the array.xml and send the data to the spinner

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);// set a dropdown spinner

        spinner.setAdapter(adapter);// initiate the spinner

        //Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.Conversions, android.R.layout.simple_spinner_item);

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner3.setAdapter(adapter3);


    }// By Lidong Wu
}
