package com.anhthu.hoclistviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.anhthu.hoclistviewnangcao.adapter.SanPhamAdapter;
import com.anhthu.hoclistviewnangcao.model.SanPham;

public class MainActivity extends AppCompatActivity {
    ListView lvSanPham;
    SanPhamAdapter sanPhamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
        fakeData();
    }

    private void fakeData() {
        sanPhamAdapter.add(new SanPham(R.drawable.h1,"Hoa 1",15000));
        sanPhamAdapter.add(new SanPham(R.drawable.h2,"Hoa 2",18000));
        sanPhamAdapter.add(new SanPham(R.drawable.h3,"Hoa 3",19000));
        sanPhamAdapter.add(new SanPham(R.drawable.h4,"Hoa 4",12000));
        sanPhamAdapter.add(new SanPham(R.drawable.h5,"Hoa 5",11000));
        sanPhamAdapter.add(new SanPham(R.drawable.h6,"Hoa 6",16000));
        sanPhamAdapter.add(new SanPham(R.drawable.h7,"Hoa 7",15000));
        sanPhamAdapter.add(new SanPham(R.drawable.h8,"Hoa 8",18000));
        sanPhamAdapter.add(new SanPham(R.drawable.h9,"Hoa 9",17000));
        sanPhamAdapter.add(new SanPham(R.drawable.h10,"Hoa 10",12000));

    }

    private void addEvents() {
        lvSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SanPham sp = sanPhamAdapter.getItem(i);
                Toast.makeText(MainActivity.this,"Bạn chọn:" + sp.getTen(),Toast.LENGTH_LONG).show();
            }
        });
    }

    private void addControls() {
        lvSanPham = findViewById(R.id.lvSanPham);
        sanPhamAdapter = new SanPhamAdapter(MainActivity.this,R.layout.item);
        lvSanPham.setAdapter(sanPhamAdapter);
    }
}