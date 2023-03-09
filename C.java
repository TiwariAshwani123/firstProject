class A{
    A(){
        System.out.println("noob");
    }
}

abstract class B extends A{
    B(){
        System.out.println("dhruv");
    }
}

class B1 extends B{
    B1(){
        System.out.println("Ash");
    }
}

class C{
    public static void main(String[] args){
        B1 x = new B1();
    }
}