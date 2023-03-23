public class FirstChallenge {
    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double myWorkToWithNumber = ((firstDouble + secondDouble) * 100.00d ) % 23.00d;
        boolean isDivided = (myWorkToWithNumber == 0.0) ? true : false;
        System.out.println((isDivided));
        if (!isDivided) {
            System.out.println("got some reminder");
        }
    }
}
