package Chapter5AndBefore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ozan",highScorePosition);

        highScorePosition= calculateHighScorePosition(1000);
        displayHighScorePosition("Ozan",highScorePosition);

        highScorePosition= calculateHighScorePosition(500);
        displayHighScorePosition("Ozan",highScorePosition);

        highScorePosition= calculateHighScorePosition(100);
        displayHighScorePosition("Ozan",highScorePosition);

        highScorePosition= calculateHighScorePosition(25);
        displayHighScorePosition("Ozan",highScorePosition);

    }

    public static void displayHighScorePosition(String playerName,int playerPosition ) {
        System.out.println(playerName +" managed to get into position "+playerPosition+" on the high score list");
    }

    public static  int calculateHighScorePosition(int playerScore) {
        int position =4;

        if (playerScore >= 1000){
            position =1;
        }else if(playerScore >=500 && playerScore <1000) {
            position =2;

        }else if(playerScore >=100 && playerScore <500) {
            position =3;
        } return position;

    }
}