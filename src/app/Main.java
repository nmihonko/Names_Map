package app;

public class Main {

    public static void main(String[] args) {
        try {
            DataHandler handler = new DataHandler();
            UIOperator uiOperator = new UIOperator();

            handler.setData(123, "e");
            handler.setData(234, "dfg");
            handler.setData(345, "dfg");
            handler.setData(456, "f");
            handler.setData(567, "asd");
            handler.setData(678, "ASasdasDasd");
            handler.setData(789, "fggfdg");

            uiOperator.getOutput(handler.getAll());

            uiOperator.getOutput(handler.getById(345));
            uiOperator.getOutput(handler.getById(678));
            uiOperator.getOutput(handler.getById(789));
            uiOperator.getOutput(handler.getById(7891));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}