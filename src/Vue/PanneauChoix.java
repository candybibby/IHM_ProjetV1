package Vue;



import java.awt.event.*;

import javax.swing.*;

import Modele.*;

import java.awt.*;
/**
 * Classe PanneauChoix
 * permettant la construction de l'interface utilisateur
 * Hérite de JPanel
 * @author Candy & Camille
 */
public class PanneauChoix extends JPanel{

		//ATTRIBUTS
	
	/** Dessin*/
	private DessinFigures dessin;
	
	/** Figure à construire*/
	private FigureColoree fc;
	
	/** Menu déroulant pour choisir la culeur*/
	private final JComboBox choix_couleur = new JComboBox(new String [] {"rouge", "vert", "bleu", "jaune"});
	
	/** Menu déroulant pour choisir le type de figure*/
	private final JComboBox  choix_fig = new JComboBox (new String[] {"quadrilatere", "trait", "cercle", "rectangle"});
	
	/** Bouton permettant la création d'un figure*/
	private final JRadioButton b1=new JRadioButton ("Nouvelle Figure");
	
	/** Bouton permettant de tracer à main levée*/
	private final JRadioButton b2=new JRadioButton ("tracé main levée");
	
	/** Bouton permettant de manipuler une figure */
	private final JRadioButton b3=new JRadioButton ("Manipulations");

	
		//CONSTRUCTEUR
	
	/**
	 * Constructeur de la classe
	 * @param DessinFigures
	 */
	public PanneauChoix(DessinFigures d){
		if (d == null)
			d = new DessinFigures();
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
		choix_fig.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e){
				switch (choix_fig.getSelectedIndex()){
				case 0:
					fc = new Quadrilatere();
					break;
				case 1 :
					fc = new Quadrilatere();
					break;
				case 2 :
					fc = new Quadrilatere();
					break;
				case 3 :
					fc = new Quadrilatere();
					break;
				default :
					fc = new Quadrilatere();
					break;

				}
				repaint ();
			}
		});
		return this.fc;
	}
		
		
	
	
	/**
	 * Méthode déterminant la couleur à utiliser
	 * @param int
	 * @return Color
	 */
	private Color determineCouleur(int index){
		
		choix_couleur.addActionListener(new ActionListener (){
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				switch (choix_couleur.getSelectedIndex()){
				case 0 :
					fc.setCouleur(Color.RED);
					break;
				case 1:
					fc.setCouleur(Color.GREEN);
					break;
				case 2:
					fc.setCouleur(Color.BLUE);
					break;
				case 3 : 
					fc.setCouleur(Color.YELLOW);
					break;
				default :
					fc.setCouleur(Color.BLACK);
					break;
				}
			}
			
		});
		
		//modifier ça
		return fc.getCouleur();
	}
	
	/**
	 * Redéfinition de la méthode paintComponent
	 * @param g
	 */
	public void paintComponent(Graphics g){
		
	}
	
}
