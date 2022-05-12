package models;

public class PessoaFisica extends Pessoa {
    @Override
    public void setRegistroFiscal(String registroFiscal) throws Exception {
        if (registroFiscal.length() == 15) {
            registroFiscal = registroFiscal.replace("", "").replace("-", "");
        }
        if(registroFiscal.length() == 11) {
            
        } else {
            throw new Exception("Formato de CPF inválido");
        }
        super.setRegistroFiscal(registroFiscal);
    }
    @Override
    public String getRegistroFiscal() {
        return super.getRegistroFiscal();
    }
}
