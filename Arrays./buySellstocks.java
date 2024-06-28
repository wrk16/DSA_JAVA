public class buySellstocks{

    public int maxprofit(int[] prices){
        int n=prices.length;
        
        int profit=0;
        
        for(int i=1; i<n;i++){
            
                if(prices[i-1] < prices[i]){
                    profit+= prices[i]-prices[i-1];
                  
                }
            }
        
        return profit;
    }
    
        
    public static void main(String[] args) {
        int[] prices={1,2,3,4,5};
        buySellstocks obj=new buySellstocks();
        System.out.println(obj.maxprofit(prices));
    }
}