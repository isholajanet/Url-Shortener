package com.UrlShortener.UrlShortener.Repository;

import com.UrlShortener.UrlShortener.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
