package com.example.jg_pc_home.listv_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<fruit> fruitList = new ArrayList<fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initfruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,
                R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.listView_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initfruits() {
        fruit apple = new fruit("Apple", R.drawable.apple_pic);
        fruitList.add(apple);
        fruit banana = new fruit("Banana", R.drawable.banana_pic);
        fruitList.add(banana);
        fruit orange = new fruit("Orange", R.drawable.orange_pic);
        fruitList.add(orange);
        fruit watermelon = new fruit("Watermelon", R.drawable.watermelon_pic);
        fruitList.add(watermelon);
        fruit pear = new fruit("Pear", R.drawable.pear_pic);
        fruitList.add(pear);
        fruit grape = new fruit("Grape", R.drawable.grape_pic);
        fruitList.add(grape);
        fruit pineapple = new fruit("Pineapple", R.drawable.pineapple_pic);
        fruitList.add(pineapple);
        fruit strawberry = new fruit("Strawberry", R.drawable.strawberry_pic);
        fruitList.add(strawberry);
        fruit cherry = new fruit("Cherry", R.drawable.cherry_pic);
        fruitList.add(cherry);
        fruit mango = new fruit("Mango", R.drawable.mango_pic);
        fruitList.add(mango);
    }



}
