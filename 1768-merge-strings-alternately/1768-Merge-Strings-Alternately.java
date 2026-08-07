class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        char[]ch1 = word1.toCharArray();
        char[]ch2 = word2.toCharArray();
        int n1 = ch1.length;
        int n2 = ch2.length;
        char []result = new char[n1+n2];
        int k = 0;
        while(i<n1&&j<n2){
            if(k%2==0){
                result[k] = ch1[i];
                i++;
            }else{
                result[k] = ch2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            result[k] = ch1[i];
            k++;
            i++;
        }
        while(j<n2){
            result[k] = ch2[j];
            k++;
            j++;
        }
        return new String(result);
    }
}