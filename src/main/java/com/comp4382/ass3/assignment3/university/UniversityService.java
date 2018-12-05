package com.comp4382.ass3.assignment3.university;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * UniversityService
 */
@Service
public class UniversityService {

    private static final Logger logger = Logger.getLogger("University Service");

    @Autowired
    private UniversityRepository universityRepository;

    public Page<University> getUniversities(Pageable page) {
        logger.info("get universities");
        return universityRepository.findAll(page);
    }

    public University getUniversityById(Integer id) {
        logger.info("get university By Id");
        return universityRepository.getOne(id);
    }

    public University save(University university) {
        logger.info("Save university");
        return universityRepository.save(university);
    }

    public void delete(University university) {
        logger.info("Delete university");
        universityRepository.delete(university);
    }

}