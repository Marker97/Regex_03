public class Main {
    public static void main(String[] args) {
        String s3 = "are you able to climb, are you able to swim or are you able to fly?";
        String s4 = s3.replaceAll("(.are) " , "_XYZ ");
        System.out.println(s4);
    }
}