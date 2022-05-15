package models;

public class PessoaFisica extends Pessoa {
    @Override
    public void setRegistroFiscal(String registroFiscal) throws Exception {
        if (registroFiscal.length() == 15) {
            registroFiscal = registroFiscal.replace("", "").replace("-", "");
        }
        if(registroFiscal.length() == 11) {
            int fator, soma, resto, digito;
            fator = 10;
            soma = 0;
            for(int pos = 0; pos < 9;pos++) {
                soma += Character.getNumericValue(registroFiscal.charAt(pos)) * fator--;
            }
            resto = soma % 11;
            digito = (resto < 2) ? 0 : 11 - resto;
            if(digito == Character.getNumericValue(registroFiscal.charAt(9))){
                fator = 11;
                soma = 0;
                for(int pos = 0; pos < 10;pos++) {
                    soma += Character.getNumericValue(registroFiscal.charAt(pos)) * fator--;
                }
                resto = soma %11;
                digito= (resto < 2) ? 0 : 11 - resto;
                if(digito == Character.getNumericValue(registroFiscal.charAt(10))) {
                    super.setRegistroFiscal(registroFiscal);
                } else {
                    throw new Exception("CPF inválido");
                }
            } else {
                throw new Exception("CPF inválido");
            }
        } else {
            throw new Exception("Formato de CPF inválido");
        }
        super.setRegistroFiscal(registroFiscal);
    }
    @Override
    public String getRegistroFiscal() {
        String result = "";
        for(int pos = 0; pos < 11; pos++) {
            result += this.registroFiscal.charAt(pos);
            if(pos == 2 || pos == 5) {
                result += ".";
            } else if (pos == 8) {
                result += "-";
            }
        }
        return result;
    }
}
