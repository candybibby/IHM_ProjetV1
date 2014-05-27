import java.awt.event.*;


/**
 * Classe implémentant la création de figures géométriques 
 * via des clics de souris
 * @author Candy & Camille
 *
 */
public class FabricantFigures implements MouseListener{
	
			// ATTRIBUTS
	
	/**Figure en cours de fabrication*/
	private FigureColoree	figure_en_cours_de_fabrication;
	
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
		// TODO Auto-generated constructor stub
	}
	
		
			// METHODES

		/**
		 * 
		 */
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		/**
		 * Méthode implémentant la création d'une figure géométrique via des clics de souris.
		 * @param e - MouseEvent
		 */
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		/**
		 * 
		 */
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		/**
		 * Méthodes de l'interface MouseListener non utilisées.
		 * @param e - MouseEvent
		 */
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		/**
		 * 
		 */
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}
		

}
