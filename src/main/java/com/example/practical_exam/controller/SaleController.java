package com.example.practical_exam.controller;

import com.example.practical_exam.entity.ProductEntity;
import com.example.practical_exam.entity.SaleEntity;
import com.example.practical_exam.service.ProductService;
import com.example.practical_exam.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping("/list")
    public String getFormCreate(ModelMap modelMap) {
        String view = "listSale";
        try {
            List<SaleEntity> sales = saleService.getAllSale();
            modelMap.addAttribute("sales", sales);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return view;

    }
}
