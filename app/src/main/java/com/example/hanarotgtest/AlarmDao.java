package com.example.hanarotgtest;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AlarmDao {

    // 추가
    @Insert
    void setInsertAlarm(Alarm alarm);

    // 수정
    @Update
    void setUpdateAlarm(Alarm alarm);

    // 삭제
    @Delete
    void setDeleteAlarm(Alarm alarm);

    // 쿼리 - 조희 (모든 알람 조회)
    @Query("select * from Alarm")
    List<Alarm> getAlarm();


}
