package textduc;

class Model {
    private int number1;
    private int number2;
    private int sum;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void calculateSum() {
        sum = number1 + number2;
    }

    public int getSum() {
        return sum;
    }
}
