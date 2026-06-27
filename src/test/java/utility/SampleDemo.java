package utility;

public class SampleDemo {

	public static void main(String[] args) throws Exception {
		
		
		
		ReadConfig conf = new ReadConfig();
		String url = conf.get_AppURL();
		String username=conf.get_userName();
		String password=conf.get_password();
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);

	}

}
