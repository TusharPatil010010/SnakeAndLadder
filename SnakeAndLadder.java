public class SnakeAndLadder{
	

	static final int max = 100;
	static final int min = 0;
	static int total_count = 0;
	
	//function to find new position
	public static int dice_throw(int position) {
		total_count++;												//counting overall dice rolls
		int num = (int)Math.floor(Math.random() * 10) % 6 + 1 ;
		System.out.println("Number on dice : "+num);
		
		//checking which option we got
		int check = (int)Math.floor(Math.random() * 10) % 3;
		
		switch(check) {
		case 1:
			System.out.println("You got the snake.");
			System.out.println();
			position -= num;
			break;
		case 2:
			System.out.println("You got the ladder.");
			System.out.println();
			position += num;
			position = dice_throw(position);							//If player gets ladder, plays again
			break;
		default:
			System.out.println("Stay on the same position");
			System.out.println();
			break;
		}
		//reseting position if becomes less than min
		if(position < min) {
			position = min;
		}
		//if goes above 100 then initial position
		if(position > max) {
			position -= num;
		}
		
		return position;
	}	
	
	public static void main(String[] args) {
		//constants
		int player1_num = 0;
		int player2_num = 1;
		 
		//variables
		int p1_pos = 0;
		int p2_pos = 0;
		
		int roll = (int)Math.floor(Math.random() * 10) % 2;
		//throwing a dice
		while(p1_pos != max && p2_pos != max) {
			if(roll%2 == player1_num) {
				System.out.println("Player 1 playing.....");
				p1_pos = dice_throw(p1_pos);
			}
			
			if(roll%2 == player2_num) {
				System.out.println("Player 2 playing.....");
				p2_pos = dice_throw(p2_pos);
			}
			
			System.out.println("Player1 is at "+p1_pos);

			System.out.println("Player2 is at "+p2_pos);
			System.out.println();
			System.out.println();
			roll++;
		}
		if(p1_pos == max)	System.out.println("Player1 won");
		else	System.out.println("Player2 won");
		System.out.println("Number of dice rolls required to win the game : "+total_count);
	}
}