import java.awt.Graphics;

public class Board {
	private Hex[][] hexArr = new Hex[7][];

	public Board() {
		hexArr[0] = new Hex[4];
		hexArr[1] = new Hex[5];
		hexArr[2] = new Hex[6];
		hexArr[3] = new Hex[7];
		hexArr[4] = new Hex[6];
		hexArr[5] = new Hex[5];
		hexArr[6] = new Hex[4];
		
		for(int r = 0; r < hexArr.length; r++) {
			for(int c = 0; c < hexArr[r].length; c++) {
				
			}
		}
	}
	
	public void draw(Graphics g) {
		
	}

}

