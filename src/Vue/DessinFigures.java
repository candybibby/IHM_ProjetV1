package Vue;
import javax.swing.*;

import java.util.*;

import Modele.*;

import java.awt.*;

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

	
			// ATTRIBUT
	
	/** Liste de figures colorées*/
	private ArrayList<FigureColoree> lfg;
	
	Scribble s;
			// CONSTRUCTEUR
	
	/**
	 * Constructeur vide : dessin ne contenant aucune figure.
	 */
	public DessinFigures() {
		this.lfg = new ArrayList<FigureColoree>();
	}
	
	
			// METHODES
	
	/**
	 * Cette méthode permet d'ajouter une nouvelle figure au dessin.
	 * @param fc - figure à ajouter au dessin.
	 */
	public void ajoute(FigureColoree fc) {
		lfg.add(fc);
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
	public void	paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
		int i = 0;
		while(i < lfg.size()){
			lfg.get(i).affiche(g);
			i++;			
		}
	}


	public void traceScribble(Color c){
		Graphics cg = this.getGraphics();
		cg.setColor(c);
		Scribble trace = new Scribble(cg);
		this.addMouseListener(trace);
		this.addMouseMotionListener(trace);
		this.s = trace;
	}
	
	public void supprimeAuditeur(){
		
	}

}
