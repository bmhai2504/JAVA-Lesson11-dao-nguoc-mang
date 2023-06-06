import java.util.Stack;

public class IntegerStack {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<Integer> tempIntegerStack = new Stack<>();
        for (int i = 1; i < 11; i++) {
            integerStack.push(i);
        }
        while (!integerStack.isEmpty()) {
            tempIntegerStack.push(integerStack.pop());
            if(integerStack.isEmpty()){
                break;
            }
        }
        System.out.println(tempIntegerStack);
    }
}