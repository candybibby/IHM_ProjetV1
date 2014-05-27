package Main;
import javax.swing.*;
import java.awt.*;
import Vue.DessinFigures;

/**
 * Cette classe définit l'interface utilisateur et la méthode main.
 * @author Candy & Camille
 *
 */
public class Fenetre extends JFrame {

	
	
			// ATTRIBUTS
	
	/** Contenu de la fenêtre principale (JPanel) */
	private DessinFigures dessin;
	
	
			// CONSTRUCTEUR
	
	/**
	 * Constructer de la classe
	 * permettant de construire une fenetre avec une taille et un titre définit
	 * @param s - titre de la fenetre
	 * @param w - largeur de la fenetre
	 * @param h - hauteur de la fenetre
	 */
	public Fenetre(String s, int w, int h) {
		
	}
	
	
			// METHODE PRINCIPALE
	
	public static void main (String [] args){
		JFrame fenetre = new JFrame("Paint");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DessinFigures dessin = new DessinFigures();
		dessin.setPreferredSize(new Dimension(600,600));
		fenetre.setContentPane(dessin);
		fenetre.pack();
		fenetre.setVisible(true);
	}

}
