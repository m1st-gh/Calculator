import java.util.Stack;

public class Expression {

    Stack<String> stack;

    public Expression(){

        stack = new Stack<>();

    }

    public double solve(){

        double num = 0;

        while (!stack.isEmpty()){

            if(isDigit(stack.peek())){
                 num = Double.parseDouble(stack.pop());
            }
            else{
                switch (stack.pop()){
                    case "+":
                        num += Double.parseDouble(stack.pop());
                        break;
                    case "-":
                        num -= Double.parseDouble(stack.pop());
                        break;
                    case "*":
                        num *= Double.parseDouble(stack.pop());
                        break;
                    case "/":
                        if(Double.parseDouble(stack.pop()) > 0){
                            num /= Double.parseDouble(stack.pop());
                        }
                        else{
                            throw new ArithmeticException();
                        }
                }
            }

        }
        stack.push(String.valueOf(num));
        return num;
    }

    public void clear(){
        stack.clear();
    }

    public boolean push(String i){
        stack.push(i);
        if (stack.size() == 3){
            solve();
            return true;
        }
        return false;
    }

    public boolean isDigit(String string){
        try {
            double d = Double.parseDouble(string);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
