package base;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import base.model.Product;
import base.service.ProductDataReader;
import base.service.ProductDataWriter;

@SpringBootApplication
public class Task1DataReadingAndWrittingToFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task1DataReadingAndWrittingToFileApplication.class, args);

		List<Product> productList=ProductDataReader.readData();

		String messege=ProductDataWriter.writeData(productList);

		System.out.println(messege);
	}

}
