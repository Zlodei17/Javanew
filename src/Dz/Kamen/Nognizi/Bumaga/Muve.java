package Dz.Kamen.Nognizi.Bumaga;

public enum Muve {
    Rock, Paper, Scissors;
    public int compareMoves(Muve ozerMuve){
        if (this==ozerMuve)
            return 0;
        switch (this){
            case Paper:return (ozerMuve == Rock? 1:-1);
            case Rock: return (ozerMuve == Scissors? 1:-1);
            case Scissors: return (ozerMuve == Paper? 1:-1);
        }
        return 0;
    }
}
