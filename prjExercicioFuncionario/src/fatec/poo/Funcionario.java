package fatec.poo;

/**
 *
 * @author Yumi
 */
public class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
    double salBase, taxaComissao, totVendas;
    
    public Funcionario(int registro, String nome, String dtAdmissao){
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public double calcSalBruto(){

        return (salBase + taxaComissao * totVendas);
    }
    
    public double calcDesconto(){
        return calcSalBruto()* 0.1;
    }
    
    
    
    public double calcSalLiquido(){
        double gratificacao = 0;
        if(totVendas<= 5000){
            gratificacao = 0;  
        }
        else if(totVendas<=10000){
            gratificacao = calcSalBruto()*0.03;
        }
        
        else if(totVendas > 10000){
            gratificacao = calcSalBruto()*0.05;
        }
        
        
        
        return calcSalBruto()- calcDesconto()+ gratificacao;
    }

    public String getNome() {
        return nome;
    }
    
    
}
