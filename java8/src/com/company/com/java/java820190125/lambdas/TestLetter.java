package com.company.com.java.java820190125.lambdas;

import java.util.function.Function;

public class TestLetter {
    public static void main(String[] args) {
        String content ="hello , my name is Vincent ,good luck.....";
        Function<String, String> addHeader = Letter::addHeader;
        Function<String, String> transformationPipeline
                = addHeader.andThen(Letter::checkSpelling)
                .andThen(Letter::addFooter);
        String result =transformationPipeline.apply(content);
        String r=addHeader.apply("test");
        System.out.println(r);
        System.out.println(result);
    }
}
