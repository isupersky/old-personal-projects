public class Trial {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Aakash");
        Employee obj2 = new Employee("Aakash");
        Employee obj3 = new Employee("Aayushi");
        String var1 = "AA";
        String var2 =new String("AA");
        int var3 = 123;
        int var4= 123;

//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
////        System.out.println();
//        System.out.println(obj1.equals(obj2));

        System.out.println(var1.hashCode());
        System.out.println(var2.hashCode());
    }
}


class Employee{
    String name;

    Employee(String name){
        this.name= name;
    }
}
