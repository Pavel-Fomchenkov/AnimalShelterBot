package com.example.ShelterBot.bot.repository;

import com.example.ShelterBot.bot.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}
