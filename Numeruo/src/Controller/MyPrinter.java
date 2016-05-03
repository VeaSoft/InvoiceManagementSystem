/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 *
 * @author user
 */
public class MyPrinter implements Printable {
    final Component comp;
    public MyPrinter(Component comp){
        this.comp=comp;
    }
    @Override 
    public int print(Graphics g, PageFormat format,int page_index)throws PrinterException{
        if(page_index>0){
            return Printable.NO_SUCH_PAGE;
        }
        Graphics2D g2d=(Graphics2D)g;
        g2d.translate(format.getImageableX(), format.getImageableY());
        comp.printAll(g);
        
        //get the bounds of the component;
       /* Dimension dim= comp.getSize();
        double compHeight= dim.getHeight();
        double compWidth= dim.getWidth();
        //get the bounds of the printable area
        double pHeight= format.getImageableHeight();
        double pWidth= format.getImageableWidth();
        double pXStart= format.getImageableX();
        double pYStart= format.getImageableY();
        
        double xRatio= pWidth/compWidth;
        double yRatio= pHeight/compHeight;
        
        Graphics2D g2=(Graphics2D)g;
        g2.translate(pXStart, pYStart);
        g2.scale(xRatio, yRatio);
        comp.printAll(g2);
       */
        return Printable.PAGE_EXISTS;
    }
    
    
}
