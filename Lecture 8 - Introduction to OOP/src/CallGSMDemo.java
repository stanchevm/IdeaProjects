public class CallGSMDemo {
    public static void main(String[] args) {
        GSM gsm1 = new GSM();
        GSM gsm2 = new GSM();
        GSM gsm3 = new GSM();
        GSM gsm4 = new GSM();

        gsm1.insertSimCard("0888111111");
        gsm2.insertSimCard("0888222222");
        gsm3.insertSimCard("0888333333");
        gsm4.insertSimCard("0888444444");
        gsm1.call(gsm2,18.87);
        gsm1.call(gsm4,8.15);
        gsm3.call(gsm1,3.15);
        gsm4.removeSimCard();
        gsm4.call(gsm2,5.01);

        System.out.println("Outgoing calls");
        gsm1.printInfoForTheLastOutgoingCall();
        gsm2.printInfoForTheLastOutgoingCall();
        gsm3.printInfoForTheLastOutgoingCall();
        gsm4.printInfoForTheLastOutgoingCall();
        System.out.println("");
        System.out.println("Incoming calls");
        gsm1.printInfoForTheLastIncomingCall();
        gsm2.printInfoForTheLastIncomingCall();
        gsm3.printInfoForTheLastIncomingCall();
        gsm4.printInfoForTheLastIncomingCall();
        System.out.println("");
        System.out.println("Sum for calls");
        gsm1.getSumForCall();
        gsm2.getSumForCall();
        gsm3.getSumForCall();
        gsm4.getSumForCall();
    }
}

