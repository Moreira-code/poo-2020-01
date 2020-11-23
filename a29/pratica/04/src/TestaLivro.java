public class TestaLivro {

    public static void main(String[] args) {
        Livro l1 = new Livro("Guia Prático Me Poupe! - 33 Dias Para Mudar Sua Vida Financeira", "Nathalia Arcuri", "Sextante", 2020);
        Livro l2 = new Livro("O homem mais rico da Babilônia", "George S. Clason", " - ", 2017);
        Livro l3 = new Livro("Pequeno manual antirracista", "Djamila Ribeiro", "Companhia das Letras", 2019);

        System.out.println(l1 + "\n");
        System.out.println(l2 + "\n");
        System.out.println(l3 + "\n");
    }
}