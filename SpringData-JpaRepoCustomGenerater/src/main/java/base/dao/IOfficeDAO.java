package base.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import base.model.Office;

public interface IOfficeDAO extends JpaRepository<Office, Serializable> {

}
