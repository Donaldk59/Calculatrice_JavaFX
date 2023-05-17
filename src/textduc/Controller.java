package textduc;

import textduc.View;

class Controller {
    private Model model;
    private View view;

    public void setModel(Model model) {
        this.model = model;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void calculateSum() {
        int number1 = view.getNumber1();
        int number2 = view.getNumber2();

        model.setNumber1(number1);
        model.setNumber2(number2);

        model.calculateSum();

        view.setSum(model.getSum());
    }
}