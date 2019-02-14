package aSimpleRead;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     *   Hello Friends! Welcome.
     *   Let's learn how to - Read Input in Java.
     *
     *   There are lots of ways to skin a cat, and completing this task in Java
     *   is no exception.
     *
     *   You may many other ways of achieving a similar result - each have their own pros/cons.
     *   For now, we start simple.
     *
     *   Disclaimer : There is objectively _poor_ code in these tutorials.
     *   This may be something to keep in mind and revisit later. What made it poor? :thinking-face:
     *
     *
     *   Setting Arguments : CTRL+ALT+R
     */

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App {

    private final TopicsOfInterest topics;

    public App(){
         topics = new TopicsOfInterest(); // shh, ignore this.
    }

    public void run(){

        InputStream source = System.in;             // System.in? It's stdin, read as 'Standard In'. Here, it's the input from your keyboard!
        Scanner reader = new Scanner(source);       // We want to read many things from stdin, and Java's Scanner class helps us do that.

        System.out.println("What's on your mind?"); // stdout, same thing - but the other direction - the output.

        String line = reader.nextLine();            // type-type-type-ENTER. You get the whole line.

        String[] words = line.split(" ");     // We want to investigate each word, so split em up.

        for(String word : words){
            if(topics.contains(word)){
                respond(word);
            }
        }
    }

    private void respond(String word) {
        String phrase = String.format("Oh awesome! I love %s", word.toUpperCase());
        System.out.println(phrase);
    }
}


class TopicsOfInterest {

    private final List topics;

    public TopicsOfInterest() {
        topics = Arrays.asList("puppies", "cake", "java");
    }

    public boolean contains(String word){
        return topics.contains(word);
    }
}