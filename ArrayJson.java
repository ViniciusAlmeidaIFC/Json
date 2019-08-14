import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

import com.google.gson.Gson;


public class ArrayJson {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		System.out.print("Informe a quantidade de valores: ");
		int t = entrada.nextInt();
		
		for (int i = 0; i < t; i++) {
			System.out.print("->");
			lista.add(entrada.nextInt());
		}
				Gson gson = new Gson ();
				String json = gson.toJson(lista);
				//Local a onde irá armazenar o Json
				FileWriter writer = new FileWriter("C:\\Users\\Vinicius\\Desktop\\arrayjson.json");
				writer.write(json);
				writer.close();
		
		entrada.close();
	}

}
