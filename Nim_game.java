public class NimGame {

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        NimGame game = new NimGame();
        
        System.out.println(game.canWinNim(1));  
        System.out.println(game.canWinNim(4));  
        System.out.println(game.canWinNim(7));  
        System.out.println(game.canWinNim(8));  
    }
}
