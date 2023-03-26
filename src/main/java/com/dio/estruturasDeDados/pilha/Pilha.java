package com.dio.estruturasDeDados.pilha;

public class Pilha<T> {
    private No<T> entradaPilha;

    public Pilha(){
        this.entradaPilha = null;
    }

    public boolean isEmpty(){
        return entradaPilha == null ? true : false;
    }

    public No<T> top(){
        // Retorna sempre o nó que está No<T> topo.
        return entradaPilha;
    }

    public void push(Object novoNo){
        No no = new No(novoNo);
        // Usa um auxiliar para pegar o primeiro nó da pilha
        No<T> refAuxiliar = entradaPilha;
        // Seta a entrada da pilha como o novo nó que será recebido.
        entradaPilha = no;
        // Pega o primeiro nó da pilha e faz referência ao de baixo.
        entradaPilha.setNo(refAuxiliar);
    }


    public No<T> pop(){
        // Verifica se a pilha é nula
        if(!isEmpty()){
            // Pega a o primeiro nó da pilha a ser retirado;
            No<T> poped = entradaPilha;
            // Como o primeiro foi retirado a referência agora aponta para o de baixo;
            entradaPilha = entradaPilha.getNo();
            return poped;
        }
        return null;
    }

    public No<T> index(Integer index){
        No<T> noAuxiliar = entradaPilha;
        int count = 0;
        No<T> noRetornado;
        while(true){
            if(noAuxiliar != null){
                if(index == count){
                    noRetornado = noAuxiliar;
                    break;
                }  
                count++;
                noAuxiliar = noAuxiliar.getNo();
            }else{
                noRetornado = null;
                break;
            }
        }
        return noRetornado;
    }

    @Override
    public String toString(){
        String retorno = "--------------\n";
        retorno += "Pilha\n";
        retorno += "--------------\n";
        No<T> noAuxiliar = entradaPilha;
        while(true){
            if(noAuxiliar != null){
                retorno += noAuxiliar.toString() + "\n";
                noAuxiliar = noAuxiliar.getNo();
            }else{
                break;
            }
        }
        retorno += "==============\n";
        return retorno;
    }
}
