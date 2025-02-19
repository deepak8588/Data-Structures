// Problem: The hiring team aims to find 3 candidates who are great collectively. Each candidate has his or her ability expressed as an integer. 3 candidates are great collectively if the product of their abilities is maximum. Given the abilities of some candidates in an array, arr[], return the maximum collective ability from the pool of candidates.
// Input: arr[] = [-10, -3, -5, -6, -20]
// Output: -90
// Explanation: Multiplication of -3, -5 and -6 is -90.



Solution:
// User function Template for Java

class Solution {
    int maxProduct(int[] arr) {
        // code here
        
        
        //Catch in the problem is there could be two cases of maximum  first max 
        //can either be product last three number or it could be product of first two negative numbers
        //and multiply it with last number
        
        //First approach sort array and multiply 3 largest element
        Arrays.sort(arr);
        int n= arr.length;
        int maxProduct= Math.max(arr[0]*arr[1]*arr[n-1], arr[n-1]*arr[n-2]*arr[n-3]);
        
        return maxProduct;
        
        //Second approach iterate one time and find three largest element and multple them
        //And first and second element now product could max of any of two as above
        
        int largest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE,thirdLargest=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]> largest){
                thirdLargest=secondLargest;
                secondLargest=largest;
                largest=arr[i];
            }
            
            else if(arr[i]> secondLargest){
                thirdLargest=secondLargest;
                secondLargest=arr[i];
            }
            
            else if(arr[i]> thirdLargest){
                thirdLargest=arr[i];
            }
        }
        
        int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]< first){
                second=first;
                first=arr[i];
            }
            
            else if(arr[i]< second){
                second=arr[i];
            }
        
        }
        
        return Math.max(first*second*largest, largest*secondLargest*thirdLargest);
    }
}
