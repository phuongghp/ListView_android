package com.example.listview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class HinhAnhAdapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<HinhAnh> hinhAnhList;

    public HinhAnhAdapter(Context context, int layout, List<HinhAnh> hinhAnhList) {
        this.context = context;
        this.layout = layout;
        this.hinhAnhList = hinhAnhList;
    }

    @Override
    public int getCount() {
        return hinhAnhList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    class ViewHolder{
        ImageView imgHinh;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view==null){
            holder=new ViewHolder();
            LayoutInflater layoutInflater=(LayoutInflater)
                    context.getSystemService(
                            context.LAYOUT_INFLATER_SERVICE
                    );
            view= layoutInflater.inflate(layout,null);
            holder.imgHinh=(ImageView) view.findViewById(
                    R.id.imageViewHinhanh
            );
            view.setTag(holder);

        }
        else{
            holder=(ViewHolder) view.getTag();
        }
        HinhAnh hinhAnh=hinhAnhList.get(position);
        holder.imgHinh.setImageResource(hinhAnh.getHinh());
        return view;
    }
}
