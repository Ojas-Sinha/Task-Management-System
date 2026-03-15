package com.example.taskmanager.config;

import com.example.taskmanager.model.User;
import com.example.taskmanager.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(UserRepository repo){

        return args -> {

            if(repo.count()==0){

                User lead = new User();
                lead.setName("Team Lead");
                lead.setEmail("lead@test.com");
                lead.setPassword("123");
                lead.setRole("TEAM_LEAD");

                User member1 = new User();
                member1.setName("John");
                member1.setEmail("member1@test.com");
                member1.setPassword("123");
                member1.setRole("MEMBER");

                User member2 = new User();
                member2.setName("Rahul");
                member2.setEmail("member2@test.com");
                member2.setPassword("123");
                member2.setRole("MEMBER");

                repo.save(lead);
                repo.save(member1);
                repo.save(member2);

            }

        };

    }

}