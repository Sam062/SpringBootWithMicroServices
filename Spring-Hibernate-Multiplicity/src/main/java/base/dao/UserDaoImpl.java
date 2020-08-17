package base.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import base.entity.UserEntity;

public interface UserDaoImpl extends JpaRepository<UserEntity, Serializable>{
}
