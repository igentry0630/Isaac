package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("workouts")
public class EventController {

    private static List<String> workouts = new ArrayList<>();

    @GetMapping
    public String displayAllExercises(Model model) {
        model.addAttribute("workouts", workouts);
        return "workouts/index";
    }

    @GetMapping("create")
    public String renderCreateWorkoutForm() {
        return "workouts/create";
    }

    @PostMapping("create")
    public String createWorkout(@RequestParam String workoutName) {
        workouts.add(workoutName);
        return "redirect:";
    }

}
