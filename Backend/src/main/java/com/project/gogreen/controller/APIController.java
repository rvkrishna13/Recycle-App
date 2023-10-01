package com.project.gogreen.controller;

import com.project.gogreen.config.JwtUtil;
import com.project.gogreen.model.Product;
import com.project.gogreen.model.User;
import com.project.gogreen.model.cart.CartItem;
import com.project.gogreen.model.cart.CartItemPK;
import com.project.gogreen.service.CartItemService;
import com.project.gogreen.service.JwtUserDetailsService;
import com.project.gogreen.service.ProductService;
import com.project.gogreen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class APIController {
//Task 11: Write code for API controller here
}
