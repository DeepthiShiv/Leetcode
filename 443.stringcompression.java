class Solution {
    public int compress(char[] chars) {
       int j=0;
        for(int i=0;i<chars.length;i++){
            int c=1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                c++;
                i++;
            }
            chars[j++]=chars[i];
            if(c>1){
               for(char ch: Integer.toString(c).toCharArray()){
                chars[j++]=ch;
               }
            }

        }
        return j;
}
}
