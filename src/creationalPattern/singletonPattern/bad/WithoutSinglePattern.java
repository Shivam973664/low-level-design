package creationalPattern.singletonPattern.bad;

public class WithoutSinglePattern {

	public static void main(String[] args) {
		ApplicationSetting applicationSetting  = new ApplicationSetting();
		ApplicationSetting applicationSetting1  = new ApplicationSetting();
		System.out.println(applicationSetting.getApiKey() + " " + applicationSetting1.getApiKey());
		System.out.println(applicationSetting==applicationSetting1);
		
	}

}
