


class Employee {
    String name;
    int salary;

    void showInfo() {
        System.out.println(name);
        System.out.println(salary);
    }

    
    
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Golu Prasad";
        e1.salary = 23000;
        
        e2.name = "mohan singh";
        e2.salary = 34000;        
        
        e1.showInfo();
        e2.showInfo();
    }

   
}