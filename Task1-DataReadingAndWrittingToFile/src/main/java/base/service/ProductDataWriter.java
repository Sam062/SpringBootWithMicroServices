package base.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import base.model.Product;

@Service
public class ProductDataWriter {
	public static String writeData(List<Product> products) {
		//Applying Streams filter
		List<Product> filterdProducts=products.stream().filter(p->p.getPcost()>5000.0).collect(Collectors.toList());
		StringBuilder builder=new StringBuilder();
		for (Product product : filterdProducts) {
			builder.append(product.getPid()+","+product.getPname()+","+product.getPcost()+"\n");
		}
		StringBuilder finalMsg=null;
		try {
			FileWriter writer=new FileWriter("F:\\output.txt");
			writer.write(builder.toString());
			writer.close();
			finalMsg=new StringBuilder().append("AFTER FILTER DATA WRITTEN TO FILE...");

		} catch (IOException e) {
			finalMsg=new StringBuilder().append("DATA COULDN'T BE WRITTEN TO FILE...");
			e.printStackTrace();
		}

		return finalMsg.toString();
	}
}
