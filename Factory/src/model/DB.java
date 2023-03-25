/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Leonardo
 */
public abstract class DB {
    public abstract void getData();
    
    public void create(){
        System.out.println("Creating");
    }
    public void connect(){
        System.out.println("Connecting");
    }
    public void query(){
        System.out.println("Running queries");
    }
}
