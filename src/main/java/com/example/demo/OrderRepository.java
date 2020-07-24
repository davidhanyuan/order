package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

    @Query(value = "select * from t_order where UserID = :uid order by OrderID desc",nativeQuery = true)
    List<Order> findAllByUid(@Param("uid") long uid);

    @Query(value = "update t_order set State = :state where OrderID = :oid",nativeQuery = true)
    @Modifying
    void updateState(@Param("oid") long oid, @Param("state") int state);

    @Query(value = "update t_order set State = 4 where OrderID = :oid",nativeQuery = true)
    @Modifying
    void receiveAction(@Param("oid") long oid);

    @Query(value = "update t_order set State = 5 where OrderID = :oid",nativeQuery = true)
    @Modifying
    void commentAction(@Param("oid") long oid);

    @Query(value = "select * from t_order where RestaurantID = :rid limit :index,:limit",nativeQuery = true)
    List<Order> findAllByRid(@Param("rid") long rid, @Param("index") int index, @Param("limit") int limit);
}
