import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        Stack <String> stringStack = new Stack<>();
        String s = "Minh Hai";
        String stringTemp = "";
        for (int i = 0; i < s.length(); i++){
            stringStack.push(String.valueOf(s.charAt(i)));
        }

        for(int i = 0, n = stringStack.size(); i < n; i++){
            stringTemp += stringStack.pop();
        }
        System.out.println(stringTemp);

    }
}
