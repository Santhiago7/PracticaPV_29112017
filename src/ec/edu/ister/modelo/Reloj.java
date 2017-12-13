/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
/**
 *SANTHIAGO COLUMBA
 *Programacion Visual II
 * @author ODG-ISC
 */
public class Reloj  implements Runnable{
   

    JLabel label;

    //String dato;
    public Reloj(JLabel label) {
        this.label = label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public String tiempoUno() {
        Date date = new Date();
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat hourDateFormat = new SimpleDateFormat("HH:mm:ss");
        return (dateformat.format(date))+" "+(hourDateFormat.format(date));
    }

    public void run() {
        int i = 1;
        try {
            do {
                this.label.setText(tiempoUno());

            } while (i == 1);

        } catch (Exception e) {
        }
    }
}



