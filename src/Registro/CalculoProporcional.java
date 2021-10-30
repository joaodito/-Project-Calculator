package Registro;

import java.io.FileReader;
import java.io.IOException;
import java.lang.ProcessHandle.Info;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class CalculoProporcional extends alunos {
    public static Object buscarAlunos;
    private String nomealuno;
    private String rendaAluno;
    public static float rendaTotal;
    public static float DespesaTotal;
    public static float Calculofinal;
    
    static ArrayList<String> Infonome = new ArrayList<>();
    static ArrayList<String> Inforenda = new ArrayList<>();
    static ArrayList<Float> Infconta = new ArrayList<>();
    static ArrayList<Float> percent = new ArrayList<>();
   
    String result;
    
    public CalculoProporcional(float rendaTotal,float DespesaTotal) {

        this.rendaTotal = rendaTotal;
        this.DespesaTotal = DespesaTotal;
    }
    public static void buscarAlunos() {
		
		try {
            
        
		FileReader FI = new FileReader("alunos.txt");
		int i = FI.read();
		String repo ="";
		while(!(i==-1)){
			char c = (char)i;
			repo+= (char)c;
			i=FI.read();
			
		}
		String[] repoAluno = repo.split("\n");
		for(String r : repoAluno ){
			repoAluno = r.split(",");
			alunos a = new alunos (repoAluno[0], repoAluno[1], repoAluno[2]);
			aluno.add(a);
			AlunoInfo= repoAluno;
			Infonome.add(AlunoInfo[0]);
        	Inforenda.add(AlunoInfo[2]);
            Infconta.add(Float.parseFloat(AlunoInfo[2]));

		}
        FI.close();
    } catch (Exception e) {
        //TODO: handle exception
    }
		
		}
    public static void calculoProporcionalfinal(){ 
        for(int i=0;i<Infonome.size();i++){
        percent.add(Infconta.get(i)/rendaTotal*100);
        Calculofinal= (percent.get(i)/100)*DespesaTotal;
        JOptionPane.showMessageDialog(null, DespesaTotal+"\nNome: "+Infonome.get(i)+"\nRenda:R$"+ Inforenda.get(i)+"\nPorcentagem: "+percent.get(i)+"%\nTotal a Pagar:"+ Calculofinal);
        }
        
        return;

    }
}   
