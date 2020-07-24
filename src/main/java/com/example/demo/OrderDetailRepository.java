package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long> {

    @Query(value = "select * from t_order_detail where OrderID = :oid",nativeQuery = true)
    List<OrderDetail> findByOrderID(@Param("oid") int oid);
}
