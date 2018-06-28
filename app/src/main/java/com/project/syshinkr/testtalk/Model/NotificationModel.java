package com.project.syshinkr.testtalk.Model;

public class NotificationModel {
    public String to;
    public Notification notification = new Notification();
    public Data data = new Data();

    //백그라운드 모델
    public static class Notification {
        public String title;
        public String text;
    }
    //포그라운드 모델
    public static class Data {
        public String title;
        public String text;
    }
}
