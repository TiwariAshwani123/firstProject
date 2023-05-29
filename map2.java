import java.util.TreeMap;

class map2 {
    public static void main(String[] args) {
        TreeMap<Employee, Integer> x = new TreeMap<Employee, Integer>();
        
        x.put(new Employee("nobita", 8), 12000);
        x.put(new Employee("papita", 12), 34000);
        x.put(new Employee("ninjahathodi", 9), 9000);
        x.put(new Employee("doremon", 100), 100000);
        x.put(new Employee("shinchan", 14), 2000);

        System.out.println(x);
    }    
}

class Employee implements Comparable<Employee> {
    String name;
    Integer age;

    Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Employee obj) {
        return this.name.compareTo(obj.name);
    }
}



