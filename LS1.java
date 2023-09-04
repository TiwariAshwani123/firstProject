class LS1{
    public static void main(String[] args) {

        int[] a = {23,43,73,543,64,26};

        int ans = LinearSearch( a , 64);

        System.out.println(ans);
    }

    static int LinearSearch(int a[] , int search ){
        
        if(a.length == 0){
            return -1;
        }

        for(int i=0 ; i<a.length ; i++){
            int element = a[i];

            if(element == search){
                return i;
            }
         
        }

        return 0;
    }
}