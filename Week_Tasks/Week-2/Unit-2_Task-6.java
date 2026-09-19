class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int highest = 0;
        for (int g : gain) {
            altitude += g;
            highest = Math.max(highest, altitude);
        }
        return highest;
    }
}
Input: 
gain = [-5,1,5,0,-7]
Output: 
1
