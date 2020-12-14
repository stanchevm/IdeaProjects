public class Computer {
    int year;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    int freeMemory;
    String operatingSystem;

    public void changeOperationSystem(String newOperationSystem) {
        operatingSystem = newOperationSystem;
    }

    public void useMemory(int memory) {
            if (memory < 0) {
                memory *= -1;
            }
            if (memory > freeMemory) {
                System.out.println("Not enough free memory!");
            }else{
                freeMemory -=memory;
            }
        }

    @Override
    public String toString() {
        return "Computer{" +
                "year=" + year +
                ", price=" + price +
                ", isNotebook=" + isNotebook +
                ", hardDiskMemory=" + hardDiskMemory +
                ", freeMemory=" + freeMemory +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
