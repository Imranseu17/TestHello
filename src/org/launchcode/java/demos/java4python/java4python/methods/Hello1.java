package org.launchcode.java.demos.java4python.java4python.methods;


import org.launchcode.java.demos.java4python.java4python.Source;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class Hello1 {
    public  static  void main(String[]args)
    {
        String massage = Source.getMassage("H");
        Date d = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(d.toInstant());
        System.out.println(dateFormat.format(d));
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(massage);
    }
}
