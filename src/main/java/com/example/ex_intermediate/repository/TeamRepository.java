package com.example.ex_intermediate.repository;

import com.example.ex_intermediate.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeamRepository {

    private static final RowMapper<Team> TEAM_ROW_MAPPER = (rs, i) -> {
        Team team = new Team();
        team.setId(rs.getInt("id"));
        team.setLeagueName(rs.getString("league_name"));
        team.setTeamName(rs.getString("team_name"));
        team.setHeadquarters(rs.getString("headquarters"));
        team.setInauguration(rs.getString("inauguration"));
        team.setHistory(rs.getString("history"));
        return team;
    };

    @Autowired
    private NamedParameterJdbcTemplate template;

    // 全てのチームを発足日で昇順に取得する
    public List<Team> findAll() {
        String sql = "SELECT id,league_name,team_name,headquarters,inauguration,history FROM teams ORDER BY inauguration";
        return template.query(sql, TEAM_ROW_MAPPER);
    }

    // IDでチームを取得する
    public Team findById(Integer id) {
        String sql = "SELECT id,league_name,team_name,headquarters,inauguration,history FROM teams WHERE id = :id";
        MapSqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
        return template.queryForObject(sql, param, TEAM_ROW_MAPPER);
    }
}