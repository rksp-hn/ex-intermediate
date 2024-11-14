package com.example.ex_intermediate.service;

import com.example.ex_intermediate.domain.Team;
import com.example.ex_intermediate.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> showList() {
        return teamRepository.findAll();
    }

    public Team showDetail(Integer id) {
        return teamRepository.findById(id);
    }
}