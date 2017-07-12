/**
 * Created by t-nich on 7/11/2017.
 */
public class DST extends Player {
    private int[] pointsAllowed = new int[17];
    private int[] passYardsAllowed = new int[17];
    private int[] rushYardsAllowed = new int[17];
    private int[] interceptions = new int[17];
    private int[] sacks = new int[17];
    private int[] touchdowns = new int[17];
    private int[] forcedFumbles = new int[17];
    private int[] fumblesRecovered = new int[17];
    private int[] kicksBlocked = new int[17];
    private int[] safeties = new int[17];

    public DST(String firstName, String lastName, String team) {
        super(firstName, lastName, team);
    }
}
