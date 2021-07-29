package Java8InterfaceClassExamples;

interface Aakash{
    public void printMe();
}

public class FirstLambda {


    public static void main(String[] args) {
        Aakash obj = new Aakash() {
            @Override
            public void printMe() {
                System.out.println("Java8InterfaceExamples.Aakash Sinha");
            }
        };
        obj.printMe();
        Aakash obj2=()->{
            System.out.println("Java8InterfaceExamples.Aakash Says Hello!!");
        };

        obj2.printMe();
    }
}
