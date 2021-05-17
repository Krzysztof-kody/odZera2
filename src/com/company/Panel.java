package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Panel extends JPanel implements MouseListener, MouseMotionListener  {

    public Panel(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(G.x, G.y, 30, 30);
        g.setColor(Color.BLUE);
        g.fillRect(G.x+50, G.y, 30, 30);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("click!");
        if(e.getY()>G.y && e.getY() < G.y+30)
            if(e.getX()>G.x && e.getX() < G.x+30){
                System.out.println("bum1");
            }
        if(e.getY()>G.y && e.getY() < G.y+30)
            if(e.getX()>G.x+50 && e.getX() < G.x+30+50){
                System.out.println("bum2");
            }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println(e.getX() + " : " + e.getY());
    }
}
