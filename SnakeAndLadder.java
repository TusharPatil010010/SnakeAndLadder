public class SnakeAndLadder{
	public static void main(String[] args) {

		final int max = 100;
		final int min = 0;
		int p1_pos = 0;
		
		while(p1_pos<max) {
			
			int num = (int)Math.floor(Math.random() * 10) % 6 + 1 ;
			System.out.println("Number on dice : "+num);
			
			int check = (int)Math.floor(Math.random() * 10) % 3; //checking the options
			
			switch(check) {
			case 0:
				System.out.println("No play");
			case 1:
				System.out.println("Snake, move backward "+num+" positions");
				p1_pos -= num;
				break;
			case 2:
				System.out.println("Ladder, move forward "+num+" positions");
				p1_pos += num;
				break;
			default:
				System.out.println("Stay at same position");
				break;
			}
			//reseting the position 
			if(p1_pos < min) {
				p1_pos = min;
			}
			
			System.out.println("Your current position is "+p1_pos);
		}
	}
}