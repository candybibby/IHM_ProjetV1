package Modele;
import java.awt.*;
/**
 * Classe Polygone
 * @author Candy && Camille
 * Cette classe abstraite est la super classe
 * de tous les polygones
 */
public abstract class Polygone extends FigureColoree {

		//ATTRIBUTS
	
	/** Polygone de l'API Java (classe Polygone)*/
	private Polygon p;
	
	
		//CONSTRUCTEUR
	
	/**
	 * Constructeur vide
	 */
	public Polygone() {
		super();
	}
	
	
		//METHODES
	
	/**
	 * Méthode affichant un polygone
	 * (fait appel à fillPolygon de la classe Java Polygon)
	 * @param g		contexte graphique
	 */
	public void affiche(Graphics g){
		p= new Polygon();
		for (int i = 0; i<tab_mem.length; i++){
			p.addPoint(tab_mem[i].rendreX(), tab_mem[i].rendreY());
		}
		g.setColor(couleur);
		g.fillPolygon(p);
		super.affiche(g);
	}
	
	/**
	 * Méthode retourne vrai si le point dont les
	 * coordonnées sont passées en paramètres se trouve
	 * à l'intérieur du polygone
	 * @param x	abscisse
	 * @param y	ordonnée
	 * @return boolean
	 */
	public boolean estDedans(int x, int y){
		return (p.contains(x,y));
	}
	
	/**
	 * Méthode modifie le polygone conformément à
	 * un ensemble de points saisie (ses nouveaux
	 * sommets)
	 * @param Point []	tableau contenant les nouveaux points
	 * de saisie
	 */
	public void modifierPoints(Point[] tab_saisie){
		tab_mem = tab_saisie;
	}
	
	/**
	 * Méthode retourne en résultat le nombre de
	 * points dont on a besoin, en général, pour la saisie
	 * d'un polygone
	 * @param int 	nombre de clics
	 */
	public int nbClics(){
		
		//modifer
		return 0;
	}
	

}
