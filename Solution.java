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