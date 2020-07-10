package com.example.apsdemo.dao.mapper;

import com.example.apsdemo.dao.businessObject.ScheduleTestItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ScheduleTestItemMapper extends JpaSpecificationExecutor<ScheduleTestItem>, JpaRepository<ScheduleTestItem,Long> {
}
