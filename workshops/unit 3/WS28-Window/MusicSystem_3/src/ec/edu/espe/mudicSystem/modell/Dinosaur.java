/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mudicSystem.modell;

/**
 *
 * @author PC1
 */
public class Dinosaur {
    
    private int numberOfKeys;
    private String brand;
    private String type;
    private String color;
    private String serialNumber;

    public Dinosaur(int numberOfKeys, String brand, String type, String color, String serialNumber) {
        this.numberOfKeys = numberOfKeys;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.serialNumber = serialNumber;
    }

    

    
    /**
     * @return the numberOfKeys
     */
    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    /**
     * @param numberOfKeys the numberOfKeys to set
     */
    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
       
}
