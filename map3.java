import java.util.Comparator;
import java.util.TreeMap;
import java.util.Scanner;

class map3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Press\n1 for NameAscSort\n2 for NameDscSort\n3 for AgeAscSort\n4 for AgeDscSort: ");

        int ui = sc.nextInt();

        Comparator<Employee> comp = null;

        if(ui == 1) {
            comp = new NameAscSort();
        } else if(ui == 2) {
            comp = new NameDscSort();
        } else if(ui == 3) {
            comp = new AgeAscSort();
        } else if(ui == 4) {
            comp = new AgeDscSort();
        } else { 
            System.out.println("Invalid Input...");
        }

        if(comp != null) {
            TreeMap<Employee, Integer> x = new TreeMap<Employee, Integer>(comp);
            
            x.put(new Employee("nobita", 8), 12000);
            x.put(new Employee("papita", 12), 34000);
            x.put(new Employee("ninjahathodi", 9), 9000);
            x.put(new Employee("doremon", 100), 100000);
            x.put(new Employee("shinchan", 14), 2000);
            x.put(new Employee("raju", 2), 20);
    
            System.out.println(x);
        }
    }    
}

class NameAscSort implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class NameDscSort implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o2.name.compareTo(o1.name);
    }
}


class AgeAscSort implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.age.compareTo(o2.age);
    }
}

class AgeDscSort implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o2.age.compareTo(o1.age);
    }
} 


class Employee {
    String name;
    Integer age;

    Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}