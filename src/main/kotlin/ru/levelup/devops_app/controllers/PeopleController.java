package ru.levelup.devops_app.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.levelup.devops_app.model.Person;
import ru.levelup.devops_app.service.BookService;
import ru.levelup.devops_app.service.PeopleService;


@RestController
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;
    private final BookService itemService;

    @Autowired
    public PeopleController(PeopleService peopleService, BookService itemService) {
        this.peopleService = peopleService;
        this.itemService = itemService;
    }


    @GetMapping()
    public String getPeople(Model model) {
        return null;
    }

    @GetMapping("/{id}")
    public String getPersonById(@PathVariable Long id,  Model model) {
        return null;
    }

    @GetMapping("/new")
    public String getFormToCreateNewPerson(Model model) {
        return null;
    }

    @PostMapping()
    public String createPerson(@ModelAttribute("newPerson") @Valid Person person, BindingResult bindingResult) {
        return null;
    }

    @GetMapping("/{id}/edit")
    public String getFormToUpdateCurrentPerson(@PathVariable("id") Long id ,Model model) {
        return null;
    }

    @PatchMapping("/{id}")
    public String editPerson(@PathVariable("id") Long id , @ModelAttribute("editPerson") @Valid Person person,
                             BindingResult bindingResult) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable("id") Long id) {
        return null;
    }

    @PatchMapping("/search")
    public String getPersonFromSearchById(@ModelAttribute("person") @Valid Person person, Model model) {
        return null;
    }
}
