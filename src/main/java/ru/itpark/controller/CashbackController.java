package ru.itpark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.service.CashbackService;

@Controller
public class CashbackController {
    private final CashbackService service;


    public CashbackController(CashbackService service) {
        this.service = service;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("welcome", "Enter your data");

        return "index";
    }

    @PostMapping
    public String index(Model model, @RequestParam int sumCategorySimple, @RequestParam int sumCategoryPriority, @RequestParam int sumCategorySuper) {
        model.addAttribute("welcome", "Enter your data");


        model.addAttribute("cashback", service.cashBack(sumCategorySimple, sumCategoryPriority, sumCategorySuper));

        return "index";
    }
}