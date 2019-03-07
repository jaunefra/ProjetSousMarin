import java.awt.*;
import javax.swing.*;

class Sous_Marin extends Vehicule {

	int munitions;


	/*

		int x : Une position de départ
		int y : Une position de départ

		double angle : Un angle de départ
		int longueur : La longueur d'un sous marin
		int largeur : La largeur d'un sous marin

		Color C : La couleur du sous marin

		Ce constructeur permet de créer un Sous_Marin

	*/
	Sous_Marin(int x, int y, double angle, int longueur, int largeur, Color C)
	{
		// On appelle le superconstructeur avec un tableau de points X, Y afin de créer notre sous marin
		super(initPosX(x, angle, 0, longueur, largeur), initPosY(y, angle, 0, longueur, largeur), longueur, largeur, 5, angle, C);
		this.couleur = C;
		this.posX = new int[5];
		this.posY = new int[5];
		this.direction = 0;


		// Génère les différents points
		this.posX = initPosX(x, angle, 0, longueur, largeur);
		this.posY = initPosY(y, angle, 0, longueur, largeur);

		// On attribue X munitions au sous_marin
		this.munitions = 5;
	}



	/*
		Fonction qui fait bouger le sous marin
		Aucun retour
	*/
	public void move()
	{
		//System.out.println(this.posX[0]);
		// this.angle += 1;
		this.posX = initPosX(this.posX[0]+1, this.angle, 0, this.longueur, this.largeur);
	}


	public void plonger()
	{

		if(this.profondeur >= Game.hauteurEau)
			this.profondeur += 5;
	}

	public void remonter()
	{
		if(this.profondeur <= Game.hauteurEau)
			this.profondeur -= 5;
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
