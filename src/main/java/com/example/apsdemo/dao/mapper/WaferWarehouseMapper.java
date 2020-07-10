package com.example.apsdemo.dao.mapper;

import com.example.apsdemo.dao.camstarObject.WaferWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WaferWarehouseMapper extends JpaRepository<WaferWarehouse,String>, JpaSpecificationExecutor<WaferWarehouse> {
}
