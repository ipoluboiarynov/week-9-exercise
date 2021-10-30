package com.ivan4usa.util;

import com.ivan4usa.persistence.GenericDao;

public class DaoFactory {
    // Empty constructor is private - static class
    private DaoFactory() {

    }

    public static GenericDao createDao(Class type) {
        return new GenericDao(type);

    }
}
