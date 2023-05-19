package controller;

import com.example.WorkInProgressXX.News;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
public class NewsController {

    private List<News> newsList = new ArrayList<>(); // Assume this list is populated with news data

    @GetMapping("/news")
    public List<News> getNewsList(@RequestParam String sort, @RequestParam(required = false) String keyword) {
        List<News> filteredNewsList = new ArrayList<>();

        // Sort the news list based on the provided sort parameter
        if (sort.equalsIgnoreCase("publicationDateAsc")) {
            newsList.sort(Comparator.comparing(News::getPublicationDate));
        } else if (sort.equalsIgnoreCase("publicationDateDesc")) {
            newsList.sort(Comparator.comparing(News::getPublicationDate).reversed());
        } else if (sort.equalsIgnoreCase("titleAsc")) {
            newsList.sort(Comparator.comparing(News::getTitle));
        } else if (sort.equalsIgnoreCase("titleDesc")) {
            newsList.sort(Comparator.comparing(News::getTitle).reversed());
        }

        // Filter the news list based on the provided keyword
        if (keyword != null && !keyword.isEmpty()) {
            for (News news : newsList) {
                if (news.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                        news.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                    filteredNewsList.add(news);
                }
            }
        } else {
            filteredNewsList = newsList;
        }

        return filteredNewsList;
    }

}
