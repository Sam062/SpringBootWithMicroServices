package base.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import base.entity.BookEntity;

public interface IBookRepo extends JpaRepository<BookEntity, Serializable>{

}
