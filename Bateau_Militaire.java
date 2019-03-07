import java.awt.*;
import javax.swing.*;
import java.util.*;

class Bateau_Militaire extends Vehicule {

	int munitions;

  // Compte le nombre d'execution de pas
  // Utilisé pour générer une trajectoire
  int nbPas;



	Bateau_Militaire(int x, int y, double angle, int longueur, int largeur, Color C)
	{
		// On appelle le superconstructeur avec un tableau de points X, Y afin de créer notre sous marin
		super(initPosX(x, angle, 2*Math.PI*0.45, longueur, largeur), initPosY(y, angle, 2*Math.PI*0.45, longueur, largeur), longueur, largeur, 5, angle, C);
		this.couleur = C;
		this.posX = new int[5];
		this.posY = new int[5];
    this.direction = 2*Math.PI*0.45;
    System.out.println("Direction: " + this.direction);

		// Génère les différents points
		this.posX = initPosX(x, angle, this.direction, longueur, largeur);
		this.posY = initPosY(y, angle, this.direction, longueur, largeur);

		// On attribue X munitions au sous_marin
		this.munitions = 5;
	}



	/*
		Fonction qui fait bouger le sous marin
		Aucun retour
	*/
	public void move()
	{
		int x, y;

    // On récupère la position du bateau
    x = this.posX[0];
    y = this.posY[0];

    // On incrémente la position de 1
    x += 5;
    y += 5;

    // On change l'angle
    Random r = new Random();

    this.angle += 0.1;
    if(this.angle >= 2*Math.PI) this.angle = 0.01;

    // Génère les différents points
		this.posX = initPosX(x, angle, this.direction, longueur, largeur);
		this.posY = initPosY(y, angle, this.direction, longueur, largeur);

	}


	/*
		Fonction qui fait tirer le sous marin
		Aucun retour
	*/
	void tirer()
	{
	}


	/*
		Fonction qui vérifie si il y a des collisions avec le sous marin
		Aucun retour
	*/
	public void checkCollision()
	{
	}


}
