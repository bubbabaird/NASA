package com.theironyard.charlotte.demo.controller;


import com.theironyard.charlotte.demo.models.NASAData;
import com.theironyard.charlotte.demo.services.NASAService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by BUBBABAIRD on 5/22/17.
 */
@Controller
public class NASAController {
    // field defination
    NASAService nasaService;
    // standard constructor,
    public NASAController(NASAService nasaService) {
        this.nasaService = nasaService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String homepage(Model model, String q) {
        NASAData nasaData = nasaService.getData(q);
        // the first 'field' matches the template name
        model.addAttribute("nasa", nasaData.getCollection());
        return "home";
    }
}