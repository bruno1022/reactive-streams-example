package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        channel.addVideo("Reactive Programming with Java");
        channel.addVideo("Introduce to Machine Learning");
        channel.addVideo("Web development basic");

        User userSubscriber = new User("Bruno Ferreira");

        channel.subscribe(userSubscriber);
    }
}