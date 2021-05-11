package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.WorkoutData;
import org.launchcode.codingevents.models.Workout;
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


    @GetMapping
    public String displayAllExercises(Model model) {
        model.addAttribute("workouts", WorkoutData.getAll());
                return "workouts/index";
    }

    @GetMapping("create")
    public String renderCreateWorkoutForm() {
        return "workouts/create";
    }

    @PostMapping("create")
    public String createWorkout(@RequestParam String workoutName) {
        WorkoutData.add(new Workout(workoutName));
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteWorkoutForm(Model model) {
        model.addAttribute("title", "Delete Workout");
        model.addAttribute("workouts", WorkoutData.getAll());
        return "workouts/delete";
    }

    @PostMapping("delete")
    public String processDeleteWorkoutForm(@RequestParam(required = false) int[] workoutIds) {

        if (workoutIds != null) {
            for (int id : workoutIds) {
                WorkoutData.remove(id);
            }
        }
        return "redirect:";
        }
    }


