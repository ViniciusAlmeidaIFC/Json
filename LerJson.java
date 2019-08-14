import java.lang.reflect.Type;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LerJson {

	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		Type tipoLista = new TypeToken<ArrayList<Integer>>() {}.getType();
		//Local a onde irá armazenar o Json
		FileReader reader = new FileReader("C:\\Users\\Vinicius\\Desktop\\arrayjson.json");
		ArrayList<Integer> lista = gson.fromJson(reader, tipoLista);
		reader.close();
		System.out.println(lista);
	}

}
