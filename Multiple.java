class Multiple{ 
     void MultipleSum(int n){ 
         int sum=0; 
         for (int i=0;i<n;i++){ 
             if (i%3==0 || i%5==0){ 
                 sum+=i; 
             } 
             else if (i%3==0 && i%5==0){ 
                 sum-=i; 
             } 
 
 
         } 
         System.out.println(sum); 
     } 
         public static void main(String[] args) { 
 		Multiple f = new Multiple(); 
 		f.MultipleSum(1000); 
 	} 
 } 
