
import java.util.Stack;

public class Ques8_alternative extends Stack<Integer> {
    
    Stack<Integer> min = new Stack<>();
    
    void push(int item) {
        
        if (isEmpty() == true) {
            super.push(item);
            min.push(item);
        } else {
            
            super.push(item);
            int y = min.pop();
            min.push(y);
            
            if (item < y) {
                
                min.push(item);
            } else
                min.push(y);
        }
    }
    
    public Integer pop() {
        
        int x = super.pop();
        min.pop();
        return x;
        
    }
    
    int getMin() {
        
        int x = min.pop();
        min.push(x);
        return x;
    }
    
    public static void main(String[] args) {
        Ques8_alternative stack = new Ques8_alternative();
        stack.push(100);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.getMin());
        stack.push(5);
        System.out.println(stack.getMin());
        
    }
}
