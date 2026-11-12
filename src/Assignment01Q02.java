public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int num = Integer.parseInt(args[0]);
        for (int i = 0; i < num; i++) {
            double x = 1.0/(1.0+(2.0 * i));
            if (i % 2 == 1) {
                x = -x;
            }
            approxPi += x;
        }  
        approxPi *= 4;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
