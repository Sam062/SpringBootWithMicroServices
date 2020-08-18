package base.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import base.entity.Grocer;

public interface GrocerMasterRepo extends JpaRepository<Grocer, Serializable> {

}
