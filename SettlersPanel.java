import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class SettlersPanel extends JPanel {
	private final int PANEL_WIDTH = 800;
	private final int PANEL_HEIGHT = 600;
	private Hex h = new Hex(Hex.Resource.Wood, 400, 400, 50);
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Catan");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SettlersPanel());
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	public SettlersPanel() {
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		h.draw(g);
	}

}
