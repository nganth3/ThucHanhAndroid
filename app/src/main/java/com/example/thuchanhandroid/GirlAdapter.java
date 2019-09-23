package com.example.thuchanhandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

public class GirlAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Girl> girlList;

    public GirlAdapter(Context context, int layout, List<Girl> girlList) {
        this.context = context;
        this.layout = layout;
        this.girlList = girlList;
    }

    @Override
    public int getCount() {
        return girlList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(layout,null);
        TextView txtTen =(TextView) convertView.findViewById(R.id.textviewTen);
        TextView txtMota =(TextView) convertView.findViewById(R.id.textviewMota);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageviewHinh);

        Girl girl = girlList.get(position);
        txtTen.setText(girl.getHoTen());
        txtMota.setText(girl.getMota());
        imgHinh.setImageResource((girl.getHinhAnh()));

        return convertView;
    }
}
