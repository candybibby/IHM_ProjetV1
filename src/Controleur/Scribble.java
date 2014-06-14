package Controleur;

import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;




public class Scribble extends JPanel implements MouseListener, MouseMotionListener {

	private int last_X, last_Y;
	private Graphics g;
	
	public Scribble(Graphics gr){
		this.g=gr;
		//this.addMouseListener(this);
		//this.addMouseMotionListener(this);
	}
	
	public void mouseClicked (MouseEvent e){}
	public void mouseEntered (MouseEvent e){}
	public void mouseExited (MouseEvent e){}
	public void mouseReleased (MouseEvent e){}
	
	public void mouseMoved (MouseEvent e){}
		
	public void mousePressed (MouseEvent e){
		if (SwingUtilities.isLeftMouseButton(e)){
			last_X=e.getX();
			last_Y=e.getY();
		}
		else if (SwingUtilities.isRightMouseButton(e)){
			//((JComponent)(e.getSource())).removeMouseListener(this);
			//((JComponent)(e.getSource())).removeMouseMotionListener(this);
			//permet d'effacer le tracer pour recommencer 
			((JComponent)(e.getSource())).repaint();
		}
	}
	
	public void mouseDragged (MouseEvent e){
		g.drawLine(last_X, last_Y, e.getX(),e.getY());
		last_X=e.getX();
		last_Y=e.getY();
	}
	
	
}
