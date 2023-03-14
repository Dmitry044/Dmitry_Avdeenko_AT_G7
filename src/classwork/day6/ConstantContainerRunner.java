package classwork.day6;


public class ConstantContainerRunner {
    public void printColor(String color) {
        if (ConstantContainer.RED.equals(color)) {
            System.out.println(ConstantContainer.RED);
        } else if (ConstantContainer.BLUE.equals(color)) {
            System.out.println(ConstantContainer.BLUE);
        } else if (ConstantContainer.GREEN.equals(color)) {
            System.out.println(ConstantContainer.GREEN);
        } else if (ConstantContainer.YELLOW.equals(color)) {
            System.out.println(ConstantContainer.YELLOW);
        } else if (ConstantContainer.PURPLE.equals(color)) {
            System.out.println(ConstantContainer.PURPLE);
        }
    }
}
