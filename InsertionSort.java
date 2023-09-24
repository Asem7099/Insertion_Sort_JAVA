package insertionsort;


public class InsertionSort {


    public static void main(String[] args) {
    int arr[]= {20,30,50,10,40,60};
        for(int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i;
           while(j>0 && arr[j-1] > temp )
            {
             arr[j]= arr[j-1];
             j--;
            }
           arr[j]=temp;
        }
    for(int x=0;x<6;x++){
    System.out.println(arr[x]); }
        
    }
    
}
