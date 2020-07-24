package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@RequestMapping("/order")
@RestController
@Transactional
public class OrderHandler {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/findAllByRid/{rid}/{page}/{limit}")
    public List<Order> findAllByRid(@PathVariable("rid") int rid, @PathVariable("page") int page, @PathVariable("limit") int limit){
        return orderRepository.findAllByRid(rid,(page-1)*limit,limit);
    }

    @PutMapping("/updateState/{oid}/{state}")
    public void updateSate(@PathVariable("oid") int oid, @PathVariable("state") int state){
        orderRepository.updateState(oid,state);
    }

    @PostMapping("/save")
    public long save(@RequestBody Order order){
        order.date = new Date();
        order.arrivingtime = new Date();
        orderRepository.save(order);
        return order.getOrderid();
    }

    @GetMapping("/findAll")
    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    @GetMapping("/findAllByUid/{uid}")
    public List<Order> findAllByUid(@PathVariable("uid") long uid){
        return orderRepository.findAllByUid(uid);
    }



    @GetMapping("/findByOid/{oid}")
    public Order findAllByRid(@PathVariable("oid") long oid){
        return orderRepository.findById(oid).get();
    }

    @PutMapping("/update")
    public void update(@RequestBody Order order){
        orderRepository.save(order);
    }

    @PutMapping("/receiveaction/{oid}")
    public void receiveAction(@PathVariable("oid") long oid){
        orderRepository.receiveAction(oid);
    }

    @PutMapping("/commentaction/{oid}")
    public void commentAction(@PathVariable("oid") long oid){
        orderRepository.commentAction(oid);
    }

    @GetMapping("findAnOrder/{oid}")
    public Order findAnOrder(@PathVariable("oid") long oid){
        return orderRepository.findById(oid).get();
    }

}
