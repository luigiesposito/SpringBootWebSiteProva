package it.luigi.spring;

public class DatiMessaggio {
	
	private String nome;
	private String email;
	private String oggetto;
	private String messaggio;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOggetto() {
		return oggetto;
	}
	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}
	public String getMessaggio() {
		return messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	@Override
	public String toString() {
		return "DatiMessaggio [nome=" + nome + ", email=" + email + ", oggetto=" + oggetto + ", messaggio=" + messaggio
				+ "]";
	}

	
	

}
