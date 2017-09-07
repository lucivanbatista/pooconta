//ContaBancaria

package modelo;

import java.util.ArrayList;
import java.util.List;

//Define os dados e o comportamento
//dos objetos do tipo ContaBancaria
public class ContaBancaria {
	//Eu mudei muita coisa para private
	//Eu também removi o 'i' (iterador) e o 'n'
	private String nomeTitular;
	private int numero;
	private List<Double> extrato; // Em java a gente usa as listas, aqui eu criei uma lista de double, ela possui infinitos tamanhos
									//Não é necessário dizer o tamanho para a lista, mas é necessário instanciar ela
	private double saldo; 
	
//Construtor, possui sempre o mesmo nome da classe.	
	public ContaBancaria(int numero, double saldo, String nome) {
		// O this. funciona assim: teremos o número do parâmetro (antigo numeroC) e o número como variável da classe (aquele lá em cima private)
		// O this. referencia dizendo que estamos usando o numero variavel, e quando não tem, é o do parâmetro
		this.numero = numero;
		this.saldo = saldo; 
		this.nomeTitular = nome;
		this.extrato = new ArrayList<Double>(); // Ela é instanciada aqui, ou seja, agora ela foi realmente criada e está pronta para ser usada
	}
	
	public ContaBancaria(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo; 
		extrato = new ArrayList<Double>();
	}
	
	public double getNumero(){
		return this.numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public void setNomeTitular(String nomeTitular){
		this.nomeTitular = nomeTitular;
	}
	
	public String getNomeTitular(){
		return this.nomeTitular;
	}
	
	public boolean saque(double valor) {
		if(valor > 0 && this.saldo >= valor) {
			//this.saldo = this.saldo - valor;
			this.saldo -= valor;
			this.extrato.add(-valor);
			return true;
		}
		return false;
	}
	
	public boolean deposito(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			this.extrato.add(valor);
			return true;
		}
		return false;
	}
	
	public List<Double> getExtrato() {
		return this.extrato;
	}
	
	public void mostrar(){
		System.out.println(this.getExtrato());
	}
}