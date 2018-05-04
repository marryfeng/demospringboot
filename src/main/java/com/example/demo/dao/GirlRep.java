package com.example.demo.dao;

import com.example.demo.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fengli on 2017/9/6.
 */
public interface GirlRep extends JpaRepository<Girl,Integer> {
}
