package exAula151;

import exAula151.entities.Comment;
import exAula151.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter momentFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime moment1 = LocalDateTime.parse("21/06/2021 13:05:44", momentFmt);
        String title1 = "Traveling to New Zealand!";
        String content1 = "I'm going to visit this wonderful country!";
        int likes1 = 12;

        Post p1 = new Post(moment1, title1, content1, likes1);

        p1.addComment(new Comment("Have a nice trip!"));
        p1.addComment(new Comment("Wow that's awesome!"));

        System.out.print(p1);

        System.out.println();

        LocalDateTime moment2 = LocalDateTime.parse("28/07/2021 23:14:19", momentFmt);
        String title2 = "Good night guys";
        String content2 = "See you tomorrow";
        int likes2 = 5;

        Post p2 = new Post(moment2, title2, content2, likes2);

        p2.addComment(new Comment("Good night"));
        p2.addComment(new Comment("May the force be with you!"));

        System.out.print(p2);
    }
}
