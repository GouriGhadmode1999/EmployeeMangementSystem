package com.example.demo.ServiceImpl;

import com.example.demo.Entity.Skills;
import com.example.demo.Service.SkillsService;
import com.example.demo.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsServiceImpl implements SkillsService {

    private final SkillsRepository skillsRepository;

    @Autowired
    public SkillsServiceImpl(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    @Override
    public Skills saveSkill(Skills skill) {
        return skillsRepository.save(skill);
    }

    @Override
    public Skills getSkillById(long id) {
        return skillsRepository.findById(id).orElse(null);
    }
    
    // Implement other methods as needed...
}
