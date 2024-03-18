package com.example.demo.controller;

import com.example.demo.Entity.Skills;
import com.example.demo.Service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    private final SkillsService skillsService;

    @Autowired
    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @PostMapping("/add")
    public Skills addSkill(@RequestBody Skills skill) {
        return skillsService.saveSkill(skill);
    }

    @GetMapping("/{id}")
    public Skills getSkillById(@PathVariable long id) {
        return skillsService.getSkillById(id);
    }
    
    // Implement other REST endpoints as needed...
}
