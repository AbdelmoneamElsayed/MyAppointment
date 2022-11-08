package com.example.myappointment;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private ArrayList<CandroidModel> candroidModels;
    private Activity activity;

    public CustomAdapter(ArrayList<CandroidModel> candroidModels, Activity activity) {
        this.candroidModels = candroidModels;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return candroidModels.size();
    }

    @Override
    public Object getItem(int i) {
        return candroidModels.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){
            Log.d("listview", "Inflation...");
            LayoutInflater inflater = activity.getLayoutInflater();
            view = inflater.inflate(R.layout.list_item , viewGroup , false);
        }

        TextView textView = view.findViewById(R.id.tv);
        ImageView imageView = view.findViewById(R.id.iv);
        textView.setText(candroidModels.get(i).getVersionName());
        imageView.setImageResource(candroidModels.get(i).getPicture());
        return view;
    }
}
