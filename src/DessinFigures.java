import javax.swing.*;

/**
 * 
 * Chaque instance de cette classe 
 * est un dessin comportant plusieurs figures colorées 
 * visualisables à l'écran dont une seule est sélectionnée.
 * @author Candy & Camille
 * 
 */
public class DessinFigures extends JPanel{

	
			// ATTRIBUTS
	
	
	/**Figure en cours de fabrication.*/
	private FigureColoree	figure_en_cours_de_fabrication;
	
	/**Accumule le nombre de clics de souris.*/
	private int	nb_points_cliques;
	
	/**Tableau contenant des points créés à partir de clics de souris.*/
	private Point[]	points_cliques;
	

	
	
			// CONSTRUCTEUR
	
	public DessinFigures(FigureColoree fc) {
		
	}
	
	
			// METHODES
	

}
