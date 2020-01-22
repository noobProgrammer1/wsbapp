package com.skorupa.springWebApp.Controllers;

import com.skorupa.springWebApp.model.Customer;
import com.skorupa.springWebApp.repositories.CustomerrRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class CustomerController {

    private CustomerrRepository customerrRepository;

    public CustomerController(CustomerrRepository authorRepository) {
        this.customerrRepository = authorRepository;
    }

    @GetMapping({"/","/customers"})
    public String getCustomers(Model model) {

        model.addAttribute("customers", customerrRepository.findAll());
        return "customers";
    }

    @GetMapping("/add")
    public String add(Customer customer) {
        return "add";
    }


    @PostMapping("/addcustomer")
    public String addCustomer(@Valid Customer customer, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add";
        }

        customerrRepository.save(customer);
        model.addAttribute("customers", customerrRepository.findAll());
        return "congrat";
    }

}
