package exercicio_modulo_18;

public class LeituraTabela {
    public static void main(String[] args) {
        try {

            Class<Usuario> classe = Usuario.class;


            Tabela tabela = classe.getAnnotation(Tabela.class);


            System.out.println("Nome da Tabela: " + tabela.value());
        } catch (NullPointerException e) {

            System.out.println("A anotação @Tabela não foi encontrada na classe.");
        } catch (Exception e) {

            System.out.println("Ocorreu um erro ao ler a anotação: " + e.getMessage());
        }
    }
}
