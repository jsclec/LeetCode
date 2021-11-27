package CountBinarySubstrings;

public class CountBinarySubstrings {
    //01 and 10 are valid, as well as 00..11.. or 11..00.., but nothing else

    public CountBinarySubstrings(){
    }

    public int getCount(String s){
        int curr = 1, ans = 0, prev = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                curr++;
            }
            else{
                ans += Math.min(curr, prev);
                prev = curr;
                curr=1;
            }
        }
        return ans + Math.min(curr, prev);
    }
}
