package com.example.ben.bluechat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Ben on 4/5/16.
 */
public class BluetoothChatMessage {
    private String message;
    private boolean ack;
    private long timestamp;

    BluetoothChatMessage(String message) {
        this.message = message;
    }
    BluetoothChatMessage(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean getAck() {
        return this.ack;
    }
    public void setAck(boolean status) {
        this.ack = status;
    }

    public String getTime() {
        /*Calendar cal = Calendar.getInstance();
        TimeZone tz = cal.getTimeZone();*/
        SimpleDateFormat sdf = new SimpleDateFormat("MMM-dd-yy hh:mm");

        String time = sdf.format(new Date(timestamp));

        return time;
    }


}
