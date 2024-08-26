package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class catrac {
	private String nome;
	private Date entrada;
	private Date saida;
	
	public catrac() {
	}
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public catrac(String nome, Date entrada, Date saida) {
		this.nome = nome;
		this.entrada = entrada;
		this.saida = saida;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getEntrada() {
		return entrada;
	}
	
	public Date getSaida() {
		return saida;
	}
	
	public long DuraçaoDate() {
		long diff = entrada.getTime() - saida.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void novadata(Date entrada, Date saida) {
		this.entrada = entrada;
		this.saida = saida;
	}
	@Override 
	public String toString(){
		return "nome do cliente: "
				+ nome
				+", dia em que foi pago entrada: "
				+ sdf.format(entrada)
				+ ", dia de vencimento: "
				+ sdf.format(saida)
                + ", duraçao de dias ate o vencimento: "
                + DuraçaoDate();
	}
}
