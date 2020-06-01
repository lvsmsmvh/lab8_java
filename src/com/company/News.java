package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class News {
    private String title;
    private Calendar dateCreation;
    private Calendar dateChange;


    public News(String title){
        this.title = title;
        dateCreation = Calendar.getInstance();
        dateChange = Calendar.getInstance();
    }

    public void changeNews(String title){
        this.title = title;
        dateChange = Calendar.getInstance();
    }

    public String getTitle() {
        return title;
    }

    public Calendar getDateCreation() {
        return dateCreation;
    }

    public Calendar getDateChange() {
        return dateChange;
    }
}
