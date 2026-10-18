package com.example.a171026_tsbbmk_repasopm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    String ls1[];
    String lst2[];
    int lst3[];
    LayoutInflater layoutInflater;

    private OnItemClickListener listener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

    public Adapter(Context context, String[] ls1, String[] lst2, int[] lst3) {
        this.context = context;
        this.ls1 = ls1;
        this.lst2 = lst2;
        this.lst3 = lst3;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.contenedor, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        // Vinculamos tus 3 arreglos con las vistas correspondientes
        holder.txt1.setText(ls1[position]);
        holder.txt2.setText(lst2[position]);
        holder.img1.setImageResource(lst3[position]);

        holder.itemView.setOnClickListener(v -> {
            if(listener != null){
                listener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ls1.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt1, txt2;
        ImageView img1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Mapeo exacto usando los IDs de tu XML contenedor
            img1 = itemView.findViewById(R.id.img1);
            txt1 = itemView.findViewById(R.id.txt1);
            txt2 = itemView.findViewById(R.id.txt2);
        }
    }
}