package com.example.Joins.Tables.All.Relations.to.DB.service;

import com.example.Joins.Tables.All.Relations.to.DB.models.Mission;

import java.util.List;

public interface MissionService {
    List<Mission> getAllMissions();
    Mission getMissionById(Integer id);
    Mission createMission(Mission mission);
    Mission updateMission(Integer id, Mission mission);
    void deleteMission(Integer id);
}
