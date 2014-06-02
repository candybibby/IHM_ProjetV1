package Main;
import javax.swing.*;
import java.awt.*;
import Vue.*;

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
		JFrame fe = new JFrame(s);
		fe.setPreferredSize(new Dimension(w,h));
		this.dessin = new DessinFigures();
	}
	
	
			// METHODE PRINCIPALE
	
	public static void main (String [] args){
		Fenetre fenetre = new Fenetre("Paint", 800,800);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel general = new JPanel();		//JPanel qui contient tout
		DessinFigures d = fenetre.dessin;		//JPanel dans lequel on dessine
		PanneauChoix choix = new PanneauChoix(d);	//JPanel où on choisit les options
		general.setPreferredSize(new Dimension(800,800));
		general.setLayout(new BorderLayout());
		general.add(choix, BorderLayout.NORTH);
		general.add(d, BorderLayout.CENTER);
		fenetre.setContentPane(general);
		fenetre.pack();
		fenetre.setVisible(true);
		
	}
}
