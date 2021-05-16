package com.example.cosu_pra.DTO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class Post {
    private String title;
    private String writer;
    private String date;
    private String content;
    private List<String> category;
    private int report;

    public Post() {
        date = new SimpleDateFormat("yyyy/ MM / dd / HH:mm:ss").
                format(Calendar.getInstance().getTime());
        category = new ArrayList<String>();
        report = 0;
    }

    public Post(String writer, String content) {
        this();
        this.writer = writer;
        this.content = content;
    }

    public Post(String title, String writer, String content) {
        this(writer, content);
        this.title = title;
    }

    public Post(String title, String writer, String content,List<String> category) {
        this(writer, content);
        this.title = title;
        this.category = category;
    }


    // getter
    public String getWriter() {
        return writer;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getCategory() {
        return category;
    }

    public int getReport(){ return report;}

    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCategory(List<String> category){
        this.category = category;
    }

    public void setReport(int report){
        this.report = report;
    }
}
