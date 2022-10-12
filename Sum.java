public class Sum {
    int sum, mini;
    public Sum(int[] array){
        sum=0;
        mini=array[0];
        for(int i=0;i<10;i=i+1){
            sum=sum+array[i];

            if(mini>array[i]){
                mini=array[i];
            }
        }

       
        
        

       
    }
    public int getSum()
    {
       return  sum-mini;
    }
      public int getDiference()
      {
           return mini;
      }
}
