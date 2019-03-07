import java.awt.Graphics;
import java.awt.Color;
abstract class Vehicule extends Displayable implements entite {

	int vitesse;
	int longueur, largeur;
	double angle;
	double direction;
	int profondeur;



	/*
		int 		x					: Un position de point de départ
		double  angle			: Un angle
		int 		longueur	: Une longueur
		int     largeur		: Largeur du bateau

		Cette fonction calcule grâce au point X les différents points necessaire afin de dessiner
		le bateau.

		Cette fonction renvoie un tableau de point
	*/

	static int[] initPosX(int x, double angle, double direction, int longueur, int largeur)
	{
		int[] posX;
		System.out.println("AngleX;" + angle);
		posX = new int[5];
		posX[0] = (int) (x + (Math.cos(direction)));
		posX[1] = (int) (posX[0] + longueur*Math.cos(angle));
		posX[3] = (int) (posX[1] - largeur*Math.cos(Math.PI/2 - angle));
		posX[4] = (int) (posX[0] - largeur*Math.cos(Math.PI/2 - angle));
		posX[2] = (int) ((posX[1] + posX[3]) / 2 + Math.cos(angle)*longueur/3);

		return posX;
	}


	/*
		int 		y					: Un position de point de départ
		double  angle			: Un angle
		int 		longueur	: Une longueur
		int     largeur		: Largeur du bateau

		Cette fonction calcule grâce au point Y les différents points necessaire afin de dessiner
		le bateau.

		Cette fonction renvoie un tableau de point
	*/
	static int[] initPosY(int y, double angle, double direction, int longueur, int largeur)
	{
		int[] posY;
		System.out.println("AngleY;" + angle);

		posY = new int[5];
		posY[0] = (int) (y + (Math.sin(direction)));
		posY[1] = (int) (posY[0] + longueur*Math.sin(angle));
		posY[3] = (int) (posY[1] + largeur*Math.sin(Math.PI/2 - angle));
		posY[4] = (int) (posY[0] + largeur*Math.sin(Math.PI/2 - angle));
		posY[2] = (int) ((posY[1] + posY[3]) / 2 + Math.sin(angle)*longueur/3);
		System.out.println("initPosY: " + posY[0]);


		return posY;
	}

	Vehicule(int[] posX, int[] posY, int longueur, int largeur, int vitesse, double angle, Color c)
	{
		super(posX, posY, c);
		this.longueur = longueur;
		this.largeur = largeur;
		this.angle = angle;
		this.vitesse = vitesse;
	}
}
