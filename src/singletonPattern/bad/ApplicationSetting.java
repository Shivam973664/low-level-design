package singletonPattern.bad;

public class ApplicationSetting {

	private String apiKey;
	
	private String databaseUrl;
	
	public ApplicationSetting() {
		this.apiKey= "defaultApiKey";
		this.databaseUrl = "defaultDatabaseUrl";
	}
	
	public String getApiKey() {
		return apiKey;
	}
	
	public String getDatabaseUrl() {
		return this.databaseUrl;
	}
	

}
