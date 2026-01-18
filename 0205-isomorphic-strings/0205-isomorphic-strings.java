class Solution {
    public boolean isIsomorphic(String s, String t) {
     int[] s1=new int[256];
     int[] t1=new int[256];
     if(s.length()!=t.length()){
        return false;
     }
     for(int i=0;i<s.length();i++){
        char maps=s.charAt(i);
        char mapt=t.charAt(i);
        if (s1[maps] != t1[mapt]) {
            return false;
        }

        // Update the last seen position (using i + 1 to avoid default 0 conflict)
        s1[maps] = i + 1;
        t1[mapt] = i + 1;
    }
    return true;
     }

    }
