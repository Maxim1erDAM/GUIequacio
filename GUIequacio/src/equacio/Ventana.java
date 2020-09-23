package equacio;

import javax.swing. * ;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements ActionListener {
  /**
	 *
	 */
  private static final long serialVersionUID = 1L;

  @Override
  public void actionPerformed(final ActionEvent e) {

    //Valor de l'equació 1 
    //(a) a=-2, b=-4, c=3
    Grafica.Escena.paintSQRFunc(Grafica.Escena.getGraphics(), -0.2, -4, 3, -200, 200);
    
    //Valor de l'equació 2
    //(b) a=2 b= 2, c= -3
    Grafica.Escena.paintSQRFunc(Grafica.Escena.getGraphics(), 2, 2, -3, -200, 200);
    
    //Valor de l'equació 3
    //(c) a=-2,b= 4, c=0
    Grafica.Escena.paintSQRFunc(Grafica.Escena.getGraphics(), -2, 4, 0, -200, 200);

  }
}