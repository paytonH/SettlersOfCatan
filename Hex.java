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
			g.setColor(new Color(0,100,0));
		}
		if(type == Resource.Brick) {
			g.setColor(new Color(204,0,0));
		}
		if(type == Resource.Sheep) {
			g.setColor(new Color(0,255,0));
		}
		if(type == Resource.Wheat) {
			g.setColor(new Color(204,204,0));
		}
		if(type == Resource.Rock) {
			g.setColor(new Color(96,96,96));
		}
		g.fillPolygon(xPoints, yPoints, 6);
	}

}
