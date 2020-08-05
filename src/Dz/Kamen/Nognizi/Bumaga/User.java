package Dz.Kamen.Nognizi.Bumaga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    private BufferedReader bufferedReader;
    public User(){
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }
    public boolean playAgain(){
        String gou = null;
        System.out.print("Хотите сыграть еще раз? ");
        BufferedReader play = new BufferedReader(new InputStreamReader(System.in));
        try {
            gou = bufferedReader.readLine();
            gou = gou.toUpperCase();
            
        } catch (IOException e) {
            e.printStackTrace();
        }return gou.charAt(0) == 'Д';
    }
    public Muve getMove() {
        System.out.println("Камень, ножницы или бумага?");
        try {
            String userInput = bufferedReader.readLine();
            userInput = userInput.toUpperCase();
            char firstLetter = userInput.charAt(0);
            if (firstLetter == 'К' || firstLetter == 'Н' || firstLetter == 'Б') {
                {
                    switch (firstLetter) {
                        case 'К':
                            return Muve.Rock;
                        case 'Н':
                            return Muve.Scissors;
                        case 'Б':
                            return Muve.Paper;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return getMove();
    }
}
