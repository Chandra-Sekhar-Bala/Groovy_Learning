class Calculator{
    // addition
    def add(int... num){
        int sum = 0
        for(i in num){
            sum += i
        }
        return "Total sum is: " +sum
    }
    // multilication
    def multiply(int... num){
        int mul = 1
        for(i in num){
            mul *= i
        }
        return "Multipliation is: $mul"
    }
    // division
   def division(int a, int b) {
        try {
            return "Division of $a / $b is ${a / b}"
        } catch (ArithmeticException e) {
            return "Division by zero is not valid"
        }
   }

    // subtraction
    String subtract(int a, int b) {
        "Subtraction of $a - $b is ${a-b}"
    }

}
