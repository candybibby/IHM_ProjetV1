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
	private final JComboBox choix_couleur = new JComboBox(new String [] {"noir", "rouge", "vert", "bleu", "jaune"});
	
	/** Menu déroulant pour choisir le type de figure*/
	private final JComboBox  choix_fig = new JComboBox (new String[] {"quadrilatere", "trait", "cercle", "rectangle"});
	
	/** Bouton permettant la création d'un figure*/
	private final JRadioButton b1=new JRadioButton ("Nouvelle Figure");
	
	/** Bouton permettant de tracer à main levée*/
	private final JRadioButton b2=new JRadioButton ("tracé main levée");
	
	/** Bouton permettant de manipuler une figure */
	private final JRadioButton b3=new JRadioButton ("Manipulations");

	/** Groupe de boutons */
	private final ButtonGroup bg = new ButtonGroup();
	
		//CONSTRUCTEUR
	
	/**
	 * Constructeur de la classe
	 * @param DessinFigures
	 */
	public PanneauChoix(DessinFigures d){
		setLayout(new BorderLayout());
		
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
	
		JPanel haut=new JPanel();
		haut.add(b1);
		haut.add(b2);
		haut.add(b3);
		add (haut, BorderLayout.NORTH);
		
		JPanel bas = new JPanel();
		bas.add(choix_fig);
		bas.add(choix_couleur);
		add(bas, BorderLayout.SOUTH);
		
		if (d == null)
			d = new DessinFigures();
		this.dessin = d;
		
	//	choix_couleur.setEnabled(false);
		choix_couleur.addActionListener(new ActionListener (){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Color c = determineCouleur(choix_couleur.getSelectedIndex());
				if (b1.isSelected()&& (fc!=null)){
					fc.changeCouleur(c);
					dessin.repaint();
				}
				if (b2.isSelected()){
					
				}
				if (b3.isSelected()){
					// pas de manipulation de forme
				}
			}

		});
		
		
		choix_fig.setEnabled(false);
		
		choix_fig.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (choix_fig.getSelectedIndex()!=0){
					fc = creeFigure(choix_fig.getSelectedIndex());
					
				}
			}
			
		});
		
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				fc = new Quadrilatere();
				fc.changeCouleur(determineCouleur(choix_couleur.getSelectedIndex()));
				dessin.construit(fc);
				choix_fig.setEnabled(true);
				choix_fig.setSelectedIndex(0);
			}
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// tracé à main levée
			}
		});
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// manipulation de forme
			}
		});
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
					
					//on crée que des quadrilatère dans cette verison
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
		Color res;
		choix_couleur.addActionListener(new ActionListener (){
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				switch (choix_couleur.getSelectedIndex()){ //index
				case 1 :
					fc.changeCouleur(Color.RED);
					break;
				case 2:
					fc.changeCouleur(Color.GREEN);
					break;
				case 3:
					fc.changeCouleur(Color.BLUE);
					break;
				case 4 : 
					fc.changeCouleur(Color.YELLOW);
					break;
				default :
					fc.changeCouleur(Color.BLACK);
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
