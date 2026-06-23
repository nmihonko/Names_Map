package app;

public class UIOperator {

    public void getOutput(String output) {
        if (output == null) {
            throw new IllegalArgumentException("Output cannot be null");
        }
        System.out.println(output);
    }
}