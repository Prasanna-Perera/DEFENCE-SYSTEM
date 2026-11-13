/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system;

/**
 *
 * @author ASUS ROG
 */
public class Observer {
    private MainController main_c;
    private Observable[] txt = new Observable[0];
    

    public void setMain(MainController mc) {
        this.main_c = mc;
    }

public void add(Observable o) {
       Observable[] newTxt = new Observable[txt.length + 1];
        for (int i = 0; i < txt.length; i++) {
            newTxt[i] = txt[i];
        }
        newTxt[newTxt.length - 1] = o;
        txt = newTxt;
    }

    public void broadcast(String msg) {
        for (int i = 0; i < txt.length; i++) {
            txt[i].update(msg);
        }
    }
    
    public void sendPrivate(String unitName, String msg) {
        for (int i = 0; i < txt.length; i++) {
            
            String className = txt[i].getClass().getSimpleName(); 
            if (className.equalsIgnoreCase(unitName)) {
                txt[i].update(msg + " (pvt)" );
            }
        }
    }

    public void toMain(String from, String msg) {
        if (main_c != null) {
            main_c.receiveFromUnit(from, msg);
        }
    }
}

