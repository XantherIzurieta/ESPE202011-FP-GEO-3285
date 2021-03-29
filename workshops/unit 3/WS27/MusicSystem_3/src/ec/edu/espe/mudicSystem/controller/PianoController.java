/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mudicSystem.controller;

import ec.edu.espe.mudicSystem.modell.Piano;
import utils.FileManager;

/**
 *
 * @author PC1
 */
public class PianoController {
    
public void save(Piano piano)  {
String data = piano.getBrand()+" ,"+piano.getType()+ " ,"+piano.getColor()
        +" ,"+piano.getNumberOfKeys()+" ,"+piano.getSerialNumber();
FileManager.save(data,"pianos");
    
    
} 
}
