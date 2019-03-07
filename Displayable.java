import java.awt.Graphics;
import java.awt.Color;

class Displayable{
  int[] posX, posY;
  Color couleur;

  Displayable(int[] x, int[] y, Color c){
    this.posX = x; this.posY = y;
    this.couleur = c;
    for(int i = 0; i < x.length; i++)
    {
      System.out.print("posX[" + i + "] = " + x[i]);
      System.out.print(" | posY[" + i + "] = " + y[i]);
      System.out.println("");
    }
  }


  void paint(Graphics g){

    /*for(int i = 0; i < posX.length; i++)
    {
      System.out.print("PAINT posX[" + i + "] = " + posX[i]);
      System.out.print(" | posY[" + i + "] = " + posY[i]);
      System.out.println("");
    }*/

		g.setColor(this.couleur);
    //g.fillOval(this.posX[0], this.posY[0], 10, 10);
    g.fillPolygon(this.posX, this.posY, this.posX.length);
  }
}
