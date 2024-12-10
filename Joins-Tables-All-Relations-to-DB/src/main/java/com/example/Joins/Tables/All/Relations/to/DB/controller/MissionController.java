package com.example.Joins.Tables.All.Relations.to.DB.controller;

import com.example.Joins.Tables.All.Relations.to.DB.models.Mission;
import com.example.Joins.Tables.All.Relations.to.DB.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missions")
public class MissionController {

    @Autowired
    private MissionService missionService;

    @GetMapping
    public ResponseEntity<List<Mission>> getAllMissions() {
        List<Mission> missions = missionService.getAllMissions();
        return ResponseEntity.ok(missions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mission> getMissionById(@PathVariable Integer id) {
        Mission mission = missionService.getMissionById(id);
        return ResponseEntity.ok(mission);
    }

    @PostMapping
    public ResponseEntity<Mission> createMission(@RequestBody Mission mission) {
        Mission newMission = missionService.createMission(mission);
        return ResponseEntity.ok(newMission);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mission> updateMission(@PathVariable Integer id, @RequestBody Mission mission) {
        Mission updatedMission = missionService.updateMission(id, mission);
        return ResponseEntity.ok(updatedMission);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMission(@PathVariable Integer id) {
        missionService.deleteMission(id);
        return ResponseEntity.noContent().build();
    }
}
