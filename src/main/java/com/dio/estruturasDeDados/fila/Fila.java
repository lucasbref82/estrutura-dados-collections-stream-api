package com.dio.estruturasDeDados.fila;

import com.dio.estruturasDeDados.pilha.No;

public class Fila<T> {
    private No<T> refNo;

    public Fila(){
        this.refNo = null;
    }

    public void enqueue(Object obj){
        No novoNo = new No(obj);
        novoNo.setNo(refNo);
        refNo = novoNo;
    }

    public No<T> first(){
        if(!this.isEmpty()){
            No<T> primeiroNo = refNo;
            while(true){
                if(primeiroNo.getNo() != null){
                    primeiroNo = primeiroNo.getNo();
                }else{
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public Object dequeue(){
        if(!isEmpty()){
            No<T> primeiroNo = refNo;
            No<T> auxiliar = refNo;
            while(true){
                if(primeiroNo.getNo() != null){
                    auxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getNo();
                }else{
                    auxiliar.setNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNo == null ? true : false;
    }

    @Override
    public String toString(){
        String retorno = "----------\n";
        retorno += "Fila\n";
        retorno += "----------\n";
        No<T> referenciaNo = refNo;
        if(!isEmpty()){
            while(true){
                if(referenciaNo != null){
                    retorno += referenciaNo.toString() + "\n";
                    referenciaNo = referenciaNo.getNo();
                }else{
                    break;
                }
            }
        }else{
            retorno += "Sem dados\n";
            retorno += "===========";
        }

        return retorno;

    }


}
