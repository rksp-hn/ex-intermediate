package com.example.ex_intermediate.controller;

import com.example.ex_intermediate.domain.Team;
import com.example.ex_intermediate.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/showList")
    public String showList(Model model) {
        List<Team> teamList = teamService.showList();
        model.addAttribute("teamList", teamList);
        return "teams/list";
    }

    @GetMapping("/showDetail/{id}")
    public String showDetail(@PathVariable("id") String id, Model model) {
        Integer teamId=Integer.parseInt(id);
        Team team = teamService.showDetail(teamId);
        model.addAttribute("team", team);
        return "teams/detail";
    }
}