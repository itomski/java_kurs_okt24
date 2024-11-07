package de.lubowiecki.okt24.patterns.adapter;

import java.util.Arrays;

public class Tweet {

    private final String author;
    private final String group;
    private final String title;
    private final String body;
    private final String[] tags;

    public Tweet(String author, String group, String title, String body, String... tags) {
        this.author = author;
        this.group = group;
        this.title = title;
        this.body = body;
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public String getGroup() {
        return group;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String[] getTags() {
        return tags;
    }

    public void post() {
        System.out.println("----- POST TWEET -----");
        System.out.println("-- # START");
        System.out.println("-- # AUTHOR: \t" + author);
        System.out.println("-- # GROUP: \t" + group);
        System.out.println("-- # TITLE: \t" + title);
        System.out.println("-- # BODY: \t\t" + body);
        System.out.println("-- # TAGS: \t\t" + Arrays.toString(tags));
        System.out.println("-- # END \n");
    }
}
