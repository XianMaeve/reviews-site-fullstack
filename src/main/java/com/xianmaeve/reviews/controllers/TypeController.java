package com.xianmaeve.reviews.controllers;

import com.xianmaeve.reviews.models.Type;
import com.xianmaeve.reviews.repositories.TypeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TypeController {

    @Resource
    private TypeRepository typeRepo;

    @RequestMapping({"/types", "/", ""})
    public String displayTypes(Model model) {
        model.addAttribute("types", typeRepo.findAll());
        return "typesTemplate";
    }

   @GetMapping("/types/{type}")
    public String displayType(@PathVariable String value, Model model) {
        Type retrievedType = typeRepo.findTypeByValue(value);
        model.addAttribute("type", retrievedType);
        return "typeTemplate";
   }
}
