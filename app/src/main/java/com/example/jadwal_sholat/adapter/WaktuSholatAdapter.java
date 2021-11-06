package com.example.jadwal_sholat.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jadwal_sholat.R;
import com.example.jadwal_sholat.model.waktusholat.DataItem;

import java.util.ArrayList;

public class WaktuSholatAdapter extends RecyclerView.Adapter<WaktuSholatAdapter.ViewHolder> {

    private ArrayList<DataItem> dataItems = new ArrayList<>();
    private Context context;

    public WaktuSholatAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<DataItem> items){
        dataItems.clear();
        dataItems.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public WaktuSholatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WaktuSholatAdapter.ViewHolder holder, int position) {
        holder.namaSholat.setText(dataItems.get(position).getDate().toString());
        holder.cvItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView jamSholat, namaSholat;
        CardView cvItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cvItem = itemView.findViewById(R.id.itemlist_cv);
            namaSholat = itemView.findViewById(R.id.txt_namasolat);

        }
    }
}
