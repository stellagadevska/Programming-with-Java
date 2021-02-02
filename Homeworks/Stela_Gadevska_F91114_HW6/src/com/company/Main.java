package com.company;

public class Main {

    public static void main(String[] args) {
	    // Създаване на обект от топ Post
        Post post1 = new Post("My healthy life", " I want to live a healthy life! I want to be happy and live as long as " +
                "possible. I know that sport and good nutrition will help me complete my goal to keep my health at its best.");

        String substr = "health";

        boolean contains = post1.containsTitle(substr);
        System.out.println("The title '" + post1.getTitle() + "' contains '" + substr + "' : " + contains);

        int numberOfTimes = post1.numberOfTimes(substr);
        System.out.println("The substring '" + substr + "' is found " + numberOfTimes + " times in the text.");

    }
}
