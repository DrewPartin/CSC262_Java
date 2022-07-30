import java.text.DecimalFormat;
import java.util.Random;

public class CrapsStats {
    private Random randomNumbers = new Random();
    private enum Status { CONTINUE, WON, LOST };
    private final static int SNAKE_EYES = 2;
    private final static int TREY = 3;
    private final static int SEVEN = 7;
    private final static int YO_LEVEN = 11;
    private final static int BOX_CARS = 12;

    // arrays to hold the number of wins/losses for the first 20 rolls
    private static int[] winsFirst20 = new int[20];
    private static int[] lossesFirst20 = new int[20];
    private static int winsAfter20 = 0;
    private static int lossesAfter20 = 0;

    // variables to hold the total number of wins and losses for all rolls
    private static int totalWins = 0;
    private static int totalLosses = 0;
    private static int totalGames = 0;
    private static int totalRolls = 0;

    public void Play() {
        int myPoint = 0;
        Status gameStatus;
        int roll = 1;
        int sumOfDice = rollDice();

        switch ( sumOfDice ) 
        {
            case SEVEN: 
            case YO_LEVEN:            
                gameStatus = Status.WON;
                winsFirst20[0]++;
                totalWins++;
                totalGames++;
                totalRolls += roll;
                break;
            case SNAKE_EYES: 
            case TREY: 
            case BOX_CARS: 
                gameStatus = Status.LOST;
                lossesFirst20[0]++;
                totalLosses++;
                totalGames++;
                totalRolls += roll;
                break;
            default:         
                gameStatus = Status.CONTINUE; 
                myPoint = sumOfDice; 
                roll++;
                break; 
        }
        
        while ( gameStatus == Status.CONTINUE ) 
        { 
            sumOfDice = rollDice();

            if ( sumOfDice == myPoint ) {
                gameStatus = Status.WON;
                if ( roll <= 20 ) {
                    winsFirst20[roll - 1]++;
                    totalWins++;
                    totalGames++;
                    totalRolls += roll;
                } else if ( roll > 20 ) {
                    totalWins++;
                    winsAfter20++;
                    totalGames++;
                    totalRolls += roll;
                }
            }
            else if ( sumOfDice == SEVEN ) { 
                gameStatus = Status.LOST;
                if ( roll <= 20 ) {
                    lossesFirst20[roll - 1]++;
                    totalLosses++;
                    totalGames++;
                    totalRolls += roll;
                } else if ( roll > 20 ) {
                    totalLosses++;
                    lossesAfter20++;
                    totalGames++;
                    totalRolls += roll;
                }
            }  
            else { 
                gameStatus = Status.CONTINUE; 
                myPoint = sumOfDice; 
                roll++;
            }  
        }             
    } 
    
    public int rollDice() {
        int die1 = randomNumbers.nextInt(6) + 1;
        int die2 = randomNumbers.nextInt(6) + 1;
        int sum = die1 + die2;
        return sum;
    }

    public void printStats() {
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\nStatistics for " + totalGames + " games of Craps:\n");
        System.out.println("Total wins: " + totalWins);
        System.out.println("Total losses: " + totalLosses);
        System.out.println("Chance of winning: " + df.format((double)totalWins / totalGames * 100) + "%");
        System.out.println("Average number of rolls per game: " + df.format((double)totalRolls / totalGames));
        System.out.println("\nWins on first roll: " + winsFirst20[0]);
        System.out.println("Wins on second roll: " + winsFirst20[1]);
        System.out.println("Wins on third roll: " + winsFirst20[2]);
        System.out.println("Wins on fourth roll: " + winsFirst20[3]);
        System.out.println("Wins on fifth roll: " + winsFirst20[4]);
        System.out.println("Wins on sixth roll: " + winsFirst20[5]);
        System.out.println("Wins on seventh roll: " + winsFirst20[6]);
        System.out.println("Wins on eighth roll: " + winsFirst20[7]);
        System.out.println("Wins on ninth roll: " + winsFirst20[8]);
        System.out.println("Wins on tenth roll: " + winsFirst20[9]);
        System.out.println("Wins on eleventh roll: " + winsFirst20[10]);
        System.out.println("Wins on twelfth roll: " + winsFirst20[11]);
        System.out.println("Wins on thirteenth roll: " + winsFirst20[12]);
        System.out.println("Wins on fourteenth roll: " + winsFirst20[13]);
        System.out.println("Wins on fifteenth roll: " + winsFirst20[14]);
        System.out.println("Wins on sixteenth roll: " + winsFirst20[15]);
        System.out.println("Wins on seventeenth roll: " + winsFirst20[16]);
        System.out.println("Wins on eighteenth roll: " + winsFirst20[17]);
        System.out.println("Wins on nineteenth roll: " + winsFirst20[18]);
        System.out.println("Wins on twentieth roll: " + winsFirst20[19]);
        System.out.println("Total wins in first 20 rolls: " + (winsFirst20[0] + winsFirst20[1] + winsFirst20[2] + winsFirst20[3] + winsFirst20[4] + winsFirst20[5] + winsFirst20[6] + winsFirst20[7] + winsFirst20[8] + winsFirst20[9] + winsFirst20[10] + winsFirst20[11] + winsFirst20[12] + winsFirst20[13] + winsFirst20[14] + winsFirst20[15] + winsFirst20[16] + winsFirst20[17] + winsFirst20[18] + winsFirst20[19]));
        System.out.println("Total wins after twentieth roll: " + winsAfter20);
        System.out.println("\nLosses on first roll: " + lossesFirst20[0]);
        System.out.println("Losses on second roll: " + lossesFirst20[1]);
        System.out.println("Losses on third roll: " + lossesFirst20[2]);
        System.out.println("Losses on fourth roll: " + lossesFirst20[3]);
        System.out.println("Losses on fifth roll: " + lossesFirst20[4]);
        System.out.println("Losses on sixth roll: " + lossesFirst20[5]);
        System.out.println("Losses on seventh roll: " + lossesFirst20[6]);
        System.out.println("Losses on eighth roll: " + lossesFirst20[7]);
        System.out.println("Losses on ninth roll: " + lossesFirst20[8]);
        System.out.println("Losses on tenth roll: " + lossesFirst20[9]);
        System.out.println("Losses on eleventh roll: " + lossesFirst20[10]);
        System.out.println("Losses on twelfth roll: " + lossesFirst20[11]);
        System.out.println("Losses on thirteenth roll: " + lossesFirst20[12]);
        System.out.println("Losses on fourteenth roll: " + lossesFirst20[13]);
        System.out.println("Losses on fifteenth roll: " + lossesFirst20[14]);
        System.out.println("Losses on sixteenth roll: " + lossesFirst20[15]);
        System.out.println("Losses on seventeenth roll: " + lossesFirst20[16]);
        System.out.println("Losses on eighteenth roll: " + lossesFirst20[17]);
        System.out.println("Losses on nineteenth roll: " + lossesFirst20[18]);
        System.out.println("Losses on twentieth roll: " + lossesFirst20[19]);
        System.out.println("Total losses in first 20 rolls: " + (lossesFirst20[0] + lossesFirst20[1] + lossesFirst20[2] + lossesFirst20[3] + lossesFirst20[4] + lossesFirst20[5] + lossesFirst20[6] + lossesFirst20[7] + lossesFirst20[8] + lossesFirst20[9] + lossesFirst20[10] + lossesFirst20[11] + lossesFirst20[12] + lossesFirst20[13] + lossesFirst20[14] + lossesFirst20[15] + lossesFirst20[16] + lossesFirst20[17] + lossesFirst20[18] + lossesFirst20[19]));
        System.out.println("Total losses after twentieth roll: " + lossesAfter20);
        System.out.println("\nChance to win on first roll: " + df.format((double)winsFirst20[0] / totalGames * 100) + "%");
        System.out.println("Chance to win on second roll: " + df.format((double)winsFirst20[1] / totalGames * 100) + "%");
        System.out.println("Chance to win on third roll: " + df.format((double)winsFirst20[2] / totalGames * 100) + "%");
        System.out.println("Chance to win on fourth roll: " + df.format((double)winsFirst20[3] / totalGames * 100) + "%");
        System.out.println("Chance to win on fifth roll: " + df.format((double)winsFirst20[4] / totalGames * 100) + "%");
        System.out.println("Chance to win on sixth roll: " + df.format((double)winsFirst20[5] / totalGames * 100) + "%");
        System.out.println("Chance to win on seventh roll: " + df.format((double)winsFirst20[6] / totalGames * 100) + "%");
        System.out.println("Chance to win on eighth roll: " + df.format((double)winsFirst20[7] / totalGames * 100) + "%");
        System.out.println("Chance to win on ninth roll: " + df.format((double)winsFirst20[8] / totalGames * 100) + "%");
        System.out.println("Chance to win on tenth roll: " + df.format((double)winsFirst20[9] / totalGames * 100) + "%");
        System.out.println("Chance to win on eleventh roll: " + df.format((double)winsFirst20[10] / totalGames * 100) + "%");
        System.out.println("Chance to win on twelfth roll: " + df.format((double)winsFirst20[11] / totalGames * 100) + "%");
        System.out.println("Chance to win on thirteenth roll: " + df.format((double)winsFirst20[12] / totalGames * 100) + "%");
        System.out.println("Chance to win on fourteenth roll: " + df.format((double)winsFirst20[13] / totalGames * 100) + "%");
        System.out.println("Chance to win on fifteenth roll: " + df.format((double)winsFirst20[14] / totalGames * 100) + "%");
        System.out.println("Chance to win on sixteenth roll: " + df.format((double)winsFirst20[15] / totalGames * 100) + "%");
        System.out.println("Chance to win on seventeenth roll: " + df.format((double)winsFirst20[16] / totalGames * 100) + "%");
        System.out.println("Chance to win on eighteenth roll: " + df.format((double)winsFirst20[17] / totalGames * 100) + "%");
        System.out.println("Chance to win on nineteenth roll: " + df.format((double)winsFirst20[18] / totalGames * 100) + "%");
        System.out.println("Chance to win on twentieth roll: " + df.format((double)winsFirst20[19] / totalGames * 100) + "%\n");

    }
}