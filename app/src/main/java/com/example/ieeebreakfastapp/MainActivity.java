package com.example.ieeebreakfastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    populateMenu();
    initClickListner();
  }



  private void populateMenu() {
    //Initialize Array
    String[] listText = {
      "Egg and Prantha",
      "Egg and Bread",
      "Tea and Prantha",
      "Halwa Puri",
      "Donuts",
      "Chola Prantha",
      "Daal Mash and Roti",
      "Malai Prantha",
      "Cream Prantha",
      "Stawbeary Milk Shake",
      "Banana Milk Shake",
      "Mango Milk Shake",
      "Date Milk Shake"
    };

    //Make Adapter
    ArrayAdapter<String> menuItemsAdapter = new ArrayAdapter<String>(this,R.layout.da_menu_item,listText);

    //Configure List View
    ListView  menuList = (ListView) findViewById(R.id.menu);
    menuList.setAdapter(menuItemsAdapter);
  }

  private void initClickListner() {
    ListView  menuList = (ListView) findViewById(R.id.menu);
    menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent goItemDetail = new Intent(MainActivity.this, ItemDetailActivity.class);
        TextView tv = (TextView)view;
        goItemDetail.putExtra("name", tv.getText().toString());
        startActivity(goItemDetail);
      }
    });
  }
}
