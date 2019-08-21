package com.megadahliana.reviewbuku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailNovelActivity extends AppCompatActivity {

    private TextView Pengarang;
    private TextView Judul;
    private TextView Deskripsi;
    private TextView Genre;
    private CircleImageView coverPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_novel);
        
        Awal();
        PindahData();
    }

    private void PindahData() {
        Intent ambil=getIntent();
        String nama = ambil.getStringExtra("nama");
        String judul = ambil.getStringExtra("judul");
        String deskripsi = ambil.getStringExtra("deskripsi");
        String genre = ambil.getStringExtra("genre");
        String photo = ambil.getStringExtra("photo");

        Pengarang.setText(nama);
        Judul.setText(judul);
        Deskripsi.setText(deskripsi);
        Genre.setText(genre);
        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(350, 550))
                .into(coverPhoto);
    }

    private void Awal() {
        Pengarang= findViewById(R.id.tv_item_nama);
        Judul= findViewById(R.id.tv_item_judul);
        Deskripsi= findViewById(R.id.tv_item_deskripsi);
        Genre= findViewById(R.id.tv_item_genre);
        coverPhoto= findViewById(R.id.img_item_photo);
    }
}
