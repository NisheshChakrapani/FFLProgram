/**
 * Created by t-nich on 7/11/2017.
 */
public class RunningBack extends Player {
    private int[] rushAttempts = new int[17];
    private int[] rushYards = new int[17];
    private int[] rushTDs = new int[17];
    private int[] fumbles = new int[17];
    private double[] ypc = new double[17];
    private int[] receptions = new int[17];
    private int[] targets = new int[17];
    private int[] recYards = new int[17];
    private double[] YAC = new double[17];
    private int[] recTDs = new int[17];
    private int[] snaps = new int[17];

    public RunningBack(String firstName, String lastName, String team) {
        super(firstName, lastName, team);
    }
}
