package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ControllerNews {

    private News[] arrayNews;
    private DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SSS");

    public ControllerNews(News[] arrayNews){
        this.arrayNews = arrayNews;
    }

    public void view(int id){
        String title = arrayNews[id].getTitle();
        System.out.println("\n1. Title: " + title);
        String dateCreation = dateFormat.format(arrayNews[id].getDateCreation().getTime());
        System.out.println("2. Date of creation: " + dateCreation);
        String dateChange = dateFormat.format(arrayNews[id].getDateChange().getTime());
        System.out.println("3. Date of change: " + dateChange);
    };


    public void edit(int id, String title){
        arrayNews[id].changeNews(title);
        System.out.print("\nNews title edited.");
        view(id);
    }
}