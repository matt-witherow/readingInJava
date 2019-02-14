package cFileRead;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    /**
     *   Hello Friends! Welcome.
     *   Let's learn how to - Read Input From a File in Java.
     *
     *   Setting Arguments : CTRL+ALT+R
     */

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App {
    public void run(){
            BlockFileReader reader = new BlockFileReader("resources/fixture-blocks.csv");
            List<String> orders = reader.read();
            for(String o : orders){
                System.out.println(o+"!");
            }
    }
}
