package fatec.poo;

/**
 *
 * @author Yumi
 */
public class FuncionarioComissionado extends Funcionario{
    
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, double salBase, double taxaComissao, double totalVendas) {
    super(registro, nome, dtAdmissao);
    this.salBase = salBase;
    this.taxaComissao = taxaComissao;
    this.totalVendas = totalVendas;
}

    public void setSalBase(double salBase){
        this.salBase = salBase;
    }
    
    public double getSalBase(){
        return salBase;
    }
    
    public double getTotalVendas(){
        return totalVendas;
    }
    
    public double getTaxaComissao(){
        return taxaComissao;
    }
    
    public void addVendas(double novaVenda){
        totalVendas += novaVenda;
    }
    
    @Override
    public double calcSalBruto(){
        return salBase +(taxaComissao * totalVendas);
    }
    
    public double calcGratificacao(){
        double gratificacao = 0;

        if(totalVendas <= 5000){
            gratificacao = 0;
        } else if(totalVendas <= 10000){
            gratificacao = calcSalBruto() * 0.03;
        } else if(totalVendas > 10000){
            gratificacao = calcSalBruto() * 0.05;
        }

        return gratificacao;
    }
    
    @Override
    public double calcSalLiquido(){
        double desconto = calcSalBruto() * 0.1;
        return calcSalBruto() - desconto + calcGratificacao();
    }
    
}
