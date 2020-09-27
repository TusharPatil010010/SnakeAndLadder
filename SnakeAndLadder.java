public class SnakeAndLadder{
		public static void main(String[] args)
		{   
		       int pos=0;
                       int dice;
                       int option;

                       dice = (int)( Math.floor(Math.random()*5) + 1);
                       option=(int)Math.floor(Math.random()*2);

		            switch(option) {
		                
		                case 0:                 //No Play
		                System.out.println("No play");
		                break;
		                
		                case 1:                 //Ladder
		                System.out.println("It's a ladder " + pos);
				pos =+ dice;
		                break;
		                
		                case 2 :                //Snake
		                System.out.println("It's a snake " + pos);
				pos =- dice;
		                break;
		             }
             
		}

}