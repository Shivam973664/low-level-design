package behavioural.templateMethodPattern.good;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import behavioural.templateMethodPattern.User;

public class JSONParser extends DataParser{

	@Override
	public void readFile() {
		ObjectMapper obj = new ObjectMapper();
		try {
			List<User> users = obj.readValue(bufferReader,new TypeReference<List<User>>() {});
			users.forEach(System.out :: println);
			
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	
}
