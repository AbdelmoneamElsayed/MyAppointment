package com.example.myappointment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;



import java.util.Calendar;

public class home extends AppCompatActivity {
    private static final String Tag = "home";

EditText et_text;
DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText et_txt=findViewById(R.id.et_search);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        et_text=findViewById(R.id.et_datee);
        Calendar calendar= Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        et_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog daialog = new DatePickerDialog(home.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        setListener, year, month, day);
                daialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                daialog.show();

            }
        });
       setListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(Tag, "onDateSet : mm//dd//yyy" + month + "/" + day + year);

                String date = day + "/" + month + "/" + year;
                et_text.setText(date);

            }
        };

    }

    public void back(View view) {
        Intent mm = new Intent(home.this, Login.class);
        startActivity(mm);
    }

    public void nexxt(View view) {
        Intent mm = new Intent(home.this,MapsActivity.class);
        startActivity(mm);
    }


    public void list_fun(View view) {
        Intent rr = new Intent(home.this,search_doctors.class);
        startActivity(rr);
    }
}