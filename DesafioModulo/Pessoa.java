package classe.DesafioModulo;

public class Pessoa {
    String nomedaPessoa;
    double pesoDaPessoa;

    Pessoa(String nomedaPessoa, double pesoDaPessoa) {
        this.nomedaPessoa = nomedaPessoa;
        this.pesoDaPessoa = pesoDaPessoa;
    }
    void Comer(Comida comida) {
        if (comida != null) {
            this.pesoDaPessoa += comida.pesoDaComida;
        }
//        return PesoDaComida + pesoDaPessoa;
    }

    String apresentar() {
        return "Olá eu sou o " + nomedaPessoa + " e tenho " + pesoDaPessoa + "Kgs.";
    }

}

