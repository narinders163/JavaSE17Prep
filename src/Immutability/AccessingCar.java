package Immutability;

public class AccessingCar {
    public static void main(String[] args) {
        ImmutableClassCAR immutableClassCAR = new ImmutableClassCAR("jddsn","jndknd","jdncds","jhskja");

        String carClass = immutableClassCAR.getCarClass();
        System.out.println(carClass);
        ImmutableClassCAR immutableClassCAR1 = new ImmutableClassCAR("Honda","Accord","1.5L","EX-L");
        String carClass1 = immutableClassCAR1.getCarClass();
        System.out.println(carClass1);
    }
}
