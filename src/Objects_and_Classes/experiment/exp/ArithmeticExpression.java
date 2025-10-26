package Objects_and_Classes.experiment.exp;

import java.util.Objects;
import java.util.Stack;

public class ArithmeticExpression {
    private String expr;
    private Stack<Integer> nums = new Stack<>();
    private Stack<String> op = new Stack<>();

    public ArithmeticExpression (String expr) {
        this.expr = expr;
    }

    public int getResult() {
        for (String ch : expr.split(" ")){
            if (!isOp(ch)){
                // parse num
                nums.push(Integer.parseInt(ch));
            } else {
                // parse op
                if (ch.equals(")")){
                    while (!op.isEmpty() && !Objects.equals(op.peek(), "(")){
                        int y = nums.pop();
                        nums.push(applyOp(y));
                    }
                    op.pop();
                    continue;
                }
                if (ch.equals("(")){
                    op.push(ch);
                    continue;
                }
                while (!op.isEmpty() && compare_op(ch) <= compare_op( op.peek())){
                    if (Objects.equals(op.peek(), "("))break;
                    int y = nums.pop();
                    nums.push(applyOp(y));
                }
                op.push(ch);

            }
        }
        while (!op.isEmpty()){
            int y = nums.pop();
            nums.push(applyOp(y));
        }
        return nums.pop();
    }

    private boolean isOp(String ch) {
        return Objects.equals(ch,"+") ||
                Objects.equals(ch,"-") ||
                Objects.equals(ch,"*") ||
                Objects.equals(ch,"/") ||
                Objects.equals(ch,"(") ||
                Objects.equals(ch,")");
    }


    private int applyOp(int y) {
        int x = nums.pop();
        String ch = op.pop();
        return switch (ch){
            case "*" -> x * y;
            case "/" ->x / y;
            case "-" -> x - y;
            case "+" -> x + y;
            default -> 0;
        };
    }

    private int compare_op(String x){
        if (x.equals("+") || x.equals("-"))return 1;
        if (x.equals("*")|| x.equals("/")) return 2;
        return 0;
    }

}
