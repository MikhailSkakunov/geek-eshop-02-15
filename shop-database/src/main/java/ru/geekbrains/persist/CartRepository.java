package ru.geekbrains.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.persist.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{
}
