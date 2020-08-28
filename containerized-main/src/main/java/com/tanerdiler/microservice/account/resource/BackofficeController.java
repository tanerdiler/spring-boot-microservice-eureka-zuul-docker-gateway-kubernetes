package com.tanerdiler.microservice.account.resource;

import com.tanerdiler.microservice.account.dto.OrderDTO;
import com.tanerdiler.microservice.account.model.Account;
import com.tanerdiler.microservice.account.model.Order;
import com.tanerdiler.microservice.account.model.Product;
import com.tanerdiler.microservice.account.repository.AccountServiceClient;
import com.tanerdiler.microservice.account.repository.OrderServiceClient;
import com.tanerdiler.microservice.account.repository.ProductServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BackofficeController {

    private static final Logger LOG = LoggerFactory.getLogger(BackofficeController.class);

    @Autowired
    private ProductServiceClient productService;
    @Autowired
    private OrderServiceClient orderService;
    @Autowired
    private AccountServiceClient accountService;

    @GetMapping("/orders")
    public ResponseEntity<List<OrderDTO>> getOrders() {

        LOG.warn("Fetching all orders...");
        List<Order> orders = orderService.findAll();
        Map<Integer, Account> accounts = new HashMap<>();
        Map<Integer, Product> products = new HashMap<>();

        LOG.warn("Fetching accounts of orders...");
        orders.stream()
                .filter(o -> !accounts.containsKey(o.getAccountId()))
                .map(o -> accountService.findById(o.getAccountId()))
                .forEach(a -> accounts.put(a.getId(), a));

        LOG.warn("Fetching products of orders...");
        orders.stream()
                .filter(o -> !products.containsKey(o.getProductId()))
                .map(o -> productService.findById(o.getProductId()))
                .forEach(a -> products.put(a.getId(), a));

        LOG.warn("Generating composite of orders...");
        List<OrderDTO> orderDTOList = new ArrayList<>();
        orders.forEach(o -> {
            orderDTOList.add(new OrderDTO(
                    o.getId(),
                    o.getCount(),
                    o.getPrice(),
                    o.getDiscountedPrice(),
                    accounts.get(o.getAccountId()).getFullname(),
                    products.get(o.getProductId()).getName()
            ));
        });

        return ResponseEntity.ok(orderDTOList);

    }
}
