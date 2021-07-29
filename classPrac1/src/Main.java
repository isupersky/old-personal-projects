import packageTest.*;

import java.lang.reflect.Array;

public class Main {

    public static void main(String args[]) {
        System.out.println("Hello world");

        String a ="Abc";
        String b  = new String("Abc");
        if(a==b){
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
//        notMain.example= 200;
//        notMain nm = new notMain();
//        nm.main2();
//        System.out.println(packageTestClass.abc);

        StringBuilder sb = new StringBuilder("Abc");
        StringBuilder sb1 = new StringBuilder("Abc");

        System.out.println(sb.toString().hashCode());
        System.out.println(sb1.toString().hashCode());

    }
}
class notMain{
    int example = 100;
    void main2(){
//        System.out.println(Integer.toBinaryString(example));
//        int abc =Integer.parseInt(Integer.toBinaryString(example << 1),2);
//        System.out.println(abc);
//        outer:
//        for(int i =0; i<10;i++){
//            inner:
//            for(int j = 0;j<10;j++){
//                if(i+j>=10){
//                    System.out.println(i+j);
//                    break outer;
//                }
//                else{
//                    System.out.println(i+j+"-->");
////                    continue inner;
//                }
//            }
//        }

//// Jagged Array  Example
//        int arr [][] = new int[2][];
//        arr[0]= new int[]{0, 1, 2, 3, 4, 5};
//        arr[1]=new int[]{0};


    }

 }