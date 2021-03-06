package Modele;



/**
 * Classe Point
 * @author Candy && Camille
 * 
 */
public class Point {

	
		//ATTRIBUTS
	
	/** Abscisse du point*/
	private int x;
	
	/** Ordonnée du point*/
	private int y;
	
	
		
		//CONSTRUCTEUR
	
	/**
	 * Constructeur de la classe
	 * @param abs	abscisse du point à créer
	 * @param ord	ordonnée du point à créer
	 */
	public Point(int abs, int ord) {
		this.x = abs;
		this.y = ord;		
	}
	
	
	
		//METHODES
	
	/**
	 * Méthode calculant la distance
	 * entre deux points
	 * @param p2	deuxième point
	 * @return double	la distance
	 */
	public double distance(Point p2){
		int a = p2.rendreX()-this.rendreX();
		int b = p2.rendreY()-this.rendreY();
		return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
	}
	
	
	/**
	 * Méthode incrémentant l'abscisse du point
	 * l'abscisse du point
	 * @param incx	incrément à appliquer
	 */
	public void incrementerX(int incx){
		this.x += incx;
	}
	
	
	/**
	 * Méthode incrémentant l'ordonnée du point
	 * l'ordonnée du point
	 * @param incy	incrément à appliquer
	 */
	public void incrementerY(int incy){
		this.y += incy;
	}
	

	/**
	 * Méthode modifiant l'ordonnée du point
	 * Setter de y
	 * @param y	nouvelle ordonnée du point
	 */
	public void modifierY(int y){
		this.y = y;
	}
	
	
	/**
	 * Méthode modifiant l'abscisse du point
	 * Setter de x
	 * @param x	nouvelle abscisse du point
	 */
	public void modifierX(int x){
		this.x = x;
	}
	
	/**
	 * Méthode renvoyant l'abscisse du point
	 * Getter de x
	 * @return int	l'abscisse du point
	 */
	public int rendreX(){
		return this.x;
	}
	
	
	/**
	 * Méthode renvoyant l'ordonnée du point
	 * Getter de y
	 * @return int	l'ordonnée du point
	 */
	public int rendreY(){
		return this.y;
	}
	
	
	/**
	 * Méthode translatant le point
	 * @param dx	déplacement en abscisse
	 * @param dy	déplacement en ordonnée
	 */
	public void translation(int dx, int dy){
		this.incrementerX(dx);
		this.incrementerY(y);
	}
	

}
