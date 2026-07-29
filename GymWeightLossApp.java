public class GymWeightLossApp {

    public static void main(String[] args) {

        double[] gym1 = {10, 20, 27};
        double[] gym2 = {22, 5, 20};
        double[] gym3 = {30, 20, 10};
        double[][] gyms = {gym1, gym2, gym3};
        String[] gymNames = {"GYM 1", "GYM 2", "GYM 3"};

        System.out.println("GYM WEIGHTLOSS APPLICATION");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\t\tMONTH 1\tMONTH 2\tMONTH 3\t| TOTAL\tAVG\tMIN\tMAX");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < gyms.length; i++) {

            double[] currentGym = gyms[i];

            double total = 0;
            for (int j = 0; j < currentGym.length; j++) {
                total = total + currentGym[j];
            }

            double average = total / currentGym.length;

            double min = currentGym[0];
            for (int j = 1; j < currentGym.length; j++) {
                if (currentGym[j] < min) {
                    min = currentGym[j];
                }
            }

            double max = currentGym[0];
            for (int j = 1; j < currentGym.length; j++) {
                if (currentGym[j] > max) {
                    max = currentGym[j];
                }
            }

            System.out.println(gymNames[i] + "\t" + currentGym[0] + "kg\t" + currentGym[1] + "kg\t"
                    + currentGym[2] + "kg\t| " + total + "kg\t" + average + "kg\t" + min + "kg\t" + max + "kg");
        }
    }
}