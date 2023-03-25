/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade.model;

/**
 *
 * @author Leonardo
 */
public class FacadeSistemas {
    SubSistemaUM s1;
    SubSistemaDOIS s2;
    SubSistemaTRES s3;

    public FacadeSistemas(){
        this.s1 = new SubSistemaUM();
        this.s2 = new SubSistemaDOIS();
        this.s3 = new SubSistemaTRES();
    }
 
    public void metodoA(){
        s1.metodoUm();
        s2.metodoDois();
    }
    
    public void meotodoB(){
        s2.metodoDois();
        s3.metodoTres();
    }
}
