/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Principal;
import Vistas.Login;

public class Main {
    
    public static void main(String[] args) {
       Principal p = new Principal();
       Login l = new Login(p);
       l.setVisible(true);
       
    }
    
}
