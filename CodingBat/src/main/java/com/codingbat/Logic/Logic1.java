package com.codingbat.Logic;


public class Logic1 {

    /**
     * <b>cigarParty</b>
     * <a href="https://codingbat.com/prob/p159531">Link to problem</a>
     * <p>When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.</p>
     */
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) return true;
        return !(isWeekend) && cigars >= 40 && cigars <= 60;
    }

    /**
     * <b>dateFashion</b>
     * <a href="https://codingbat.com/prob/p103360">Link to problem</a>
     * <p>You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).</p>
     */
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        else if (you >= 8 || date >= 8) return 2;
        else return 1;
    }

    /**
     * <b>squirrelPlay</b>
     * <a href="https://codingbat.com/prob/p141061">Link to problem</a>
     * <p>The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.</p>
     */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        return isSummer ? 60 <= temp && 100 >= temp : 60 <= temp && 90 >= temp;
    }

    /**
     * <b>caughtSpeeding</b>
     * <a href="https://codingbat.com/prob/p157733">Link to problem</a>
     * <p>You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.</p>
     */
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) speed -= 5;
        if (speed <= 60) return 0;
        if (speed <= 80) return 1;
        else return 2;
    }

    /**
     * <b>sortaSum</b>
     * <a href="https://codingbat.com/prob/p183071">Link to problem</a>
     * <p>Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.</p>
     */
    public int sortaSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 19 ? 20 : sum;
    }

    /**
     * <b>alarmClock</b>
     * <a href="https://codingbat.com/prob/p160543">Link to problem</a>
     * <p>Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".</p>
     */
    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (day >= 1 && day <= 5) {
                return "7:00";
            } else {
                return "10:00";
            }
        }
    }

    /**
     * <b>more20</b>
     * <a href="https://codingbat.com/prob/p118290">Link to problem</a>
     * <p>Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod</p>
     */
    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    /**
     * <b>love6</b>
     * <a href="https://codingbat.com/prob/p137742">Link to problem</a>
     * <p>The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.</p>
     */
    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }

    /**
     * <b>in1To10</b>
     * <a href="https://codingbat.com/prob/p137365">Link to problem</a>
     * <p>Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.</p>
     */
    public boolean in1To10(int n, boolean outsideMode) {
        return outsideMode ? n <= 1 || n >= 10 : 1 <= n && n <= 10;
    }

    /**
     * <b>specialEleven</b>
     * <a href="https://codingbat.com/prob/p100962">Link to problem</a>
     * <p>We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator.</p>
     */
    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    /**
     * <b>old35</b>
     * <a href="https://codingbat.com/prob/p159612">Link to problem</a>
     * <p>Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator </p>
     */
    public boolean old35(int n) {
        boolean bool = n % 5 == 0 || n % 3 == 0;
        if (n % 5 == 0 && n % 3 == 0) bool = false;
        return bool;
    }

    /**
     * <b>less20</b>
     * <a href="https://codingbat.com/prob/p133158">Link to problem</a>
     * <p>Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.</p>
     */
    public boolean less20(int n) {
        return (n % 20 == 18) || (n % 20 == 19);
    }

    /**
     * <b>nearTen</b>
     * <a href="https://codingbat.com/prob/p193613">Link to problem</a>
     * <p>Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.</p>
     */
    public boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }

    /**
     * <b>teenSum</b>
     * <a href="https://codingbat.com/prob/p178728">Link to problem</a>
     * <p>Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.</p>
     */
    public int teenSum(int a, int b) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) ? 19 : a + b;
    }

    /**
     * <b>answerCell</b>
     * <a href="https://codingbat.com/prob/p110973">Link to problem</a>
     * <p>Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.</p>
     */
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;
        else if (isMorning)
            return isMom;
        else
            return true;
    }

    /**
     * <b>teaParty</b>
     * <a href="https://codingbat.com/prob/p177181">Link to problem</a>
     * <p>We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).</p>
     */
    public int teaParty(int tea, int candy) {
        if (tea >= 5 && candy >= 5) {
            if (tea >= candy * 2 || candy >= tea * 2) {
                return 2;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    /**
     * <b>fizzString</b>
     * <a href="https://codingbat.com/prob/p137136">Link to problem</a>
     * <p>Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.</p>
     */
    public String fizzString(String str) {
        boolean startsWithF = str.startsWith("f");
        boolean endsWithB = str.endsWith("b");
        if (startsWithF && endsWithB) return "FizzBuzz";
        else if (startsWithF) return "Fizz";
        else if (endsWithB) return "Buzz";
        else return str;
    }

    /**
     * <b>fizzString2</b>
     * <a href="https://codingbat.com/prob/p115243">Link to problem</a>
     * <p>
     * Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another? </p>
     */
    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0)
            return "FizzBuzz!";
        if (n % 3 == 0)
            return "Fizz!";
        else if (n % 5 == 0)
            return "Buzz!";
        else
            return n + "!";
    }

    /**
     * <b>twoAsOne</b>
     * <a href="https://codingbat.com/prob/p113261">Link to problem</a>
     * <p>Given three ints, a b c, return true if it is possible to add two of the ints to get the third.</p>
     */
    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c) || (a + c == b) || (b + c == a);
    }

    /**
     * <b>inOrder</b>
     * <a href="https://codingbat.com/prob/p154188">Link to problem</a>
     * <p>Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.</p>
     */
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk)return true;
        return (a + b == c) || (a + c == b) || (b + c == a);
    }

    /**
     * <b>inOrderEqual</b>
     * <a href="https://codingbat.com/prob/p140272">Link to problem</a>
     * <p>Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.</p>
     */
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return false;
    }


    /**
     * <b>lastDigit</b>
     * <a href="https://codingbat.com/prob/p169213">Link to problem</a>
     * <p>Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.</p>
     */
    public boolean lastDigit(int a, int b, int c) {
        return false;
    }

    /**
     * <b>lessBy10</b>
     * <a href="https://codingbat.com/prob/p179196">Link to problem</a>
     * <p>Given three ints, a b c, return true if one of them is 10 or more less than one of the others.</p>
     */
    public boolean lessBy10(int a, int b, int c) {
        return false;
    }

    /**
     * <b>withoutDoubles</b>
     * <a href="https://codingbat.com/prob/p115233">Link to problem</a>
     * <p>Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.</p>
     */
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        return 0;
    }

    /**
     * <b>maxMod5</b>
     * <a href="https://codingbat.com/prob/p115384">Link to problem</a>
     * <p>Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.</p>
     */
    public int maxMod5(int a, int b) {
        return 3;
    }

    /**
     * <b>redTicket</b>
     * <a href="https://codingbat.com/prob/p170833">Link to problem</a>
     * <p>You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.</p>
     */
    public int redTicket(int a, int b, int c) {
        return 3;
    }

    /**
     * <b>greenTicket</b>
     * <a href="https://codingbat.com/prob/p120633">Link to problem</a>
     * <p>You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.</p>
     */
    public int greenTicket(int a, int b, int c) {
        return 34;
    }

    /**
     * <b>blueTicket</b>
     * <a href="https://codingbat.com/prob/p192267">Link to problem</a>
     * <p>You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.</p>
     */
    public int blueTicket(int a, int b, int c) {
        return 23;
    }

    /**
     * <b>shareDigit</b>
     * <a href="https://codingbat.com/prob/p153748">Link to problem</a>
     * <p>Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)</p>
     */
    public boolean shareDigit(int a, int b) {
        return false;

    }


    /**
     * <b>sumLimit</b>
     * <a href="https://codingbat.com/prob/p118077">Link to problem</a>
     * <p>Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)</p>
     */
    public int sumLimit(int a, int b) {
        return 3;
    }

}
