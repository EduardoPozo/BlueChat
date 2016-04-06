package com.example.ben.bluechat;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ben on 4/5/16.
 */
public class BluetoothArrayAdapter extends ArrayAdapter<BluetoothChatMessage> {

    private static class ViewHolder {
        TextView itemView;
    }

    public BluetoothArrayAdapter(Context context, int textViewResourceId, ArrayList<BluetoothChatMessage> items) {
        super(context, textViewResourceId, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(this.getContext())
                    .inflate(R.layout.message, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.itemView = (TextView) convertView.findViewById(R.id.message);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        BluetoothChatMessage item = getItem(position);
        if (item!= null) {
            viewHolder.itemView.setText(String.format(item.getMessage()));

            // Set BluetoothChatMessage object text color according to its ack instance var
            int textColor = item.getAck() ? Color.GREEN : Color.GRAY;
            viewHolder.itemView.setTextColor(textColor);

        }

        return convertView;
    }

}
