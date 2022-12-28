package org.example.login.repository;

import org.example.login.entity.ShortSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IShortScheduleRepository extends JpaRepository<ShortSchedule, Long> {
}
