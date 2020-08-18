package base.contoller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import base.entity.Grocer;
import base.entity.Stock;
import base.repo.GrocerMasterRepo;
import base.repo.StockMasterRepo;

@RestController
public class GrocerController {
	@Autowired
	private GrocerMasterRepo grepo;
	@Autowired
	private StockMasterRepo srepo;

	@GetMapping("/save")
	public String saveGrocer() {
		Grocer g=new Grocer();
		g.setGrocerID(101);
		g.setGrocerName("SAM");
		Stock s1=new Stock(111, "PEN", g);
		Stock s2=new Stock(222, "INK", g);
		Stock s3=new Stock(333, "COPY", g);
		g.setStock(List.of(s1,s2,s3));

		Grocer g2=new Grocer();
		g2.setGrocerID(102);
		g2.setGrocerName("TOM");
		Stock ss1=new Stock(1111, "PEN", g2);
		Stock ss2=new Stock(2222, "BIKE", g2);
		Stock ss3=new Stock(3333, "CAR", g2);
		g2.setStock(List.of(ss1,ss2,ss3));

		Grocer save = grepo.save(g);
		Grocer save2 = grepo.save(g2);
		if(save!=null && save2!=null)
			return "SUCCESS";
		return "FAILURE";
	}
	@GetMapping("/findByitem/{item}")
	public List<String> findByItem(@PathVariable("item") String item) {
		List<Stock> stock= srepo.findGrocerObjByItem(item);
		List<String> collect = stock.stream().map(s->{
			String s1=s.getGrocerObj().getGrocerName();
			return s1;
		}).collect(Collectors.toList());
		//		System.out.println("GROCER ****** "+s);
		//		return ""+s.getGrocerID()+" "+s.getGrocerName();
		//		return "FOUND ::"+s.getGrocerObj().getGrocerName();
		return collect;
	}

}
