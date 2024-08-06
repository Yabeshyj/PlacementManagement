package com.tnsif.pm.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public Optional<College> getCollegeById(Long id) {
        return collegeRepository.findById(id);
    }

    public College saveCollege(College college) {
        return collegeRepository.save(college);
    }

    public void deleteCollege(Long id) {
        collegeRepository.deleteById(id);
    }
}


