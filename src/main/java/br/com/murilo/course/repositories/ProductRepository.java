package br.com.murilo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.murilo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
