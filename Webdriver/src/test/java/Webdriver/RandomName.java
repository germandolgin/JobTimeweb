package Webdriver;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.bio.SocketConnector;
import org.mortbay.jetty.webapp.WebAppContext;

import java.util.Random;

public class RandomName {




public String GetName() {

    ///// получить массив стоковых переменных
    char mas_symb[];
    mas_symb = new char[15];
    Random rnd = new Random();
     String name = ("");
    int i;
    for(i=0; i<14; i=i+1) {
        int x = rnd.nextInt(20) + 97;

                mas_symb[i]=(char)x;
        mas_symb[8]=(char)32;
name = name + mas_symb[i];

    }
    //записать массив в строку




    return name;
}




}
