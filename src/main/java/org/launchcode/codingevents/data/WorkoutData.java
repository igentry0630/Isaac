package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Workout;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WorkoutData {
//    need a place to put workout
 private static Map<Integer, Workout> workouts = new HashMap<>();

//    get all workout
    public static Collection<Workout> getAll() {
        return workouts.values();
    }


//    get a single workout
    public static Workout getById(int id) {
        return workouts.get(id);
    }
//    add a workout
    public static void add(Workout workout) {
        workouts.put(workout.getId(), workout);
    }

//    remove an workout
    public static void remove(int id) {
        workouts.remove(id);
    }
}
