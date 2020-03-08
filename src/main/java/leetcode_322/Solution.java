package leetcode_322;

import java.util.*;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/8
 * @Description: 零钱兑换 超时
 */
public class Solution {
    private LinkedList<Integer> res;
    private int min = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        backtrack(coins,coins.length - 1, amount, new LinkedList<>());
        return res == null? -1: res.size();
    }
    private void backtrack(int[] coins, int last, int amount, LinkedList<Integer> list){
        if(amount == 0){
            if(list.size() < min) {
                res = new LinkedList<>(list);
                min = res.size();
            }
            return;
        }
        for(int i = last; i >= 0; i--){
            if(coins[i] <= amount){
                list.add(coins[i]);
                backtrack(coins, i, amount - coins[i], list);
                list.removeLast();
            }
        }
    }
}
