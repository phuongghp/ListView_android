package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<HinhAnh> arrayListImage;
    HinhAnhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.gridView);
        arrayListImage=new ArrayList<>();
        arrayListImage.add(new HinhAnh("hinh anh 1", R.drawable.aa));
        arrayListImage.add(new HinhAnh("hinh anh 1", R.drawable.bb));
        arrayListImage.add(new HinhAnh("hinh anh 1", R.drawable.cc));
        adapter = new HinhAnhAdapter(MainActivity.this,R.layout.itemhinhanh,arrayListImage);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this,arrayListImage.get(position).getTen(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}