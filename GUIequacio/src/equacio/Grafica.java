package equacio;

import javax.swing.JButton;
import java.awt. * ;

public class Grafica {
  //Important, l'escena ha de ser publica i estatica
  public static Escena Escena;

  public static void main(String[] args) {
    //Creant la finestra y l'escena de dibuix
    Ventana frame = new Ventana();

    frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);

    frame.setBounds(300, 300, 510, 600);

    frame.setLayout(new BorderLayout());

    Escena = new Escena();

    //Configuració del Botó
    JButton start = new JButton("Iniciar");

    start.addActionListener(frame);

    start.setText("Mostrar");

    //Borders al panel
    frame.add(Escena, BorderLayout.CENTER);

    frame.add(start, BorderLayout.SOUTH);

    frame.setVisible(true);
  }

}