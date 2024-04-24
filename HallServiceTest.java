package com.example.Cinesoft.Services;

import com.example.Cinesoft.Entities.Hall;
import com.example.Cinesoft.Repositories.HallRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HallServiceTest {
//    HallService hallService;
//    HallRepository hallRepository;
//    @Before
//    public void before(){
//        hallService = new HallService(hallRepository);
//    }

//    @Test
//    void getAllHalls() {
//        Hall hall1 = new Hall();
//        Hall hall2 = new Hall();
//        hallService.addHallToDB(hall1);
//        hallService.addHallToDB(hall2);
//        ArrayList<Hall> arr1 = new ArrayList<>();arr1.add(hall1);arr1.add(hall2);
//        ArrayList<Hall> arr2 = (ArrayList<Hall>) hallService.getAllHalls();
//        assertEquals(arr1,arr2);
//    }
//
//    @Test
//    void addHallToDB() {
//        Hall hall = new Hall();
//        assertEquals(true,hallService.addHallToDB(hall));
//    }
//    @Test(expected = Exception.class)
//    void addEmptyHallToDB() {
//        Hall hall = null;
//        hallService.addHallToDB(hall);
//    }
//
//    @Test
//    void changeStatus() {
//        Hall hall = new Hall(3,true,1000);
//        hallService.addHallToDB(hall);
//        hallService.changeStatus(hall.getId());
//        assertEquals(false,hall.isStatus());
//    }
//    @Test(expected = Exception.class)
//    void changeStatusOfNothing() {
//        Hall hall = new Hall();
//        hallService.deleteById(hall.getId());
//    }
//
//    @Test
//    void deleteById() {
//        Hall hall = new Hall();
//        hallService.addHallToDB(hall);
//        assertEquals(true,hallService.deleteById(hall.getId()));
//    }
//    @Test(expected = Exception.class)
//    void changeStatusOfNothing() {
//        Hall hall = new Hall();
//        hallService.changeStatus(hall.getId());
//    }
}