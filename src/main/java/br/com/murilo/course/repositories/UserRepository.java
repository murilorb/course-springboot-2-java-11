package br.com.murilo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.murilo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
