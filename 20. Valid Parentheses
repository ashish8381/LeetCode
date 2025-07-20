class Solution {
    public boolean isValid(String s) {
        int length;
        do {
            length = s.length();
            s = s.replace("{}", "")
                 .replace("()", "")
                 .replace("[]", "");
        }//if nothing left for replace exit the while loop
         while (s.length() != length);
        
        return s.isEmpty();
    }
}