/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system;

import javax.swing.JButton;

/**
 *
 * @author ASUS ROG
 */
public abstract class SuperDefence extends javax.swing.JFrame implements Observable{
    private Observer observer;
    
    public void setObserver(Observer obj){
            this.observer = obj;
    }
    public Observer getObserver() {
        return observer;
    }
    public void setSliderValue(int value) {
    }
    public void updateButtons(JButton[] btns, boolean on, int val) {
        for (int i = 0; i < btns.length; i++) {
            if (btns[i] != null) {
                int limit = (i + 1) * 25;
                btns[i].setEnabled(on && val >= limit);
            }
        }
    }
}
