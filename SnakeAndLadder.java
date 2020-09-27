public class SnakeAndLadder{
	public static void main(String[] args) {
		int start = 0;
		int check = (int)Math.floor(Math.random()*10)%6;
		
		System.out.println("Player1 starts at " + start);
		System.out.println("Player1 starts by rolling " + check);
	}
}