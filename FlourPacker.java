public class FlourPacker {
    
    /*
     *
     * bigCount = 5lbs of flour
     * smallCount = 1lb of flour
     * goal = total amount of flour to pack.
     *
     * With the given params, is it possible to
     * pack the correct amount of flour?
     *
     */
  
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        
        int smallCountNeeded = goal % 5;
        int bigCountNeeded = goal / 5;
        
        smallCount -= smallCountNeeded;
        bigCount += (smallCount / 5);
        bigCount -= bigCountNeeded;
        
        if (smallCount >= 0 &&  bigCount >= 0) {
            return true;
        }
        return false;
    }
}
