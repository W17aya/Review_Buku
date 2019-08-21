package com.megadahliana.reviewbuku;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListNovelAdapter extends RecyclerView.Adapter<ListNovelAdapter.CategoryViewHolder> {
    private ArrayList<Novel> listNovel;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListNovelAdapter(ArrayList<Novel> listnovel) {
        this.listNovel = listnovel;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_novel, viewGroup, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder categoryViewHolder, int i) {
        Novel novel = listNovel.get(i);

        Glide.with(categoryViewHolder.itemView.getContext())
                .load(novel.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(categoryViewHolder.imgPhoto);

        categoryViewHolder.tvNama.setText(novel.getNama());
        categoryViewHolder.tvJudul.setText(novel.getJudul());

        categoryViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listNovel.get(categoryViewHolder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listNovel.size();
    }

     class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvJudul;

         CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
             imgPhoto = itemView.findViewById(R.id.img_item_photo);
             tvNama = itemView.findViewById(R.id.tv_item_nama);
             tvJudul = itemView.findViewById(R.id.tv_item_judul);
        }
    }
    public interface OnItemClickCallback{
        void onItemClicked(Novel data);
    }
}
