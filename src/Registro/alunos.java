package Registro;

import javax.swing.JOptionPane;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class alunos {
	public String nomeinfo;
	public String rendainfo;
	private String nomeAluno;
	private String emailAluno;
	public String totalDeRendimento;
	public float totalR;
	public float numeroDeAlunos;
	public float rendimentoDoAluno;
	public static String[] AlunoInfo;

	static List<alunos> aluno;

	public alunos(String nomeAluno, String emailAluno, String totalDeRendimentos) {
		this.nomeAluno = nomeAluno;
		this.emailAluno = emailAluno;
		this.totalDeRendimento = totalDeRendimentos;
		this.numeroDeAlunos = 0;
	}

	public alunos() {
		aluno = new LinkedList<alunos>();
	}

	

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}



	public float getNumeroDeAlunos() {
		return numeroDeAlunos;
	}

	
	public float gettoralR() {
		return totalR;
	}

	public void cadastrarAluno() {
		nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno");
		emailAluno = JOptionPane.showInputDialog("Informe o email do aluno");
		String totalDeRendimento = JOptionPane.showInputDialog("Informe o total de rendimento do aluno");
		float rendimentoDoAluno = Float.parseFloat(totalDeRendimento);
		totalR= rendimentoDoAluno + totalR;
		numeroDeAlunos = numeroDeAlunos + 1;
		
		alunos a = new alunos(nomeAluno, emailAluno, totalDeRendimento);

		aluno.add(a);

		System.out.println(numeroDeAlunos);
		System.out.println(totalR);
		

	}

	public String toString() {
		return "" + nomeAluno + "," + emailAluno + "," + totalDeRendimento +",";
	}

	public void salvarAlunos() {
		BufferedWriter BW = null;
		FileWriter FW = null;

		try {
			FW = new FileWriter("alunos.txt");
			BW = new BufferedWriter(FW);

			for (alunos a : aluno) {
				BW.write(a.toString());
				BW.write('\n');
			}
			BW.close();
		} catch (IOException e) {

		}
	}
	
		public String getNomeAluno() {
			return AlunoInfo[0];
		}
		public String getRendaAluno() {
			return AlunoInfo[2];
		}
		
	}

	
	
