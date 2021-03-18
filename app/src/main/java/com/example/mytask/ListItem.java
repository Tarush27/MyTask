package com.example.mytask;

public class ListItem {
    private String text;

    private String Date;

    public ListItem(String text, String date) {
        this.text = text;
        Date = date;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
