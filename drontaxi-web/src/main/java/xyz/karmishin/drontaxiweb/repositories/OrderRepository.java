package xyz.karmishin.drontaxiweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.karmishin.drontaxiweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
