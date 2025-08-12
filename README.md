# 🎮 Find My Buddy v2.0(SEM-II)

Welcome to **Find My Buddy v2.0** — a terminal-based Java game where players try to find a hidden "Buddy" in one of three cups.  
This version includes **accounts, profiles, ranks, history tracking, leaderboard, ASCII art animations, background music, and hacker detection**.

---

<img width="1920" height="1080" alt="Screenshot (12)" src="https://github.com/user-attachments/assets/347bdc4d-cab3-44e9-91db-bcf940ad3b34" />
<img width="1772" height="219" alt="image" src="https://github.com/user-attachments/assets/61d6831a-ebc3-4db4-b003-292b6c6edf24" />
<img width="1920" height="1080" alt="Screenshot (2)" src="https://github.com/user-attachments/assets/64a7518d-7e86-47c8-a176-19abadde72ba" />

---

## 🌟 Features
- **User Accounts** – Login and register.
- **Player Profiles** – In-game name, country, and rank.
- **Dynamic Ranking System** – Ranks: Beginner → Bronze → Silver → Gold → Diamond → Mythic → Master → GrandMaster.
- **Game History** – View last 10 matches.
- **Leaderboard** – Top 10 global players, with friend indicators.
- **Interactive Animations** – ASCII art for events and ranks.
- **Background Music & Sound Effects** – Immersive gameplay.
- **Hacker Detection** – Invalid input penalty.
- **Multi-threading** – For sound playback and timed input.

---

## 🛠 Technologies Used
- **Java Development Kit (JDK)** – Version 8+
- **MySQL Database** – User, profile, and rank data
- **XAMPP** – Local server (Apache + MySQL)
- **MySQL Connector/J** – JDBC driver for Java

---

## 🗝 Key Concepts & Technologies in *Find My Buddy v2.0*

### 👩‍💻 Programming Concepts
- **OOP**: Java classes/objects with encapsulation and modular design.  
- **Multi-threading**: Concurrent tasks for sounds, animations, and input.  
- **I/O**: Console input/output with ASCII art and messages.  
- **Exception Handling**: Safe error handling for file and DB operations.  
- **Custom Data Structures**: Circular linked list for managing countries.  
- **Control Flow**: Conditional statements and loops for gameplay logic.  

### 🎮 Game Mechanics
- **Authentication**: Login and account creation.  
- **Profiles & Ranks**: Player info with performance-based rank tiers.  
- **History & Leaderboard**: Tracks past matches and global rankings.  
- **Friends System**: Highlights players from same/neighboring countries.  
- **ASCII Animations & Sound**: Visual and audio feedback during gameplay.  
- **Hacker Detection**: Blocks invalid/suspicious inputs.  


---

## 🚀 Getting Started

### 1️⃣ Prerequisites
- **Java JDK 8 or later** ([Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) | [OpenJDK](https://openjdk.java.net/install/))
- **XAMPP** ([Apache Friends](https://www.apachefriends.org/index.html))
- **MySQL Connector/J 8.4.0** ([Download](https://dev.mysql.com/downloads/connector/j/))

---

### 2️⃣ XAMPP Setup
1. **Start Apache & MySQL** from XAMPP Control Panel.
2. **Access phpMyAdmin** – `http://localhost/phpmyadmin/`
3. **Create Database**: `FindMyBuddyServer`
4. **Import Schema** – Use `FindMyBuddyServer.sql` in phpMyAdmin.

---
### 3️⃣ Database Schema

**1️⃣ XAMPP Control Panel**  
<img width="829" height="528" alt="image" src="https://github.com/user-attachments/assets/3309c697-c75e-4de3-ab69-24885a073c0e" />

**2️⃣ phpMyAdmin Setup**  
<img width="1907" height="996" alt="image" src="https://github.com/user-attachments/assets/7aced7c8-788d-4fa1-b0cd-5bf4baff6e6a" />

---
  **1️⃣ Profile**
  ---
  <img width="798" height="240" alt="image" src="https://github.com/user-attachments/assets/9c01ec9f-c213-451c-9d4b-65d48a33c3ae" />
  
  **2️⃣ Rank** 
  ---
  <img width="629" height="230" alt="image" src="https://github.com/user-attachments/assets/dafa6de2-7fa4-4c43-b057-47ed603ba04f" />
  
  **3️⃣ User**
  ---
  <img width="665" height="226" alt="image" src="https://github.com/user-attachments/assets/5955f3f4-804a-4579-8648-c751ea4513cb" />

---

### 4️⃣ MySQL Connector/J Setup
1. Download **mysql-connector-j-8.4.0.zip**.
2. Extract `.jar` file (e.g., `mysql-connector-j-8.4.0.jar`).
3. Place inside `lib/` folder of project.
4. Add to classpath when compiling/running.

---

### 5️⃣ Game Sound Files
Store required `.wav` files inside `resources/sounds/`.  
You may need to **update paths** in `Game_SoundsAndThreads.java`.

**Required Sounds**:
- `mixkit-medieval-show-fanfare-announcement-226.wav` (Entry)
- `chill-drum-loop-6887.wav` (Login)
- `nodens-field-song-6041.wav` (Game Center)
- `mixkit-game-level-music-689.wav` (Options)
- `game-music-loop-7-145285.wav` (Play - First Half)
- `video-game-music-loop-27629.wav` (Play - Second Half)
- `mixkit-arcade-video-game-machine-alert-2821.wav` (Hacker)
- `mixkit-long-game-over-notification-276.wav` (System End)
- `win-sfx-38507.wav` (Win)
- `medieval-fanfare-6826.wav` (Rank Up)
- `game-over-39-199830.wav` (Rank Down)

---

### 6️⃣ Compile & Run

**Windows**
```bash
javac -cp ".;lib/mysql-connector-j-8.4.0.jar" MyGames/*.java
java -cp ".;lib/mysql-connector-j-8.4.0.jar" MyGames.Center
```

---
### 📸 Screenshots

**Gameplay — Guessing Phase**  
---
<img width="1920" height="1080" alt="Screenshot (3)" src="https://github.com/user-attachments/assets/bf274db5-307c-4998-833d-af7ab767d79b" />
<img width="1920" height="1080" alt="Screenshot (4)" src="https://github.com/user-attachments/assets/be6d5166-d7d4-4231-ba82-a3269fa9482b" />
<img width="1920" height="1080" alt="Screenshot (5)" src="https://github.com/user-attachments/assets/2108003b-8f11-4726-9043-6bd42976466c" />
<img width="1920" height="1080" alt="Screenshot (6)" src="https://github.com/user-attachments/assets/5066b9f0-da06-47e6-a8cf-6501381b49e8" />
<img width="1920" height="1080" alt="Screenshot (7)" src="https://github.com/user-attachments/assets/0ebd5824-d0f4-44c5-ac39-97f2c10ef10e" />
<img width="1920" height="1080" alt="Screenshot (1)" src="https://github.com/user-attachments/assets/43083620-24c6-4dda-8bec-8672f27daa79" />
<img width="1920" height="1080" alt="Screenshot (16)" src="https://github.com/user-attachments/assets/07aed881-e869-4034-8f83-cdb4d499126c" />
<img width="1920" height="1080" alt="Screenshot (14)" src="https://github.com/user-attachments/assets/2190f099-22df-43b6-9354-c9df1b3cc0cc" />
<img width="1920" height="1080" alt="Screenshot (8)" src="https://github.com/user-attachments/assets/1cefa5ba-863e-4b69-a1c0-8f6320984652" />
<img width="1920" height="1080" alt="Screenshot (9)" src="https://github.com/user-attachments/assets/ea9e75b5-3eb3-4032-b6af-fd278b96845b" />
<img width="1920" height="1080" alt="Screenshot (10)" src="https://github.com/user-attachments/assets/d1b673fc-c6e5-4c6a-ba65-99b73dbc872f" />
<img width="1920" height="1080" alt="Screenshot (11)" src="https://github.com/user-attachments/assets/2a349cf7-5253-44c1-afb7-02e074bdad8e" />
<img width="1920" height="1080" alt="Screenshot (15)" src="https://github.com/user-attachments/assets/19df0462-7c57-4da9-b4ef-054e91cf58c8" />
<img width="1920" height="1080" alt="Screenshot (17)" src="https://github.com/user-attachments/assets/2ecfe95f-b4c7-480b-a94b-775b3c05aefe" />
<img width="1920" height="1080" alt="Screenshot (18)" src="https://github.com/user-attachments/assets/9e34dd35-cbe3-4ac1-be79-494a73284aac" />
<img width="1920" height="1080" alt="Screenshot (19)" src="https://github.com/user-attachments/assets/ad280b90-dc34-4a9e-a979-84841aa1dda0" />
<img width="1920" height="1080" alt="Screenshot (20)" src="https://github.com/user-attachments/assets/0649a378-666c-4798-945d-02874f54b251" />
<img width="1920" height="1080" alt="Screenshot (21)" src="https://github.com/user-attachments/assets/4041d89c-9bca-43f4-81f3-4bbdb95c963a" />














