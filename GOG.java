// A Java Program to generate OTP (One Time Password) 
class GOG{ 

    // A Function to generate a unique OTP everytime 
    static String generateOTP(int len) 
    { 
        // All possible characters of my OTP 
        String str = "abcdefghijklmnopqrstuvwxyzABCD"
                +"EFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
        int n = str.length(); 
        System.out.println(n);
    
        // String to hold my OTP 
        String OTP=""; 
    
        for (int i = 1; i <= len; i++) 
            OTP += (str.charAt((int) ((Math.random()*10) % n))); 
    
        return(OTP); 
    } 
    
    // Driver code 
    public static void main(String[] args) 
    { 
    
        // Declare the length of OTP 
        int len = 6; 
        System.out.printf("Your OTP is - %s", generateOTP(len)); 
        
    } 
    } 
    
    // This code is contributed by PrinciRaj1992 
    