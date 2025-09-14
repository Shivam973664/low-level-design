package creationalPattern.singletonPattern.good;

public class WithSingletonPattern {

	public static void main(String[] args) {
//		ApplicationSetting applicationSettng = new ApplicationSetting();
		ApplicationSetting applicationset1 = ApplicationSetting.getInstance();
		ApplicationSetting applicationset2 = ApplicationSetting.getInstance();
		System.out.println(applicationset1 == applicationset2);
	}
}
