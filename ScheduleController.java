package com.example.Cinesoft.Controllers;

import com.example.Cinesoft.Entities.Hall;
import com.example.Cinesoft.Entities.Movie;
import com.example.Cinesoft.Repositories.AccountRepository;
import com.example.Cinesoft.Services.HallService;
import com.example.Cinesoft.Services.MovieService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.StreamSupport;

@Controller
public class ScheduleController {
    @Autowired
    private MovieService movieService;
    @Autowired
    private HallService hallService;

    @GetMapping("/schedule")
    public String getSchedule(Model model, HttpSession session) {
        System.out.println("schedule get");
        String user = (String) session.getAttribute("user");
        if (user != null) {
            if (user.equals("admin") || user.equals("user")) {
                ArrayList<LocalDate> dates = new ArrayList<>();
                for (int i=0;i<7;i++){
                    dates.add(LocalDate.now().plusDays(i));
                }
                model.addAttribute("dates",dates);
                ArrayList<Hall> halls = hallService.findNotBlockedHalls();
                for (Hall h:halls) System.out.println(h.getId());
                model.addAttribute("halls",halls);
                return "schedule";
            }
        }
        return "redirect:/authorization";
    }

    @GetMapping("/session_creation")
    public String getSessionCreation(Model model, HttpSession session) {
        System.out.println("ses cr get");
        String user = (String) session.getAttribute("user");
        if (user != null) {
            if (user.equals("admin") || user.equals("user")) {
                movieService.deleteAllExpired(LocalDate.now());
                Iterable<Movie> movies = movieService.getAllMovies();
                if (StreamSupport.stream(movies.spliterator(), false).count() == 0)
                    model.addAttribute("error", "В базе данных кинотеатра нет фильмов");
                else model.addAttribute("movies", movies);
                ArrayList<LocalDate> dates = new ArrayList<>();
                for (int i=0;i<7;i++){
                    dates.add(LocalDate.now().plusDays(i));
                }
                model.addAttribute("dates",dates);
                ArrayList<Hall> halls = hallService.findNotBlockedHalls();
                for (Hall h:halls) System.out.println(h.getId());
                model.addAttribute("halls",halls);
                return "session_creation";
            }
        }
        return "redirect:/authorization";
    }

    @GetMapping({"/session_creation/mainpage", "/schedule/mainpage"})
    public String toMainpage(Model model, HttpSession session) {
        session.removeAttribute("filtValue");
        session.removeAttribute("sortValue");
        return "redirect:/mainpage";
    }

    @GetMapping({"/session_creation/authorization", "/schedule/authorization"})
    public String toAuthorization(Model model, HttpSession session) {
        session.removeAttribute("filtValue");
        session.removeAttribute("sortValue");
        return "redirect:/authorization";
    }
}
