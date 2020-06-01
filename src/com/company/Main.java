package com.company;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        /*
            1st task
         */
        StringBuilderTest.test();

        /*
            2nd task
        */


        Calendar cal = Calendar.getInstance();


        News[] news = new News[4];
        news[0] = new News("Trump is a president");
        news[1] = new News("It's raining");
        news[2] = new News("My phone lags");
        news[3] = new News("Salary soon");


        String[] path = {"view/0", "edit/0", "view/1", "edit/1"};
        ControllerNews controller = new ControllerNews(news);

        for(String str : path){
            StringTokenizer strToken = new StringTokenizer(str, "/");

            String mode = strToken.nextToken();
            int id = Integer.parseInt(strToken.nextToken());

            if (mode.equals("view")) {
                controller.view(id);
            } else if (mode.equals("edit")){
                System.out.println("Input a new name for \"" + news[id].getTitle() + "\":");
                String newTitleNews = new Scanner(System.in).nextLine();
                controller.edit(id, newTitleNews);
            }
        }
    }
}
