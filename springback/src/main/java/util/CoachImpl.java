package util;

import org.springframework.stereotype.Component;

@Component
public class CoachImpl implements Coach, Students {
    @Override
    public String getDailyWorkout() {
        return "yes its coach!!!";
    }

    @Override
    public String viewStudents() {
        return "yes its students!!!";
    }
}
