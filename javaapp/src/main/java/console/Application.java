package console;

import models.PessoaFisica;

public class Application {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        try {
            pf.setRegistroFiscal("11144477735");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(pf.getRegistroFiscal());
        Figure fig = new Triangle();
        fig.draw();
    }
}

