/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufam.algo;

/**
 *
 * @author Eduarda Ambrósio
 */
import java.util.Stack;

public class Pilha {
	/* empilhar nomes, listar a pilha, verificar pilha vazia, desempilhar
	*/
    private Stack<String> pilha = new Stack<String>();
		 
    public void pilha_Vazia(){
        System.out.println("\nFila está vazia? " + pilha.isEmpty());
    }
        
    public void inserePilha (String nome){
	this.pilha.push(nome);
    }
		
    public void mostraPilha () {
	System.out.println("\nNa Pilha:");
	System.out.println(pilha);
    }
		
    public void removePilha () {
        this.pilha.pop();
    }
		
    public void desempilhar () {
        System.out.println("Desempilhou "+pilha.peek());
    }
}
