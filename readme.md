# 🚀 DevFlow

# 🚀 DevFlow

DevFlow is a **Developer Productivity Platform** designed to help engineering teams manage projects, collaborate efficiently, and track software development activities from a single workspace.

Instead of relying on multiple tools for project management, task tracking, discussions, and team collaboration, DevFlow aims to provide a unified platform tailored specifically for software development teams.

> **🚧 Project Status:** DevFlow is currently under active development. Features are being implemented incrementally as part of an end-to-end full-stack learning and engineering project.

---

## 🎯 Problem Statement

Modern development teams often rely on multiple tools like Jira, Slack, GitHub, and internal dashboards to manage their daily work.

This leads to:

- Context switching between multiple applications
- Scattered project information
- Reduced team visibility
- Difficult progress tracking

DevFlow addresses these challenges by providing a centralized platform where developers, project managers, and engineering teams can manage their work efficiently.

---

## ✨ Features

### Authentication & Security
- User Registration
- Login with JWT Authentication
- Role-Based Access Control
- Secure Password Encryption (BCrypt)
- Stateless Authentication

### User Management
- Business Unit Management
- Role Management
- User Profiles
- Active/Inactive Users

### Project Management *(Upcoming)*
- Create Projects
- Team Management
- Project Dashboard

### Task Management *(Upcoming)*
- Create Tasks
- Assign Tasks
- Task Status Tracking
- Priority Management
- Due Dates

### Kanban Board *(Upcoming)*
- Drag & Drop Task Board
- Sprint View
- Work Progress Tracking

### Collaboration *(Upcoming)*
- Task Comments
- Activity Timeline
- Internal Notifications

### Dashboard *(Upcoming)*
- Personal Dashboard
- Team Dashboard
- Project Insights
- Productivity Metrics

---

## 🛠 Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- JWT Authentication
- PostgreSQL
- Flyway

### Frontend
- Angular *(In Progress)*

### Build Tools
- Maven

---

## 🏗 Project Structure

The application follows a feature-based architecture with clear separation of concerns.

```
auth/
user/
businessunit/
security/
config/
common/
project/
task/
notification/
```

---

## 🔐 Authentication Flow

```
Login

↓

AuthenticationManager

↓

JWT Generation

↓

Client Stores JWT

↓

Protected Request

↓

JwtAuthenticationFilter

↓

SecurityContext

↓

Authorized API Access
```

---

## 📌 Current Progress

- ✅ Database Configuration
- ✅ Flyway Integration
- ✅ User Management
- ✅ Business Unit Management
- ✅ Registration API
- ✅ Login API
- ✅ JWT Authentication
- ✅ Spring Security Configuration
- ✅ Custom Authentication Filter

---

## 🚧 Roadmap

- Project Module
- Task Management
- Kanban Board
- Dashboard
- Comments
- Notifications
- Activity Timeline
- GitHub Integration
- Slack Integration
- Analytics & Reports

---

## 📖 Vision

DevFlow aims to become an all-in-one developer workspace that improves engineering productivity by combining project management, collaboration, and developer-focused workflows into a single platform.