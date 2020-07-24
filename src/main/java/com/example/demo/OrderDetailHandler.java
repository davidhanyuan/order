package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/orderdetail")
@Transactional
public class OrderDetailHandler {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @GetMapping("/findAllDetail")
    public List<OrderDetail> findAllDetail(){
        return orderDetailRepository.findAll();
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        orderDetailRepository.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody OrderDetail detail){
        orderDetailRepository.save(detail);
    }

    @PostMapping("/save")
    public void save(@RequestBody OrderDetail detail){
        System.out.println(detail);
        orderDetailRepository.save(detail);
    }

    @GetMapping("/findByOrderID/{orderID}")
    public List<OrderDetail> findByOrderID(@PathVariable("orderID") int orderID){
        return orderDetailRepository.findByOrderID(orderID);
    }
}
