package com.example.blackcoffer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class refine extends AppCompatActivity {

    Spinner spinner;
    int flag=0;
    Button btncoffee,btnbusi,btnhobb,btnfrd,btnmov,btndin,btndat,btnmatr;

    ArrayList<String> arr=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);

        init();



        arr.add("Available | Hey Let Us Connect ");
        arr.add("Not Available");

        ArrayAdapter<String> spinnerAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arr);
        spinner.setAdapter(spinnerAdapter);


    }
    private void init(){
        btncoffee=findViewById(R.id.btncoffee);
        btnbusi=findViewById(R.id.btnbusi);
        btnhobb=findViewById(R.id.btnhobb);
        btnfrd=findViewById(R.id.btnfrd);
        btnmov=findViewById(R.id.btnmov);
        btndin=findViewById(R.id.btndin);
        btndat=findViewById(R.id.btndat);
        btnmatr=findViewById(R.id.btnmatr);
    }




//    public void Check(View view){
//        Button btnCurrent=(Button)view;
//        if(flag==0){
//            btnCurrent.setHintTextColor(Color.BLUE);
//            flag=1;
//        }else{
//            btnCurrent.setBackgroundColor(Color.WHITE);
//            flag=0;
//        }
//
//
//    }
}