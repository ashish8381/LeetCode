class Solution {
    public int titleToNumber(String columnTitle) {

        // columnTitle="AJHX";
        int len = columnTitle.length();

        if (len == 1) {
            return ((int) columnTitle.charAt(0)) - 64;
        }

        int count = 0;
        int power = 0;
        for (int i = len - 1; i >= 0; i--) {
            int val = ((int) columnTitle.charAt(i)) - 64;
            if (power > 0) {
                count += Math.pow(26, power) * val;
            } else {
                count = val;
            }
            // System.out.println("val="+val+" Count="+count+" Power="+power);
            power++;
        }

        return count;

    }
}