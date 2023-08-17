class employee {

  String name;
  int age;
  Address addr;

  employee(String name, int age, Address addr) {
    this.name = name;
    this.age = age;
    this.addr = addr;
  }
}

class Address {

  String state;
  String district;

  Address(String state, String district) {
    this.state = state;
    this.district = district;
  }
}

class array1 {

  public static void main(String[] args) {
    employee[] e = {
      new employee("Ash", 21, new Address("MP", "jbp")),
      new employee("muchu", 34, new Address("UP", "kashi")),
      new employee("ashish", 43, new Address("HAR", "barodra")),
    };

    for (int i = 0; i < e.length; i++) {
      System.out.println( e[i].name + "-" + e[i].age + "-" + e[i].addr.state + "-" + e[i].addr.district );
    }
  }
}
