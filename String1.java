class String1 {
    public static void main(String[] args){
        String a = "vikramaditya";
        String b = "vikramaditya";

        System.out.println(a.length());

        System.out.println(a.charAt(2));
        
        System.out.println(a.isEmpty());
        
        System.out.println(a.lastIndexOf("y")); // It search from end of a string
        
        System.out.println(a.equals(b)); // checks inside the string
        
        System.out.println(a==b); // checks the variable equality
    }
}
