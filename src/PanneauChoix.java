import java.awt.image.ImageObserver;
import java.awt.MenuContainer;
import java.io.Serializable;
import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.*;
/**
 * Classe PanneauChoix
 * @author
 * Classe pour la construction de l'interface utilisateur
 * Hérite de JPanel
 */
public class PanneauChoix extends JPanel{

		//ATTRIBUTS
	
	/** Dessin*/
	private DessinFigures dessin;
	
	/** Figure à construire*/
	private FigureColoree fc;
	


		//CONSTRUCTEUR
	
	/**
	 * Constructeur de la classe
	 * @param DessinFigures
	 */
	public PanneauChoix(DessinFigures d){
		this.dessin = d;
	}
	
	
		//METHODES
	
	/**
	 * Méthode implémentant la création
	 * d'une figure géométrique
	 * @param int
	 * @return FigureColoree
	 */
	private FigureColoree creeFigure(int index){
		
		//modifier ça
		return this.fc;
	}
	
	/**
	 * Méthode déterminant la couleur à utiliser
	 * @param int
	 * @return Color
	 */
	private Color determineCouleur(int index){
		
		
		//modifier ça
		return Color.BLACK;
	}
	
	/**
	 * Redéfinition de la méthode paintComponent
	 * @param g
	 */
	public void paintComponent(Graphics g){
		
	}
	
}
