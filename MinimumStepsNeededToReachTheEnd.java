package Chapter2;

public class MinimumStepsNeededToReachTheEnd {
    public static void main(String[] args) {
        int []test1 = {3,3,1,0,2,0,1};
        System.out.println(minimumSteps(test1));
    }

    public static int minimumSteps(int []ar){
        int steps = 0;
        int reachSoFar = 0, lastIndex = ar.length - 1;
        for(int i = 0; i <= reachSoFar && reachSoFar < lastIndex;i++) {
            reachSoFar = Math.max(reachSoFar, i + ar[i]);
            steps += 1;
        }
        return steps;
    }
}
