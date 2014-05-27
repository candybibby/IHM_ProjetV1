package Modele;
import java.awt.Graphics;

/**
 * Classe Quadrilatère
 * @author Candy && Camille
 * Hérite de Polygone
 */
public class Quadrilatere extends Polygone {

		//CONSTRUCTEUR
	
	/**
	 * Constructeur vide
	 */
	public Quadrilatere() {
		// TODO Auto-generated constructor stub
	}

	
		//METHODE
	
	/**
	 * Méthode affichant un polygone
	 * (fait appel à fillPolygon de la classe Java Polygon)
	 * @param g		contexte graphique
	 */
	@Override
	public void affiche(Graphics g) {
		// TODO Auto-generated method stub	
	}

	/**
	 * Méthode retourne vrai si le point dont les
	 * coordonnées sont passées en paramètres se trouve
	 * à l'intérieur du polygone
	 * @param x	abscisse
	 * @param y	ordonnée
	 * @return boolean
	 */
	@Override
	public boolean estDedans(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Méthode modifie le polygone conformément à
	 * un ensemble de points saisie (ses nouveaux
	 * sommets)
	 * @param Point []	tableau contenant les nouveaux points
	 * de saisie
	 */
	@Override
	public void modiferPoints(Point[] tab_saisie) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Méthode retourne en résultat le nombre de
	 * points dont on a besoin, en général, pour la saisie
	 * d'un polygone
	 * @param int 	nombre de clics
	 */
	@Override
	public int nbClics() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifierPoints(Point[] ps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int nbPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

}
