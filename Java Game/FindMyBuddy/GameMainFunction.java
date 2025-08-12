package MyGames;
import MyGames.*;

import java.sql.*;
import java.util.*;


class Center{
    public static void main(String[] args)throws Exception {
        CircularLinkedList.insertAtLast("United States");
        CircularLinkedList.insertAtLast("Brazil");
        CircularLinkedList.insertAtLast("Germany");
        CircularLinkedList.insertAtLast("India");
        CircularLinkedList.insertAtLast("Japan");
        CircularLinkedList.insertAtLast("South Africa");
        CircularLinkedList.insertAtLast("Australia");
        CircularLinkedList.insertAtLast("China");
        CircularLinkedList.insertAtLast("Saudi Arabia");
        CircularLinkedList.insertAtLast("United Kingdom");
        GameSoundOptimiser.playSound();
        Thread.sleep(200);
        GameSoundOptimiser.playEntry();
        Thread.sleep(100);
        GameSoundOptimiser.pauseEntry();
        Thread.sleep(100);
        GameSoundOptimiser.playLogin();
        Thread.sleep(100);
        GameSoundOptimiser.pauseLogin();
        Thread.sleep(100);
        GameSoundOptimiser.playGameCenter();
        Thread.sleep(100);
        GameSoundOptimiser.pauseGameCenter();
        Thread.sleep(100);
        GameSoundOptimiser.playGameOptions();
        Thread.sleep(100);
        GameSoundOptimiser.pauseGameOptions();
        Thread.sleep(100);
        GameSoundOptimiser.playHacker();
        Thread.sleep(100);
        GameSoundOptimiser.pauseHacker();
        Thread.sleep(100);
        GameSoundOptimiser.playSystemEnd();
        Thread.sleep(100);
        GameSoundOptimiser.pauseSystemEnd();
        Thread.sleep(100);
        GameSoundOptimiser.playGamePlaySoundForFirstHalf();
        Thread.sleep(100);
        GameSoundOptimiser.pauseGamePlayForFirstHalf();
        Thread.sleep(100);
        GameSoundOptimiser.playGamePlaySoundForSecondHalf();
        Thread.sleep(100);
        GameSoundOptimiser.pauseGamePlayForSecondHalf();
        Thread.sleep(100);
        GameSoundOptimiser.resumeEntry();
        Entrance a=new Entrance();
        a.enterInGame();
    }
}
class Entrance{
    void enterInGame()throws Exception{
        System.out.println();
        System.out.println();
        System.out.println();
        ShowFindMyBuddy.FIND();
        ShowFindMyBuddy.MY();
        ShowFindMyBuddy.BUDDY();
        System.out.println();
        Thread.sleep(7000);
        GameSoundOptimiser.pauseEntry();
        Thread.sleep(100);
        GameSoundOptimiser.resumeLogin();

        System.out.println();
        System.out.println(ShowFindMyBuddy.BLUE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"=========================================================| Welcome To The Game |========================================================"+ShowFindMyBuddy.RESET);
        Thread.sleep(1000);
        System.out.println();
        System.out.println();
        Scanner sc=new Scanner(System.in);
        String firstChoice="";
        System.out.println(ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"ENTER YOUR CHOICE :-"+ShowFindMyBuddy.RESET);
        do {
           System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"1. Login             "+ShowFindMyBuddy.RESET);
           System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"2. Create New Account"+ShowFindMyBuddy.RESET);
           System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"3. Exit              "+ShowFindMyBuddy.RESET);
           System.out.print(ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);
           firstChoice=sc.nextLine().trim();
           System.out.println(ShowFindMyBuddy.RESET);
           Thread.sleep(500);
           System.out.println();
           if((firstChoice).equals("1")){
            
            Login.oldUser();
           }
           else if((firstChoice).equals("2")){
            CreateNewAccount.newUser();
           }
           else if((firstChoice).equals("3")){
           Thread.sleep(100);
           GameSoundOptimiser.pauseLogin();
           Thread.sleep(100);
           GameSoundOptimiser.resumeSystemEnd(); 
           ThankYou.printThankYou();
           Blank.printBlank();
           Thread.sleep(100);
           GameSoundOptimiser.stopSound();
           System.exit(0);
           }
           else{
            System.out.println();
            System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Enter Valid Choice:-"+ShowFindMyBuddy.RESET);
            System.out.println();
            Thread.sleep(500);
           }
        } while (!(firstChoice).equals("3"));
    }
}
class Login{
    static void oldUser()throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println(ShowFindMyBuddy.BLUE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"=======================================| If You Are Old User So Pls Login Account To Play Game |========================================"+ShowFindMyBuddy.RESET);
        Boolean Created=true;
        String GID;
        String PassWord;
        do {
            System.out.println(ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"Enter Your Gmail ID"+ShowFindMyBuddy.RESET);
            System.out.print(ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD);
            GID=sc.nextLine().trim();
            System.out.println(ShowFindMyBuddy.RESET);
            Thread.sleep(500);
            if (GID!=null&& GID.endsWith("@gmail.com")) {
               Connection conn=DBConnections.getDBConnections();
               Statement st=conn.createStatement();
               String sql="select User_GID from User";
               ResultSet rs=st.executeQuery(sql);
               int temp=0;
               while (rs.next()) {
                if(GID.equals(rs.getString(1))){
                    System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" Your Gmail Has Been Found "+ShowFindMyBuddy.RESET);
                    Thread.sleep(500);
                    System.out.println();
                    System.out.println(ShowFindMyBuddy.BLUE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"!Enter Your Password To Conform:-  "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BOLD+"!That's You"+ShowFindMyBuddy.RESET);
                    Thread.sleep(1000);
                    temp=1;
                }
               }
               if (temp==1) {
                Created=false;
               }
               else{
                System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Gmail Not Found"+ShowFindMyBuddy.RESET);
                Thread.sleep(500);
               }
            }
            else{
                System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Enter Valid Gmail ID"+ShowFindMyBuddy.RESET);
                Thread.sleep(500);
            }
        } while (Created);
        Created=true;
        do {
            System.out.println(ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"Enter Your Password"+ShowFindMyBuddy.RESET);
            System.out.print(ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD);
            PassWord=sc.nextLine().trim();
            System.out.println(ShowFindMyBuddy.RESET);
            Thread.sleep(500);
            if (PassWord!=null) {
                Connection conn=DBConnections.getDBConnections();
                Statement st=conn.createStatement();
                String sql="select User_Password from User";
                ResultSet rs=st.executeQuery(sql);
                int temp=0;
                while (rs.next()) {
                 if(PassWord.equals(rs.getString(1))){
                     System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" Your Password Has Been Found "+ShowFindMyBuddy.RESET);
                     Thread.sleep(3000);
                     temp=1;
                 }
                }
                if (temp==1) {
                 Created=false;
                }
                else{
                    System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Password Not Found"+ShowFindMyBuddy.RESET);
                    Thread.sleep(500);
                }
            }
            else{
                System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Enter Your Password"+ShowFindMyBuddy.RESET);
                Thread.sleep(500);
            }
        } while (Created);
        Blank.printBlank();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLUE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"==========================================================| !Congratulations |=========================================================="+ShowFindMyBuddy.RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" Your Account Has Been Found "+ShowFindMyBuddy.RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLUE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        Thread.sleep(5000);
        Thread.sleep(100);
        GameSoundOptimiser.pauseLogin();
        Thread.sleep(100);
        GameSoundOptimiser.resumeGameCenter();
        YAY.printYay();
        GameInterface.gameOptions(GID,PassWord);
    }
}

class CreateNewAccount {
    static void newUser()throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println(ShowFindMyBuddy.BLUE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"=======================================| If You Are New User So Pls Create Account To Play Game |======================================="+ShowFindMyBuddy.RESET);
        Boolean Created=true;
        String GID;
        String PassWord;
        String Name;
        String Country;
        do {
            System.out.println(ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"Enter Your Gmail ID"+ShowFindMyBuddy.RESET);
            System.out.print(ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD);
            GID=sc.nextLine().trim();
            Thread.sleep(500);
            System.out.println(ShowFindMyBuddy.RESET);
            if (GID!=null&& GID.endsWith("@gmail.com")&& !GID.equals("@gmail.com")) {
               Connection conn=DBConnections.getDBConnections();
               Statement st=conn.createStatement();
               String sql="select User_GID from User";
               ResultSet rs=st.executeQuery(sql);
               int temp=0;
               while (rs.next()) {
                if(GID.equals(rs.getString(1))){
                    System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Account already Existed"+ShowFindMyBuddy.RESET);
                    Thread.sleep(500);
                    temp=1;
                }
               }
               if (temp==0) {
                Created=false;
               }
            }
            else{
                System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Enter Valid Gmail ID"+ShowFindMyBuddy.RESET);
                Thread.sleep(500);
            }
        } while (Created);
        Created=true;
        Thread.sleep(500);
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLUE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println();
        System.out.println();
        do {
            System.out.println(ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"Enter Your Name"+ShowFindMyBuddy.RESET);
            System.out.print(ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD);
            Name=sc.nextLine().trim();
            System.out.println(ShowFindMyBuddy.RESET);
            Thread.sleep(500);
            if (Name != null && !Name.trim().isEmpty()) {
                Connection conn=DBConnections.getDBConnections();
                Statement st=conn.createStatement();
                String sql="select Profile_Name from Profile";
                ResultSet rs=st.executeQuery(sql);
                int temp=0;
                while (rs.next()) {
                 if(Name.equals(rs.getString(1))){
                     System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Name Already Existed"+ShowFindMyBuddy.RESET);
                     Thread.sleep(500);
                     temp=1;
                 }
                }
                if (temp==0) {
                 Created=false;
                }
            }
            else{
                System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Enter Your Name"+ShowFindMyBuddy.RESET);
                Thread.sleep(500);
            }
        } while (Created);
        Created=true;
        Thread.sleep(500);
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLUE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println();
        System.out.println();
        Thread.sleep(2000);
        do {
            Countries.printCountries();
            System.out.println(ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"Enter Your Country Between 1 to 10"+ShowFindMyBuddy.RESET);
            System.out.println();
            System.out.print(ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD);
            Country=sc.nextLine().trim();
            Thread.sleep(500);
            System.out.println(ShowFindMyBuddy.RESET);
            int temp=0;
            if (Country!=null) {
                if(Country.equals("1")){
                    Country="United States";
                    temp=1;
                }
                else if(Country.equals("2")){
                    Country="Brazil";
                    temp=1;
                }
                else if(Country.equals("3")){
                    Country="Germany";
                    temp=1;
                }
                else if(Country.equals("4")){
                    Country="India";
                    temp=1;
                }
                else if(Country.equals("5")){
                    Country="Japan";
                    temp=1;
                }
                else if(Country.equals("6")){
                    Country="South Africa";
                    temp=1;
                }
                else if(Country.equals("7")){
                    Country="Austalia";
                    temp=1;
                }
                else if(Country.equals("8")){
                    Country="China";
                    temp=1;
                }
                else if(Country.equals("9")){
                    Country="Soudi Arabia";
                    temp=1;
                }
                else if(Country.equals("10")){
                    Country="United Kingdom";
                    temp=1;
                }
                else{
                    System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Enter Your Country"+ShowFindMyBuddy.RESET);
                    Thread.sleep(500);
                }
                if (temp==1) {
                    Created=false;
                }
            }
            else{
                System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Enter Your Country"+ShowFindMyBuddy.RESET);
                Thread.sleep(500);
            }
        } while (Created);
        Created=true;
        Thread.sleep(500);
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLUE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println();
        System.out.println();
        int conform=0;
        do {
            System.out.println(ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"Enter Your Password"+ShowFindMyBuddy.RESET);
            System.out.print(ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD);
            PassWord=sc.nextLine().trim();
            Thread.sleep(500);
            System.out.println(ShowFindMyBuddy.RESET);
            Connection conn=DBConnections.getDBConnections();
            Statement st=conn.createStatement();
            String sql1="select User_Password from User";
            ResultSet rs1=st.executeQuery(sql1); 
            while (rs1.next()) {
                if (PassWord.equals(rs1.getString(1))) {
                    conform=1;
                    break;
                }
            }
            if (conform==1) {
                System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Password Already Existed"+ShowFindMyBuddy.RESET);
                conform=0;
                Thread.sleep(1000);
            }
            else if (PassWord != null && !PassWord.trim().isEmpty()) {
                Thread.sleep(500);
                System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" Wait "+ShowFindMyBuddy.RESET);
                Thread.sleep(2000);
                Blank.printBlank();
                System.out.println();
                System.out.println();
                System.out.println(ShowFindMyBuddy.BLUE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"==========================================================| !Congratulations |=========================================================="+ShowFindMyBuddy.RESET);
                System.out.println();
                System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" Your Account Has Been Created "+ShowFindMyBuddy.RESET);
                System.out.println();
                System.out.println(ShowFindMyBuddy.BLUE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
                System.out.println();
                System.out.println();
                Thread.sleep(3000);
                YAY.printYay();
                ReturnToMainPage.getReturn();
                Created=false;
            }
            else{
                System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!Enter Your Password"+ShowFindMyBuddy.RESET);
                Thread.sleep(500);
            }
        } while (Created);
        Connection conn=DBConnections.getDBConnections();
        Statement st=conn.createStatement();
        String sql="insert into User(User_GID,User_PassWord) values('"+GID+"','"+PassWord+"')";
        String sql1 = "INSERT INTO `Rank`(`Rank_rank`, `Rank_GID`) VALUES(0, '" + GID + "')";
        String sql2="insert into Profile(Profile_GID,Profile_Name,Profile_Country) values('"+GID+"','"+Name+"','"+Country+"')";
        st.executeUpdate(sql);
        st.executeUpdate(sql1);
        st.executeUpdate(sql2);
    }
}
class DBConnections{
    static Connection getDBConnections()throws Exception{
        String dbURL="jdbc:mysql://localhost:3306/FindMyBuddyServer";
        String dbUser="root";
        String dbPass="";
        Connection conn=DriverManager.getConnection(dbURL, dbUser, dbPass);
        return conn;
    }
}

class Play{
    static int counterForHistory=1;
    static void PlayGame(String GID)throws Exception{
        Connection conn=DBConnections.getDBConnections();
        Statement st=conn.createStatement();
        String sql="select Rank_rank from Rank where Rank_GID='"+GID+"'";
        ResultSet rs=st.executeQuery(sql);
        rs.next();
        int curruntRank=rs.getInt(1);
        Rank.setRank(curruntRank);
        Rank.setGID(GID);
        String curruntMadelStatus;
        String win="00";
        String lose="00";
        String chances="10";
        int winCount=0;
        int loseCount=0;
        int max=3;
		int min=1;
        int rank=0;
		int rand;
        GameRule.showGameRule();
        GameCountDown.showCountDown();
        for (int i = 1; i <= 10; i++) {
        if (i==6) {
            Thread.sleep(100);
            GameSoundOptimiser.pauseGamePlayForFirstHalf();
            Thread.sleep(100);
            GameSoundOptimiser.playGamePlaySoundForSecondHalf();
        }
         rand=(int)(Math.random()*((max-min)+1)+min);
         GameAnimation.cupAnimation(chances,win,lose);
         String input=ManyInputs.getManyInputs();
         if (input==null) {
            if (rand==1) {
                Thread.sleep(100);
                GameSoundOptimiser.playGameEnd();
                GameAnimation.buddyInFirstCupAnimationForNotRespond();
            }
            else if (rand==2) {
                Thread.sleep(100);
                GameSoundOptimiser.playGameEnd();
                GameAnimation.buddyInSecondCupAnimationForNotRespond();
            }
            else if (rand==3) {
                Thread.sleep(100);
                GameSoundOptimiser.playGameEnd();
                GameAnimation.buddyInThirdCupAnimationForNotRespond();
            }
            loseCount++;
            rank=rank-5;
         }
         else if (Integer.parseInt(input)==rand) {
            if (rand==1) {
                Thread.sleep(100);
                GameSoundOptimiser.playGameEnd();
                GameAnimation.buddyInFirstCupAnimationForWon();
            }
            else if (rand==2) {
                Thread.sleep(100);
                GameSoundOptimiser.playGameEnd();
                GameAnimation.buddyInSecondCupAnimationForWon();
            }
            else if (rand==3) {
                Thread.sleep(100);
                GameSoundOptimiser.playGameEnd();
                GameAnimation.buddyInThirdCupAnimationForWon();
            }
            winCount++;
            rank=rank+10;
         }
         else if (Integer.parseInt(input)!=rand) {
            if (rand==1) {
                Thread.sleep(100);
                GameSoundOptimiser.playGameEnd();
                GameAnimation.buddyInFirstCupAnimationForLoose();
            }
            else if (rand==2) {
                Thread.sleep(100);
                GameSoundOptimiser.playGameEnd();
                GameAnimation.buddyInSecondCupAnimationForLoose();
            }
            else if (rand==3) {
                Thread.sleep(100);
                GameSoundOptimiser.playGameEnd();
                GameAnimation.buddyInThirdCupAnimationForLoose();
            }
            loseCount++;
            rank=rank-2;
         }
         if (winCount==10) {
            win=Integer.toString(winCount);
         }
         else{
            win="0"+Integer.toString(winCount);
         }
         if (loseCount==10) {
            lose=Integer.toString(loseCount);
         }
         else{
            lose="0"+Integer.toString(loseCount);
         }
         chances="0"+(10-i);
        }
        if (curruntRank+rank>0) {
           String sql1="update Rank set Rank_rank='"+(curruntRank+rank)+"'where Rank_GID='"+GID+"'";
           st.executeUpdate(sql1);
           curruntMadelStatus=RankController.getRankInMadelsWithAnimation((curruntRank+rank), curruntRank);
        }
        else{
           String sql1="update Rank set Rank_rank='"+0+"'where Rank_GID='"+GID+"'";
           st.executeUpdate(sql1);
           curruntMadelStatus=RankController.getRankInMadelsWithAnimation(0, curruntRank);
        }
        String pushForHistory=ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND+"     "+ShowFindMyBuddy.YELLOW+counterForHistory+"     "+ShowFindMyBuddy.GREEN+"WIN:     "+win+"     "+ShowFindMyBuddy.RED+"LOSE:     "+lose+"    "+ShowFindMyBuddy.YELLOW+" RANK:     "+curruntMadelStatus+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD;
        GameHistoryData.push(pushForHistory);
        counterForHistory++;
        Thread.sleep(100);
        GameSoundOptimiser.pauseGamePlayForSecondHalf();
        Thread.sleep(100);
        GameSoundOptimiser.resumeGameCenter();
        YAY.printYay();
    }
    static void GameHistory(String GID)throws Exception{
        GameHistoryData.display();
        Thread.sleep(100);
        GameSoundOptimiser.pauseGameOptions();
        Thread.sleep(100);
        GameSoundOptimiser.resumeGameCenter();
        YAY.printYay();
    }
    static void Profile(String GID)throws Exception{
        Connection conn=DBConnections.getDBConnections();
        Statement st=conn.createStatement();
        String sql1="select Profile_Name, Profile_Country from Profile where Profile_GID='"+GID+"'";
        String sql2="select Rank_rank from Rank where Rank_GID='"+GID+"'";
        ResultSet rs1=st.executeQuery(sql1);
        rs1.next();
        String Name=rs1.getString(1);
        String Country=rs1.getString(2);
        Thread.sleep(100);
        ResultSet rs2=st.executeQuery(sql2);
        rs2.next();
        int Rank=rs2.getInt(1);
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========");
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+"=|Profile!:=-"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"======================================================================================================================================="+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+" ║ "+ShowFindMyBuddy.GREEN+"NAME.   "+ShowFindMyBuddy.BLUE+"║     "+ShowFindMyBuddy.CYAN+Name);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+" ╚════*════╝ "+ShowFindMyBuddy.RED+"=|"+ShowFindMyBuddy.YELLOW+"------------------------------------------------------------------------------------------------------------------------"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+" ║ "+ShowFindMyBuddy.GREEN+"GID.    "+ShowFindMyBuddy.BLUE+"║     "+ShowFindMyBuddy.CYAN+GID);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+" ╚════*════╝ "+ShowFindMyBuddy.RED+"=|"+ShowFindMyBuddy.YELLOW+"------------------------------------------------------------------------------------------------------------------------"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+" ║ "+ShowFindMyBuddy.GREEN+"COUNTRY."+ShowFindMyBuddy.BLUE+"║     "+ShowFindMyBuddy.CYAN+Country);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+" ╚════*════╝ "+ShowFindMyBuddy.RED+"=|"+ShowFindMyBuddy.YELLOW+"------------------------------------------------------------------------------------------------------------------------"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+" ║ "+ShowFindMyBuddy.GREEN+"RANK.   "+ShowFindMyBuddy.BLUE+"║     "+ShowFindMyBuddy.CYAN+Rank);
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
        if (Rank<25) {
            Madels.MiddleBeginner();
        }
        else if (Rank>=25&&Rank<50) {
            Madels.MiddleBronze();
        }
        else if (Rank>=50&&Rank<75) {
            Madels.MiddleSliver(); 
        }
        else if (Rank>=75&&Rank<100) {
            Madels.MiddleGold();
        }
        else if (Rank>=100&&Rank<125) {
            Madels.MiddleDiamond();
        }
        else if (Rank>=125&&Rank<150) {
            Madels.MiddleMythic();
        }
        else if (Rank>=150&&Rank<175) {
            Madels.MiddleMaster();
        }
        else if (Rank>=175) {
            Madels.MiddleGrandMaster();
        }
        System.out.println(ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╔═════════════════════════╗");
        System.out.println(ShowFindMyBuddy.PURPLE+"║ "+ShowFindMyBuddy.RED+"EXIT"+ShowFindMyBuddy.BLUE+"><><><><><"+ShowFindMyBuddy.CYAN+"><><><><><"+ShowFindMyBuddy.PURPLE+"║");
        System.out.println(ShowFindMyBuddy.PURPLE+"╚═════════════════════════╝");
        System.out.println();
        ExitFromRandom.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
        GameSoundOptimiser.pauseGameOptions();
        Thread.sleep(200);
        GameSoundOptimiser.resumeGameCenter();
        YAY.printYay();
    }
    static void LeaderBoard(String GID)throws Exception{
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        System.out.println();
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+"Top 10 Players In The Game!"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"======================================================================================================================================="+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND);
        TextSetter.getPremiumText(GID);
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.PURPLE+"╔═════════════════════════╗");
        System.out.println(ShowFindMyBuddy.PURPLE+"║ "+ShowFindMyBuddy.RED+"EXIT"+ShowFindMyBuddy.BLUE+"><><><><><"+ShowFindMyBuddy.CYAN+"><><><><><"+ShowFindMyBuddy.PURPLE+"║");
        System.out.println(ShowFindMyBuddy.PURPLE+"╚═════════════════════════╝");
        System.out.println();
        ExitFromRandom.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
        GameSoundOptimiser.pauseGameOptions();
        Thread.sleep(200);
        GameSoundOptimiser.resumeGameCenter();
        YAY.printYay();
    }
    static void Setting(String GID)throws Exception{
        Scanner sc=new Scanner(System.in);
        String SettingChoice;
        int show=0;
    do {
        GameSettingPage.getGameSettingPage();
        Thread.sleep(1000);
        if (show==1) {
        System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLACK+"Enter Valid Choice"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
        System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
            Thread.sleep(500);
            show=0;
        }
        else{
        System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"Enter Your Choice"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
        System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
        }
        SettingChoice=sc.nextLine().trim();
        System.out.println(ShowFindMyBuddy.RESET);
        Thread.sleep(500);
        System.out.println();
        if((SettingChoice).equals("1")){
            YAY.printYay();
            Settings.updateName(GID);
        }
        else if((SettingChoice).equals("2")){
            YAY.printYay();
            Settings.updatePassword(GID);
        }
        else if((SettingChoice).equals("3")){
            YAY.printYay();
            GameSoundOptimiser.playGameRankUp();
            Thread.sleep(100);
            Settings.showGameCredits();
        }
        else if((SettingChoice).equals("4")){
            Thread.sleep(100);
            GameSoundOptimiser.pauseGameOptions();
            Thread.sleep(100);
            GameSoundOptimiser.resumeGameCenter();
            YAY.printYay();
        }
        else{
         show=1;
        }
      } while (!(SettingChoice).equals("4"));
    }
    static boolean Exit(String GID)throws Exception{
        Scanner sc=new Scanner(System.in);
        String exitChoice;
        int show=0;
    do {
        GameExitPage.getGameExitPage();
        Thread.sleep(1000);
        if (show==1) {
        System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLACK+"Enter Valid Choice"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
        System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
            Thread.sleep(500);
            show=0;
        }
        else{
        System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"Enter Your Choice"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
        System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
        }
        exitChoice=sc.nextLine().trim();
        System.out.println(ShowFindMyBuddy.RESET);
        Thread.sleep(500);
        System.out.println();
        if((exitChoice).equals("1")){
            Blank.printBlank();
            Design.printDesign();
            System.out.println();
            System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"Preapering For Logout"+ShowFindMyBuddy.RESET);
            System.out.println();
            Thread.sleep(3000);
            System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"Saving all Progress"+ShowFindMyBuddy.RESET);
            System.out.println();
            Thread.sleep(1000);
            System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"wait"+ShowFindMyBuddy.RESET);
            System.out.println();
            Thread.sleep(2000);
            System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"All Set"+ShowFindMyBuddy.RESET);
            System.out.println();
            Design.printDesign();
            Thread.sleep(5000);
            Thread.sleep(100);
            GameSoundOptimiser.pauseGameOptions();
            Thread.sleep(100);
            GameSoundOptimiser.playLogin();
            YAY.printYay();
            return false;
        }
        else if((exitChoice).equals("2")){
            Thread.sleep(100);
            GameSoundOptimiser.pauseGameOptions();
            Thread.sleep(100);
            GameSoundOptimiser.resumeSystemEnd();
            ThankYou.printThankYou();
            Blank.printBlank();
            Thread.sleep(100);
            GameSoundOptimiser.stopSound();
            System.exit(0);
        }
        else if((exitChoice).equals("3")){
            YAY.printYay();
            Thread.sleep(100);
            GameSoundOptimiser.pauseGameOptions();
            Thread.sleep(100);
            GameSoundOptimiser.resumeGameCenter();
        }
        else{
         show=1;
        }
     } while (!(exitChoice).equals("3"));
     return true;
    }
}
class GameInterface{
   static void gameOptions(String GID,String PassWord)throws Exception{
    Scanner sc=new Scanner(System.in);
    String scoendChoice;
    boolean logout=true;
    int show=0;
    do {
        GameCenterPage.getGameCenterPage();
        if (show==1) {
            System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLACK+"Enter Valid Choice"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
            System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
            show=0;
        }
        else{
            System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+"Enter Your Choice"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
            System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
        }
        scoendChoice=sc.nextLine().trim();
        System.out.println(ShowFindMyBuddy.RESET);
        Thread.sleep(500);
        System.out.println();
        if((scoendChoice).equals("1")){
            GameSoundOptimiser.pauseGameCenter();
            Thread.sleep(150);
            GameSoundOptimiser.resumeGamePlayForFirstHalf();
            Thread.sleep(150);
            YAY.printYay();
            Play.PlayGame(GID);
        }
        else if((scoendChoice).equals("2")){
            Thread.sleep(100);
            GameSoundOptimiser.pauseGameCenter();
            Thread.sleep(100);
            GameSoundOptimiser.resumeGameOptions();
            YAY.printYay();
            Play.LeaderBoard(GID);
        }
        else if((scoendChoice).equals("3")){
            Thread.sleep(100);
            GameSoundOptimiser.pauseGameCenter();
            Thread.sleep(100);
            GameSoundOptimiser.resumeGameOptions();
            YAY.printYay();
            Play.GameHistory(GID);
        }
        else if((scoendChoice).equals("4")){
            Thread.sleep(100);
            GameSoundOptimiser.pauseGameCenter();
            Thread.sleep(100);
            GameSoundOptimiser.resumeGameOptions();
            YAY.printYay();
            Play.Profile(GID);
        }
        else if((scoendChoice).equals("5")){
            Thread.sleep(100);
            GameSoundOptimiser.pauseGameCenter();
            Thread.sleep(100);
            GameSoundOptimiser.resumeGameOptions();
            YAY.printYay();
            Play.Setting(GID);
        }
        else if((scoendChoice).equals("6")){
            Thread.sleep(100);
            GameSoundOptimiser.pauseGameCenter();
            Thread.sleep(100);
            GameSoundOptimiser.resumeGameOptions();
            YAY.printYay();
            logout=Play.Exit(GID);
        }
        else{
         show=1;
        }
     } while (logout);
     ReturnToMainPage.getReturn();
   }
}
class Settings{
    public static void updateName(String GID)throws Exception{
    Scanner sc=new Scanner(System.in);
    String updateName;
    int show=0;
    do {
        GameSettingPage.getUpdateNamePage();;
        if (show==1) {
            Thread.sleep(1000);
            System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLACK+"Name Not Updated!"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
            Thread.sleep(3000);
            show=0;
            YAY.printYay();
            return;
        }
        else if(show==2){
            Thread.sleep(1000);
            System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLACK+"Name Already Existed!"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
            System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
            show=0;
        }
        else if(show==3){
            Thread.sleep(1000);
            System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLACK+"This is Your Old Name!"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
            System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
            show=0;
        }
        else{
            Thread.sleep(1000);
            System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+"Enter New Name"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
            System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
        }
        updateName=sc.nextLine().trim();
        System.out.println();
        Thread.sleep(500);
        System.out.println();
        if (updateName==null||updateName.isEmpty()) {
            show=1;
        }
        else{
            Connection conn=DBConnections.getDBConnections();
            String sql="select Profile_Name from Profile where Profile_GID='"+GID+"'";
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            rs.next();
            String Name=rs.getString(1);
            if (Name.equals(updateName)) {
                show=3;
            }
            else{
                String sql1="select Profile_Name from Profile";
                ResultSet rs1=st.executeQuery(sql1); 
                while (rs1.next()) {
                    if (updateName.equals(rs1.getString(1))) {
                        show=2;
                        break;
                    }
                }
                if (show!=2) {
                    Thread.sleep(1000);
                    System.out.println();
                    System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+"Your Name Succesfully Updated!"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
                    System.out.println(ShowFindMyBuddy.RESET);
                    String sql2="update Profile set Profile_Name='"+updateName+"' where Profile_GID='"+GID+"'";
                    st.executeUpdate(sql2);
                    Thread.sleep(3000);
                    YAY.printYay();
                    return;
                }
            }
        }
     } while (true);
    }

    public static void updatePassword(String GID)throws Exception{
    Scanner sc=new Scanner(System.in);
    String updatePassword;
    int show=0;
    do {
        GameSettingPage.getUpdatePasswordPage();;
        if (show==1) {
            Thread.sleep(1000);
            System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLACK+"Password Not Updated!"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
            Thread.sleep(3000);
            show=0;
            YAY.printYay();
            return;
        }
        else if(show==2){
            Thread.sleep(1000);
            System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLACK+"Password Already Existed!"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
            System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
            show=0;
        }
        else if(show==3){
            Thread.sleep(1000);
            System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLACK+"This is Your Old Password!"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
            System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
            show=0;
        }
        else{
            Thread.sleep(1000);
            System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+"Enter New Password"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
            System.out.print(ShowFindMyBuddy.RED+"=> "+ShowFindMyBuddy.PURPLE);
        }
        updatePassword=sc.nextLine().trim();
        System.out.println();
        Thread.sleep(500);
        System.out.println();
        if (updatePassword==null||updatePassword.isEmpty()) {
            show=1;
        }
        else{
            Connection conn=DBConnections.getDBConnections();
            String sql="select User_Password from User where User_GID='"+GID+"'";
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            rs.next();
            String PassWord=rs.getString(1);
            if (PassWord.equals(updatePassword)) {
                show=3;
            }
            else{
                String sql1="select User_Password from User";
                ResultSet rs1=st.executeQuery(sql1); 
                while (rs1.next()) {
                    if (updatePassword.equals(rs1.getString(1))) {
                        show=2;
                        break;
                    }
                }
                if (show!=2) {
                    Thread.sleep(1000);
                    System.out.println();
                    System.out.println(ShowFindMyBuddy.YELLOW+"║║"+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+"Your Password Succesfully Updated!"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"║║");
                    System.out.println(ShowFindMyBuddy.RESET);
                    String sql2="update User set User_Password='"+updatePassword+"' where User_GID='"+GID+"'";
                    st.executeUpdate(sql2);
                    Thread.sleep(3000);
                    YAY.printYay();
                    return;
                }
            }
        }
     } while (true);
    }

    public static void showGameCredits()throws Exception{
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.RED+"Developed By :-"+ShowFindMyBuddy.YELLOW+"  THAKAR ARY DATTATREY");
        MadeInIndia.printMadeInIndia();
        System.out.println();
        System.out.println(ShowFindMyBuddy.PURPLE+"╔═════════════════════════╗");
        System.out.println(ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.RED+" EXIT"+ShowFindMyBuddy.BLUE+"><><><><><"+ShowFindMyBuddy.CYAN+"><><><><><"+ShowFindMyBuddy.PURPLE+"║");
        System.out.println(ShowFindMyBuddy.PURPLE+"╚═════════════════════════╝");
        Thread.sleep(5000);
        ExitFromRandom.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
        YAY.printYay();
    }
}
class RankController{
    public static String getRankInMadelsWithAnimation(int newRank,int curruntRank)throws Exception{
        if (newRank==curruntRank) {
            if (newRank<25) {
               return ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"BEGGINER"+ShowFindMyBuddy.RESET; 
            }
            else if (newRank>=25&&newRank<50) {
               return ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"BRONZE"+ShowFindMyBuddy.RESET;
            }
            else if (newRank>=50&&newRank<75) {
               return ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"SILVER"+ShowFindMyBuddy.RESET;
            }
            else if (newRank>=75&&newRank<100) {
               return ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"GOLD"+ShowFindMyBuddy.RESET;  
            }
            else if (newRank>=100&&newRank<125) {
               return ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"DIAMOND"+ShowFindMyBuddy.RESET; 
            }
            else if (newRank>=125&&newRank<150) {
               return ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"MYTHIC"+ShowFindMyBuddy.RESET;  
            }
            else if (newRank>=150&&newRank<175) {
                return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"MASTER"+ShowFindMyBuddy.RESET; 
            }
            else if (newRank>=175) {
                return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"GRANDMASTER"+ShowFindMyBuddy.RESET;
            }
        }
        else if (newRank>curruntRank) {
            if (newRank<25) {
                return ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"BEGGINER"+ShowFindMyBuddy.RESET; 
             }
             else if (newRank>=25&&newRank<50) {
                if (curruntRank<25) {
                    GameSoundOptimiser.playGameRankUp();
                    Thread.sleep(100);
                    Madels.showPromotionForBronze();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"PROMOTED! TO "+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"BRONZE"+ShowFindMyBuddy.RESET;
                }
                else{
                    return ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"BRONZE"+ShowFindMyBuddy.RESET;
                }
             }
             else if (newRank>=50&&newRank<75) {
                if (curruntRank<50) {
                    GameSoundOptimiser.playGameRankUp();
                    Thread.sleep(100);
                    Madels.showPromotionForSliver();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"PROMOTED! TO "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"SILVER"+ShowFindMyBuddy.RESET;
                }
                else{
                    return ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"SILVER"+ShowFindMyBuddy.RESET;
                }
             }
             else if (newRank>=75&&newRank<100) {
                if (curruntRank<75) {
                    GameSoundOptimiser.playGameRankUp();
                    Thread.sleep(100);
                    Madels.showPromotionForGold();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"PROMOTED! TO "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"GOLD"+ShowFindMyBuddy.RESET;
                }
                else{
                    return ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"GOLD"+ShowFindMyBuddy.RESET;
                }  
             }
             else if (newRank>=100&&newRank<125) {
                if (curruntRank<100) {
                    GameSoundOptimiser.playGameRankUp();
                    Thread.sleep(100);
                    Madels.showPromotionForDiamond();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"PROMOTED! TO "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"DIAMOND"+ShowFindMyBuddy.RESET; 
                }
                else{
                    return ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"DIAMOND"+ShowFindMyBuddy.RESET; 
                }  
             }
             else if (newRank>=125&&newRank<150) {
                if (curruntRank<125) {
                    GameSoundOptimiser.playGameRankUp();
                    Thread.sleep(100);
                    Madels.showPromotionForMythic();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"PROMOTED! TO "+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"MYTHIC"+ShowFindMyBuddy.RESET; 
                }
                else{
                    return ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"MYTHIC"+ShowFindMyBuddy.RESET;
                }    
             }
             else if (newRank>=150&&newRank<175) {
                if (curruntRank<150) {
                    GameSoundOptimiser.playGameRankUp();
                    Thread.sleep(100);
                    Madels.showPromotionForMaster();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"PROMOTED! TO "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"MASTER"+ShowFindMyBuddy.RESET; 
                }
                else{
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"MASTER"+ShowFindMyBuddy.RESET;
                }    
             }
             else if (newRank>=175) {
                if (curruntRank<175) {
                    GameSoundOptimiser.playGameRankUp();
                    Thread.sleep(100);
                    Madels.showPromotionForGrandMaster();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"PROMOTED! TO "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"GRANDMASTER"+ShowFindMyBuddy.RESET;
                }
                else{
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"GRANDMASTER"+ShowFindMyBuddy.RESET;
                }    
             } 
        }
        else if (newRank<curruntRank) {
            if (newRank<25) {
                if (curruntRank>=25) {
                    GameSoundOptimiser.playGameRankDown();
                    Thread.sleep(100);
                    Madels.showDemotionForBronze();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"DEMOTED! TO "+ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"BEGGINER"+ShowFindMyBuddy.RESET; 
                }
                else{
                    return ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"BEGGINER"+ShowFindMyBuddy.RESET; 
                }  
             }
             else if (newRank>=25&&newRank<50) {
                if (curruntRank>=50) {
                    GameSoundOptimiser.playGameRankDown();
                    Thread.sleep(100);
                    Madels.showDemotionForSliver();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"DEMOTED! TO "+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"BRONZE"+ShowFindMyBuddy.RESET;
                }
                else{
                    return ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"BRONZE"+ShowFindMyBuddy.RESET;
                }
             }
             else if (newRank>=50&&newRank<75) {
                if (curruntRank>=50) {
                    GameSoundOptimiser.playGameRankDown();
                    Thread.sleep(100);
                    Madels.showDemotionForGold();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"DEMOTED! TO "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"SILVER"+ShowFindMyBuddy.RESET;
                }
                else{
                    return ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"SILVER"+ShowFindMyBuddy.RESET;
                }
             }
             else if (newRank>=75&&newRank<100) {
                if (curruntRank>=100) {
                    GameSoundOptimiser.playGameRankDown();
                    Thread.sleep(100);
                    Madels.showDemotionForDiamond();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"DEMOTED! TO "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"GOLD"+ShowFindMyBuddy.RESET;
                }
                else{
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"DEMOTED! TO "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"GOLD"+ShowFindMyBuddy.RESET;
                }  
             }
             else if (newRank>=100&&newRank<125) {
                if (curruntRank>=125) {
                    GameSoundOptimiser.playGameRankDown();
                    Thread.sleep(100);
                    Madels.showDemotionForMythic();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"DEMOTED! TO "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"DIAMOND"+ShowFindMyBuddy.RESET;
                }
                else{
                    return ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"DIAMOND"+ShowFindMyBuddy.RESET;
                } 
             }
             else if (newRank>=125&&newRank<150) {
                if (curruntRank>=150) {
                    GameSoundOptimiser.playGameRankDown();
                    Thread.sleep(100);
                    Madels.showDemotionForMaster();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"DEMOTED! TO "+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"MYTHIC"+ShowFindMyBuddy.RESET;
                }
                else{
                    return ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"MYTHIC"+ShowFindMyBuddy.RESET;
                }  
             }
             else if (newRank>=150&&newRank<175) {
                if (curruntRank>=175) {
                    GameSoundOptimiser.playGameRankDown();
                    Thread.sleep(100);
                    Madels.showDemotionForGrandMaster();
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"DEMOTED! TO "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"MASTER"+ShowFindMyBuddy.RESET; 
                }
                else{
                    return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"MASTER"+ShowFindMyBuddy.RESET; 
                }
             }
             else if (newRank>=175) {
                 return ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"GRANDMASTER"+ShowFindMyBuddy.RESET;
             } 
        }
        return null;
    }
}
class GameHistoryData {
    static int top=-1;
    static int size=10;
    static int pushCount=0;
    static String element;
    static String[] stack =new String[size];
    public static void push(String element1) {
        if (top == size - 1) {
            element=element1;
            pop();
        } else {
            ++top;
            stack[top] = element1;
        }
        pushCount++;
    }
    public static void pop() {
        for(int i=0;i<10;i++){
            if(i==9){
               stack[i]=element;
            }
            else{
               stack[i]=stack[i+1];
            }
        }
    }
    public static void display()throws Exception {
        if (top == -1) {
            PlayGameForHistory.printPlayGameForHistory();  
            return;
        } else {
            System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
            System.out.println();
            System.out.println(ShowFindMyBuddy.RED_BACKGROUND+"Your Last 10 Played Matches!"+ShowFindMyBuddy.BLACK_BACKGROUND);
            System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"======================================================================================================================================="+ShowFindMyBuddy.BLACK_BACKGROUND);
            System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND);
            for (int i = top; i >=0; i--) {
            System.out.println(stack[i] + " ");
            System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+"---------------------------------------------------------------------------------------------------------------------------------------");
            }
            for (int i = 1; i < (10-pushCount); i++) {
            System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND);
            System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+"---------------------------------------------------------------------------------------------------------------------------------------");
            }
            System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.BLACK_BACKGROUND);
            System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.BLACK_BACKGROUND);
            System.out.println(ShowFindMyBuddy.PURPLE+"╔═════════════════════════╗");
            System.out.println(ShowFindMyBuddy.PURPLE+"║ "+ShowFindMyBuddy.RED+"EXIT"+ShowFindMyBuddy.BLUE+"><><><><><"+ShowFindMyBuddy.CYAN+"><><><><><"+ShowFindMyBuddy.PURPLE+"║");
            System.out.println(ShowFindMyBuddy.PURPLE+"╚═════════════════════════╝");
            ExitFromRandom.waitForEnter();
            System.out.println(ShowFindMyBuddy.RESET);
        }
    }
}
class MakeFriends{
    public static String country_01(String GID)throws Exception{
        Connection conn=DBConnections.getDBConnections();
        String sql="select Profile_Country from Profile where Profile_GID='"+GID+"'";
        Statement st=conn.createStatement();
        ResultSet rs1=st.executeQuery(sql);
        rs1.next();
        String country=rs1.getString(1);
        String beforeCountry=CircularLinkedList.getCountryBeforeCountry(country);
        return beforeCountry;
    }
    public static String country_02(String GID)throws Exception{
        Connection conn=DBConnections.getDBConnections();
        String sql="select Profile_Country from Profile where Profile_GID='"+GID+"'";
        Statement st=conn.createStatement();
        ResultSet rs1=st.executeQuery(sql);
        rs1.next();
        String country=rs1.getString(1);
        String afterCountry=CircularLinkedList.getCountryAfterCountry(country);
        return afterCountry;
    }
}
class CircularLinkedList {
    public static class Node {
        String data;
        Node next;
        
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node first = null;
    public static String getCountryBeforeCountry(String data){
        Node temp=first;
        while(!temp.next.data.equals(data)){
            temp = temp.next;
        }
        return temp.data;
    }
    public static String getCountryAfterCountry(String data){
        Node temp=first;
        while(!temp.data.equals(data)){
            temp = temp.next;
        }
        return temp.next.data;
    }
    public static void insertAtLast(String data){
         Node n = new Node(data);
         if(first == null){
         first = n;
         n.next = first;
         }
         else{
         Node temp = first;
         while(!temp.next.equals(first)){
         temp = temp.next;
         }
         temp.next = n;
         n.next = first;
        }
    }
    public static void display() {
        if (first == null) {
            System.out.println("No elements in linked list");
        } else {
            Node temp = first;
            do {
                System.out.println(temp.data);
                temp = temp.next;
            } while (!temp.equals(first));
        }
    }
}
class TextSetter{
    public static void getPremiumText(String GID)throws Exception{
        String country_01=MakeFriends.country_01(GID);
        String country_02=MakeFriends.country_02(GID);
        Connection conn=DBConnections.getDBConnections();
        String sql1="select Profile_Country from Profile where Profile_GID='"+GID+"'";
        Statement st=conn.createStatement();
        ResultSet rs1=st.executeQuery(sql1);
        rs1.next();
        String MYcountry=rs1.getString(1);
        String sql="select Rank_rank,Profile_Name,Profile_Country,Profile_GID from Rank JOIN Profile ON RANK_GID=Profile_GID ORDER BY Rank_rank DESC";
        Statement st1=conn.createStatement();
        ResultSet rs=st1.executeQuery(sql);
        int i=0;
        while (rs.next()){
            if (i<10) {
            String name=rs.getString(2);
            int temp1=rs.getInt(1);
            String rank=RankController.getRankInMadelsWithAnimation(temp1,temp1);
            String country=rs.getString(3);
            int temp=25;
            while(temp-name.length()>0){
                name=name+" ";
            }
            temp=25;
            while(temp-country.length()>0){
                country=country+" ";
            }
            if (i!=9) {
                if((country.trim().equals(MYcountry)||country.trim().equals(country_01)||country.trim().equals(country_02))&&!GID.equals(rs.getString(4))){
                    System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+" "+(i+1)+". "+ShowFindMyBuddy.RED+"Name:- "+name+ShowFindMyBuddy.CYAN+" Country:- "+""+country+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+"Friend"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"          "+" Rank:- "+rank+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
                    System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"---------------------------------------------------------------------------------------------------------------------------------------");
                }
                else{
                    System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+" "+(i+1)+". "+ShowFindMyBuddy.RED+"Name:- "+name+ShowFindMyBuddy.CYAN+" Country:- "+country+"                "+ShowFindMyBuddy.YELLOW+" Rank:- "+rank+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
                    System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"---------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
            else{
                if((country.trim().equals(MYcountry)||country.trim().equals(country_01)||country.trim().equals(country_02))&&!GID.equals(rs.getString(4))){
                    System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+""+(i+1)+". "+ShowFindMyBuddy.RED+"Name:- "+name+ShowFindMyBuddy.CYAN+" Country:- "+""+country+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+"Friend"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+"          "+" Rank:- "+rank+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
                }
                else{
                    System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+""+(i+1)+". "+ShowFindMyBuddy.RED+"Name:- "+name+ShowFindMyBuddy.CYAN+" Country:- "+country+"                "+ShowFindMyBuddy.YELLOW+" Rank:- "+rank+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
                }
            }
            }
            i++;
        }
    }
}