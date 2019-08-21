package com.megadahliana.reviewbuku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Novel> listnovel = new ArrayList<>();
    private String title = "Review Buku";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        listnovel.addAll(NovelData.getListData());
        showRecyclerList();
  //      showRecyclerAbout();
    }

    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListNovelAdapter listNovelAdapter = new ListNovelAdapter(listnovel);
        rvCategory.setAdapter(listNovelAdapter);

        listNovelAdapter.setOnItemClickCallback(new ListNovelAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Novel data) {
                showSelectedNovel(data);
            }
        });
    }

  //  private void showRecyclerAbout() {
    //    Intent i =new Intent(MainActivity.this, About.class);
     //   startActivity(i);
    //}


    private void showSelectedNovel(Novel novel){
        Toast.makeText(this, "Kamu Memilih "+novel.getNama(), Toast.LENGTH_SHORT).show();
        Intent ambil=new Intent(MainActivity.this,DetailNovelActivity.class);
        ambil.putExtra("nama",novel.getNama());
        ambil.putExtra("judul",novel.getJudul());
        ambil.putExtra("photo",novel.getPhoto());
        ambil.putExtra("deskripsi",novel.getSpoiler());
        ambil.putExtra("genre",novel.getGenre());
        startActivity(ambil);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        if (itemId == R.id.action_about) {
            Intent about = new Intent(MainActivity.this, About.class);
            startActivity(about);
        }
    }
}
