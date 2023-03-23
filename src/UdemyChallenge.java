public class UdemyChallenge {
    public static void main(String[] args) {



        System.out.println(shouldWakeUp(true, 4));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if(barking == false) {
            return  false;
        } else if (barking && (hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        } else if ( (hourOfDay > 22 || hourOfDay < 8) && (barking)) {
            return true;
        } else {
            return true;
        }
    }
}
