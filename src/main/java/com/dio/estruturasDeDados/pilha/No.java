package com.dio.estruturasDeDados.pilha;


public class No<T> {
    private T dado;
    private No<T> no;

    public No(){

    }

    public No(T dado) {
        this.dado = dado;
    }

    public Object getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getNo() {
        return no;
    }

    public void setNo(No<T> no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "No [dado=" + dado + "]";
    }

    

    
}
