package com.dzqc.service;


import org.springframework.stereotype.Repository;

import java.util.List;


public interface BaseService<T> {
    List<T> query(T t);
    Integer add(T t);
    Integer edit(T t);

    Integer remove(Long id);
}
