package singletonPattern.good;

public class ApplicationSetting {
//step 1 create a static variable of this class so that static getInstance method can access it.
	private static ApplicationSetting instance;
	
	private String databaseurl;
	
	private String apiKey;

	//step 2 : make the constructor as private . so that no one can create the instance of this 
	//class
	private ApplicationSetting() {
		this.apiKey= " default value";
		this.databaseurl = "databbaseusrl default";
	}
	
	//this is the main method which will give you single instance.
	public static ApplicationSetting getInstance() {
		if(instance==null) {
//			this.instance = new ApplicationSetting(); // we can not call static variable using this
			instance = new ApplicationSetting();
		}
		return instance;
	}

	
	public String getDatabaseurl() {
		return databaseurl;
	}

	
	public String getApiKey() {
		return apiKey;
	}
	
	
}
