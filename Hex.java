import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Hex {
	public enum Resource{Wood, Brick, Sheep, Wheat, Rock}
	private Resource type;
	private int xLoc;
	private int yLoc;
	private int[] xPoints;
	private int[] yPoints;
	private int width;
	private int height;

	public Hex(Resource r, int x, int y, int w) {
		type = r;
		xLoc = x;
		yLoc = y;
		width = w;
		height = (int)(2*(width/Math.sqrt(3)));
		xPoints = new int[] {xLoc, xLoc + width/2, xLoc + width/2, xLoc, xLoc - width/2, xLoc - width/2};
		yPoints = new int[] {yLoc + height/2, yLoc + height/4, yLoc - height/4, yLoc - height/2, yLoc - height/4, yLoc + height/4};
	}

	public void draw(Graphics g) {
		if(type == Resource.Wood) {
			g.setColor(Color.GREEN);
		}
		if(type == Resource.Brick) {
			g.setColor(Color.RED);
		}
		if(type == Resource.Sheep) {
			g.setColor(c);
		}
		if(type == Resource.Wheat) {
			g.setColor(Color.GREEN);
		}
		if(type == Resource.Rock) {
			g.setColor(Color.GREEN);
		}
		
		g.fillPolygon(xPoints, yPoints, 6);
	}

}
