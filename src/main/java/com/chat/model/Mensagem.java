package com.chat.model;

public class Mensagem {

	private TipoMensagem tipo;
    private String conteudo;
    private String remetente;

    public enum TipoMensagem {
        CHAT,
        ENTROU,
        SAIU
    }

    public TipoMensagem getTipo() {
        return tipo;
    }

    public void setTipo(TipoMensagem tipo) {
        this.tipo = tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }
}
