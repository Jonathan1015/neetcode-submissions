class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        String strS = new String(sArr);
        String strT = new String(tArr);

        if (strS.equals(strT)) {
            return true;
        }
        return false; 
    }
}
