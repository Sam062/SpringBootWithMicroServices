package base.service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.stereotype.Service;

import base.model.Product;

@Service
public class ProductDataReader {
	public static List<Product> readData(){
		List<Product> productList=null;
		Product p=null;
		//	----- ONE MORE WAY TO READ FILE DATA ------
		//		StringBuilder data=new StringBuilder();
		//		try {
		//			FileReader reader=new FileReader("F:\\productInput.txt");
		//			int i;
		//			while((i=reader.read())!=-1) {
		//				data.append((char)i);
		//			}
		//			
		//		} 

		try{
			//Reading data From file
			String data=new String(Files.readAllBytes(Paths.get("F:\\productInput.txt")));

			//Converting data into String Tokens from newLine character(row by row)
			StringTokenizer token=new StringTokenizer(data,"\n");

			productList=new ArrayList<>();

			//taking data From Row separated with comma(,)
			while(token.hasMoreTokens()) {
				StringTokenizer oneRow=new StringTokenizer(token.nextToken(),",");
				while (oneRow.hasMoreTokens()) {
					p=new Product();
					p.setPid(Integer.parseInt(oneRow.nextToken()));
					p.setPname(oneRow.nextToken());
					p.setPcost(Double.parseDouble(oneRow.nextToken()));

					//Adding Product type Data To List of Products
					productList.add(p);
				}
			}

		} 
		catch (Exception e) {
			System.out.println("FILE NOT FOUND");
			e.printStackTrace();
		}
		return productList;
	}
}
