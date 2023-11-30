package Utilities;


 public class Calculator {

    Double firstNumber;
    Double secondNumber;

    Calculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
}
public static double subtract(double firstNumber, double secondNumber) {
    return firstNumber - secondNumber;

}
public static double divide(double firstNumber, double secondNumber) {
    return firstNumber / secondNumber;
}
public static double multiply(double firstNumber, double secondNumber){
    return firstNumber * secondNumber;
}

}