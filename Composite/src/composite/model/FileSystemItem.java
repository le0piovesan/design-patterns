/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite.model;

/**
 *
 * @author Leonardo
 */
public abstract class FileSystemItem {
    
    public abstract void add(FileSystemItem fs);
    public abstract void print(String estrutura);

}
