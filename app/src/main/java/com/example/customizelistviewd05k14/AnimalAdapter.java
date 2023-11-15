package com.example.customizelistviewd05k14;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {
    // Thuoc tinh
    private Context context;
    private List<Animal> dataSource; // Du lieu

    public AnimalAdapter(Context context, List<Animal> dataSource) {
        this.context = context;
        this.dataSource = dataSource;
    }

    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return dataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // Itemview va bind ID
        View v = LayoutInflater.from(context).inflate(R.layout.item_animal, viewGroup, false);
        // Bind id
        TextView tvAnimalName = v.findViewById(R.id.tvAnimalName);
        TextView tvAnimalDescription = v.findViewById(R.id.tvAnimalDescription);
        ImageView imgAnimalImage = v.findViewById(R.id.imgAnimalImage);
        // Set du lieu
        Animal animal = dataSource.get(i);
        tvAnimalName.setText(animal.getName());
        tvAnimalDescription.setText(animal.getDescription());

        Glide.with(context).load(animal.getUrl()).into(imgAnimalImage);

        return v;
    }
}
