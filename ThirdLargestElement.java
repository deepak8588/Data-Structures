// Given an array, arr of positive integers. Find the third largest element in it. Return -1 if the third largest element is not found.
// Input: arr[] = [2, 4, 1, 3, 5]
// Output: 3
// Explanation: The third largest element in the array [2, 4, 1, 3, 5] is 3.

//Apporach is to iterate over the array and maintain first second and third largest element in array.

class Solution {
    int thirdLargest(int arr[]) {
        
        int largest=-1, secondLargest=-1, thirdLargest=-1;
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i]>largest){
                thirdLargest=secondLargest;
                secondLargest=largest;
                largest=arr[i];
            }
            
            else if(arr[i]>secondLargest){
                thirdLargest=secondLargest;
                secondLargest=arr[i];
            }
            
            else if(arr[i]>thirdLargest){
                thirdLargest=arr[i];
            }
            
        }
        
        return thirdLargest;
    }
}
