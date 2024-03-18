package com.example.demo.Service;

import com.example.demo.Entity.Skills;

public interface SkillsService {
    // Define methods for CRUD operations or any additional business logic
    Skills saveSkill(Skills skill);
    Skills getSkillById(long id);
    // Other methods...
}
