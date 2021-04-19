import java.util.Scanner;

public class Funcionario extends Usuario {
    private int idFuncionario;
    private Carro listarCarro;
    private Carro editarCarro;
    private Carro cadastrarCarro;
    
    public Funcionario(String nome, String email, String senha) {
        super(nome, email, senha);
    }
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public Carro getEditarCarro() {
        return editarCarro;
    }

    public void setEditarCarro(Carro editarCarro) {
        this.editarCarro = editarCarro;
    }
    // metodo para editar as informações do funcionario
    public void  editarPerfil(){
        
    };
    public boolean editarCarro(Scanner scan){
        
        System.out.printf("Modelo: %s\n" +
                          "Cor: %s\n" +
                          "Ano: %s\n" +
                          "Descricao: %s\n" +
                          "Valor: R$%.2f\n",
                          this.getEditarCarro().getModelo(),
                          this.getEditarCarro().getCor(),
                          this.getEditarCarro().getAno(),
                          this.getEditarCarro().getDescricao(),
                          this.getEditarCarro().getValor());
        System.out.printf("Deseja editar:\n"+
                          "1 - Modelo\n"+
                          "2 - Cor\n"+
                          "3 - Ano\n"+
                          "4 - Descricao\n"+
                          "5 - Valor\n"+
                          "Informe:\n");
       scan.nextInt();
       return true ;
    }
    /*private void cadastrarCarro(listaCarro){
        System.out.printf("Informe modelo:" +
                          "Informe cor: %s" +
                          "Informe ano: %s" +
                          "Informe descricao: %s" +
                          "Informe valor: %.2f",
                          this.getCarro().setModelo(),
                          this.getCarro().setCor(),
                          this.getCarro().setAno(),
                          this.getcarro().setDescricao(),
                          this.getcarro().setValor());
        
    }*/
    
    

}