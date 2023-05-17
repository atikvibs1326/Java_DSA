class GfG
{
    void printPat(int n)
    {
         // Your code here
         for(int i=1;i<=n;i++){
             for(int j=n;j>=1;j--){
                 for(int k=n+1-i;k>=1;k--){
                     System.out.print(j+" ");
                 }
             }
             System.out.print("$");
         }
    }
}
