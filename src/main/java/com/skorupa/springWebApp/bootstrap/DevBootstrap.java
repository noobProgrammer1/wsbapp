package com.skorupa.springWebApp.bootstrap;

import com.skorupa.springWebApp.model.Customer;
import com.skorupa.springWebApp.repositories.CustomerrRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


//@Component
//public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
//
//    private CustomerrRepository customerrRepository;
//
//
//    public DevBootstrap(CustomerrRepository authorRepository) {
//        this.customerrRepository = authorRepository;
//        }
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        initData();
//    }
//
//    private void initData(){
//
//
//
//        //ERIC
//        Customer eric = new Customer(2l,"Eric","Evans");
//
//        Customer rod = new Customer(3l,"Rod", "Johnson");
//        customerrRepository.save(eric);
//
//        //ROD
//
//
//        customerrRepository.save(rod);
//
//
//    }
//
//
//}
