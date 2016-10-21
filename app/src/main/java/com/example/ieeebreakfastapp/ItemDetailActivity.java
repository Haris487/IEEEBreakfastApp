package com.example.ieeebreakfastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ItemDetailActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_item_detail);
    Intent takeItem = getIntent();
    String name = takeItem.getStringExtra("name");
    TextView tv = (TextView) findViewById(R.id.item_name);
    tv.setText(name);
  }
}
