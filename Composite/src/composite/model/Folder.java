/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class Folder extends FileSystemItem {
    
    private String nome;
    private List<FileSystemItem> FileSystemItemList = new ArrayList<FileSystemItem>();

    public Folder(String nome) {
        this.nome = nome;
    }
        
    @Override
    public void print(String estrutura) {
        System.out.println(estrutura + nome);
        for (FileSystemItem fs: FileSystemItemList) {
            fs.print(estrutura + '|');
        }
    }

    @Override
    public void add(FileSystemItem fs) {
        FileSystemItemList.add(fs);
    }
    
}
