package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepository repo;

    public Task assignTask(Task task){

        task.setStatus("PENDING");

        return repo.save(task);
    }
    
    public List<Task> getAllTasks(){
        return repo.findAll();
    }

    public List<Task> getTasks(Long userId){

        return repo.findByAssignedUsers_Id(userId);
    }

    public Task updateStatus(Long taskId,String status){

        Task task = repo.findById(taskId).get();

        task.setStatus(status);

        return repo.save(task);
    }

}