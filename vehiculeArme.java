import java.awt.Graphics;
import java.awt.Color;

abstract class vehiculeArme extends Vehicule{


	abstract void tirer();

	vehiculeArme(int[] posX, int[] posY, int longueur, int largeur, int vitesse, double angle, Color c)
	{
		super(posX, posY, longueur, largeur, vitesse, angle, c);
	}
}
