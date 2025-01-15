package com.intelliguru.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1408 {
    public List<String> stringMatching(String[] words) {
        List<String> substringList = new ArrayList<>();

        for (String word : words) {
            for (String s : words) {
                if (!word.equalsIgnoreCase(s) && s.contains(word)) {
                    substringList.add(word);
                }
            }
        }
        return substringList;
    }

    public static void main(String[] args) {
        LeetCode1408 leetCode1408 = new LeetCode1408();
        String[] strs = {"leetcoder","leetcode","od","hamlet","am"};
        List<String> duplicateList = new ArrayList<>();
        for(int i =0; i < strs.length; i++){
            for(int j =0; j< strs.length; j++){
                if(! strs[i].equalsIgnoreCase(strs[j])){
                    if(strs[j].contains(strs[i])){
                        duplicateList.add(strs[i]);
                        break;
                    }
                }
            }
        }

        List<String> result = leetCode1408.stringMatching(strs);

    }
}
