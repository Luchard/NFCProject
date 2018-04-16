package com.brett.beam;

/**
 * Created by Luchard
 * on 4/15/2018.
 */

public class MessageNFC {
    private String from;
    private String message;
    private String mDate;
    private String sujet;


    public MessageNFC(String from, String message, String mDate) {
        this.from = from;
        this.message = message;
        this.mDate = mDate;
    }

    public MessageNFC(String from, String message, String mDate, String sujet) {
        this.from = from;
        this.message = message;
        this.mDate = mDate;
        this.sujet = sujet;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }
}
