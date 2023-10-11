package Arrays;

public class basics {
    public static void main(String[] args) {
        // int arr[] = {2,3,45,2,4};        
        // int ages[] = new int[50];
        // arr = new int [95]; //we can declare our array like this
        // int arr[];//declaring an array named 'arr'
        // arr = new int[4]; //allocating memory to array 'arr'
        // arr[0] = 45;
        // arr[1] = 54;
        // arr[2] = 12;
        // arr[3] = 90; 
        int arr[] = {3,4,2,5,2};
        for(int i=0;i<arr.length;i++){   // displaying using for-loop 
            System.out.print(arr[i]+" ");
        }
        // for(int element : arr){ // dispalying using for-each-loop 
        //     System.out.println(element);
        // }
        // int i = 0; //initializing loop variable
        // while(i<arr.length){ //displaying using while-loop 
        //     System.out.println(arr[i]);
        //     i++;
        // }

        // for(int i=0;i<4;i++){
        //     System.out.println(arr[i]);
        // }
        // System.out.println("The length of array is : "+arr.length);
    }
}
