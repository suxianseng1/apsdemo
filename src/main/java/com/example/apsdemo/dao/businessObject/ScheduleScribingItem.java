package com.example.apsdemo.dao.businessObject;

import com.example.apsdemo.dao.businessData.ScheduleScribingItemData;
import com.example.apsdemo.schedule.ScheduleTaskLine;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="A_ScheduleScribingItem")
public class ScheduleScribingItem extends ScheduleScribingItemData {

    @JsonIgnore
    @OneToOne(targetEntity = ScheduleTask.class)
    private ScheduleTask scheduleTask;

    @JsonIgnore
    @ManyToOne(targetEntity = TestScribingCenter.class)
    private TestScribingCenter testScribingCenter;

    public TestScribingCenter getTestScribingCenter() {
        return testScribingCenter;
    }

    public void setTestScribingCenter(TestScribingCenter testScribingCenter) {
        this.testScribingCenter = testScribingCenter;
    }

    public ScheduleTask getScheduleTask() {
        return scheduleTask;
    }

    public void setScheduleTask(ScheduleTask scheduleTask) {
        this.scheduleTask = scheduleTask;
    }

    public ScheduleScribingItem() {
    }

    public ScheduleScribingItem(String brief,int durationTime,TestScribingCenter center,ScheduleTaskLine line) {
        this.setScheduleTask(new ScheduleTask(line,this,durationTime*60));
        this.setSliceNr(center.getSliceNr());
        this.setWaferNr(center.getWaferNr());
        this.setTestScribingCenter(center);
        this.setBrief(brief);
    }
}
