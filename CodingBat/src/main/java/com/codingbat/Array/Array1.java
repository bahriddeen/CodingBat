package com.codingbat.Array;


public class Array1 {

    /**
     * <b>firstLast6</b>
     * <a href="https://codingbat.com/prob/p185685">Link to problem</a>
     * <p>Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.</p>
     */
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    /**
     * <b>sameFirstLast</b>
     * <a href="https://codingbat.com/prob/p118976">Link to problem</a>
     * <p>Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.</p>
     */
    public boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }

    /**
     * <b>makePi</b>
     * <a href="https://codingbat.com/prob/p167011">Link to problem</a>
     * <p>Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.</p>
     */
    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    /**
     * <b>commonEnd</b>
     * <a href="https://codingbat.com/prob/p191991">Link to problem</a>
     * <p>Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.</p>
     */
    public boolean commonEnd(int[] a, int[] b) {
        int aL = a.length - 1;
        int bL = b.length - 1;
        return a[0] == b[0] || a[aL] == b[bL];
    }

    /**
     * <b>sum3</b>
     * <a href="https://codingbat.com/prob/p175763">Link to problem</a>
     * <p>Given an array of ints length 3, return the sum of all the elements.</p>
     */
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    /**
     * <b>rotateLeft3</b>
     * <a href="https://codingbat.com/prob/p185139">Link to problem</a>
     * <p>Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.</p>
     */
    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    /**
     * <b>reverse3</b>
     * <a href="https://codingbat.com/prob/p112409">Link to problem</a>
     * <p>Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.</p>
     */
    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    /**
     * <b>maxEnd3</b>
     * <a href="https://codingbat.com/prob/p146256">Link to problem</a>
     * <p>Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.</p>
     */
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        return new int[]{max, max, max};
    }

    /**
     * <b>sum2</b>
     * <a href="https://codingbat.com/prob/p190968">Link to problem</a>
     * <p>Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.</p>
     */
    public int sum2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return nums[0] + (nums.length > 1 ? nums[1] : 0);
    }

    /**
     * <b>middleWay</b>
     * <a href="https://codingbat.com/prob/p146449">Link to problem</a>
     * <p>Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.</p>
     */
    public int[] middleWay(int[] a, int[] b) {
        int[] i = new int[2];
        i[0] = a[a.length / 2];
        i[1] = b[b.length / 2];
        return i;

    }

    /**
     * <b>makeEnds</b>
     * <a href="https://codingbat.com/prob/p101230">Link to problem</a>
     * <p>Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.</p>
     */
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    /**
     * <b>has23</b>
     * <a href="https://codingbat.com/prob/p171022">Link to problem</a>
     * <p>Given an int array length 2, return true if it contains a 2 or a 3.</p>
     */
    public boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }

    /**
     * <b>no23</b>
     * <a href="https://codingbat.com/prob/p175689">Link to problem</a>
     * <p>Given an int array length 2, return true if it does not contain a 2 or 3.</p>
     */
    public boolean no23(int[] nums) {
        return !(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    /**
     * <b>makeLast</b>
     * <a href="https://codingbat.com/prob/p137188">Link to problem</a>
     * <p>Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.</p>
     */
    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

    /**
     * <b>double23</b>
     * <a href="https://codingbat.com/prob/p145365">Link to problem</a>
     * <p>Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.</p>
     */
    public boolean double23(int[] nums) {
        return nums.length >= 2 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
    }

    /**
     * <b>fix23</b>
     * <a href="https://codingbat.com/prob/p120347">Link to problem</a>
     * <p>Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.</p>
     */
    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3)
            nums[1] = 0;
        else if (nums[1] == 2 && nums[2] == 3)
            nums[2] = 0;
        return nums;
    }

    /**
     * <b>start1</b>
     * <a href="https://codingbat.com/prob/p109660">Link to problem</a>
     * <p>Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.</p>
     */
    public int start1(int[] a, int[] b) {
        int aL = a.length;
        int bL = b.length;
        int cnt = 0;
        if (aL > 0 && a[0] == 1) cnt++;
        if (bL > 0 && b[0] == 1) cnt++;
        return cnt;
    }

    /**
     * <b>biggerTwo</b>
     * <a href="https://codingbat.com/prob/p109537">Link to problem</a>
     * <p>Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.</p>
     */
    public int[] biggerTwo(int[] a, int[] b) {
        int aSum = a[0] + a[1];
        int bSum = b[0] + b[1];
        return bSum > aSum ? b : a;
    }

    /**
     * <b>makeMiddle</b>
     * <a href="https://codingbat.com/prob/p199519">Link to problem</a>
     * <p>Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.</p>
     */
    public int[] makeMiddle(int[] nums) {
        int length = nums.length;
        if (length % 2 == 0)
            return new int[]{nums[length / 2 - 1], nums[length / 2]};
        else
            return new int[]{nums[length / 2]};
    }

    /**
     * <b>plusTwo</b>
     * <a href="https://codingbat.com/prob/p180840">Link to problem</a>
     * <p>Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.</p>
     */
    public int[] plusTwo(int[] a, int[] b) {
        int[] arr = new int[4];
        arr[0] = a[0];
        arr[1] = a[1];
        arr[2] = b[0];
        arr[3] = b[1];
        return arr;
    }

    /**
     * <b>swapEnds</b>
     * <a href="https://codingbat.com/prob/p118044">Link to problem</a>
     * <p>Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.</p>
     */
    public int[] swapEnds(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        nums[0] = last;
        nums[nums.length - 1] = first;
        return nums;
    }

    /**
     * <b>midThree</b>
     * <a href="https://codingbat.com/prob/p155713">Link to problem</a>
     * <p>Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.</p>
     */
    public int[] midThree(int[] nums) {
        int length = nums.length;
        if (length < 3) return nums;
        int mid = length / 2;
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }

    /**
     * <b>maxTriple</b>
     * <a href="https://codingbat.com/prob/p185176">Link to problem</a>
     * <p>Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.</p>
     */
    public int maxTriple(int[] nums) {
        int midIndex = nums.length / 2;
        int first = nums[0];
        int mid = nums[midIndex];
        int last = nums[nums.length - 1];
        return Math.max(first, Math.max(mid, last));
    }

    /**
     * <b>frontPiece</b>
     * <a href="https://codingbat.com/prob/p142455">Link to problem</a>
     * <p>Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.</p>
     */
    public int[] frontPiece(int[] nums) {
        if (nums.length < 2) return nums;
        return new int[]{nums[0], nums[1]};
    }

    /**
     * <b>unlucky1</b>
     * <a href="https://codingbat.com/prob/p197308">Link to problem</a>
     * <p>We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.</p>
     */
    public boolean unlucky1(int[] nums) {
        if (nums.length < 2)
            return false;
        else if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3))
            return true;
        else return nums.length > 2 && nums[1] == 1 && nums[2] == 3;
    }

    /**
     * <b>make2</b>
     * <a href="https://codingbat.com/prob/p143461">Link to problem</a>
     * <p>Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.</p>
     */
    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];

        if (a.length >= 2) {
            result[0] = a[0];
            result[1] = a[1];
        } else if (a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        } else {
            result[0] = b[0];
            result[1] = b[1];
        }
        return result;
    }

    /**
     * <b>front11</b>
     * <a href="https://codingbat.com/prob/p128270">Link to problem</a>
     * <p>Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.</p>
     */
    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) return new int[]{};
        return (a.length == 0) ? new int[]{b[0]} : (b.length == 0) ? new int[]{a[0]} : new int[]{a[0], b[0]};
    }
}
