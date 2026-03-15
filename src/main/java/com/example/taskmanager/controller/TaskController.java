package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskService service;

    @PostMapping("/assign")
    public Task assignTask(@RequestBody Task task){

        return service.assignTask(task);

    }

    @GetMapping("/user/{userId}")
    public List<Task> getTasks(@PathVariable Long userId){
        return service.getTasks(userId);
    }

    @PutMapping("/update/{taskId}")
    public Task updateTask(@PathVariable Long taskId,
                           @RequestParam String status){

        return service.updateStatus(taskId,status);

    }

    @GetMapping
    public List<Task> getAllTasks(){
        return service.getAllTasks();
    }

}