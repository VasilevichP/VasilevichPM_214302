package com.example.Cinesoft.Services;

import com.example.Cinesoft.Entities.Session;
import com.example.Cinesoft.Repositories.SessionRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SessionServiceTest {
//    SessionService sessionService;
//    SessionRepository sessionRepository;
//    @Before
//    public  void setUp(){
//        sessionService=new SessionService(sessionRepository);
//    }
//
//    @Test
//    void getAllSessions() {
//        Session ses1 = new Session();
//        Session ses2 = new Session();
//        sessionService.createSession(ses1);
//        sessionService.createSession(ses2);
//        ArrayList<Session> arr1 = new ArrayList<>();arr1.add(ses1);arr1.add(ses2);
//        ArrayList<Session> arr2 = (ArrayList<Session>) sessionService.getAllSessions();
//        assertEquals(arr1,arr2);
//    }
//
//    @Test
//    void createSession() {
//        Session session = new Session();
//        assertEquals(true,sessionService.createSession(session));
//    }
//    @Test(expected = Exception.class)
//    void createNullSession() {
//        Session session = null;
//        sessionService.createSession(session);
//    }
//
//    @Test
//    void updateSession() {
//        Session session = new Session(2222L,301L, LocalDate.now(), LocalTime.now(),LocalTime.now().plusHours(2));
//        sessionService.createSession(session);
//        session.setDate(LocalDate.now().plusDays(2));
//        assertEquals(true,sessionService.updateSession(session));
//
//    }
//    @Test(expected = Exception.class)
//    void updateNotSavedSession() {
//        Session session = new Session(2222L,301L, LocalDate.now(), LocalTime.now(),LocalTime.now().plusHours(2));
//        session.setDate(LocalDate.now().plusDays(2));
//        sessionService.updateSession(session);
//
//    }
//    @Test
//    void deleteSession() {
//        Session session = new Session();
//        sessionService.createSession(session);
//        assertEquals(true,sessionService.deleteSession(session.getId()));
//    }
//    @Test(expected = Exception.class)
//    void deleteNotSavedSession() {
//        Session session = new Session();
//        sessionService.deleteSession(session.getId());
//    }
}