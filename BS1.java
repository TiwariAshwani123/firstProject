class BS1{
    public static void main(String[] args) {
        
        int [] a = {2,3,4,5,6,7,8,9,10};

        int ans = BinarySearch(a, 4);

        System.out.println("Index :" + ans);
        System.out.println("Value :" + a[ans]);
    }

    static int BinarySearch(int[] a , int target){

        int start = 0 ;
        int end = a.length;
        
        while(start <= end){
            
            int mid = (start + end) / 2;

            if(a[mid] == target ){
                return mid;
            }
            else if(a[mid] < target){
                start = mid + 1;
            }

            else{
                end  = mid - 1 ;
            }
        }

        return -1;
    }
}