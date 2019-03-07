import java.awt.*;
import javax.swing.*;

class GamePanel extends JFrame {

	int hauteur, largeur;
	String nom;
	Game jeu;
	Color couleurFond;

	public GamePanel(String nom, int hauteur, int largeur, Color couleurFond, Game jeu) {

		super(nom);
		this.jeu = jeu;
		this.couleurFond = couleurFond;
		this.setBackground(this.couleurFond);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(hauteur, largeur);
		this.setResizable(false);
		this.setVisible(true);
  }

  public void paint(Graphics gr){
		gr.setColor(this.couleurFond);
		gr.fillRect(0,0,this.getWidth(),this.getHeight());
		//System.out.println("paint frame " + this.getWidth() + " " + this.getHeight());
		Displayable[] t = this.jeu.getDisplayables();
		//System.out.println("Pos1 GamePanel: " + t[0].posX[0]);
		for(int i=0;i<t.length;i++) t[i].paint(gr);
	}

}
