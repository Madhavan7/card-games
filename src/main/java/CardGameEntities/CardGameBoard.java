package CardGameEntities;

import java.util.Random;

public abstract class CardGameBoard implements Shuffle {
    protected Card[] deck = new Card[52];
    protected Random shuffler = new Random();
    public CardGameBoard(){
        for(int i = 0; i < 52; i ++){
            deck[i] = new Card(i);
        }
        this.shuffle();
    }
    public void shuffle(){
        for(int i = 0; i < 52; i ++){
            Card x = deck[i];
            int j = shuffler.nextInt(52);
                deck[i] = deck[j];
                deck[j] = x;
        }
    }
}
