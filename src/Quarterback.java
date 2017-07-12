/**
 * Created by t-nich on 7/11/2017.
 */
public class Quarterback extends Player {
    int[] passYards = new int[17];
    private int[] passTDs = new int[17];
    private int[] interceptions = new int[17];
    private int gamesPlayed;
    private double[] qbRating = new double[17];
    private double[] completionPct = new double[17];
    private int[] sacks = new int[17];
    private int[] fumbles = new int[17];
    private int[] rushAttempts = new int[17];
    private int[] rushYards = new int[17];
    private int[] rushTDs = new int[17];

    public Quarterback(String firstName, String lastName, String team) {
        super(firstName, lastName, team);
    }
}
