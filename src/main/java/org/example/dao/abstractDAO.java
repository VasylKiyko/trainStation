package org.example.dao;

import java.util.List;

public interface abstractDAO<T> {
    List<T> readAll();
}
