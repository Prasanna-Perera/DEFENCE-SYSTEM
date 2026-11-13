/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system;

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
    
}
