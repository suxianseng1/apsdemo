package com.example.apsdemo.dao.mapper;

import com.example.apsdemo.dao.camstarObject.WaferModelWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WaferModelWarehouseMapper extends JpaRepository<WaferModelWarehouse,String>, JpaSpecificationExecutor {
}
