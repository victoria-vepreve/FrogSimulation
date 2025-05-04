import java.util.Scanner;
public class FrogSimulation{
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance(){
        Scanner s = new Scanner(System.in);
        System.out.println("How far?");
        return s.nextInt();
    }
    public boolean simulate(){
        int frogDis = 0;
        for (int i = 0; i < maxHops; i++){
            int hop = hopDistance();
            frogDis += hop;
            if (frogDis >= goalDistance) return true;
            if (frogDis < 0) return false;
        }
        return false;
    }
    public double runSimulations(int num){
        int success = 0;
        for (int i = 0; i < num; i++){
            boolean sim = simulate();
            if (sim) success++;
        }
        return (double) success/num;
    }
}