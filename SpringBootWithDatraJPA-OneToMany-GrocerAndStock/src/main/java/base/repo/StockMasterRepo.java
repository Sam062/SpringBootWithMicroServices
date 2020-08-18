package base.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import base.entity.Stock;

public interface StockMasterRepo extends JpaRepository<Stock, Serializable> {
	List<Stock> findGrocerObjByItem(String item);

}
