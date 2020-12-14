public class ComputerDemo {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        Computer comp2 = new Computer();

        comp1.year = 2020;
        comp1.price = 2500;
        comp1.hardDiskMemory = 1000000;
        comp1.freeMemory = 32000;
        comp1.operatingSystem = "Windows 10";

        comp2.year = 2019;
        comp2.price = 6500;
        comp2.hardDiskMemory = 512000;
        comp2.freeMemory = 160000;
        comp2.operatingSystem = "macOS";

        comp2.useMemory(100);
        comp1.changeOperationSystem("Linux");
        System.out.println(comp1);
        System.out.println(comp2);
    }
}
