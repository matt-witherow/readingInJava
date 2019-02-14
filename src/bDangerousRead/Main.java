package bDangerousRead;

public class Main {

    public static void main(String[] args) {
        App app = new App(args);
        app.run();
    }
}

/**
 *   Expected input
 *      $ 3 Puppy
 *
 *   Output
 *      PUPPY
 *      PUPPY
 *      PUPPY
 *
 */


class App {

    private final String[] _args;

    public App(String[] args){
        _args = args;        // ["3", "Puppy"];
    }

    public void run(){

        int times = parseNumber(_args[0]);           // indexing arrays
        String shout = shoutify(_args[1]);

        for(int i = 0 ; i < times ; i++ ){
            System.out.println(shout);
        }
    }

    private String shoutify(String s) {
        return s.toUpperCase() + "!";
    }

    private int parseNumber(String number) {
        return Integer.valueOf(number);            // Auto Unboxing
    }
}