class Solution {
    public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    
    int size=0;
    int index=0;
    size=strs[0].length();
    for(int k=1;k<strs.length;k++){
        if(size>strs[k].length()){
            size=strs[k].length();
            index=k;
        }
    }


    for(int i=0;i<size;i++){
        char a=strs[index].charAt(i);

        for(int j=0;j<strs.length;j++){
                if(i==strs[j].length()|| a!=strs[j].charAt(i)){
                     System.out.println("ans=="+strs[j].substring(0,i));
                    return strs[j].substring(0,i);
                }
        }

    }

    return strs[index];
    }
}