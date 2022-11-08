package com.example.myappointment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class search_doctors extends AppCompatActivity {
    private ArrayList<CandroidModel> candroidModels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_doctors);
        candroidModels.add(new CandroidModel(R.drawable.ccoviid , R.string.ccoviid ,"https://www.vezeeta.com/en/doctor/general-practice/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.derma , R.string.derma ,"https://www.vezeeta.com/en/doctor/genital-dermatology/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.dentist, R.string.dentist ,"https://www.vezeeta.com/en/doctor/dentistry/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.neuro , R.string.neuro ,"https://www.vezeeta.com/en/doctor/neurology/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.child , R.string.child ,"https://www.vezeeta.com/en/doctor/pediatrics-and-new-born/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.orthopedic , R.string.orthopedic ,"https://www.vezeeta.com/en/doctor/orthopedics/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.ear , R.string.ear ,"https://www.vezeeta.com/en/doctor/ear-nose-and-throat/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.cardiology , R.string.cardiology ,"https://www.vezeeta.com/en/doctor/cardiology/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.chest , R.string.chest ,"https://www.vezeeta.com/en/doctor/chest/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.diabetes , R.string.diabetes ,"https://www.vezeeta.com/en/doctor/diabetes-and-endocrinology/new-cairo"));
        candroidModels.add(new CandroidModel(R.drawable.radio , R.string.radio ,"https://www.vezeeta.com/en/doctor/diagnostic-radiology/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.gas , R.string.gas ,"https://www.vezeeta.com/en/doctor/gastroenterology-and-endoscopy/egypt?gclid=CjwKCAjw49qKBhAoEiwAHQVTo4Z8yqh0k0_WkOcUxSv_72UG4unmGMpwnN-zJw7CuwjDFiBCrAI6gBoCe7oQAvD_BwE"));
        candroidModels.add(new CandroidModel(R.drawable.liver , R.string.liver ,"https://www.vezeeta.com/en/doctor/hepatology/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.nephrology , R.string.nephrology ,"https://www.vezeeta.com/en/doctor/nephrology/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.eye , R.string.eye ,"https://www.vezeeta.com/en/doctor/ophthalmology/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.plastic , R.string.plastic ,"https://www.vezeeta.com/en/doctor/plastic-surgery/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.spinal , R.string.spinal,"https://www.vezeeta.com/en/doctor/spinal-surgery/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.cancer , R.string.cancer ,"https://www.vezeeta.com/en/doctor/oncology/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.psy, R.string.psy ,"https://www.vezeeta.com/en/doctor/psychiatry/egypt"));
        candroidModels.add(new CandroidModel(R.drawable.doctor, R.string.doctor ,"https://www.vezeeta.com/en/doctor/general-surgery/egypt"));

        CustomAdapter adapter = new CustomAdapter(candroidModels , search_doctors.this);

        ListView listView = findViewById(R.id.lv);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Uri link = Uri.parse(candroidModels.get(i).getUrl());
                Intent intent = new Intent(Intent.ACTION_VIEW , link);
                startActivity(intent);
            }
        });

    }
}