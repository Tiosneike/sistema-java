package modelo;

import java.util.List;
import java.util.ArrayList;

public class Sistema {
	private static String nomeProduto;
	private static Float valorProduto;
	private static Float quantia;
	private static Float valorTotal;

	public Float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Float valorTotal) {
		Sistema.valorTotal = valorTotal;
	}

	public Float getQuantia() {
		return quantia;
	}

	public void setQuantia(Float quantia) {
		Sistema.quantia = quantia;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		Sistema.nomeProduto = nomeProduto;
	}

	public Float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Float valorProduto) {
		Sistema.valorProduto = valorProduto;
	}

	public String getValorStoq() {
		return valorStoq;
	}

	public void setValorStoq(String valorStoq) {
		this.valorStoq = valorStoq;
	}

	public List<String> getStoq() {
		return stoq;
	}

	public void setStoq(List<String> stoq) {
		this.stoq = stoq;
	}

	private String valorStoq;
	private List<String> stoq = new ArrayList<String>();

	public void total() {
		valorTotal = (quantia * valorProduto);
	}

	public void cadastro() {
		total();
		stoq.add("\nProduto= " + nomeProduto + " Preço= " + valorProduto + " Quantia em Estoque= " + quantia + " Total "
				+ valorTotal);
	}
}