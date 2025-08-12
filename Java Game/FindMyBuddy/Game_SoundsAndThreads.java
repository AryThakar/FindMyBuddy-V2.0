//this a file that made for Sounds and MultiThreading Task for the game this is the best usage of the threads.
//this threads work with Main Thread Parallely
//Main Usage of Threads
//1.Sound in backGround
//2.User Conformations
//3.Timer and gameInput time limit
//4.2min not replay function for auto shutdown

package MyGames;
import MyGames.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import javax.sound.sampled.*;


//this is the game thread for User Conformations
class NextTry{
    //this a method for call multipule times threads
    public static void waitForEnter(){
        EnterThread();
    }
    //this is the thread for Conformation
    public static void EnterThread(){
        Scanner sc=new Scanner(System.in);
        //Create a Object for Runnable and Override Method run()
        Runnable forEnter=new Runnable() {
            public void run(){
                try {
                    String temp=sc.nextLine();
                } catch (Exception e) {
                    //this a method of java throwable and method prints Message for Exception
                    e.printStackTrace();
                }
            }
        };
        //Creating a thread for User Conformation and Start() and Join()
        Thread forTemp=new Thread(forEnter);
        forTemp.start();
        try {
           forTemp.join(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class EndGame{
    //this a method for call multipule times threads
    public static void waitForEnter(){
        EnterThread();
    }
    //this is the thread for Conformation
    public static void EnterThread(){
        Scanner sc=new Scanner(System.in);
        //Create a Object for Runnable and Override Method run()
        Runnable forEnter=new Runnable() {
            public void run(){
                try {
                    String temp=sc.nextLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        //Creating a thread for User Conformation and Start() and Join()
        Thread forTemp=new Thread(forEnter);
        forTemp.start();
        try {
           forTemp.join(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class GameStart{
    //this a method for call multipule times threads
    public static void waitForEnter(){
        EnterThread();
    }
    //this is the thread for Conformation
    public static void EnterThread(){
        Scanner sc=new Scanner(System.in);
        //Create a Object for Runnable and Override Method run()
        Runnable forEnter=new Runnable() {
            public void run(){
                try {
                    String temp=sc.nextLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        //Creating a thread for User Conformation and Start() and Join()
        Thread forTemp=new Thread(forEnter);
        forTemp.start();
        try {
           forTemp.join(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class ExitFromRandom{
    //this a method for call multipule times threads
    public static void waitForEnter(){
        EnterThread();
    }
    //this is the thread for Conformation
    public static void EnterThread(){
        Scanner sc=new Scanner(System.in);
        //Create a Object for Runnable and Override Method run()
        Runnable forEnter=new Runnable() {
            public void run(){
                try {
                    String temp=sc.nextLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        //Creating a thread for User Conformation and Start() and Join()
        Thread forTemp=new Thread(forEnter);
        forTemp.start();
        try {
           forTemp.join(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class EntrySound implements Runnable {
    Clip c;
    long currentPointer;
    boolean paused = false;
    boolean playing = false;
    //this method load sound in the File
    public void loadSound(String filepath) throws Exception {
        //Make file object 
        File musicPath = new File(filepath);
        //if file exist then move ahead
        if (!musicPath.exists()) {
            System.out.println("File not found: " + filepath);
            return;
        }
        // AudioInputStream for Fetch data from Sound file
       //AudioSystem for work as a Vurchual pointer to run file
        AudioInputStream soundfile = AudioSystem.getAudioInputStream(musicPath);
        // clip work as a Small gaph in AudioPlayer of the console that gaph connect File to Speaker
       //this a clip and getClip() method that provide cilp for file
        c = AudioSystem.getClip();
        //load SoundFile in the Clip object
        c.open(soundfile);
        c.addLineListener(new LineListener() {
            public void update(LineEvent event) {
                if (event.getType() == LineEvent.Type.STOP) {
                    if (c.getMicrosecondPosition() >= c.getMicrosecondLength()) {
                        c.setMicrosecondPosition(0);
                        c.start();
                    }
                }
            }
        });
    }
    public void run() {
        try {
            loadSound("C:\\Java Game\\Game Sounds\\mixkit-medieval-show-fanfare-announcement-226.wav");
           //After a load Sound file we start Sound
           //getMicrosecondPosition is works AS a pointer that return CurruntPosition of Sound file Pointer
           //SetMicrosecondPosition is a method to Set Position of pointer in Sound File
           //getMicrosecondLength is a method that return The Length of Sound File
           //This is a logic of Make Infinity Loop for Sound That run Continusly
           //when Sound File run completely so run from Starts
           //this my original logic to play sound loop but this is not efficiant as Line Listner 
           //so when i run my code 100-150 time then i find some inconsistancy in this method like sound stops automatically
           //so i must use line Listner instead of loop
           // while (true) {
           //     if (c.getMicrosecondPosition() >= c.getMicrosecondLength()) {
           //         c.setMicrosecondPosition(0);
           //         c.start();
           //     }
           // }
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //synchronized for Sound Because In a one time only one Action can Execute on this Thread
    // this all methods for Play()
    //                      Pause()
    //                      Resume()
    //                      Stop() the Sound Thread
    public synchronized void play() {
        if (c != null) {
            if (paused) {
                c.setMicrosecondPosition(currentPointer);
                c.start();
                paused = false;
            } else {
                c.setMicrosecondPosition(0);
                c.start();
            }
            playing = true;
        }
    }
    public synchronized void pause() {
        if (c != null && playing) {
            currentPointer = c.getMicrosecondPosition();
            c.stop();
            paused = true;
            playing = false;
        }
    }
    public synchronized void stop() {
        if (c != null) {
            c.stop();
            c.close();
            playing = false;
            paused = false;
        }
    }
    public synchronized void resume() {
        if (paused) {
            c.setMicrosecondPosition(currentPointer);
            c.start();
            paused = false;
            playing = true;
        }
    }
}
//Like Above Instruction All Remain Same For the Sound Logic
class LoginSound implements Runnable {
    Clip c;
    long currentPointer;
    boolean paused = false;
    boolean playing = false;

    public void loadSound(String filepath) throws Exception {
        File musicPath = new File(filepath);
        if (!musicPath.exists()) {
            System.out.println("File not found: " + filepath);
            return;
        }
        AudioInputStream soundfile = AudioSystem.getAudioInputStream(musicPath);
        c = AudioSystem.getClip();
        c.open(soundfile);
        c.addLineListener(new LineListener() {
            public void update(LineEvent event) {
                if (event.getType() == LineEvent.Type.STOP) {
                    if (c.getMicrosecondPosition() >= c.getMicrosecondLength()) {
                        c.setMicrosecondPosition(0);
                        c.start();
                    }
                }
            }
        });
    }
    public void run() {
        try {
            loadSound("C:\\Java Game\\Game Sounds\\chill-drum-loop-6887.wav");
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void play() {
        if (c != null) {
            if (paused) {
                c.setMicrosecondPosition(currentPointer);
                c.start();
                paused = false;
            } else {
                c.setMicrosecondPosition(0);
                c.start();
            }
            playing = true;
        }
    }
    public synchronized void pause() {
        if (c != null && playing) {
            currentPointer = c.getMicrosecondPosition();
            c.stop();
            paused = true;
            playing = false;
        }
    }
    public synchronized void stop() {
        if (c != null) {
            c.stop();
            c.close();
            playing = false;
            paused = false;
        }
    }
    public synchronized void resume() {
        if (paused) {
            c.setMicrosecondPosition(currentPointer);
            c.start();
            paused = false;
            playing = true;
        }
    }
}
class GameCenterSound implements Runnable {
    Clip c;
    long currentPointer;
    boolean paused = false;
    boolean playing = false;

    public void loadSound(String filepath) throws Exception {
        File musicPath = new File(filepath);
        if (!musicPath.exists()) {
            System.out.println("File not found: " + filepath);
            return;
        }
        AudioInputStream soundfile = AudioSystem.getAudioInputStream(musicPath);
        c = AudioSystem.getClip();
        c.open(soundfile);
        c.addLineListener(new LineListener() {
            public void update(LineEvent event) {
                if (event.getType() == LineEvent.Type.STOP) {
                    if (c.getMicrosecondPosition() >= c.getMicrosecondLength()) {
                        c.setMicrosecondPosition(0);
                        c.start();
                    }
                }
            }
        });
    }
    public void run() {
        try {
            loadSound("C:\\Java Game\\Game Sounds\\nodens-field-song-6041.wav");
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void play() {
        if (c != null) {
            if (paused) {
                c.setMicrosecondPosition(currentPointer);
                c.start();
                paused = false;
            } else {
                c.setMicrosecondPosition(0);
                c.start();
            }
            playing = true;
        }
    }
    public synchronized void pause() {
        if (c != null && playing) {
            currentPointer = c.getMicrosecondPosition();
            c.stop();
            paused = true;
            playing = false;
        }
    }
    public synchronized void stop() {
        if (c != null) {
            c.stop();
            c.close();
            playing = false;
            paused = false;
        }
    }
    public synchronized void resume() {
        if (paused) {
            c.setMicrosecondPosition(currentPointer);
            c.start();
            paused = false;
            playing = true;
        }
    }
}
class GameOptionsSound implements Runnable {
    Clip c;
    long currentPointer;
    boolean paused = false;
    boolean playing = false;

    public void loadSound(String filepath) throws Exception {
        File musicPath = new File(filepath);
        if (!musicPath.exists()) {
            System.out.println("File not found: " + filepath);
            return;
        }
        AudioInputStream soundfile = AudioSystem.getAudioInputStream(musicPath);
        c = AudioSystem.getClip();
        c.open(soundfile);
        c.addLineListener(new LineListener() {
            public void update(LineEvent event) {
                if (event.getType() == LineEvent.Type.STOP) {
                    if (c.getMicrosecondPosition() >= c.getMicrosecondLength()) {
                        c.setMicrosecondPosition(0);
                        c.start();
                    }
                }
            }
        });
    }
    public void run() {
        try {
            loadSound("C:\\Java Game\\Game Sounds\\mixkit-game-level-music-689.wav");
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void play() {
        if (c != null) {
            if (paused) {
                c.setMicrosecondPosition(currentPointer);
                c.start();
                paused = false;
            } else {
                c.setMicrosecondPosition(0);
                c.start();
            }
            playing = true;
        }
    }
    public synchronized void pause() {
        if (c != null && playing) {
            currentPointer = c.getMicrosecondPosition();
            c.stop();
            paused = true;
            playing = false;
        }
    }
    public synchronized void stop() {
        if (c != null) {
            c.stop();
            c.close();
            playing = false;
            paused = false;
        }
    }
    public synchronized void resume() {
        if (paused) {
            c.setMicrosecondPosition(currentPointer);
            c.start();
            paused = false;
            playing = true;
        }
    }
}
class GamePlaySoundForFirstHalf implements Runnable {
    Clip c;
    long currentPointer;
    boolean paused = false;
    boolean playing = false;

    public void loadSound(String filepath) throws Exception {
        File musicPath = new File(filepath);
        if (!musicPath.exists()) {
            System.out.println("File not found: " + filepath);
            return;
        }
        AudioInputStream soundfile = AudioSystem.getAudioInputStream(musicPath);
        c = AudioSystem.getClip();
        c.open(soundfile);
        c.addLineListener(new LineListener() {
            public void update(LineEvent event) {
                if (event.getType() == LineEvent.Type.STOP) {
                    if (c.getMicrosecondPosition() >= c.getMicrosecondLength()) {
                        c.setMicrosecondPosition(0);
                        c.start();
                    }
                }
            }
        });
    }
    public void run() {
        try {
            loadSound("C:\\Java Game\\Game Sounds\\game-music-loop-7-145285.wav");
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void play() {
        if (c != null) {
            if (paused) {
                c.setMicrosecondPosition(currentPointer);
                c.start();
                paused = false;
            } else {
                c.setMicrosecondPosition(0);
                c.start();
            }
            playing = true;
        }
    }
    public synchronized void pause() {
        if (c != null && playing) {
            currentPointer = c.getMicrosecondPosition();
            c.stop();
            paused = true;
            playing = false;
        }
    }
    public synchronized void stop() {
        if (c != null) {
            c.stop();
            c.close();
            playing = false;
            paused = false;
        }
    }
    public synchronized void resume() {
        if (paused) {
            c.setMicrosecondPosition(currentPointer);
            c.start();
            paused = false;
            playing = true;
        }
    }
}
class GamePlaySoundForSecondHalf implements Runnable {
    Clip c;
    long currentPointer;
    boolean paused = false;
    boolean playing = false;

    public void loadSound(String filepath) throws Exception {
        File musicPath = new File(filepath);
        if (!musicPath.exists()) {
            System.out.println("File not found: " + filepath);
            return;
        }
        AudioInputStream soundfile = AudioSystem.getAudioInputStream(musicPath);
        c = AudioSystem.getClip();
        c.open(soundfile);
        c.addLineListener(new LineListener() {
            public void update(LineEvent event) {
                if (event.getType() == LineEvent.Type.STOP) {
                    if (c.getMicrosecondPosition() >= c.getMicrosecondLength()) {
                        c.setMicrosecondPosition(0);
                        c.start();
                    }
                }
            }
        });
    }
    public void run() {
        try {
            loadSound("C:\\Java Game\\Game Sounds\\video-game-music-loop-27629.wav");
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void play() {
        if (c != null) {
            if (paused) {
                c.setMicrosecondPosition(currentPointer);
                c.start();
                paused = false;
            } else {
                c.setMicrosecondPosition(0);
                c.start();
            }
            playing = true;
        }
    }
    public synchronized void pause() {
        if (c != null && playing) {
            currentPointer = c.getMicrosecondPosition();
            c.stop();
            paused = true;
            playing = false;
        }
    }
    public synchronized void stop() {
        if (c != null) {
            c.stop();
            c.close();
            playing = false;
            paused = false;
        }
    }
    public synchronized void resume() {
        if (paused) {
            c.setMicrosecondPosition(currentPointer);
            c.start();
            paused = false;
            playing = true;
        }
    }
}
class HackerSound implements Runnable {
    Clip c;
    long currentPointer;
    boolean paused = false;
    boolean playing = false;

    public void loadSound(String filepath) throws Exception {
        File musicPath = new File(filepath);
        if (!musicPath.exists()) {
            System.out.println("File not found: " + filepath);
            return;
        }
        AudioInputStream soundfile = AudioSystem.getAudioInputStream(musicPath);
        c = AudioSystem.getClip();
        c.open(soundfile);
        c.addLineListener(new LineListener() {
            public void update(LineEvent event) {
                if (event.getType() == LineEvent.Type.STOP) {
                    if (c.getMicrosecondPosition() >= c.getMicrosecondLength()) {
                        c.setMicrosecondPosition(0);
                        c.start();
                    }
                }
            }
        });
    }
    public void run() {
        try {
            loadSound("C:\\Java Game\\Game Sounds\\mixkit-arcade-video-game-machine-alert-2821.wav");
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void play() {
        if (c != null) {
            if (paused) {
                c.setMicrosecondPosition(currentPointer);
                c.start();
                paused = false;
            } else {
                c.setMicrosecondPosition(0);
                c.start();
            }
            playing = true;
        }
    }
    public synchronized void pause() {
        if (c != null && playing) {
            currentPointer = c.getMicrosecondPosition();
            c.stop();
            paused = true;
            playing = false;
        }
    }
    public synchronized void stop() {
        if (c != null) {
            c.stop();
            c.close();
            playing = false;
            paused = false;
        }
    }
    public synchronized void resume() {
        if (paused) {
            c.setMicrosecondPosition(currentPointer);
            c.start();
            paused = false;
            playing = true;
        }
    }
}
class SystemEndSound implements Runnable {
    Clip c;
    long currentPointer;
    boolean paused = false;
    boolean playing = false;

    public void loadSound(String filepath) throws Exception {
        File musicPath = new File(filepath);
        if (!musicPath.exists()) {
            System.out.println("File not found: " + filepath);
            return;
        }
        AudioInputStream soundfile = AudioSystem.getAudioInputStream(musicPath);
        c = AudioSystem.getClip();
        c.open(soundfile);
        c.addLineListener(new LineListener() {
            public void update(LineEvent event) {
                if (event.getType() == LineEvent.Type.STOP) {
                    if (c.getMicrosecondPosition() >= c.getMicrosecondLength()) {
                        c.setMicrosecondPosition(0);
                        c.start();
                    }
                }
            }
        });
    }
    public void run() {
        try {
            loadSound("C:\\Java Game\\Game Sounds\\mixkit-long-game-over-notification-276.wav");
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void play() {
        if (c != null) {
            if (paused) {
                c.setMicrosecondPosition(currentPointer);
                c.start();
                paused = false;
            } else {
                c.setMicrosecondPosition(0);
                c.start();
            }
            playing = true;
        }
    }
    public synchronized void pause() {
        if (c != null && playing) {
            currentPointer = c.getMicrosecondPosition();
            c.stop();
            paused = true;
            playing = false;
        }
    }
    public synchronized void stop() {
        if (c != null) {
            c.stop();
            c.close();
            playing = false;
            paused = false;
        }
    }
    public synchronized void resume() {
        if (paused) {
            c.setMicrosecondPosition(currentPointer);
            c.start();
            paused = false;
            playing = true;
        }
    }
}
//this a GameSoundOptimiser class That Controls Sound Threads As per Game Need
//We use Sound as a Vertual Pointer
//Make Runnble Object And Thread and This Controler Methods
class GameSoundOptimiser{
  static EntrySound playEntrySound = new EntrySound();
  static Thread soundEntryThread = new Thread(playEntrySound);

  static LoginSound playLoginSound = new LoginSound();
  static Thread soundLoginThread = new Thread(playLoginSound);

  static GameCenterSound playGameCenterSound = new GameCenterSound();
  static Thread soundGameCenterThread = new Thread(playGameCenterSound);

  static GameOptionsSound playGameOptionsSound = new GameOptionsSound();
  static Thread soundGameOptionThread = new Thread(playGameOptionsSound);

  static GamePlaySoundForFirstHalf playGamePlaySoundForFirstHalf = new GamePlaySoundForFirstHalf();
  static Thread soundGamePlayThreadFoThreadForFirst = new Thread(playGamePlaySoundForFirstHalf);

  static GamePlaySoundForSecondHalf playGamePlaySoundForSecondHalf = new GamePlaySoundForSecondHalf();
  static Thread soundGamePlayThreadFoThread = new Thread(playGamePlaySoundForSecondHalf);

  static GameRankUpSound playGameRankUpSound = new GameRankUpSound();
  static Thread soundGameRankUpThread = new Thread(playGameRankUpSound);

  static GameRankDownSound playGameRankDownSound = new GameRankDownSound();
  static Thread soundGameRankDownThread = new Thread(playGameRankDownSound);

  static GameEndSound playGameEndSound = new GameEndSound();
  static Thread soundGameEndThread = new Thread(playGameEndSound);

  static SystemEndSound playSystemEndSound = new SystemEndSound();
  static Thread soundSystemEndThread = new Thread(playSystemEndSound);

  static HackerSound playHackerSound = new HackerSound();
  static Thread soundHackerThread = new Thread(playHackerSound);

   public static void playSound()throws Exception{
       soundEntryThread.start();
       Thread.sleep(150);
       soundLoginThread.start();
       Thread.sleep(150);
       soundGameCenterThread.start();
       Thread.sleep(150);
       soundGameOptionThread.start();
       Thread.sleep(150);
       soundGamePlayThreadFoThreadForFirst.start();
       Thread.sleep(150);
       soundGamePlayThreadFoThread.start();
       Thread.sleep(150);
       soundGameEndThread.start();
       Thread.sleep(150);
       soundGameRankUpThread.start();
       Thread.sleep(150);
       soundGameRankDownThread.start();
       Thread.sleep(150);
       soundSystemEndThread.start();
       Thread.sleep(150);
       soundHackerThread.start();
       Thread.sleep(150);
   }

   public static void stopSound()throws Exception{
       stopEntry();
       Thread.sleep(150);
       stopLogin();
       Thread.sleep(150);
       stopGameCenter();
       Thread.sleep(150);
       stopGameOptions();
       Thread.sleep(150);
       stopGamePlayForSecondHalf();
       Thread.sleep(150);
       stopSystemEnd();
       Thread.sleep(150);
       stopHacker();
       Thread.sleep(150);
       stopGamePlayForFirstHalf();
       Thread.sleep(150);
   }

   public static void playEntry(){
       playEntrySound.play();
   }
   public static void pauseEntry(){
       playEntrySound.pause();
   }
   public static void resumeEntry(){
       playEntrySound.resume();
   }
   public static void stopEntry(){
       playEntrySound.stop();
   }
   public static void playLogin(){
       playLoginSound.play();
   }
   public static void pauseLogin(){
       playLoginSound.pause();
   }
   public static void resumeLogin(){
       playLoginSound.resume();
   }
   public static void stopLogin(){
       playLoginSound.stop();
   }
   public static void playGameCenter(){
       playGameCenterSound.play();
   }
   public static void pauseGameCenter(){
       playGameCenterSound.pause();
   }
   public static void resumeGameCenter(){
       playGameCenterSound.resume();
   }
   public static void stopGameCenter(){
       playGameCenterSound.stop();
   }
   public static void playGameOptions(){
       playGameOptionsSound.play();
   }
   public static void pauseGameOptions(){
       playGameOptionsSound.pause();
   }
   public static void resumeGameOptions(){
       playGameOptionsSound.resume();
   }
   public static void stopGameOptions(){
       playGameOptionsSound.stop();
   }
   public static void playGamePlaySoundForFirstHalf(){
       playGamePlaySoundForFirstHalf.play();
   }
   public static void pauseGamePlayForFirstHalf(){
       playGamePlaySoundForFirstHalf.pause();
   }
   public static void resumeGamePlayForFirstHalf(){
       playGamePlaySoundForFirstHalf.resume();
   }
   public static void stopGamePlayForFirstHalf(){
       playGamePlaySoundForFirstHalf.stop();
   }
   public static void playGamePlaySoundForSecondHalf(){
       playGamePlaySoundForSecondHalf.play();
   }
   public static void pauseGamePlayForSecondHalf(){
       playGamePlaySoundForSecondHalf.pause();
   }
   public static void resumeGamePlayForSecondHalf(){
       playGamePlaySoundForSecondHalf.resume();
   }
   public static void stopGamePlayForSecondHalf(){
       playGamePlaySoundForSecondHalf.stop();
   }
   public static void playGameRankUp(){
       playGameRankUpSound.play();
   }
   public static void playGameRankDown(){
       playGameRankDownSound.play();
   }
   public static void playGameEnd(){
       playGameEndSound.play();
   }
   public static void playSystemEnd(){
       playSystemEndSound.play();
   }
   public static void pauseSystemEnd(){
       playSystemEndSound.pause();
   }
   public static void resumeSystemEnd(){
       playSystemEndSound.resume();
   }
   public static void stopSystemEnd(){
       playSystemEndSound.stop();
   }
   public static void playHacker(){
        playHackerSound.play();
   }
   public static void pauseHacker(){
        playHackerSound.pause();
   }
   public static void resumeHacker(){
       playHackerSound.resume();
   }
   public static void stopHacker(){
       playHackerSound.stop();
   }
}
class GameEndSound implements Runnable {
    Clip c;
    public void loadSound(String filepath) throws Exception {
        File musicPath = new File(filepath);
        if (!musicPath.exists()) {
            System.out.println("File not found: " + filepath);
            return;
        }
        AudioInputStream soundfile = AudioSystem.getAudioInputStream(musicPath);
        c = AudioSystem.getClip();
        c.open(soundfile);
    }
    public void run() {
        try {
            loadSound("C:\\Java Game\\Game Sounds\\win-sfx-38507.wav");
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void play() {
        if (c != null) {
            c.setMicrosecondPosition(0);
            c.start();
        }
    }
}
class GameRankUpSound implements Runnable {
    Clip c;
    public void loadSound(String filepath) throws Exception {
        File musicPath = new File(filepath);
        if (!musicPath.exists()) {
            System.out.println("File not found: " + filepath);
            return;
        }
        AudioInputStream soundfile = AudioSystem.getAudioInputStream(musicPath);
        c = AudioSystem.getClip();
        c.open(soundfile);
    }
    public void run() {
        try {
            loadSound("C:\\Java Game\\Game Sounds\\medieval-fanfare-6826.wav");
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void play() {
        if (c != null) {
            c.setMicrosecondPosition(0);
            c.start();
        }
    }
}
class GameRankDownSound implements Runnable {
    Clip c;
    public void loadSound(String filepath) throws Exception {
        File musicPath = new File(filepath);
        if (!musicPath.exists()) {
            System.out.println("File not found: " + filepath);
            return;
        }
        AudioInputStream soundfile = AudioSystem.getAudioInputStream(musicPath);
        c = AudioSystem.getClip();
        c.open(soundfile);
    }
    public void run() {
        try {
            loadSound("C:\\Java Game\\Game Sounds\\game-over-39-199830.wav");
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void play() {
        if (c != null) {
            c.setMicrosecondPosition(0);
            c.start();
        }
    }
}
//this a Thread that Print TimeAnimation for Game
class TimeAnimation implements Runnable {
    //when user Enter the Input The Loop Automaticaly Stops
    boolean running = true;
    public void stop() {
    System.out.println(ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
    running = false;
    }
    //this is a loop to print Timer
    public void run() {
        int i = 1;
        int j = 6;
        while (running) {
            // '\r' for back the pointer to Start point in the same line and also clear the the line 
            System.out.print("\r"); 
            System.out.print(ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
                    if (i==1||i==2) {
                        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"██"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"==|"+j+"|=="+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"██"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.CYAN+ShowFindMyBuddy.BOLD+" ═=═=═=═"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"):"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"Choice"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+"=> "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD); 
                        i++;
                        j--;
                    }
                else if (i==3||i==4) {
                        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"██"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"==|"+j+"|=="+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"██"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.CYAN+ShowFindMyBuddy.BOLD+" ═=═=═=═"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"):"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"Choice"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+"=> "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD); 
                        i++;
                        j--;
                    }
                else if (i==5||i==6) {
                        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"██"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"==|"+j+"|=="+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"██"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.CYAN+ShowFindMyBuddy.BOLD+" ═=═=═=═"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"):"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"Choice"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+"=> "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);  
                        i++;
                        j--;
                    }
                else{
                    System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"██"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"==|"+j+"|=="+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"██"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.CYAN+ShowFindMyBuddy.BOLD+" ═=═=═=═"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"):"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"Choice"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+"=> "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);
                    break;
                }
            // for print Animation very Smoothly    
            System.out.flush();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class UserGameInput{
    static String input;
    public static boolean isValidInput(String input)throws Exception {
        System.out.println(ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        if (input != null) {
            //Input must be Empty or between 1 to 3
            boolean isEmptyOrSpecificNumber = input.trim().isEmpty() || input.equals("1") || input.equals("2") || input.equals("3");
            //if input is A-a to Z-z or Any Symbole then User considerd as Hacker
            boolean isNotAlphabeticOnly = !input.matches("[a-zA-Z]+");
            
            boolean isNotAlphanumericOnly = !input.matches(".*[^a-zA-Z0-9].*");
    
            if (isEmptyOrSpecificNumber && isNotAlphabeticOnly && isNotAlphanumericOnly) {
                return true;
            }
            else{
                Rank.setRankForHacker();
                Thread.sleep(100);
                GameSoundOptimiser.pauseGamePlayForSecondHalf();
                Thread.sleep(100);
                GameSoundOptimiser.pauseGamePlayForFirstHalf();
                Thread.sleep(150);
                GameSoundOptimiser.playHacker();
                Emergency hacker = new Emergency();
                hacker.tackAction();
            }
        }
        return false;
    }
    //for set or get inputs
    static String getInput(){
        return input;
    }
    static void setInput(String Input){
        input=Input;
    }
}
class GetUserInputForGame implements Runnable {
    static String input = null;
    public void run(){
        Scanner sc = new Scanner(System.in);
        TimeAnimation access = new TimeAnimation();
        //for UserInput
        Runnable inputTask = new Runnable() {
            public void run() {
                try {
                    input =sc.nextLine().trim();
                    System.out.println("\r");
                    access.stop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"You have 6 seconds to enter your input:"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        System.out.println();
        Thread print = new Thread(access);
        print.start();

        Thread inputThread = new Thread(inputTask);
        inputThread.start();

        //for UserInput between timeLimit
        Runnable timeoutTask = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(7000);
                    if (inputThread.isAlive()) {
                        System.out.println();
                        System.out.println();
                        System.out.println(ShowFindMyBuddy.RESET+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"Time's up! No input was received."+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
                        inputThread.interrupt();
                        if (UserGameInput.isValidInput(input)) {
                           UserGameInput.setInput(null);
                        }
                    }
                    else{
                        if (UserGameInput.isValidInput(input)) {
                            if (input.equals("1")||input.equals("2")||input.equals("3")) {
                                UserGameInput.setInput(input);
                            }
                            else{
                                UserGameInput.setInput(null);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread timeoutThread = new Thread(timeoutTask);
        timeoutThread.start();
        //if UserNot give input in 2 mins then System automatically close
        Runnable exitTask = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(120000);
                    if (inputThread.isAlive() || timeoutThread.isAlive()) {
                        System.out.println(ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
                        Emergency.Demotion();
                        Blank.printBlank();
                        System.out.println();
                        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"No input received for 2 minutes. Exiting..."+ShowFindMyBuddy.RESET);
                        Thread.sleep(3000);
                        System.out.println();
                        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"Exit Done ..."+ShowFindMyBuddy.RESET);
                        Thread.sleep(3000);
                        Thread.sleep(100);
                        GameSoundOptimiser.pauseGamePlayForSecondHalf();
                        Thread.sleep(100);
                        GameSoundOptimiser.pauseGamePlayForFirstHalf();
                        Thread.sleep(100);
                        GameSoundOptimiser.resumeSystemEnd();
                        Thread.sleep(100);
                        ThankYou.printThankYou();
                        Blank.printBlank();
                        GameSoundOptimiser.stopSound();
                        System.exit(0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread exitThread = new Thread(exitTask);
        exitThread.start();
        //wait for thread completion
        try {
            inputThread.join();
            timeoutThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Rank{
    public static int rank;
    public static String GID;
    public static void setRankForHacker()throws Exception{
        Connection conn=DBConnections.getDBConnections();
        Statement st=conn.createStatement();
        int rank=Rank.getRank();
        String GID=Rank.getGID();
        int gameRank=rank-50;
        if (gameRank>0) {
            String sql="update Rank set Rank_rank='"+gameRank+"'where Rank_GID='"+GID+"'";
            st.executeUpdate(sql); 
        }
        else{
            String sql="update Rank set Rank_rank='"+0+"'where Rank_GID='"+GID+"'";
            st.executeUpdate(sql);
        }
    }
    public static void setRank(int rank1){
        rank=rank1;
    }
    public static int getRank(){
        return rank;
    }
    public static void setGID(String GID1){
        GID=GID1;
    }
    public static String getGID(){
        return GID;
    }
}
//this is a class for Call GameInputThread for multiple times
class ManyInputs{
    public static String getManyInputs()throws Exception{
       GetUserInputForGame userInput=new GetUserInputForGame();
       Thread userInputThread=new Thread(userInput);
       userInputThread.start();
       userInputThread.join();
       String input=UserGameInput.getInput();
       System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);
       return input;
    }
}