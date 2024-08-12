class String3 {
    public static void main(String[] args) {
        String x = "mohan20ganesh78tinku23yamraj10vivek32";

        String[] y = x.split("\\d\\d");

        for(String a : y) {
            System.out.println(a);
        }
    }
} 