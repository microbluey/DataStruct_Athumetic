package com.microblueworld.test.athumetic;

import com.microblueworld.datastruct.LinkedListStack;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Stack;

public class StackTest {

    @Test
    public void bracketsPairTest() {
        String s = "{[({})]}[]{}";
        char[] chars = s.toCharArray();
        boolean pairFlag = true;
        LinkedListStack<Character> stack = new LinkedListStack<>();
        for (int i = 0; i < chars.length; i++) {

        }
        System.out.println(pairFlag);
    }
    public boolean bracketsPair() {
        String s = "{[({})]}[]{}";
        char[] chars = s.toCharArray();
        boolean pairFlag = true;
        LinkedListStack<Character> stack = new LinkedListStack<>();
        for (int i = 0; i < chars.length; i++) {
            if ('}' == chars[i]){
                Character pop = stack.pop();
                pairFlag = pop.equals('{');
            }else if (']' == chars[i]){
                Character pop = stack.pop();
                pairFlag = pop.equals('{');
            }
        }
        System.out.println(pairFlag);
        return false;
    }

    @Test
    public void trailingZeroes() {
        int n = 30;
        BigInteger f = factorial(n);
        String s = String.valueOf(f);
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = chars.length - 1;chars[i] == '0';i--){
            result++;
        }
        System.out.println(result);
    }
    public BigInteger factorial(int n){
        //System.out.println(n);
        if(n == 1 || n == 0){
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.valueOf(n).multiply(factorial(n - 1));
        return result;
    }

    @Test
    public void test1(){
        System.out.println(hasAlternatingBits(5));

    }
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        int cur = 0;
        int pre = 0;
        for (char c : s.toCharArray()) {
            cur = c;
            if (pre == cur){
                return false;
            }
            pre = cur;
        }
        return true;
    }


    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] chars = answerKey.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 1; i < chars.length;i++){
            if (chars[i] == chars[i-1]){
                count++;
            }else{
                list.add(count);
                count = 0;
            }
        }
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max + k;
    }
}
