package com.example.chapter08;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
public class SpinnerDropdownActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private final   static String[]starArray={"水星","金星","地球","火星","木星","土星"};
    private Spinner sp_dropdown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_dropdown);
        sp_dropdown = findViewById(R.id.sp_dropdown);
        ArrayAdapter<String> startAdapter=new ArrayAdapter<>(this,R.layout.item_select,starArray);
        sp_dropdown.setAdapter(startAdapter);
        sp_dropdown.setSelection(0);
        sp_dropdown.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}