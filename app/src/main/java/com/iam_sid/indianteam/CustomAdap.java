package com.iam_sid.indianteam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdap extends BaseAdapter {

    ArrayList<players> playArr;
    Context con;
    private static LayoutInflater inflater=null;

    public CustomAdap(ArrayList<players> playArr, Context con) {
        this.playArr = playArr;
        this.con = con;
        inflater = (LayoutInflater) con.getSystemService(con.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return playArr.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder{
        TextView name;
        ImageView photo;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View rowView;

        Holder holder=new Holder();
        rowView=inflater.inflate(R.layout.list_row,null);

        holder.name=(TextView)rowView.findViewById(R.id.tvName);
        holder.photo=(ImageView)rowView.findViewById(R.id.ivPhoto);

        holder.name.setText(playArr.get(position).name);
        holder.photo.setImageResource(playArr.get(position).imgid);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(con,"You clicked on "+playArr,Toast.LENGTH_SHORT).show();
            }
        });


        return rowView;
    }
}
