package app;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            DataRepository dataRepository = new DataRepository();
            DataHandler handler = new DataHandler(dataRepository);
            UIOperator uiOperator = new UIOperator();

            dataRepository.setData(123, "e");
            dataRepository.setData(234, "dfg");
            dataRepository.setData(345, "dfg");
            dataRepository.setData(456, "f");
            dataRepository.setData(567, "asd");
            dataRepository.setData(678, "ASasdasDasd");
            dataRepository.setData(789, "fggfdg");

            uiOperator.getOutput(handler.getAll());

            uiOperator.getOutput(handler.getById(345));
            uiOperator.getOutput(handler.getById(678));
            uiOperator.getOutput(handler.getById(789));
            uiOperator.getOutput(handler.getById(7891));

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}