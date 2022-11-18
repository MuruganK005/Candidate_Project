package com.candidate.repo;

import com.candidate.entity.IsysTechInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IsysTechInfoRepo extends JpaRepository<IsysTechInfo,Long> {
}
