package base.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import base.model.EmployeeJPA;

public interface IEmployeeDao extends JpaRepository<EmployeeJPA, Serializable> {

}
