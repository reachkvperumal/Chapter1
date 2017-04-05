package com.tutorial.streams;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by KV on 4/4/2017.
 */
public class ReadFile {

    public void read() {

        try {
            String string = new String(Files.readAllBytes(Paths.get(this.getClass().getClassLoader().getResource("Tutorial.txt").toURI())), StandardCharsets.UTF_8);
            Stream.of(string.split("[\\P{L}]+"))
                    //.peek(System.out::println)
                    .filter(t -> t.length() > 0)
                    .forEach(System.out::println);
        } catch (RuntimeException | IOException | URISyntaxException e) {
            e.printStackTrace();
        }

        /*Stream<Double> generate = Stream.generate(Math::random);
        generate.forEach(System.out::println);*/
        Stream.iterate(BigInteger.ONE, t -> t.add(BigInteger.ONE)).forEach(System.out::println);

    }

    public static void main(String[] args) {
        new ReadFile().read();

    }
}
