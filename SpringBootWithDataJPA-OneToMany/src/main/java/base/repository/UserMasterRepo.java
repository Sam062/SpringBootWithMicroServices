package base.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import base.model.UserEntity;

public interface UserMasterRepo extends JpaRepository<UserEntity, Serializable> {

}
