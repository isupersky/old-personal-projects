package Java8InterfaceClassExamples;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<Integer, Long, Integer> refObject = (e1,e2)-> e1+Integer.parseInt(e2.toString());
        System.out.println(refObject.apply(100, 200l));

        Predicate<Integer> predicateRefObject = (e1)->{
          if(e1%2==0)
              return true;

          return false;

        };

        System.out.println(predicateRefObject.test(101));
        System.out.println(predicateRefObject.test(100));

        Predicate <String> predicateRefObject2 = (e1)->{
          if(e1.startsWith("no"))
              return true;

              return false;
        };
        System.out.println(predicateRefObject2.test("nope"));
    }
}
