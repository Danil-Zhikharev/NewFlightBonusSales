package src.main;

public class BonusMilesService {
    int price;
    public int calculate(int price){
        int miles;
        miles = price / 20;
        return miles;
    }
}
