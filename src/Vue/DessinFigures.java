package Vue;
import javax.swing.*;
import java.awt.*;
import Modele.FigureColoree;
import Modele.Point;
import Controleur.*;

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
	
	/**
	 * Constructeur vide : dessin ne contenant aucune figure.
	 */
	public DessinFigures() {
		this.points_cliques = new Point[100];
		this.figure_en_cours_de_fabrication = null;
		this.nb_points_cliques = 0;
	}
	
	
			// METHODES
	
	/**
	 * Cette méthode permet d'ajouter une nouvelle figure au dessin.
	 * @param fc - figure à ajouter au dessin.
	 */
	public void ajoute(FigureColoree fc) {
		
		//A faire
		repaint();
	}
	
	/**
	 * Cette méthode permet d'initier le mécanisme événementiel de fabrication des figures à la souris (ajout du listener).
	 * @param fc - forme à construire point par point à la souris
	 */
	public void	construit(FigureColoree fc) {
		FabricantFigures f = new FabricantFigures(fc);
		this.addMouseListener(f);
		repaint();
	}
	
	/**
	 * Cette méthode redessine toutes les figures du dessin.
	 * @param g - environnement graphique de dessin.
	 */
	public void	paintComponent(Graphics g) {
		super.paintComponent(g);

		//a faire
	}
	

}
