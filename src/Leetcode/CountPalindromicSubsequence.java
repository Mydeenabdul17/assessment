package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountPalindromicSubsequence {
	Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		System.out.println(new CountPalindromicSubsequence().countPalindromicSubsequences("abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"));
	}
    public int countPalindromicSubsequences(String s) {
        combination(s,"",0);
        return set.size()%1000000007;
        
    }
    public boolean isPalindrome(String s){
        for(int i=0,j=s.length()-1;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
   public void combination(String s, String k, int start) {
		for (int i = start; i < s.length(); i++) {
			k += s.charAt(i);
            if(k.length()>0&&isPalindrome(k))
			set.add(k);
			combination(s, k, i + 1);
			k = k.substring(0, k.length() - 1);
		}
		return;
	}
}
