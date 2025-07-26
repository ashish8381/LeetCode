class Solution {
    public int lengthOfLastWord(String s) {

        s=s.replaceAll("\\s+","1");

        int length =s.length();

        // if(!s.contains("1")){
        //     return s.length();
        // }

        if(s.charAt(length-1)=='1'){
            length=length-1;
        }
        // System.out.println(s);
        int count=0;
       for(int i=length-1;i>=0;i--){
            if(s.charAt(i)!='1'){
                System.out.println(s.charAt(i));
                    count++;
            }else{
                return count;
            }
       }
        return count;
    }
}