public class Main {
    public static void main(String[] args) {
        String City="Columbus";

        int zip = 43228;

        int[] dailyHighs = {32, 25, 27, 40, 45};

        int length = dailyHighs.length;

        int sum = 0;

        for (int i = 0; i < dailyHighs.length; i++) {
            sum += dailyHighs[i];
        }

        double average =  sum/ (double) dailyHighs.length;

        System.out.println("City: "+City+" Zip Code: "+ zip+" Average High Temperature: "+ average);
    }
}

