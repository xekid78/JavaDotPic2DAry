/**
 *
 * @author xekid78
 *
 */
public class Dotpic2dary {

	public static void main(String[] args) {
		int[][] letterA =
            {{0,0,1,1,0,0},
             {0,1,0,0,1,0},
             {1,0,0,0,0,1},
             {1,1,1,1,1,1},
             {1,0,0,0,0,1},
             {1,0,0,0,0,1}};

		for (int[] line : letterA) {
			for (int dot : line) {
				if (dot == 1) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
