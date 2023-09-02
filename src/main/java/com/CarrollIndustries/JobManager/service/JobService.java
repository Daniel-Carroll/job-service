package com.CarrollIndustries.JobManager.service;


import com.CarrollIndustries.JobManager.dto.Job;
import com.CarrollIndustries.JobManager.dto.SearchJobRequest;
import com.CarrollIndustries.JobManager.dto.SubmitJobRequest;

import java.util.List;

public interface JobService {
    public Job submitJob(SubmitJobRequest submitRequest);
    public Job getJob(int jobId);
    public List<Job> searchJobs(SearchJobRequest searchRequest);
}
