package base.iContactMaster;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import base.entity.CustomerMasterEntity;

public interface ICustomerMaster extends CrudRepository<CustomerMasterEntity, Serializable> {
	
	// **********FIND BYB CUST NAME -----------------------
	@Query("FROM CustomerMasterEntity WHERE custName=:name")
	public CustomerMasterEntity findByCustName(String name);
	
	
	// **********FIND BYB CUST NAME AND CUST MOBILE -----------------------
	@Query("FROM CustomerMasterEntity WHERE custName=:name AND custMobile=:mob")
	public CustomerMasterEntity findByCustNameAndCustMobile(String name, String mob);
	
	
	// **********FIND BYB CUST NAME OR CUST MOBILE -----------------------
	@Query("FROM CustomerMasterEntity WHERE custName=:name OR custMobile=:mob")
	public CustomerMasterEntity findByCustNameOrCustMobile(String name, String mob);
	
	
	/*    NOT WORKING FINE
	 * // ********** UPDATE RECORD -----------------------
	 * 
	 * @Modifying
	 * 
	 * @Query(value =
	 * "UPDATE CustomerMasterEntity SET custName=:cname, custMobile=:cmob WHERE custId=:cid"
	 * ,nativeQuery = true) public void updateRecord(Integer cid, String cname, Long
	 * cmob);
	 * 
	 * 
	 * // ********** INSERT RECORD -----------------------
	 * 
	 * @Query("INSERT INTO CustomerMasterEntity values( :cid, :cname, :cmob)")
	 * public void insertRecord(Integer cid, String cname, Long cmob);
	 */
	

}
