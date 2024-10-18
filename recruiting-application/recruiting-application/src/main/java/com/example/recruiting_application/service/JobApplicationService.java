package com.example.recruiting_application.service;

import com.example.recruiting_application.dto.HistoryDTO;
import com.example.recruiting_application.dto.JobApplicationDTO;
import com.example.recruiting_application.model.JobApplication;
import com.example.recruiting_application.repository.JobApplicationRepo;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class JobApplicationService {
    private JobApplicationRepo jobApplicationRepo;

    public JobApplicationService(JobApplicationRepo jobApplicationRepo) {
        this.jobApplicationRepo = jobApplicationRepo;
    }

    public JobApplication applyForJob(JobApplication jobApplication) {
        return jobApplicationRepo.save(jobApplication);
    }


    public List<JobApplicationDTO> getAllApplications() {
        return jobApplicationRepo.findAllApplicationsWithUserDetails();
    }
//    public JobApplication getApplicationById(Long id) {
//        Optional<JobApplication> optionalApplication = jobApplicationRepo.findById(id);
//        return optionalApplication.orElse(null); // Return the application if found, else null
//    }


    public boolean existsByUserIdAndJobId(Long userId, Long jobId) {
        return jobApplicationRepo.existsByUserIdAndJobId(userId, jobId);
    }

    public JobApplication getApplicationById(Long id) {
        return jobApplicationRepo.findById(id).orElse(null);
    }

    public void save(JobApplication jobApplication) {
        jobApplicationRepo.save(jobApplication);
    }

//    public void delete(JobApplication jobApplication) {
//        jobApplicationRepo.delete(jobApplication);
//    }

    public void update(JobApplication jobApplication) {
        jobApplicationRepo.save(jobApplication);
    }

    public long countAllApplications() {
        return jobApplicationRepo.count();
    }

    public long countApplicationsByStatus(String status) {
        return jobApplicationRepo.countByStatus(status);
    }


}
