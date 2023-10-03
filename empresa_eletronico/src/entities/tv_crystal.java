package entities;

public class tv_crystal {
	public String modelo = "Crystal_Samsung";
	public String cor = "Black";
	public Float tamanho = 50f;
	public boolean energia;
	public void ligar() {
	this.energia = true;
	}
	public void desligar() {
	this.energia = false;
	}
	public String toString(){
	return "Modelo: " + modelo + "\nCor: " + cor + "\nPolegadas: " + tamanho + "\nLigado: " +
	energia + "\n================";
	}
}
