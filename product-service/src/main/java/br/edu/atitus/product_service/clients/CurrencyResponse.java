package br.edu.atitus.product_service.clients;

public class CurrencyResponse {

	private Long id;
	private String source;
	private String target;
	private double conversionRate;
	private String environment;
	private double convertedValue;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public double getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public double getContertedValue() {
		return convertedValue;
	}
	public void setContertedValue(double contertedValue) {
		this.convertedValue = contertedValue;
	}
}
