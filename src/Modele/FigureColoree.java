package Modele;



import java.awt.*;


/**
 * Cette classe abstraite représente le sommet de la hiérarchie d'héritage 
 * de n'importe quelle figure géométrique visualisable à l'écran et manipulable à la souris. 
 * Cette classe s'inspire du fonctionnement des logiciels de dessin vectoriel, où une figure est :
 * 	 	- définie à l'aide de points de saisie (par exemple les deux extrémités d'une diagonale d'un rectangle). 
 * 		- mémorisée comme un ensemble de points qui permettent de la manipuler (par exemple les 4 sommets d'un rectangle).
 * @author Candy & Camille
 *
 */
public abstract class FigureColoree {

	
			// ATTRIBUTS
	
	/**Attribut de type Color donnant la couleur de remplissage.*/
	protected Color	couleur;
	
	/**Constante définissant la taille de la périphérie des carrés de sélection.*/
	private static int	PERIPHERIE_CARRE_SELECTION;
	
	/**Attribut booléen indiquant si la figure est sélectionnée (son affichage est alors différent).*/
	private boolean	selected;
	
	/**Tableau des points de mémorisation de la figure.*/
	protected Point[]	tab_mem;
	
	/**Constante définissant la taille des carrés de sélection.*/
	private static int	TAILLE_CARRE_SELECTION;
	
	
	
			// CONSTRUCTEUR
	
	/**
	 * Constructeur vide. Initialise les attributs "selected" et "couleur", 
	 * ainsi que le tableau de mémorisation. La dimensioin de celui-ci étant indiquée par la méthode "nbPoints()".
	 */
	public FigureColoree() {
		tab_mem = new Point[this.nbPoints()];
		selected = false;
		couleur = Color.black;
	}
	
			// METHODES
	
	
	/**
	 * Méthode d'affichage de la figure 
	 * Si la figure est sélectionnée des petits carrés sont dessinés autour des points de mémorisation.
	 * @param g - environnement graphique.
	 */
	public void	affiche(Graphics g){
		if (selected){
			g.setColor(Color.black);
			for (int i = 0; i < tab_mem.length; i++){
				g.fillRect(tab_mem[i].rendreX()-2, tab_mem[i].rendreY()-2, 4, 4);
				g.setColor(couleur);
			}
		}
	}
	
	
	/**
	 * Méthode qui détecte un point se trouvant près d'un carré de sélection.
	 * @param x - abscisse d'un clic de souris.
	 * @param y - ordonnée d'un clic de souris.
	 * @return l'indice dans tab_mem du point se trouvant près d'un carré de sélection.
	 */
	public int	carreDeSelection(int x, int y){
		return 0;
	}
	
	
	/**
	 * Méthode permettant de changer la couleur de la figure.
	 * @param c - nouvelle couleur.
	 */
	public void	changeCouleur(Color c){
		
	}
	
	
	/**
	 * Cette méthode désélectionne la figure.
	 */
	public void	deSelectionne(){
		
	}
	
	/**
	 * Cette méthode retourne vrai 
	 * si le point dont les coordonnées sont passées en paramètre se trouve à l'intérieur de la figure.
	 * @param x - abscisse
	 * @param y - ordonnee
	 * @return
	 */
	public abstract boolean	estDedans(int x, int y);
	
	
	
	/**
	 * Méthode abstraite qui permet de modifier les points de mémorisation à partir de points de saisie.
	 * @param ps - tableau des points de saisie
	 */
	public abstract void modifierPoints(Point[] ps);
	
	
	/**
	 * Méthode abstraite
	 * @return retourne le nombre de points de saisie (nombre de clics).
	 */
	public abstract int	nbClics();
	
	
	/**Méthode abstraite qui retourne le nombre de points de mémorisation .
	 * 
	 * @return
	 */
	public abstract int	nbPoints();
	
	
	/**
	 * Cette méthode sélectionne la figure.
	 */
	public void	selectionne(){
		
	}
	
	
	/**
	 * Cette méthode permet d'effectuer une transformation des coordonnées des points de mémorisation de la figure.
	 * @param dx - déplacement sur l'axe des abscisses.
	 * @param dy - déplacement sur l'axe des ordonnees.
	 * @param indice - indice dans tab_mem du point à modifier.
	 */
	public void	transformation(int dx, int dy, int indice){
		
	}
	
	
	/**
	 * Cette méthode permet d'effectuer une translation des coordonnées des points de mémorisation de la figure.
	 * @param dx - déplacement sur l'axe des abscisses.
	 * @param dy - déplacement sur l'axe des ordonnees.
	 */
	public void	translation(int dx, int dy){
		
	}
	

}
