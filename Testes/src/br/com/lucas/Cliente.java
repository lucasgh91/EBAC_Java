package br.com.lucas;

public class Cliente {
	
	private Integer codigo;
	private Long codigoMaior = 1231231231l;
	private Double valorDecimal1 = 10.1;
	private Boolean status = false;
	private Float valorDecimal = 10.0f;
	private Short shor;
	private Byte bi;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Long getCodigoMaior() {
		return codigoMaior;
	}
	public void setCodigoMaior(Long codigoMaior) {
		this.codigoMaior = codigoMaior;
	}
	public Double getValorDecimal1() {
		return valorDecimal1;
	}
	public void setValorDecimal1(Double valorDecimal1) {
		this.valorDecimal1 = valorDecimal1;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Float getValorDecimal() {
		return valorDecimal;
	}
	public void setValorDecimal(Float valorDecimal) {
		this.valorDecimal = valorDecimal;
	}
	public Short getShor() {
		return shor;
	}
	public void setShor(Short shor) {
		this.shor = shor;
	}
	public Byte getBi() {
		return bi;
	}
	public void setBi(Byte bi) {
		this.bi = bi;
	}
	
	
}
