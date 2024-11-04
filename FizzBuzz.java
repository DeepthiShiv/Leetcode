class Solution {
    public List<String> fizzBuzz(int n) {
    List<String> res = new ArrayList<>();        
        int c3=0,c5=0;
        for(int i=1;i<=n;i++){
            c3++;c5++;
            if(c3==3 && c5==5){
                c3=c5=0;
                res.add("FizzBuzz");
            }
            else if(c3==3){
                c3=0;
                res.add("Fizz");
            }
            else if(c5==5){
                c5=0;
                res.add("Buzz");
            }
            else{
                res.add(""+i);
            }
        }
        return res;
    }
}
