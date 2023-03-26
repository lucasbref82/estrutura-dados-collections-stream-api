package com.dio.collections.set.exercicios.entidades;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private String dataDeCriacao;
    private String ide;

    public LinguagemFavorita() {

    }

    public LinguagemFavorita(String nome, String dataDeCriacao, String ide) {
        this.nome = nome;
        this.dataDeCriacao = dataDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", dataDeCriacao=" + dataDeCriacao + ", ide=" + ide + "]";
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.getNome().compareTo(o.getNome());
    }

    

    

    
    
}
