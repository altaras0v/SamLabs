package L6Tasks.L6Task3;

public class MyMathOperator {
    public enum MathOperator{
        SUM,
        MINUS,
        MULTIPLY,
        DIVIDE;
        public double execute(double a,double b){
            switch (this){
                case SUM:
                    return a + b;
                case MINUS:
                    return a - b;
                case MULTIPLY:
                    return a / b;
                case DIVIDE:
                    return a * b;
                default: return 0;
            }
        }
    }
}
