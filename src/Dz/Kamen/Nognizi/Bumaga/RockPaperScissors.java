package Dz.Kamen.Nognizi.Bumaga;

public class RockPaperScissors {
    private Computer computer;
    private User user;
    private int userScore;
    private int computerScore;
    private int numberOfGames;
    public RockPaperScissors(){
        computer = new Computer();
        user = new User();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;

    }
    public void startGame(){
        System.out.println("КАМЕНЬ, НОЖНИЦЫ, БУМАГА!");
        Muve userMove = user.getMove();
        Muve computerMove = computer.getMuve();
        System.out.println("\nВаш ход  " + userMove + ".");
        System.out.println("Ход компьютера  " + computerMove + ".\n");

    }

    public static void main(String[] args) {

            RockPaperScissors rockPaperScissors = new RockPaperScissors();
            rockPaperScissors.startGame();

    }
}
