public class WhileLoopDemo {
    public static void main(String[] args) {
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("running");
            double random = Math.random()*10;

            if (random<5){
                shouldContinue = false;
            }
            System.out.println(random);

            }
        }
    }