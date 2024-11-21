package com.mycompany.pei;

import conexao.Conexao;

public class Pei {

    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.getConexao();
    }
    private static Pei instance; // Instância única
    private int pontos;
    
    private Pei() {
        this.pontos = 0;
    }

    public static Pei getInstance() {
        if (instance == null) {
            instance = new Pei();
        }
        return instance;
    }

    public int getPontos() {
        return this.pontos;
    }

    public void GastarPontos(int gasto) {
        this.pontos -= gasto;
    }

    public void GanharPontos(int ganho) {
        this.pontos += ganho;
    }
}
