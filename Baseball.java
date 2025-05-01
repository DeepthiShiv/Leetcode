class Solution {
    public int calPoints(String[] operations) {
        List <Integer> ans= new ArrayList<>();

        for(String op: operations){
            if(op.equals("C")){
                ans.remove(ans.size()-1);
            }else if(op.equals("+")){
                ans.add(ans.get(ans.size()-1)+ans.get(ans.size()-2));
            }else if(op.equals("D")){
                ans.add(2*ans.get(ans.size()-1));
            }else{
                ans.add(Integer.parseInt(op));
            }
        }

        int sum=0;
        for(int num:ans){
            sum+=num;
        }

        return sum;
    }
}
