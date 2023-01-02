package CardGameEntities;

public class Card {
    public int number;
    public String type;
    public Card(int number, String type){
        this.number = number;
        this.type = type;
    }
    public Card(int number){
        int x = (int) Math.floor(number / 13);
        int y = number %13;
        switch(x){
            case 0:
                this.number = y;
                this.type = "C";
                break;
            case 1:
                this.number = y;
                this.type = "D";
                break;
            case 2:
                this.number = y;
                this.type = "S";
                break;
            case 3:
                this.number = y;
                this.type = "H";
                break;
        }
    }
}
