package com.ani.investocalci.investocalciapp.repository;

import com.ani.investocalci.investocalciapp.entity.IPO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

public interface IpoRepository extends JpaRepository<IPO, Integer> {

    @Query(value = "SELECT * FROM ipos where type=:type", nativeQuery = true)
    public Page<IPO> getIPOListByType(@RequestParam("type") String type, Pageable pageable);
}
