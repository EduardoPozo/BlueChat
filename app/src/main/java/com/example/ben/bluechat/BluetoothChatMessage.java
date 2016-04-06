package com.example.ben.bluechat;

/**
 * Created by Ben on 4/5/16.
 */
public class BluetoothChatMessage {
    private String message;
    private boolean ack;

    BluetoothChatMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }


    public boolean getAck() {
        return this.ack;
    }
    public void setAck(boolean status) {
        this.ack = status;
    }


}
