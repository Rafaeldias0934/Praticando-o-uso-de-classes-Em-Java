package classe.DesafioModulo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Rafael Dias",89.99);
        Pessoa p2 = new Pessoa ("Samuel Almeida",99.00);

        Comida c1 = new Comida("Feijão Tropeiro",0.0223);
//        c1.nomeDaComida = "Feijão Tropeiro";
//        c1.pesoDaComida = 0.0223;

        Comida c2 = new Comida("Arroz Branco", 0.300);
//        c2.nomeDaComida = "Arroz Branco";
//        c2.pesoDaComida = 0.300;

        System.out.println(p1.apresentar());
        p1.Comer(c1);
        System.out.println(p1.apresentar());
        p1.Comer(c2);
        System.out.println(p1.apresentar());


//        System.out.printf("%s, tinha o peso inicial de %.2fKG, após comer %.4fg de %s\n", p1.nomedaPessoa ,p1.pesoDaPessoa, c1.pesoDaComida, c1.nomeDaComida, p1.Comer(c1.pesoDaComida));
//        System.out.printf("%s, tinha o peso inicial de %.2fKG, após comer %.4fg de %s, o peso atual é de %.2fKG.\n",p2.nomedaPessoa,p2.pesoDaPessoa, c2.pesoDaComida,c2.nomeDaComida, p2.Comer(c2.pesoDaComida));
//        System.out.printf("%s, tinha o peso inicial de %.2fKG, após comer %.4fg de %s, o peso atual é de %.2fKG.\n", p1.nomedaPessoa ,p1.pesoDaPessoa, c1.pesoDaComida, c1.nomeDaComida, p1.Comer(c1.pesoDaComida));
    }
}
