package fatec.poo;

/**
 *
 * @author Yumi
 */
public class FuncionarioHorista extends Funcionario {
    
    private double valHorTrab;
    private int qtdHorTrab;
    
    
    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab) {
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }
    
    public void setQtdHorTrab(int qtdHorTrab){
        this.qtdHorTrab = qtdHorTrab;
    }
    
    @Override
    public double calcSalBruto(){
        return valHorTrab * qtdHorTrab;
    }
    
    public double calcGratificacao(){
        
        return 0;
    }
    
    @Override
    public double calcSalLiquido(){
        double desconto = calcSalBruto() * 0.1;
        return calcSalBruto() - desconto + calcGratificacao();
    }
}
    
