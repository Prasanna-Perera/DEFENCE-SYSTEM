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
    private MainController main;
    private Observable[] txt = new Observable[0];
    

    public void setMain(MainController mc) {
        this.main = mc;
    }

public void add(Observable o) {
       Observable[] newTxt = new Observable[txt.length + 1];
        for (int i = 0; i < txt.length; i++) {
            newTxt[i] = txt[i];
        }
        newTxt[newTxt.length - 1] = o;
        txt = newTxt;
    }

    // Main Controller එකෙන් එවන මැසේජ් එක යුනිට්ස් හැම එකටම යවනවා (Broadcast)
    public void broadcast(String msg) {
        for (int i = 0; i < txt.length; i++) {
            txt[i].update(msg);
        }
    }

    public void toMain(String from, String msg) {
        if (main != null) {
            main.receiveFromUnit(from, msg);
        }
    }
}

