public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String arg: args){
            char str = arg.charAt(0);
            int ascii = (int) str;
            if ( ascii %5 == 0){
                System.out.println(str);
            }
        }
    }
}
