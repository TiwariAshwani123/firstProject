class LS3{
    public static void main(String[] args){
        int arr[] = {34,64,2,75,74,42,6};

        System.out.println(recurLS(arr,0,74)); //giving the index of target number
    }

    static int recurLS(int arr[] , int index , int target){

        if(target == arr[index]){
            return index;
        }
        if(index == arr.length-1){
            return -1;
        }

        return recurLS(arr, index+1, target) ;
    }
}