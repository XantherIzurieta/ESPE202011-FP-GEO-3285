/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mudicSystem.controller;

import ec.edu.espe.mudicSystem.modell.Dinasour;
import utils.FileManager;

/**
 *
 * @author PC1
 */
public class DinasourController {
    
public void save(Dinasour dinosaur)  {
String data = dinosaur.getBrand()+" ,"+dinosaur.getType()+ " ,"+dinosaur.getColor()
        +" ,"+dinosaur.getNumberOfKeys()+" ,"+dinosaur.getSerialNumber();
FileManager.save(data,"Dinosaurs");
    
    
} 
}
