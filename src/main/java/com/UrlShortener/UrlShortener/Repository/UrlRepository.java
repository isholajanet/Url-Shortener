package com.UrlShortener.UrlShortener.Repository;

import com.UrlShortener.UrlShortener.models.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Url, String> {
}
