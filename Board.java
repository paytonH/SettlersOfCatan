
import java.awt.Graphics;

public class Board {
	private Hex[][] hexArr = new Hex[7][];

	public Board() {
		for(int i = 0;i < hexArr.length;i++) {
			hexArr[i] = new Hex[i+3];
			hexArr[6-i] = new Hex[i+3];
		}

		for(int r = 0; r < hexArr.length; r++) {
			for(int c = 0; c < hexArr[r].length; c++) {
				hexArr[r][c] = new Hex();
			}
		}
	}
	
	public void draw(Graphics g) {
		for(int r = 0; r < hexArr.length; r++) {
			for(int c = 0; c < hexArr[r].length; c++) {
				hexArr[r][c].draw(g);
			}
		}
	}

}
