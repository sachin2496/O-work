package net.javaguides.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.dao.customerdao;
import net.javaguides.springboot.dao.techniciandao;
import net.javaguides.springboot.model.customer;
import net.javaguides.springboot.model.technician;


@Service
public class customerserviceimpl {
    
    
    @Autowired
    customerdao custdao;
    
    public void addcustomer(customer cust)
    {
        int ctcust = custdao.countbyemail(cust.getEmail());
        if(ctcust==0)
        {
            custdao.insertcustomer(cust);
            
            System.out.println("successfully added customer");
        }
        else
        {
            System.out.println("user already exist");
        }
    }

}
