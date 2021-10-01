package com.trinhnam12345z.bt2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TraiCay> traiCayList;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }


    @Override
    public int getCount() {
        return traiCayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txtTen,txtMota;
        ImageView imgAnh;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holder = new ViewHolder();

            holder.txtTen = view.findViewById(R.id.txtTen);
            holder.txtMota = view.findViewById(R.id.txtMota);
            holder.imgAnh = view.findViewById(R.id.imgAnh);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        TraiCay traiCay = traiCayList.get(i);
        holder.txtTen.setText(traiCay.getTen());
        holder.txtMota.setText(traiCay.getMota());
        holder.imgAnh.setImageResource(traiCay.getHinhAnh());
        return view;
    }
}
