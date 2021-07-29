package Java8InterfaceClassExamples;

@FunctionalInterface
interface CustomStringInterface{
    ConstructorReference concatCharacters(char [] charArray);

}
public class ConstructorReference {
    String xyz;
    ConstructorReference(char[] charArray){
        xyz = new String(charArray);
    }
//    char[] charList = {'a','b','c','d'};

    @Override
    public String toString() {
//        System.out.println(xyz);
        return xyz;
    }

    public static void main(String[] args) {
        char[] chars = {'a','b','c','d'};
        CustomStringInterface customStringInterface = ConstructorReference::new;
        System.out.println(customStringInterface.concatCharacters(chars));
    }
}

