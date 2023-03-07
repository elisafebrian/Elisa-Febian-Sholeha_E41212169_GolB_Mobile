package com.example.minggu3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
public class recyclerview extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adapter adapter;
    private ArrayList<mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new adapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(recyclerview.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new mahasiswa("Dimas Maulana", "1325315254","0821918264256"));
        mahasiswaArrayList.add(new mahasiswa("Fadly Yonk", "13215146","0821964522661"));
        mahasiswaArrayList.add(new mahasiswa("Elisa Febrian", "1624618991","0821256526781"));
        mahasiswaArrayList.add(new mahasiswa("Fara Derliana", "1621651652","0835125542671"));
    }
}