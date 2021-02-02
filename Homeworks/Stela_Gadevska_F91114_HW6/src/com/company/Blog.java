package com.company;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<Post> postsList;

    public Blog() {
        this.postsList = new ArrayList<>();
    }

    public List<Post> getPostsList() {
        return postsList;
    }

    // Метод, който по даден низ отпечатва списък със заглавията на публикациите, в които този низ се
    // среща като подниз в текста на публикацията. Трябва първо да се отпечатват публикациите, в текста,
    // на които подниза се среща най-често.


}
