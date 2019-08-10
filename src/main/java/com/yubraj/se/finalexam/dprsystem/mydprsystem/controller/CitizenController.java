package com.yubraj.se.finalexam.dprsystem.mydprsystem.controller;

import com.yubraj.se.finalexam.dprsystem.mydprsystem.model.Citizen;
import com.yubraj.se.finalexam.dprsystem.mydprsystem.model.State;
import com.yubraj.se.finalexam.dprsystem.mydprsystem.service.CitizenService;
import com.yubraj.se.finalexam.dprsystem.mydprsystem.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CitizenController {

        @Autowired
        private CitizenService service;

        @Autowired
        private StateService stateService;

        @GetMapping(value = "/displayCitizenList")
        public String displayCitizens(ModelMap modelMap) {
            List<Citizen> citizenList = service.getAllCitizen();
            modelMap.addAttribute("citizenList", citizenList);
            double netIncome = service.getWholeNationalYearlyIncome(citizenList);
            modelMap.addAttribute("netIncome",netIncome);

            return "CitizenList";
        }

    @GetMapping(value = "/showCreateCitizen")
    public String displayCreatePage(Model model){
        List<State> states=stateService.getAllStates();
        model.addAttribute("states",states);
        model.addAttribute("citizen", new Citizen());
        // List<Supplier>
        return "createCitizenPage";
    }

    @PostMapping(value = "/savecitizen")
    public String saveCitizen(@ModelAttribute("citizen") Citizen citizen, ModelMap modelMap) {
        Citizen citizenSaved = service.saveCitizen(citizen);
        String message = "Student saved with id" + citizenSaved.getCitizenId();
        modelMap.addAttribute("message", message);
        return "createCitizenPage";
    }

}
