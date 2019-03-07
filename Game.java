import java.awt.*;
import javax.swing.JFrame;


/*

	Classe du jeu. Elle sert à executer le programme.
	Elle instancie une interface, et les différents véhicules

*/

class Game {


	// Informations sur l'interface
	int hauteur, largeur;
	Vehicule[] vehicules;
	GamePanel frame;
	static int hauteurEau;

	// Nombre de véhicule
	int nbVehicules;

	public Game(String nom, int hauteur, int largeur, Color couleurFond, int nbVehicules)
	{

		// On applique les différents paramètres
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.nbVehicules = nbVehicules;


		// On instancie nos véhicules
		this.vehicules = new Vehicule[this.nbVehicules];
		this.vehicules[0] = new Sous_Marin(300,200, 2.00, 40, 17, Color.red);
		this.vehicules[1] = new Bateau_Militaire(0,0, 2.00, 80, 30, Color.GREEN);



		// On instancie l'interface
		this.frame = new GamePanel(nom, 700, 700, couleurFond, this);
	}

	public static void main(String[] args)
	{

		// On crée le jeu
		Game jeu = new Game("Sous Marin", 500, 500, Color.blue, 2);

		// On le fait tourner
		jeu.run();

	}


	/*

		Le code du jeu.
		Ici, on appelle toutes les fonctions necessaire au bon fonctionnement du jeu
	*/
	public void run(){
		while(true){
			try{Thread.sleep(50);}catch(InterruptedException e){}

			// On fait bouger tous les véhicules
			for(int i = 0; i < this.nbVehicules; i++)
			{
				this.vehicules[i].move();
			}

			// On redessine tout
			this.frame.repaint();
		}
	}


	// Renvoie un tableau de Dispayable
	Displayable[] getDisplayables(){
		return this.vehicules;
	}
}
