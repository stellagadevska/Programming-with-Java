package com.company;

public class Post {
    private int sequenceNumber;
    private String title;
    private String text;
    private int numberOfPosts;
    private int numberOfTimes;

    public Post() {
        numberOfPosts++;
        this.sequenceNumber = numberOfPosts;
    }
    public Post(String title, String text) {
        numberOfPosts++;
        this.sequenceNumber = numberOfPosts;
        this.title = title;
        this.text = text;
        numberOfTimes = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    // Метод проверява дали даден низ се среща като подниз в заглавието
    public boolean containsTitle(CharSequence str) {
        if (this.title.contains(str)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean containsText(CharSequence str) {
        if (this.text.contains(str)) {
            return true;
        } else {
            return false;
        }
    }

    // Метод, който връща колко пъти даден низ се среща като подниз в текста на публикацият
    public int numberOfTimes(CharSequence str) {
        if (containsText(str)) {
            numberOfTimes++;
        }
        return numberOfTimes;
    }

}
