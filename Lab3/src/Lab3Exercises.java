import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame rafaelGonzalez = new JFrame("Hello, world!");
		rafaelGonzalez.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		rafaelGonzalez.setLocation(600, 275);
		rafaelGonzalez.setSize(200, 200);
		
        MyPanelClass myPanel = new MyPanelClass();
        rafaelGonzalez.getContentPane().add(myPanel);
        
		rafaelGonzalez.setVisible(true);
	}
}