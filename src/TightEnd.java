/**
 * Created by t-nich on 7/11/2017.
 */
public class TightEnd extends Player {
    private int[] receptions = new int[17];
    private int[] targets = new int[17];
    private int[] recYards = new int[17];
    private double[] YAC = new double[17];
    private int[] recTDs = new int[17];
    private int[] snaps = new int[17];

    public TightEnd(String firstName, String lastName, String team) {
        super(firstName, lastName, team);
    }
}
