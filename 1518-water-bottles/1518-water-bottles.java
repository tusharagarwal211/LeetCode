class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int numDrink = numBottles;
        int drinkBottles = 0;
        int remBottles = 0;
        
        while(numExchange <= numBottles) {
            drinkBottles = numBottles/numExchange;
            remBottles = numBottles%numExchange;
            numBottles = drinkBottles + remBottles;
            numDrink += drinkBottles;
        }
        
        return numDrink;
    }
}