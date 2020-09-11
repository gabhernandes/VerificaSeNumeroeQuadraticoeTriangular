package com.example.istrianglenumberisquadraticnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String message;
    static boolean isTriangular(double num)
    {

        if (num < 0)
            return false;

        int sum = 0;

        for (int n = 1; sum <= num; n++)
        {
            sum = sum + n;
            if (sum == num)
                return true;
        }

        return false;
    }

    static boolean isQuadratic (double num){
        double sq = Math.sqrt(num);
        if ((sq == Math.floor(sq))) {
            return true;
        }
        else{
            return false;
        }

    }
    public void Verificar(View view){




        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
//        Log.i("info", editText.getText().toString());
        String sEditText = editText.getText().toString();
        if(sEditText.matches("")){
            message = "Por favor digite um número";
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            return;
        }
        double n = Double.parseDouble(editText.getText().toString());



        if (isTriangular(n) && isQuadratic(n)) {
            message = "O número "
                    + editText.getText().toString()  + " é triangular e quadrático";
        }
        else if(isQuadratic(n)){
            message =" O número "
                    + editText.getText().toString() + " é quadrático";
        }
        else if(isTriangular(n)){
           message = " O número "
                   + editText.getText().toString()  + " é triangular ";
        }
        else{
            message  = "O número "
                    + editText.getText().toString()  + " não é triangular e quadrático";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


//        Log.i("Info",Double.toString(inputNumber));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}