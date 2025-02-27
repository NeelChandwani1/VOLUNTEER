package com.volunteermatching.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.volunteermatching.model.Volunteer;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
}
