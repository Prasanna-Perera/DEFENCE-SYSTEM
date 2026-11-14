/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defence.system;

/**
 *
 * @author ASUS ROG
 */
public class DEFENCESYSTEM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainController mainController = new MainController();
        Observer observer = new Observer();
        Helicopter helicopter= new Helicopter();
        Tank tank = new Tank();
        Submarine submarine = new Submarine();
         
        observer.setMain(mainController);
        mainController.setObserver(observer);
        
        helicopter.setObserver(observer);
        tank.setObserver(observer);
        submarine.setObserver(observer);
        
        observer.add(helicopter);
        observer.add(tank);
        observer.add(submarine);
        
        mainController.setVisible(true);
        helicopter.setVisible(true);
        tank.setVisible(true);
        submarine.setVisible(true);
        
       
         
         
    }
    
}