class Solution {
    public int strStr(String haystack, String needle) {
        
        // if(!haystack.contains(needle)){
        //     return -1;
        // }

        //     return haystack.indexOf(needle);

        // if(haystack.equals(needle)){
        //         return 0;
        // }

        int a=haystack.length();
        int b=needle.length();

        for(int i=0;i<=a-b;i++){
            if(haystack.substring(i,i+b).equals(needle)){
                return i;
            }
        }

    return -1;
    }
}