class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List res = new ArrayList<>();
        int maxCandy = candies[0];
 
        for(int i=0;i<n;i++){
            if(candies[i]>maxCandy){
                maxCandy=candies[i];
            }
        }

        for(int i=0;i<n;i++){
           if(candies[i]+extraCandies>=maxCandy){
               res.add(i,true);
           }else{
             res.add(i,false);
           }
        }
        return res;
    }
}