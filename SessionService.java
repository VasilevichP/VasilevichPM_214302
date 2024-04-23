package com.example.Cinesoft.Services;

import com.example.Cinesoft.Entities.Movie;
import com.example.Cinesoft.Entities.Session;
import com.example.Cinesoft.Repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class SessionService {
    private final SessionRepository sessionRepository;
    @Autowired
    public SessionService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public Iterable<Session> getAllSessions(){
        Iterable<Session> sessions =sessionRepository.findAll();
        return sessions;
    }
    public boolean createSession(Session session){
        try {
            sessionRepository.save(session);return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public Iterable<Session> findByDateAndHall(LocalDate date,Long id){
        return sessionRepository.findAllByDateAndHall(date,id);
    }
    public Session getSessionById(Long id){
        Optional<Session> optSession = sessionRepository.findById(id);
        return optSession.get();
    }
    public boolean updateSession(Session session){
        try {
            sessionRepository.save(session);return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public boolean deleteSession (Long id){
        try {
            sessionRepository.deleteById(id);return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public void deleteShown(LocalDate date){
        Iterable<Session> sessions = sessionRepository.findAll();
        for (Session s: sessions) if (s.getDate().isBefore(date)) deleteSession(s.getId());
    }
    public Iterable<Session> filterByDay(Iterable<Session> allSessions,LocalDate day){
        ArrayList<Session> sessions = (ArrayList<Session>) StreamSupport.stream(allSessions.spliterator(), false)
                .collect(Collectors.toList());
        Stream<Session> sess = sessions.stream();
        allSessions = sess.filter(s -> s.getDate().isEqual(day)).collect(Collectors.toList());
        System.out.println("fd: "+allSessions);
        return allSessions;
    }
    public Iterable<Session> filterByHall(Iterable<Session> allSessions,Long hall){
        ArrayList<Session> sessions = (ArrayList<Session>) StreamSupport.stream(allSessions.spliterator(), false)
                .collect(Collectors.toList());
        Stream<Session> sess = sessions.stream();
        allSessions = sess.filter(s -> s.getHall().equals(hall)).collect(Collectors.toList());
        System.out.println("fh: "+allSessions);
        return allSessions;
    }
}
