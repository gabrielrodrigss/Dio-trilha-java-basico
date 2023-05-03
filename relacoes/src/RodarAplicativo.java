public class RodarAplicativo {
    public static void main(String[] args) {
        
        // Criação de um objeto.
        Funcionario funcionario = new Funcionario();

        // Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Dowcast
        //Gerente gerente_ = new Funcionario(); // Dá um erro, tendo que ser explícito.
        // Dá um erro nessa linha, pois a classe filha não tem todos os dados que mãe tem, 
       // ocasionando uma perca de dados ao transformar a mãe para filha, e os dados dá mãe não existiram pós processo.
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
