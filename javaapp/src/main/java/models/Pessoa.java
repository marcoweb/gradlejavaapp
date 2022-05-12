package models;

public class Pessoa {
    private String nome;
    protected String registroFiscal;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRegistroFiscal(String registroFiscal) throws Exception  {
        this.registroFiscal = registroFiscal;
    }

    public String getRegistroFiscal() {
        return registroFiscal;
    }
}

