package com.codingbat.Functional;

import java.util.List;
import java.util.stream.Collectors;


public class Functional1 {

    /**
     * <b>doubling</b>
     * <a href="https://codingbat.com/prob/p117665">Link to problem</a>
     * <p>Given a list of integers, return a list where each integer is multiplied by 2.</p>
     */
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    /**
     * <b>square</b>
     * <a href="https://codingbat.com/prob/p139586">Link to problem</a>
     * <p>Given a list of integers, return a list where each integer is multiplied with itself.</p>
     */
    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    /**
     * <b>addStar</b>
     * <a href="https://codingbat.com/prob/p170181">Link to problem</a>
     * <p>Given a list of strings, return a list where each string has "*" added at its end.</p>
     */
    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(s -> s + "*")
                .collect(Collectors.toList());
    }

    /**
     * <b>copies3</b>
     * <a href="https://codingbat.com/prob/p181634">Link to problem</a>
     * <p>Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.</p>
     */
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }

    /**
     * <b>moreY</b>
     * <a href="https://codingbat.com/prob/p177528">Link to problem</a>
     * <p>Given a list of strings, return a list where each string has "y" added at its start and end.</p>
     */
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> 'y' + s + 'y');
        return strings;
    }

    /**
     * <b>math1</b>
     * <a href="https://codingbat.com/prob/p103869">Link to problem</a>
     * <p>Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.</p>
     */
    public List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n + 1) * 10)
                .collect(Collectors.toList());
    }

    /**
     * <b>rightDigit</b>
     * <a href="https://codingbat.com/prob/p152194">Link to problem</a>
     * <p>Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)</p>
     */
    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
    }

    /**
     * <b>lower</b>
     * <a href="https://codingbat.com/prob/p186894">Link to problem</a>
     * <p>Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).</p>
     */
    public List<String> lower(List<String> s) {
        s.replaceAll(String::toLowerCase);
        return s;
    }

    /**
     * <b>noX</b>
     * <a href="https://codingbat.com/prob/p105967">Link to problem</a>
     * <p>Given a list of strings, return a list where each string has all its "x" removed.</p>
     */
    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(s -> s.replaceAll("x", ""))
                .collect(Collectors.toList());
    }

}
