/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testesunitariosnotas;

/**
 *
 * @author caiop
 */
import java.util.HashMap; import java.util.Map;

public class ControleNotas {
    private Map<String, Double> notasAlunos;
    
    public ControleNotas() {
        notasAlunos = new HashMap<>();
    }
    
    public double obterNota(String aluno) {
        return notasAlunos.get(aluno);
    }
    
    public void adicionarNota(String aluno, double nota) {
        notasAlunos.put(aluno, nota);
    }
    
    public void atualizarNota(String aluno, double novaNota) {
        if (!notasAlunos.containsKey(aluno)) {
            throw new IllegalArgumentException("Aluno não encontrado.");
        }
        notasAlunos.put(aluno, novaNota);
    }

    public double calcularMedia() {
        
        double totalNotas = 0.0;
        double quantidadeNotas = 0.0;
        for (double nota : notasAlunos.values()) {
            totalNotas += nota;
            quantidadeNotas += 1;
        }
        return totalNotas / quantidadeNotas;
    }
    
    public double obterNotaMaisAlta() {
        double notaMaisAlta = 0.0;
        for (double nota : notasAlunos.values()) {
            if (nota > notaMaisAlta) {
                notaMaisAlta = nota;
            }
        }
        return notaMaisAlta;
    }
    
    public double obterNotaMaisBaixa() {
        double notaMaisBaixa = 10.0;
        for (double nota : notasAlunos.values()) {
            if (nota < notaMaisBaixa) {
                notaMaisBaixa = nota;
            }
        }
        return notaMaisBaixa;
    }
}
    