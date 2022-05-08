public class Flip_Coin {
    public static void main(String[] args) {
        System.out.println("How Many Times Coin Flipping ");
        int flipNo = Utility.getUserInteger();
        int heads = 0, tails = 0;
        double headsPercent=0, tailsPercent=0;
        for (int i=0; i<flipNo; i++){
            double randomNo = Utility.getRandomDouble(1);
            if (randomNo < 0.5)
                tails++;
            else
                heads++;
        }
        headsPercent = 100*heads/flipNo;
        tailsPercent = 100*tails/flipNo;
        System.out.println("No. of heads: "+heads+" No. of tails: "+tails+"\nheads %: "+headsPercent+" tails %: "+tailsPercent);
    }
}
