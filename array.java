import java.util.Scanner;


public class gameoflife {

	/**This method allows the user to control and view the generations*/
		public static void method(int turn, String[][] board, int width) {
			
			turn++;
			System.out.println("This is turn: " + turn);
			System.out.println("Enter y to start the next generation.");
			Scanner input = new Scanner(System.in);
			String move = input.next();
			if (move.equals("y")) {
			print(turn, board, width);
			};
			
		}
		
		/**This method prints and manages the board*/
		public static void print(int turn, String[][] board, int width) {
			
			int[][] map = 
					{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
			
		for(int i = 0; i < width; i++) {		
				for(int j = 0; j < width; j++) {
				System.out.print("[" + board[i][j] + "]");
						for(int q = -1; q < 2; q++) {
							for(int w = -1; w < 2; w++) {
								
						int e = i + q;
						int r = j + w;
						
						if (board[(i)][(j)].equals("X") && (e > -1) && (r > -1) && (e < width) && (r < width)){
							map[e][r]++;
						}
							}
						}
						if (board[(i)][(j)].equals("X")) {
							map[i][j]--;
						}
			}
				System.out.println();
			}
		
		System.out.println();
		for(int i = 0; i < width; i++) {
			
			for(int j = 0; j < width; j++) {

			if((map[i][j] != 3) && (map[i][j] != 2)) {
				board[i][j] = ".";
			}else {
				if(map[i][j]== 3) {
					board[i][j] = "X";
			}else {
				if(map[i][j]== 2) {
					if(board[i][j].equals("X")) {
						board[i][j] = "X";
					}else {
						board[i][j] = ".";
					}
			}
			}
			}
			}
			System.out.println("");

		}

     method(turn, board, width);
		}

		
		
		/**This main controls the two aforementioned methods*/

		public static void main(String [] args) {
			
			
			
			
			
			String[][] board = {
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
					{".", "X", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "X", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "X", "X", ".", "X", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "X", ".", "X", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "X", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", "X", ".", "X", ".", ".", ".", ".", ".", ".", ".", "X", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", "X", ".", ".", ".", ".", ".", ".", "X", ".", ".", "."},
					{".", ".", ".", ".", ".", "X", ".", "X", "X", "X", ".", ".", ".", ".", ".", ".", "X", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", "X", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
					{".", ".", ".", ".", "X", "X", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", "X", ".", ".", ".", ".", "X", ".", ".", ".", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."},
					{".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."}};

			int turn = 0;
			int width = 20;

			method(turn, board, width);
			
		}
	
}
