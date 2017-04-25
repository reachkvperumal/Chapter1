package com.tutorial.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Created by KV on 4/6/2017.
 */
public class LeaningMap {


    public static void intStream(){
        IntStream.generate(new IntSupplier() {
            int i = 0;
            @Override
            public int getAsInt() {
                i++;
                return i * i;
            }
        }).limit(10).forEach(System.out::println);
    }

    public static void init() {
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());

        /*Map<String, String> stringMap = locales.collect(
                Collectors.toMap(Locale::getDisplayLanguage, l -> l.getDisplayLanguage(l), (o, e) -> e)
        );

        System.out.println("----------------");
        System.out.println(stringMap);
        System.out.println("----------------");*/
        Map<String, String> map = locales.collect(
                Collectors.toMap(l -> l.getDisplayLanguage(),
                        l -> l.getDisplayLanguage(l),
                        (oldValue, newValue) -> oldValue));

        System.out.println(map.entrySet().stream().count());
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "---" + entry.getValue()));

    }

    public static void main(String[] args) {

        //init();
        Stream<Locale> stream = Arrays.stream(Locale.getAvailableLocales());
        Map<String, List<Locale>> listMap = stream.collect(groupingBy(Locale::getCountry));
        System.out.println(listMap);
        Arrays.stream(Locale.getAvailableLocales()).collect(groupingBy(Locale::getCountry, counting()))
                .forEach((s, aLong) -> System.out.printf("COUNTRY NAME : %s, COUNT = %d%n", new Locale("", s).getDisplayCountry(), aLong));

        intStream();
    }

}
