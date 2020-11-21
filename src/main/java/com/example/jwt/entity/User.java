package com.example.jwt.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class GetUserData {
        private String username;
        private String password;
    }
}
