public class Call {
    double priceForAMinute = 0.19;
    double duration;
    String caller;
    String receiver;

    public void call(String receiver){
        System.out.println(receiver);
    }

    @Override
    public String toString() {
        return "Call{" +
                "priceForAMinute=" + priceForAMinute +
                ", duration=" + duration +
                ", caller='" + caller + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
}
