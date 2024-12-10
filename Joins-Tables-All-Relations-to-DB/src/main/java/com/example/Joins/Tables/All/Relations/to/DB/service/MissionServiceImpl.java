package com.example.Joins.Tables.All.Relations.to.DB.service;

import com.example.Joins.Tables.All.Relations.to.DB.models.Mission;
import com.example.Joins.Tables.All.Relations.to.DB.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissionServiceImpl implements MissionService {

    @Autowired
    private MissionRepository missionRepository;

    @Override
    public List<Mission> getAllMissions() {
        return missionRepository.findAll();
    }

    @Override
    public Mission getMissionById(Integer id) {
        return missionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mission not found with id " + id));
    }

    @Override
    public Mission createMission(Mission mission) {
        return missionRepository.save(mission);
    }

    @Override
    public Mission updateMission(Integer id, Mission mission) {
        if (!missionRepository.existsById(id)) {
            throw new RuntimeException("Mission not found with id " + id);
        }
        mission.setId(id);
        return missionRepository.save(mission);
    }

    @Override
    public void deleteMission(Integer id) {
        if (!missionRepository.existsById(id)) {
            throw new RuntimeException("Mission not found with id " + id);
        }
        missionRepository.deleteById(id);
    }
}
//