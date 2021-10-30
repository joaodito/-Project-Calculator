package Registro;

public class CalculoIgualitario {
    private float numAlunosI;
	private float DespesaFinalI;

    public CalculoIgualitario(float numAlunosI,float DespesaFinalI){
        this.numAlunosI = numAlunosI;
        this.DespesaFinalI= DespesaFinalI;
    }
    public float CalculoIgualitarioFinal(){
        return DespesaFinalI/numAlunosI;
    }
}
