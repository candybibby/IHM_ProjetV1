package Modele;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;




public class Trait extends FigureColoree{
	private static int indice = 0;
	private int debx;
	private int deby;
	private int finx;
	private int finy;
	private Color couleur;
	
	public Trait() {
		super();
		Trait.indice++;
		this.debx = tab_mem[0].rendreX();
		this.deby = tab_mem[0].rendreY();
		this.finx = tab_mem[1].rendreX();
		this.finy = tab_mem[1].rendreY();
		this.couleur = Color.BLACK;
	}
	
	public static int getIndice(){
		return Trait.indice;
	}
	
	public static void setIndice (int i){
		Trait.indice = 0;
	}

	public int getDebx() {
		return debx;
	}

	public void setDebx(int debx) {
		this.debx = debx;
	}

	public int getDeby() {
		return deby;
	}

	public void setDeby(int deby) {
		this.deby = deby;
	}

	public int getFinx() {
		return finx;
	}

	public void setFinx(int finx) {
		this.finx = finx;
	}

	public int getFiny() {
		return finy;
	}

	public void setFiny(int finy) {
		this.finy = finy;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}

	@Override
	public void affiche(Graphics g){
		g.setColor(couleur);
		g.drawLine(tab_mem[0].rendreX(), tab_mem[0].rendreY(), tab_mem[1].rendreX(), tab_mem[1].rendreY());
		super.affiche(g);
	}
	
	


	@Override
	public void modifierPoints(Point[] ps) {
		tab_mem = ps;
	}

	@Override
	public int nbClics() {
		return 2;
	}

	@Override
	public int nbPoints() {
		return 2;
	}

	
	
	@Override
	public boolean estDedans(int x, int y) {
		boolean res = false;
		
		// vecteur
		int dx=(finx-debx);
		int dy=(finy-deby);
		int max = Math.max(Math.abs(dx), Math.abs(dy));
		
		// on vérifie que le point (x,y) est sur le trait
		int t = 0;
		while ( !res && (t<=max) ) {
			if ( (x == (debx+(t*dx)/max)) && (y == (deby+(t*dy)/max)) )
					res =true;
			t++;
		}

		return false;
	}

	
		

}