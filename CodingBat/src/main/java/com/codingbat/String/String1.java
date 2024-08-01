package com.codingbat.String;


public class String1 {

    /**
     * <b>helloName</b>
     * <a href="https://codingbat.com/prob/p171896">Link to problem</a>
     * <p>Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".</p>
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /**
     * <b>makeAbba</b>
     * <a href="https://codingbat.com/prob/p161056">Link to problem</a>
     * <p>Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".</p>
     */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /**
     * <b>makeTags</b>
     * <a href="https://codingbat.com/prob/p147483">Link to problem</a>
     * <p>The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".</p>
     */
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /**
     * <b>makeOutWord</b>
     * <a href="https://codingbat.com/prob/p184030">Link to problem</a>
     * <p>Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.</p>
     */
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    /**
     * <b>extraEnd</b>
     * <a href="https://codingbat.com/prob/p108853">Link to problem</a>
     * <p>Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.</p>
     */
    public String extraEnd(String str) {
        String s = str.substring(str.length() - 2);
        return s + s + s;
    }

    /**
     * <b>firstTwo</b>
     * <a href="https://codingbat.com/prob/p163411">Link to problem</a>
     * <p>Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.</p>
     */
    public String firstTwo(String str) {
        return str.length() >= 2 ? str.substring(0, 2) : str;
    }

    /**
     * <b>firstHalf</b>
     * <a href="https://codingbat.com/prob/p172267">Link to problem</a>
     * <p>Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".</p>
     */
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    /**
     * <b>withoutEnd</b>
     * <a href="https://codingbat.com/prob/p130896">Link to problem</a>
     * <p>Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.</p>
     */
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * <b>comboString</b>
     * <a href="https://codingbat.com/prob/p168564">Link to problem</a>
     * <p>Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).</p>
     */
    public String comboString(String a, String b) {
        return a.length() > b.length() ? b + a + b : a + b + a;
    }

    /**
     * <b>nonStart</b>
     * <a href="https://codingbat.com/prob/p143825">Link to problem</a>
     * <p>Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.</p>
     */
    public String nonStart(String a, String b) {
        return a.length() == 1 && b.length() == 1 ? "" : a.substring(1) + b.substring(1);
    }

    /**
     * <b>left2</b>
     * <a href="https://codingbat.com/prob/p197720">Link to problem</a>
     * <p>Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.</p>
     */
    public String left2(String str) {
        return str.length() == 2 ? str : str.substring(2) + str.substring(0, 2);
    }

    /**
     * <b>right2</b>
     * <a href="https://codingbat.com/prob/p130781">Link to problem</a>
     * <p>Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.</p>
     */
    public String right2(String str) {
        return str.length() == 2 ? str : str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    /**
     * <b>theEnd</b>
     * <a href="https://codingbat.com/prob/p162477">Link to problem</a>
     * <p>Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.</p>
     */
    public String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    /**
     * <b>withouEnd2</b>
     * <a href="https://codingbat.com/prob/p174254">Link to problem</a>
     * <p>Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.</p>
     */
    public String withouEnd2(String str) {
        int l = str.length();
        return l <= 2 ? "" : str.substring(1, l - 1);
    }

    /**
     * <b>middleTwo</b>
     * <a href="https://codingbat.com/prob/p137729">Link to problem</a>
     * <p>Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.</p>
     */
    public String middleTwo(String str) {
        int l = str.length();
        int i = str.length() / 2;
        return l <= 2 ? str : str.substring(i - 1, i + 1);
    }

    /**
     * <b>endsLy</b>
     * <a href="https://codingbat.com/prob/p103895">Link to problem</a>
     * <p>Given a string, return true if it ends in "ly".</p>
     */
    public boolean endsLy(String str) {
        if (str.equals("ly")) return true;
        if (str.length() <= 2) return false;
        return str.endsWith("ly");
    }

    /**
     * <b>nTwice</b>
     * <a href="https://codingbat.com/prob/p174148">Link to problem</a>
     * <p>Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.</p>
     */
    public String nTwice(String str, int n) {
        return n == 0 ? "" : str.substring(0, n) + str.substring(str.length() - n);
    }

    /**
     * <b>twoChar</b>
     * <a href="https://codingbat.com/prob/p144623">Link to problem</a>
     * <p>Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.</p>
     */
    public String twoChar(String str, int index) {
        if (index + 2 > str.length()) return str.substring(0, 2);
        else if (index < 0) return str.substring(0, 2);
        else return str.substring(index, index + 2);
    }

    /**
     * <b>middleThree</b>
     * <a href="https://codingbat.com/prob/p115863">Link to problem</a>
     * <p>Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.</p>
     */
    public String middleThree(String str) {
        int l = str.length();
        if (l == 3) return str;
        l = l / 2;
        return str.substring(l - 1, l + 2);
    }

    /**
     * <b>hasBad</b>
     * <a href="https://codingbat.com/prob/p139075">Link to problem</a>
     * <p>Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.</p>
     */
    public boolean hasBad(String str) {
        int l = str.length();
        return l >= 3 && (str.startsWith("bad") || (l > 3 && str.startsWith("bad", 1)));
    }

    /**
     * <b>atFirst</b>
     * <a href="https://codingbat.com/prob/p139076">Link to problem</a>
     * <p>Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.</p>
     */
    public String atFirst(String str) {
        return str.isEmpty() ? "@@" : str.length() >= 2 ? str.substring(0, 2) : str + '@';
    }

    /**
     * <b>lastChars</b>
     * <a href="https://codingbat.com/prob/p138183">Link to problem</a>
     * <p>Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.</p>
     */
    public String lastChars(String a, String b) {
        boolean aEmpty = a.isEmpty();
        boolean bEmpty = b.isEmpty();
        if (aEmpty && bEmpty) return "@@";
        if (aEmpty) return "@" + b.charAt(b.length() - 1);
        if (bEmpty) return a.charAt(0) + "@";
        return a.charAt(0) + b.substring(b.length() - 1);
    }

    /**
     * <b>conCat</b>
     * <a href="https://codingbat.com/prob/p132118">Link to problem</a>
     * <p>Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat"./p>
     */
    public String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) return a + b;
        if (a.charAt(a.length() - 1) == b.charAt(0)) return a + b.substring(1);
        return a + b;
    }

    /**
     * <b>lastTwo</b>
     * <a href="https://codingbat.com/prob/p194786">Link to problem</a>
     * <p>Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".</p>
     */
    public String lastTwo(String str) {
        if (str.length() < 2) return str;
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    /**
     * <b>seeColor</b>
     * <a href="https://codingbat.com/prob/p199216">Link to problem</a>
     * <p>Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.</p>
     */
    public String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        else if (str.startsWith("blue")) return "blue";
        else return "";
    }

    /**
     * <b>frontAgain</b>
     * <a href="https://codingbat.com/prob/p196652">Link to problem</a>
     * <p>Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".</p>
     */
    public boolean frontAgain(String str) {
        return str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    /**
     * <b>minCat</b>
     * <a href="https://codingbat.com/prob/p105745">Link to problem</a>
     * <p>Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.</p>
     */
    public String minCat(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        return a.substring(a.length() - minLength) + b.substring(b.length() - minLength);
    }

    /**
     * <b>extraFront</b>
     * <a href="https://codingbat.com/prob/p172063">Link to problem</a>
     * <p>Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.</p>
     */
    public String extraFront(String str) {
        if (str.length() < 2) return str + str + str;
        return str.substring(0, 2) + str.substring(0, 2) + str.substring(2);
    }

    /**
     * <b>without2</b>
     * <a href="https://codingbat.com/prob/p142247">Link to problem</a>
     * <p>Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.</p>
     */
    public String without2(String str) {
        int len = str.length();

        if (len < 2) {
            return str;
        }

        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(len - 2, len);

        return firstTwo.equals(lastTwo) ? str.substring(2, len) : str;
    }

    /**
     * <b>deFront</b>
     * <a href="https://codingbat.com/prob/p110141">Link to problem</a>
     * <p>Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.</p>
     */
    public String deFront(String str) {
        if (str.length() >= 2) {
            if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
                return str;
            } else if (str.charAt(0) == 'a') {
                return str.charAt(0) + str.substring(2);
            } else if (str.charAt(1) == 'b') {
                return str.substring(1);
            } else {
                return str.substring(2);
            }
        } else if (str.length() == 1 && str.charAt(0) == 'a') {
            return str;
        } else {
            return "";
        }
    }

    /**
     * <b>startWord</b>
     * <a href="https://codingbat.com/prob/p141494">Link to problem</a>
     * <p>Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.</p>
     */
    public String startWord(String str, String word) {
        return str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1)) ? str.substring(0, word.length()) : "";
    }

    /**
     * <b>withoutX</b>
     * <a href="https://codingbat.com/prob/p151940">Link to problem</a>
     * <p>Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.</p>
     */
    public String withoutX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    /**
     * <b>withoutX2</b>
     * <a href="https://codingbat.com/prob/p151359">Link to problem</a>
     * <p>Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.</p>
     */
    public String withoutX2(String str) {
        if (str.length() <= 1) {
            return str.replace("x", "");
        } else if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        } else {
            return str;
        }
    }
}
