package com.codingbat.Functional;

import java.util.List;
import java.util.stream.Collectors;


public class Functional2 {

    /**
     * <b>noNeg</b>
     * <a href="https://codingbat.com/prob/p103456">Link to problem</a>
     * <p>Given a list of integers, return a list of the integers, omitting any that are less than 0.</p>
     */
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    /**
     * <b>no9</b>
     * <a href="https://codingbat.com/prob/p124510">Link to problem</a>
     * <p>Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)</p>
     */
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }

    /**
     * <b>noTeen</b>
     * <a href="https://codingbat.com/prob/p137274">Link to problem</a>
     * <p>Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.</p>
     */
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num < 13 || num > 19)
                .collect(Collectors.toList());
    }

    /**
     * <b>noZ</b>
     * <a href="https://codingbat.com/prob/p105671">Link to problem</a>
     * <p>Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)</p>
     */
    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }

    /**
     * <b>noLong</b>
     * <a href="https://codingbat.com/prob/p194496">Link to problem</a>
     * <p>Given a list of strings, return a list of the strings, omitting any string length 4 or more.</p>
     */
    public List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());
    }

    /**
     * <b>no34</b>
     * <a href="https://codingbat.com/prob/p184496">Link to problem</a>
     * <p>Given a list of strings, return a list of the strings, omitting any string length 3 or 4.</p>
     */
    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() != 3 && s.length() != 4)
                .collect(Collectors.toList());
    }

    /**
     * <b>noYY</b>
     * <a href="https://codingbat.com/prob/p115967">Link to problem</a>
     * <p>Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.</p>
     */
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }

    /**
     * <b>two2</b>
     * <a href="https://codingbat.com/prob/p148198">Link to problem</a>
     * <p>Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.</p>
     */
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .filter(n -> n % 10 != 2)
                .collect(Collectors.toList());
    }

    /**
     * <b>square56</b>
     * <a href="https://codingbat.com/prob/p132748">Link to problem</a>
     * <p>Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.</p>
     */
    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(num -> num * num + 10)
                .filter(num -> num % 10 != 5 && num % 10 != 6)
                .collect(Collectors.toList());
    }

}
