

public class Reflection {
    public static void main(String[] args) {
        Class<Cliente> clienteClass = Cliente.class;
        Tabela tabelaAnnotation = clienteClass.getAnnotation(Tabela.class);

        if (tabelaAnnotation != null) {
            String nomeDaTabela = tabelaAnnotation.nome();
            System.out.println("Nome da tabela em tempo de execução: " + nomeDaTabela);
        } else {
            System.out.println("A classe Cliente não possui a anotação @Tabela.");
        }
    }
}