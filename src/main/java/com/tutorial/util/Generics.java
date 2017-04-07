package com.tutorial.util;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

/**
 * Created by KV on 4/5/2017.
 */
public class Generics {

    private static Companies companies;

    static List<Optional<CompanyName>> loadCompanies(Companies companies) throws EmptyCompany {


        Optional.ofNullable(companies.getCompanies()).orElseThrow(EmptyCompany::new);
        return companies.getCompanies()
                .stream()
                .map(o -> Optional.ofNullable(new CompanyName(o)))
                .collect(toList());
    }

    public static void main(String[] args) {
        try {
            List<Optional<CompanyName>> optionalList = loadCompanies(companies);
            optionalList.stream().peek(System.out::println);
        } catch (EmptyCompany emptyCompany) {
            emptyCompany.printStackTrace();
        }
    }

}
