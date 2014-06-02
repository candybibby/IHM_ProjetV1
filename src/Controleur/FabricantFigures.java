package Controleur;

import Vue.*;
import Modele.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * Classe implémentant la création de figures géométriques 
 * via des clics de souris
 * @author Candy & Camille
 *
 */
public class FabricantFigures implements MouseListener{
	
			// ATTRIBUTS
	
	/**Figure en cours de fabrication*/
	private FigureColoree figure_en_cours_de_fabrication;
	
	/** Accumule le nombre de clics de souris.*/
	private int	nb_points_cliques;
	
	/** Tableau contenant des points créés à partir de clics de souris */
	private Point[]	points_cliques;
	
	
			// CONSTRUCTEUR
	
	/**
	 * Constructeur de la classe.
	 * @param fc - figure vide créée dans la classe Dialogue.
	 */
	public FabricantFigures(FigureColoree fc) {
		this.figure_en_cours_de_fabrication = fc;
		this.nb_points_cliques = 0;
		this.points_cliques = new Point[this.figure_en_cours_de_fabrication.nbClics()];
	}
	
		
			// METHODES


		/**
		 * Méthode implémentant la création d'une figure géométrique
		 * via des clics de souris.
		 * @param e - MouseEvent
		 */
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			if (SwingUtilities.isLeftMouseButton(e)){
				if (nb_points_cliques < (points_cliques.length - 1)){
					points_cliques[nb_points_cliques] = new Point (e.getX(), e.getY());
					nb_points_cliques++;
				}
				else { 
					points_cliques[nb_points_cliques] = new Point ( e.getX(), e.getY() );
					figure_en_cours_de_fabrication.modifierPoints(points_cliques);
					((DessinFigures)(e.getSource())).ajoute(figure_en_cours_de_fabrication);
					((JComponent)(e.getSource())).removeMouseListener(this);
				}
			}
		}

		//Méthodes non utilisées
		
		/**
		 * Méthodes de l'interface MouseListener
		 * non utilisées.
		 * @param e - MouseEvent
		 */
		public void mouseEntered(MouseEvent e) {}
		
		public void mouseReleased(MouseEvent e) {}
		
		public void mouseClicked(MouseEvent e) {}
		
		public void mouseExited(MouseEvent e) {}	
		

}
