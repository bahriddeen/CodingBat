package com.codingbat.Map;

import java.util.HashMap;
import java.util.Map;


public class Map1 {

    /**
     * <b>mapBully</b>
     * <a href="https://codingbat.com/prob/p197888">Link to problem</a>
     * <p>Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.</p>
     */

    public Map<String, String> mapBully(Map<String, String> map) {
        map.computeIfPresent("a", (key, value) -> {
            map.put("b", value);
            return "";
        });
        return map;
    }

    /**
     * <b>mapShare</b>
     * <a href="https://codingbat.com/prob/p148813">Link to problem</a>
     * <p>Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.</p>
     */
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) map.put("b", map.get("a"));
        map.remove("c");
        return map;
    }

    /**
     * <b>mapAB</b>
     * <a href="https://codingbat.com/prob/p107259">Link to problem</a>
     * <p>Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".</p>
     */
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b"))
            map.put("ab", map.get("a") + map.get("b"));
        return map;
    }

    /**
     * <b>topping1</b>
     * <a href="https://codingbat.com/prob/p182712">Link to problem</a>
     * <p>Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".</p>
     */
    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream"))
            map.put("ice cream", "cherry");
        map.put("bread", "butter");
        return map;
    }

    /**
     * <b>topping2</b>
     * <a href="https://codingbat.com/prob/p196458">Link to problem</a>
     * <p>Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".</p>
     */
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsValue("ice cream"))
            map.put("yogurt", map.get("ice cream"));
        if (map.containsValue("spinach"))
            map.put("spinach", "nuts");
        return map;
    }

    /**
     * <b>topping3</b>
     * <a href="https://codingbat.com/prob/p128461">Link to problem</a>
     * <p>Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".</p>
     */
    public Map<String, String> topping3(Map<String, String> map) {
        return new HashMap<>();
    }

    /**
     * <b>mapAB2</b>
     * <a href="https://codingbat.com/prob/p115011">Link to problem</a>
     * <p>Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.</p>
     */
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b"))
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        return map;
    }

    /**
     * <b>mapAB3</b>
     * <a href="https://codingbat.com/prob/p115012">Link to problem</a>
     * <p>Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.</p>
     */
    public Map<String, String> mapAB3(Map<String, String> map) {
        return new HashMap<>();
    }

    /**
     * <b>mapAB4</b>
     * <a href="https://codingbat.com/prob/p136950">Link to problem</a>
     * <p>Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.</p>
     */
    public Map<String, String> mapAB4(Map<String, String> map) {
        return new HashMap<>();
    }

}
