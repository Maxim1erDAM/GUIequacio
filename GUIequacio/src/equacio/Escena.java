package equacio;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Escena extends JPanel {

  /**
	 *
	 */
  private static final long serialVersionUID = 1L;
  private int llamada;

  public Escena() {
    init();

  }

  public void init() {
    //Color del borde de l'escena
    this.setBorder(BorderFactory.createLineBorder(Color.black));
  }

  @Override

  public void paintComponent(Graphics g) {

    super.paintComponent(g);

    int px2 = this.getWidth() / 2;
    int py2 = this.getHeight() / 2;
    int px = this.getWidth();
    int py = this.getHeight();

    //Es una creu feta per 4 liníes
    //Linea est blue
    g.setColor(Color.blue);

    g.drawLine(0, py2, px, py2);

    //Linea oest roja
    g.setColor(Color.red);

    g.drawLine(0, py2, px2, py2);

    //Linea sur roja
    g.setColor(Color.red);
    g.drawLine(px2, 0, px2, py);

    //Linea nord blava
    g.setColor(Color.blue);
    g.drawLine(px2, 0, px2, py2);

    //Separadors
    g.setColor(Color.black);
    for (int i = 0; i < px; i = i + 10) {
      g.drawLine(i, py2 - 2, i, py2 + 2);

      g.drawLine(px2 - 2, i, px2 + 2, i);

    }
  }

  // y= c*x2 +c*x +c

  public void paintSQRFunc(Graphics g, double x2mult,

  double x1mult, double cons, double x1, double x2)

  {

    //Depenent de les vegades que cridem a una equacio mostrará un color
    if (llamada == 0) {
      g.setColor(Color.red);

    }
    if (llamada == 1) {
      g.setColor(Color.green);

    }
    if (llamada == 2) {
      g.setColor(Color.yellow);

    }

    for (double i = x1; i < x2; i++)

    {

      double y = ((double) Math.pow(i, 2) * x2mult) + i * x1mult + cons;

      double xp = i + 1;

      double yp = ((double) Math.pow(xp, 2) * x2mult) + xp * x1mult + cons;

      g.drawLine((int) coord_x(i), (int) coord_y(y), (int) coord_x(xp), (int) coord_y(yp));

    }
    llamada += 1;

    //Depenent de les vegades que cridem a una equacio mostrará un color, 
    //si es major que 2 es restaurará a que la primera siga de color roig, la segona verd i la tercera groc al pulsar al botó
    if (llamada > 2) {
      g.setColor(Color.red);

      llamada = 0;
    }
  }

  private double coord_x(double x) {

    double real_x = x + this.getWidth() / 2;

    return real_x;

  }

  private double coord_y(double y)

  {

    double real_y = -y + this.getHeight() / 2;

    return (real_y);

  }

}