/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite.model;

/**
 *
 * @author Leonardo
 */
public class File extends FileSystemItem {
    private String nome;

    public File(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void print(String estrutura) {
        System.out.println(estrutura + nome);
    }

    @Override
    public void add(FileSystemItem fs) {
        System.out.println("Não foi possível adicionar o arquivo");
    }
    
}
