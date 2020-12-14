public class GSM {
    String model;
    boolean hasSimCard = false;
    String simMobileNumber;
    double outgoingCallsDuration;
    String lastIncomingCall;
    String lastOutgoingCall;
    GSM callReceiver;
    Call callinfo = new Call();

    public void insertSimCard(String simNumber) {
        if (simNumber.startsWith("08") && simNumber.length() == 10) {
            hasSimCard = true;
            simMobileNumber = simNumber;
        } else {
            System.out.println(simNumber + " is not a valid phone number. Please provide correct phone number!");
            System.exit(0);
        }
    }

    public void removeSimCard() {
        hasSimCard = false;
    }

    public void call(GSM callReceiver, double duration) {
        if (duration > 0 && !callReceiver.simMobileNumber.equals(simMobileNumber) && hasSimCard && callReceiver.hasSimCard) {
            callReceiver.lastIncomingCall = simMobileNumber;
            lastOutgoingCall = callReceiver.simMobileNumber;
            outgoingCallsDuration += duration;
            callinfo.duration = duration;
        } else {
            System.out.println("Phone " + simMobileNumber + " has no sim card inserted");

        }
    }
    public void getSumForCall() {
        if (outgoingCallsDuration>0){
            System.out.println("Total sum of calls is " + Math.round(outgoingCallsDuration*callinfo.priceForAMinute*100.0)/100.0  + " leva");
        }else{
            System.out.println("No outgoing calls for number " + simMobileNumber);
        }

    }
    public void printInfoForTheLastOutgoingCall() {
        if (lastOutgoingCall != null) {
            System.out.println("last outgoing call for " + simMobileNumber + " is to number " + lastOutgoingCall + " with duration of " + callinfo.duration);
        } else {
            System.out.println("There are no outgoing calls for number " + simMobileNumber);
        }

    }

    public void printInfoForTheLastIncomingCall() {
        if (lastIncomingCall != null) {
            System.out.println("last incoming call for " + simMobileNumber + " is to number " + lastIncomingCall + " with duration of " + callinfo.duration);
        } else {
            System.out.println("There are no incoming calls for number " + simMobileNumber);
        }
    }

    @Override
    public String toString() {
        return "GSM{" +
                "model='" + model + '\'' +
                ", hasSimCard=" + hasSimCard +
                ", simMobileNumber='" + simMobileNumber + '\'' +
                ", outgoingCallsDuration=" + outgoingCallsDuration +
                ", lastIncomingCall='" + lastIncomingCall + '\'' +
                ", lastOutgoingCall='" + lastOutgoingCall + '\'' +
                '}';
    }
}
