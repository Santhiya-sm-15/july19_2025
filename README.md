# july19_2025
The problem that i solved today in leetcode

You are given a lowercase string s, determine the total number of distinct strings that can be formed using the following rules:

Identify all unique vowels (a, e, i, o, u) present in the string.
For each distinct vowel, choose exactly one of its occurrences from s. If a vowel appears multiple times, each occurrence represents a unique selection choice.
Generate all possible permutations of the selected vowels. Each unique arrangement counts as a distinct string.
Return the total number of such distinct strings.

Code:
class Solution {
    public int vowelCount(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                m.put(c,m.getOrDefault(c,0)+1);
        }
        if(m.size()==0)
            return 0;
        int res=1;
        for(int i=1;i<=m.size();i++)
            res*=i;
        for(int x:m.values())
            res*=x;
        return res;
    }
}
