package com.jojoldu.book.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRespository extends JpaRepository<User, Long> {
    Optional<User>findByEmail(String email); // 이미 생성된 사용자인지 확인하는 메서드
}
