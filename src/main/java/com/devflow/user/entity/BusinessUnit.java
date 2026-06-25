package com.devflow.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table
public class BusinessUnit {
    @Id
    private UUID id;
    private String name;
    private String description;
}
