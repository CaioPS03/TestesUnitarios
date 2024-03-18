/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testesunitariosnotas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author caiop
 */
public class ControleNotasTest {
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private ControleNotas controleNotas = new ControleNotas();

    @BeforeEach

    @Test
    public void testAdicionarNota() {
        controleNotas = new ControleNotas();
        controleNotas.adicionarNota("João", 8.5);
        assertEquals(8.5, controleNotas.obterNota("João"));
    }

    @Test
    public void testAtualizarNota() {
        controleNotas = new ControleNotas();
        controleNotas.adicionarNota("Maria", 7.0);
        controleNotas.atualizarNota("Maria", 8.0);
        assertEquals(8.0, controleNotas.obterNota("Maria"));
    }

    @Test
    public void testCalcularMedia() {
        controleNotas = new ControleNotas();
        controleNotas.adicionarNota("José", 6.0);
        controleNotas.adicionarNota("Maria", 8.0);
        assertEquals(7.0, controleNotas.calcularMedia());
    }

    @Test
    public void testObterNotaMaisAlta() {
        controleNotas = new ControleNotas();
        controleNotas.adicionarNota("Ana", 9.0);
        controleNotas.adicionarNota("Letícia", 8.0);
        assertEquals(9.0, controleNotas.obterNotaMaisAlta());
    }

    @Test
    public void testObterNotaMaisBaixa() {
        controleNotas = new ControleNotas();
        controleNotas.adicionarNota("Pedro", 5.0);
        controleNotas.adicionarNota("Paulo", 6.0);
        assertEquals(5.0, controleNotas.obterNotaMaisBaixa());
    }
}
