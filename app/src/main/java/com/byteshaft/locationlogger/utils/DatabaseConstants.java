package com.byteshaft.locationlogger.utils;


public class DatabaseConstants {
    public static final String DATABASE_NAME = "Location.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "location_table";
    public static final String USERNAME = "username";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String ID_COLUMN = "id";
    private static final String OPENING_BRACE = "(";
    private static final String CLOSING_BRACE = ")";

    public static final String TABLE_CREATE = "CREATE TABLE "
            + TABLE_NAME
            + OPENING_BRACE
            + ID_COLUMN + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + USERNAME + " TEXT,"
            + LATITUDE + " TEXT,"
            + LONGITUDE + " TEXT,"
            + CLOSING_BRACE;
}
