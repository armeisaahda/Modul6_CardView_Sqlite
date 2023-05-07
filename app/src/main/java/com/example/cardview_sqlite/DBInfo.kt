package com.example.cardview_sqlite

import android.provider.BaseColumns

//class DBInfo berfungsi untuk menampung objek pada tabel
object DBInfo {
    class UserInput: BaseColumns{//menggunakan library BaseColums
        companion object{
            val TABLE_NAME = "users"
            val COL_EMAIL = "email"
            val COL_PASS = "pass"
            val COL_USERNAME = "username"
            val COL_FULLNAME = "fullname"
        }
    }
}