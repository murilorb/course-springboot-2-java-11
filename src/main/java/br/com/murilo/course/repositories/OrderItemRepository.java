package br.com.murilo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.murilo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
