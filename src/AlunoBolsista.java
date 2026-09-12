public class AlunoBolsista extends Aluno {
    private double valorBolsa;

    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
        @Override
        void apresentar() {
            System.out.println("Olá meu nome é " + getNome() + " e tenho " + getIdade()  + " anos e recebo bolsa de R$ " + valorBolsa);
        }

    }

