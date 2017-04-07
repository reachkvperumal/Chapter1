package com.tutorial.streams;

import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by KV on 4/6/2017.
 */
public class LeaningMap {

    static void init() {
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());

        Map<String, String> map = locales.collect(
                Collectors.toMap(l -> l.getDisplayLanguage(),
                        l -> l.getDisplayLanguage(l),
                        (oldValue, newValue) -> oldValue));

        System.out.println(map.entrySet().stream().count());
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "---" + entry.getValue()));

    }

    public static void main(String[] args) {
        init();
    }

}
