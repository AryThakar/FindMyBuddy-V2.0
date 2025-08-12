//This file contains All the Textures of the game
//all methods are static so we can use and call easily.
//Warning :This All Animations Are only Work in a 27x136 size like my pc
package MyGames;
import MyGames.*;


/**
 * Game_texture
 */
public class Game_texture {

    public static void main(String[] args) {
        ReturnToMainPage.getReturn();
    }
}
//This is a class for GameTexture this class contains unicodes of colores and also This is known as 
//ANSI escape codes.
class ShowFindMyBuddy{

    //for color
    public static String RED = "\u001B[31m";
    public static String BLUE = "\u001B[34m";
    public static String RESET = "\u001B[0m";
    public static String GREEN = "\u001B[32m";
    public static String YELLOW = "\u001B[33m";
    public static String PURPLE = "\u001B[35m";
    public static String CYAN = "\u001B[36m";
    public static String BOLD = "\u001B[1m";
    public static String BLACK = "\u001B[30m";
 
    //for backGround
    public static String BLACK_BACKGROUND = "\u001B[40m";
    public static String RED_BACKGROUND = "\u001B[41m";
    public static String GREEN_BACKGROUND = "\u001B[42m";
    public static String YELLOW_BACKGROUND = "\u001B[43m";
    public static String BLUE_BACKGROUND = "\u001B[44m";
    public static String MAGENTA_BACKGROUND = "\u001B[45m";
    public static String CYAN_BACKGROUND = "\u001B[46m";
    public static String WHITE_BACKGROUND = "\u001B[47m";

    //this is known as ascii art
    public static void FIND() {
         System.out.println(WHITE_BACKGROUND+RED);
         System.out.println("******      ***     **   **    *****   ");
         System.out.println("**          ***     ***  **    **  **  ");
         System.out.println("**           *      **** **    **   ** ");
         System.out.println("******       *      ** ****    **   ** ");
         System.out.println("**           *      **  ***    **   ** ");
         System.out.println("**          ***     **   **    **  **  ");
         System.out.println("**          ***     **   **    *****   " + RESET);
     }
    public static void MY() {
         System.out.println(CYAN_BACKGROUND);
         System.out.println("**   **    **   ** ");
         System.out.println("*** ***     ** **  ");
         System.out.println("** * **      ***   ");
         System.out.println("** * **       *    ");
         System.out.println("**   **       *    ");
         System.out.println("**   **       *    ");
         System.out.println("**   **       *    " + RESET);
     }
    public static void BUDDY() {
         System.out.println(RED_BACKGROUND+CYAN);
         System.out.println("*****      **   **    *****      *****      **   ** ");
         System.out.println("**  **     **   **    **  **     **  **      ** **  ");
         System.out.println("**  **     **   **    **   **    **   **      ***   ");
         System.out.println("*****      **   **    **   **    **   **       *    ");
         System.out.println("**  **     **   **    **   **    **   **       *    ");
         System.out.println("**  **     **   **    **  **     **  **        *    ");
         System.out.println("*****       *****     *****      *****         *    " + RESET);
     }
 }
 //this class contains game Countries Image.
 class Countries{
    public static void printCountries(){
        System.out.println();
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ______________________________________________________________________ "+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                                                      |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                   1. United States (North America)                   |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                |                                     |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                |                                     |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"| 2. Brazil (South America) -----|----- 10. United Kingdom (Europe)    |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                |                                     |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                |                                     |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|       3. Germany (Europe) -----|----- 9. Saudi Arabia (Middle East)  |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                |                                     |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                |                                     |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|     4. India (South Asia) -----|----- 8. China (East Asia)           |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                |                                     |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                |                                     |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|      5. Japan (East Asia) -----|----- 7. Australia (Oceania)         |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                |                                     |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                |                                     |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                    6. South Africa (Africa)                          |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|                                                                      |"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"|______________________________________________________________________|"+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println(ShowFindMyBuddy.RESET);
        System.out.println();
    }
}
//this is design for common use
class Design{
    public static void printDesign()throws Exception{
        System.out.println();
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
        System.out.println();
    }
}
// this is a class for blank space
class Blank{
    public static void printBlank(){
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
    }
}
//this is class for Interval between to processes
 class YAY{
    public static void printYay()throws Exception{
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                    ██╗   ██╗ █████╗ ██╗   ██╗ ██╗");
        System.out.println("                                                    ██║   ██║██╔══██╗██║   ██║ ██║");
        System.out.println("                                                     ██████╔╝███████║ ██████╔╝ ██║");
        System.out.println("                                                       ██╔═╝ ██╔══██║   ██╔═╝  ██║");
        System.out.println("                                                       ██║   ██║  ██║   ██║    ██║");
        System.out.println("                                                       ╚═╝   ╚═╝  ╚═╝   ╚═╝    ╚═╝");
        System.out.println("                                                                               ╔═╗");
        System.out.println("                                                                               ╚═╝");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.RESET);
        Thread.sleep(5000);
        Thread.sleep(10);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Thread.sleep(10);
    }
}
class ReturnToMainPage{
    public static void getReturn(){
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                    ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ██████╗ ██████╗  ██████╗ ██╗");
        System.out.println("                    ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ██╔══██╗██╔══██╗██╔═══██╗██║");
        System.out.println("                    ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗      ██████╔╝██████╔╝██║   ██║██║");
        System.out.println("                    ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝      ██╔══██╗██╔══██╗██║   ██║╚═╝");
        System.out.println("                    ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗    ██████╔╝██║  ██║╚██████╔╝██╗");
        System.out.println("                     ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝    ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
    }
}
//this is a game setting page for setting purposes
class GameSettingPage{
    public static void getGameSettingPage(){
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+"==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========");
        System.out.println(")                                                                                                                                     (");
        System.out.println("( "+ShowFindMyBuddy.RED+"╔═════════════════════════╗       ╔═════════════════════════╗        ╔═════════════════════════╗        ╔═════════════════════════╗"+ShowFindMyBuddy.BLUE+" )");
        System.out.println(") "+ShowFindMyBuddy.RED+"║ "+ShowFindMyBuddy.YELLOW+"1.UPDATE NAME"+ShowFindMyBuddy.BLUE+"><><><"+ShowFindMyBuddy.CYAN+"><><>"+ShowFindMyBuddy.RED+"║       ║ "+ShowFindMyBuddy.YELLOW+"2.UPDATE PASSWORD"+ShowFindMyBuddy.CYAN+"><><"+ShowFindMyBuddy.BLUE+"><>"+ShowFindMyBuddy.RED+"║        ║ "+ShowFindMyBuddy.YELLOW+"3.GAME CREDITS"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><"+ShowFindMyBuddy.RED+"║        ║ "+ShowFindMyBuddy.YELLOW+"4.EXIT"+ShowFindMyBuddy.CYAN+"><><><><>"+ShowFindMyBuddy.BLUE+"<><><><><"+ShowFindMyBuddy.RED+"║"+ShowFindMyBuddy.BLUE+" (");
        System.out.println("( "+ShowFindMyBuddy.RED+"╚═════════════════════════╝       ╚═════════════════════════╝        ╚═════════════════════════╝        ╚═════════════════════════╝"+ShowFindMyBuddy.BLUE+" )");
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+")=====================================================================================================================================("+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
    }
    public static void getUpdateNamePage(){
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE);
        System.out.println("███████╗███████╗████████╗████████╗██╗███╗   ██╗ ██████╗ ███████╗██╗");
        System.out.println("██╔════╝██╔════╝╚══██╔══╝╚══██╔══╝██║████╗  ██║██╔════╝ ██╔════╝██║");
        System.out.println("███████╗█████╗     ██║      ██║   ██║██╔██╗ ██║██║  ███╗███████╗██║");
        System.out.println("╚════██║██╔══╝     ██║      ██║   ██║██║╚██╗██║██║   ██║╚════██║╚═╝");
        System.out.println("███████║███████╗   ██║      ██║   ██║██║ ╚████║╚██████╔╝███████║██╗");
        System.out.println("╚══════╝╚══════╝   ╚═╝      ╚═╝   ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝╚═╝");
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+"==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========");
        System.out.println();
    }
    public static void getUpdatePasswordPage(){
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE);
        System.out.println("███████╗███████╗████████╗████████╗██╗███╗   ██╗ ██████╗ ███████╗██╗");
        System.out.println("██╔════╝██╔════╝╚══██╔══╝╚══██╔══╝██║████╗  ██║██╔════╝ ██╔════╝██║");
        System.out.println("███████╗█████╗     ██║      ██║   ██║██╔██╗ ██║██║  ███╗███████╗██║");
        System.out.println("╚════██║██╔══╝     ██║      ██║   ██║██║╚██╗██║██║   ██║╚════██║╚═╝");
        System.out.println("███████║███████╗   ██║      ██║   ██║██║ ╚████║╚██████╔╝███████║██╗");
        System.out.println("╚══════╝╚══════╝   ╚═╝      ╚═╝   ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝╚═╝");
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+"==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========");
        System.out.println();
    }
}
//this is game exit page for exit or logout
class GameExitPage{
    public static void getGameExitPage(){
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+"==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========");
        System.out.println(")                                                                                                                                     (");
        System.out.println("( "+ShowFindMyBuddy.RED+"╔═════════════════════════╗                         ╔═════════════════════════╗                         ╔═════════════════════════╗"+ShowFindMyBuddy.BLUE+" )");
        System.out.println(") "+ShowFindMyBuddy.RED+"║ "+ShowFindMyBuddy.YELLOW+"1.LOGOUT"+ShowFindMyBuddy.BLUE+"><><><><"+ShowFindMyBuddy.CYAN+"><><><><"+ShowFindMyBuddy.RED+"║                         ║ "+ShowFindMyBuddy.YELLOW+"2.FINAI EXIT"+ShowFindMyBuddy.CYAN+"><><><"+ShowFindMyBuddy.BLUE+"><><><"+ShowFindMyBuddy.RED+"║                         ║ "+ShowFindMyBuddy.YELLOW+"3.EXIT"+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.RED+"║"+ShowFindMyBuddy.BLUE+" (");
        System.out.println("( "+ShowFindMyBuddy.RED+"╚═════════════════════════╝                         ╚═════════════════════════╝                         ╚═════════════════════════╝"+ShowFindMyBuddy.BLUE+" )");
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+")=====================================================================================================================================("+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
    }
}
//this is print indian flag
class MadeInIndia{
    public static void printMadeInIndia(){
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BLUE);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND);
        System.out.println("                                                                ╔═══════════╗");
        System.out.println("                                                                ║  \\  |  /  ║ ");
        System.out.println("                                                                ║   \\ | /   ║");
        System.out.println("                                          "+ShowFindMyBuddy.RED+"Made In India"+ShowFindMyBuddy.BLUE+"         ║ ---███--- ║");
        System.out.println("                                                                ║   / | \\   ║  ");
        System.out.println("                                                                ║  /  |  \\  ║ ");
        System.out.println("                                                                ╚═══════════╝"+ShowFindMyBuddy.GREEN_BACKGROUND);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"========================================================================================================================================");
    }
}
// this a interface that provide a action method to prevent Hack
interface GameActionAgainstHacker{
    public void tackAction()throws Exception;
}
//this a class that implemented by interface and also this method provides Hacker Animation
class Emergency implements GameActionAgainstHacker{
    //this a method that provides '!' Animation
    public static void Demotion() throws InterruptedException{
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                       ");
        System.out.println("                                                                  ╔══╗ ");
        System.out.println("                                                                  ║██║ ");
        System.out.println("                                                                  ║██║ ");
        System.out.println("                                                                  ║██║ ");
        System.out.println("                                                                  ║██║ ");
        System.out.println("                                                                  ║██║ ");
        System.out.println("                                                                  ╚══╝ ");
        System.out.println("                                                                  ╔══╗ ");
        System.out.println("                                                                  ╚══╝ ");
        System.out.println("                                                                       ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.RESET);
        Thread.sleep(5000);
    }
    //Hacker Animation
     public void tackAction() throws Exception{
         System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD);
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println("                                          ██╗  ██╗ █████╗  ██████╗██╗ ██╗ ███████╗██████╗  ██╗");
         System.out.println("                                          ██║  ██║██╔══██╗██╔════╝██╚██╔╝ ██╔════╝██╔══██╗ ██║");
         System.out.println("                                          ███████║███████║██║     ████║   █████╗  ██████╔╝ ██║");
         System.out.println("                                          ██╔══██║██╔══██║██║     ██╔██╚╗ ██╔══╝  ██╔══██╗ ██║");
         System.out.println("                                          ██║  ██║██║  ██║╚██████╗██║ ██║ ███████╗██║  ██║ ██║");
         System.out.println("                                          ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝ ╚═╝ ╚══════╝╚═╝  ╚═╝ ╚═╝");
         System.out.println("                                                                                           ╔═╗");
         System.out.println("                                                                                           ╚═╝");
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println(ShowFindMyBuddy.RESET);
         Thread.sleep(5000);
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         Thread.sleep(100);
         System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.BOLD+"!System Shutdown In 5 Seconds"+ShowFindMyBuddy.RESET);
         Thread.sleep(2000);
         System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD);
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println("                                                                ██████╗ ");
         System.out.println("                                                                ╚════██╗");
         System.out.println("                                                                 █████╔╝");
         System.out.println("                                                                 ╚═══██╗");
         System.out.println("                                                                ██████╔╝");
         System.out.println("                                                                ╚═════╝ ");
         System.out.println("                                                                        ");
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         Thread.sleep(1000);
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println("                                                                ██████╗ ");
         System.out.println("                                                                ╚════██╗");
         System.out.println("                                                                 █████╔╝");
         System.out.println("                                                                ██╔═══╝ ");
         System.out.println("                                                                ███████╗");
         System.out.println("                                                                ╚══════╝");
         System.out.println("                                                                        ");
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         Thread.sleep(1000);
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println("                                                                   ██╗");
         System.out.println("                                                                  ███║");
         System.out.println("                                                                  ╚██║");
         System.out.println("                                                                   ██║");
         System.out.println("                                                                   ██║");
         System.out.println("                                                                   ╚═╝");
         System.out.println("                                                                      ");
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         Thread.sleep(1000);
         System.out.println(ShowFindMyBuddy.RESET);
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         GameSoundOptimiser.stopSound();
         Thread.sleep(150);
         System.exit(0);
     }
 }
//this class contain method that is call in the end of Game Execution For 'Thank You'.
class ThankYou{
    public static void printThankYou()throws Exception{
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                  Thank                ");
        System.out.println("                                                        __     ______  _    _          ");
        System.out.println("                                                        \\ \\   / / __ \\| |  | |      ");
        System.out.println("                                                         \\ \\_/ / |  | | |  | |       ");
        System.out.println("                                                          \\   /| |  | | |  | |        ");
        System.out.println("                                                           | | | |__| | |__| |         ");
        System.out.println("                                                           |_|  \\____/ \\____/        ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.RESET);
        Thread.sleep(4000);
    }
}
class PlayGameForHistory{
    public static void printPlayGameForHistory(){
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                             ██████╗ ██╗      █████╗ ██╗   ██╗     ██████╗  █████╗ ███╗   ███╗███████╗██╗");
        System.out.println("                             ██╔══██╗██║     ██╔══██╗╚██╗ ██╔╝    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝██║");
        System.out.println("                             ██████╔╝██║     ███████║ ╚████╔╝     ██║  ███╗███████║██╔████╔██║█████╗  ██║");
        System.out.println("                             ██╔═══╝ ██║     ██╔══██║  ╚██╔╝      ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  ╚═╝");
        System.out.println("                             ██║     ███████╗██║  ██║   ██║       ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗██╗");
        System.out.println("                             ╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝        ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝╚═╝");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.PURPLE+"╔═════════════════════════╗");
        System.out.println(ShowFindMyBuddy.PURPLE+"║ "+ShowFindMyBuddy.RED+"EXIT"+ShowFindMyBuddy.BLUE+"><><><><><"+ShowFindMyBuddy.CYAN+"><><><><><"+ShowFindMyBuddy.PURPLE+"║");
        System.out.println(ShowFindMyBuddy.PURPLE+"╚═════════════════════════╝");
        System.out.println();
        System.out.println();
        System.out.println();
        ExitFromRandom.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
}
//this class contains Game Exusive Designs for Game Looking More Spacial
class Design1{
    //#pattern 1
    public static void printDesign01(){
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\  /\\ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
    }
    //#pattern 2
    public static void printDesign02(){
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.PURPLE+"╔══╗  "+ShowFindMyBuddy.CYAN+"╔════╗   "+ShowFindMyBuddy.BLUE+"╔════╗   "+ShowFindMyBuddy.CYAN+"╔════╗   "+ShowFindMyBuddy.BLUE+"╔════╗   "+ShowFindMyBuddy.CYAN+"╔════╗   "+ShowFindMyBuddy.BLUE+"╔════╗   "+ShowFindMyBuddy.CYAN+"╔════╗   "+ShowFindMyBuddy.BLUE+"╔════╗   "+ShowFindMyBuddy.CYAN+"╔════╗   "+ShowFindMyBuddy.BLUE+"╔════╗   "+ShowFindMyBuddy.CYAN+"╔════╗   "+ShowFindMyBuddy.BLUE+"╔════╗   "+ShowFindMyBuddy.CYAN+"╔════╗   "+ShowFindMyBuddy.BLUE+"╔════╗  "+ShowFindMyBuddy.PURPLE+"╔══╗");
        System.out.println(ShowFindMyBuddy.PURPLE+"╚╗ ╚╗"+ShowFindMyBuddy.CYAN+"╔╝    ╚╗ "+ShowFindMyBuddy.BLUE+"╔╝    ╚╗ "+ShowFindMyBuddy.CYAN+"╔╝    ╚╗ "+ShowFindMyBuddy.BLUE+"╔╝    ╚╗ "+ShowFindMyBuddy.CYAN+"╔╝    ╚╗ "+ShowFindMyBuddy.BLUE+"╔╝    ╚╗ "+ShowFindMyBuddy.CYAN+"╔╝    ╚╗ "+ShowFindMyBuddy.BLUE+"╔╝    ╚╗ "+ShowFindMyBuddy.CYAN+"╔╝    ╚╗ "+ShowFindMyBuddy.BLUE+"╔╝    ╚╗ "+ShowFindMyBuddy.CYAN+"╔╝    ╚╗ "+ShowFindMyBuddy.BLUE+"╔╝    ╚╗ "+ShowFindMyBuddy.CYAN+"╔╝    ╚╗ "+ShowFindMyBuddy.BLUE+"╔╝    ╚╗"+ShowFindMyBuddy.PURPLE+"╔╝ ╔╝");
        System.out.println(ShowFindMyBuddy.PURPLE+" ╚╗ ╚"+ShowFindMyBuddy.CYAN+"╝      ╚╗"+ShowFindMyBuddy.BLUE+"╝      ╚╗"+ShowFindMyBuddy.CYAN+"╝      ╚╗"+ShowFindMyBuddy.BLUE+"╝      ╚╗"+ShowFindMyBuddy.CYAN+"╝      ╚╗"+ShowFindMyBuddy.BLUE+"╝      ╚╗"+ShowFindMyBuddy.CYAN+"╝      ╚╗"+ShowFindMyBuddy.BLUE+"╝      ╚╗"+ShowFindMyBuddy.CYAN+"╝      ╚╗"+ShowFindMyBuddy.BLUE+"╝      ╚╗"+ShowFindMyBuddy.CYAN+"╝      ╚╗"+ShowFindMyBuddy.BLUE+"╝      ╚╗"+ShowFindMyBuddy.CYAN+"╝      ╚╗"+ShowFindMyBuddy.BLUE+"╝      ╚"+ShowFindMyBuddy.PURPLE+"╝ ╔╝");
        System.out.println(ShowFindMyBuddy.PURPLE+" ╔╝ ╔"+ShowFindMyBuddy.CYAN+"╗      ╔╝"+ShowFindMyBuddy.BLUE+"╗      ╔╝"+ShowFindMyBuddy.CYAN+"╗      ╔╝"+ShowFindMyBuddy.BLUE+"╗      ╔╝"+ShowFindMyBuddy.CYAN+"╗      ╔╝"+ShowFindMyBuddy.BLUE+"╗      ╔╝"+ShowFindMyBuddy.CYAN+"╗      ╔╝"+ShowFindMyBuddy.BLUE+"╗      ╔╝"+ShowFindMyBuddy.CYAN+"╗      ╔╝"+ShowFindMyBuddy.BLUE+"╗      ╔╝"+ShowFindMyBuddy.CYAN+"╗      ╔╝"+ShowFindMyBuddy.BLUE+"╗      ╔╝"+ShowFindMyBuddy.CYAN+"╗      ╔╝"+ShowFindMyBuddy.BLUE+"╗      ╔"+ShowFindMyBuddy.PURPLE+"╗ ╚╗");
        System.out.println(ShowFindMyBuddy.PURPLE+"╔╝ ╔╝"+ShowFindMyBuddy.CYAN+"╚╗    ╔╝ "+ShowFindMyBuddy.BLUE+"╚╗    ╔╝ "+ShowFindMyBuddy.CYAN+"╚╗    ╔╝ "+ShowFindMyBuddy.BLUE+"╚╗    ╔╝ "+ShowFindMyBuddy.CYAN+"╚╗    ╔╝ "+ShowFindMyBuddy.BLUE+"╚╗    ╔╝ "+ShowFindMyBuddy.CYAN+"╚╗    ╔╝ "+ShowFindMyBuddy.BLUE+"╚╗    ╔╝ "+ShowFindMyBuddy.CYAN+"╚╗    ╔╝ "+ShowFindMyBuddy.BLUE+"╚╗    ╔╝ "+ShowFindMyBuddy.CYAN+"╚╗    ╔╝ "+ShowFindMyBuddy.BLUE+"╚╗    ╔╝ "+ShowFindMyBuddy.CYAN+"╚╗    ╔╝ "+ShowFindMyBuddy.BLUE+"╚╗    ╔╝"+ShowFindMyBuddy.PURPLE+"╚╗ ╚╗");
        System.out.println(ShowFindMyBuddy.PURPLE+"╚══╝  "+ShowFindMyBuddy.CYAN+"╚════╝   "+ShowFindMyBuddy.BLUE+"╚════╝   "+ShowFindMyBuddy.CYAN+"╚════╝   "+ShowFindMyBuddy.BLUE+"╚════╝   "+ShowFindMyBuddy.CYAN+"╚════╝   "+ShowFindMyBuddy.BLUE+"╚════╝   "+ShowFindMyBuddy.CYAN+"╚════╝   "+ShowFindMyBuddy.BLUE+"╚════╝   "+ShowFindMyBuddy.CYAN+"╚════╝   "+ShowFindMyBuddy.BLUE+"╚════╝   "+ShowFindMyBuddy.CYAN+"╚════╝   "+ShowFindMyBuddy.BLUE+"╚════╝   "+ShowFindMyBuddy.CYAN+"╚════╝   "+ShowFindMyBuddy.BLUE+"╚════╝  "+ShowFindMyBuddy.PURPLE+"╚══╝");
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"* * * ============================================================================================================================ * * *"+ShowFindMyBuddy.RESET);
    }
}
//this is a class for 'Welcome' Animation
class Welcome{
    public static void printWelcome(){
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD);
        System.out.println("                                          __        __   _                            _        ");
        System.out.println("                                          \\ \\      / /__| | ___ ___  _ __ ___   ___  | |_ ___  ");
        System.out.println("                                           \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\ ");
        System.out.println("                                            \\ V  V /  __/ | (_| (_) | | | | | |  __/ | || (_) |");
        System.out.println("                                             \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/ ");
        System.out.print(ShowFindMyBuddy.RESET);
    }
}
//this is a class for 'YouLose' Animation
class YouLose{
    public static void printYouLose(){
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);
		System.out.println("                                          __     ______  _    _   _      ____   _____ ______ ");
        System.out.println("			                  \\ \\   / / __ \\| |  | | | |    / __ \\ / ____|  ____|");
        System.out.println("				           \\ \\_/ / |  | | |  | | | |   | |  | | (___ | |__   ");
        System.out.println("				            \\   /| |  | | |  | | | |   | |  | |\\___ \\|  __|  ");
        System.out.println("				             | | | |__| | |__| | | |___| |__| |____) | |____ ");
        System.out.println("					     |_|  \\____/ \\____/  |______\\____/|_____/|______|");
		System.out.print(ShowFindMyBuddy.RESET);
    }
}
//this is a class for 'YouWin' Animation
class YouWin{
    public static void printYouWin(){
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD);
		System.out.println("                                          __     ______  _    _   __          _______ _   _ ");
        System.out.println("	                                  \\ \\   / / __ \\| |  | |  \\ \\        / /_   _| \\ | |");
        System.out.println("				           \\ \\_/ / |  | | |  | |   \\ \\  /\\  / /  | | |  \\| |");
        System.out.println("				            \\   /| |  | | |  | |    \\ \\/  \\/ /   | | | . ` |");
        System.out.println("				             | | | |__| | |__| |     \\  /\\  /   _| |_| |\\  |");
        System.out.println("			                     |_|  \\____/ \\____/       \\/  \\/   |_____|_| \\_|");
		System.out.print(ShowFindMyBuddy.RESET);
    }
}
// this a class for Game Count down for game.
class GameCountDown{
    public static void showCountDown()throws Exception{
    
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                ██████╗ ");
        System.out.println("                                                                ╚════██╗");
        System.out.println("                                                                 █████╔╝");
        System.out.println("                                                                 ╚═══██╗");
        System.out.println("                                                                ██████╔╝");
        System.out.println("                                                                ╚═════╝ ");
        System.out.println("                                                                        ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Thread.sleep(1000);
        System.out.print(ShowFindMyBuddy.YELLOW);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                ██████╗ ");
        System.out.println("                                                                ╚════██╗");
        System.out.println("                                                                 █████╔╝");
        System.out.println("                                                                ██╔═══╝ ");
        System.out.println("                                                                ███████╗");
        System.out.println("                                                                ╚══════╝");
        System.out.println("                                                                        ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Thread.sleep(1000);
        System.out.print(ShowFindMyBuddy.RED);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                   ██╗");
        System.out.println("                                                                  ███║");
        System.out.println("                                                                  ╚██║");
        System.out.println("                                                                   ██║");
        System.out.println("                                                                   ██║");
        System.out.println("                                                                   ╚═╝");
        System.out.println("                                                                      ");;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Thread.sleep(1000);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                             ███████╗████████╗ █████╗ ██████╗ ████████╗  ██╗");
        System.out.println("                                             ██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝  ██║");
        System.out.println("                                             ███████╗   ██║   ███████║██████╔╝   ██║     ██║");
        System.out.println("                                             ╚════██║   ██║   ██╔══██║██╔══██╗   ██║     ██║");
        System.out.println("                                             ███████║   ██║   ██║  ██║██║  ██║   ██║     ╚═╝");
        System.out.println("                                             ╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝     ██╗");
        System.out.println("                                                                                         ╚═╝");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.RESET);
        Thread.sleep(3000);
        
    }
}
//this a class contains The rules of our Game
class GameRule{
    public static void showGameRule(){
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD);
        System.out.println("                                                                                                                                        ");
        System.out.println(" ╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗ ");
        System.out.println(" ║ "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║ ║ ██                                          *Welcome To Find My Buddy V2.0!*                                            ██ ║ ║"+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+" ║ ");
        System.out.println(" ║                                                                                                                                    ║ ");
        System.out.println(" ║  "+ShowFindMyBuddy.YELLOW+"██"+ShowFindMyBuddy.GREEN+" This is a Game that have "+ShowFindMyBuddy.BLUE_BACKGROUND+"3"+ShowFindMyBuddy.BLACK_BACKGROUND+" cups & you have to find "+ShowFindMyBuddy.BLUE_BACKGROUND+"'The Buddy'"+ShowFindMyBuddy.BLACK_BACKGROUND+" named character that is hide in a this three cups.              "+ShowFindMyBuddy.PURPLE+"║ ");
        System.out.println(" ║                                                                                                                                    ║ ");
        System.out.println(" ║  "+ShowFindMyBuddy.YELLOW+"██"+ShowFindMyBuddy.RED+" --"+ShowFindMyBuddy.GREEN+"For Win          "+ShowFindMyBuddy.YELLOW+"██"+ShowFindMyBuddy.RED+" --"+ShowFindMyBuddy.GREEN+"For Lose          "+ShowFindMyBuddy.YELLOW+"██"+ShowFindMyBuddy.RED+" --"+ShowFindMyBuddy.GREEN+"For Not Ansered                                                                 "+ShowFindMyBuddy.PURPLE+"║ ");
        System.out.println(" ║                                                                                                                                    ║ ");
        System.out.println(" ║       "+ShowFindMyBuddy.GREEN_BACKGROUND+"    "+ShowFindMyBuddy.BLACK_BACKGROUND+"                  "+ShowFindMyBuddy.RED_BACKGROUND+"    "+ShowFindMyBuddy.BLACK_BACKGROUND+"                       "+ShowFindMyBuddy.WHITE_BACKGROUND+"    "+ShowFindMyBuddy.BLACK_BACKGROUND+"                                                                        ║ ");
        System.out.println(" ║       "+ShowFindMyBuddy.GREEN_BACKGROUND+"    "+ShowFindMyBuddy.BLACK_BACKGROUND+"                  "+ShowFindMyBuddy.RED_BACKGROUND+"    "+ShowFindMyBuddy.BLACK_BACKGROUND+"                       "+ShowFindMyBuddy.WHITE_BACKGROUND+"    "+ShowFindMyBuddy.BLACK_BACKGROUND+"                                                                        ║ ");
        System.out.println(" ║                                                                                                                                    ║ ");
        System.out.println(" ║ "+ShowFindMyBuddy.YELLOW+"██"+ShowFindMyBuddy.GREEN+" In this Game you have to answer between "+ShowFindMyBuddy.BLUE_BACKGROUND+"1 to 3"+ShowFindMyBuddy.BLACK_BACKGROUND+".                                                                                 "+ShowFindMyBuddy.PURPLE+"║ ");
        System.out.println(" ║                                                                                                                                    ║ ");
        System.out.println(" ║ "+ShowFindMyBuddy.YELLOW+"██"+ShowFindMyBuddy.GREEN+" You also have "+ShowFindMyBuddy.BLUE_BACKGROUND+"6s"+ShowFindMyBuddy.BLACK_BACKGROUND+" time limit your answer not considered & you get "+ShowFindMyBuddy.RED_BACKGROUND+"'-5'"+ShowFindMyBuddy.BLACK_BACKGROUND+"marks.                                                     "+ShowFindMyBuddy.PURPLE+"║ ");
        System.out.println(" ║                                                                                                                                    ║ ");
        System.out.println(" ║ "+ShowFindMyBuddy.YELLOW+"██"+ShowFindMyBuddy.GREEN+" In a time limit if you win you will get "+ShowFindMyBuddy.BLUE_BACKGROUND+"'+10'"+ShowFindMyBuddy.BLACK_BACKGROUND+"marks & if you lose you will get "+ShowFindMyBuddy.RED_BACKGROUND+"'-2'"+ShowFindMyBuddy.BLACK_BACKGROUND+"marks.                                        "+ShowFindMyBuddy.PURPLE+"║ ");
        System.out.println(" ║    "+ShowFindMyBuddy.WHITE_BACKGROUND+"║█"+ShowFindMyBuddy.RED+"-:)== Rank System ==(:-"+ShowFindMyBuddy.PURPLE+"█║"+ShowFindMyBuddy.BLACK_BACKGROUND+"                                                                                                     ║ ");
        System.out.println(" ║ *"+ShowFindMyBuddy.GREEN+"Beginner"+ShowFindMyBuddy.RED+"-     ║<25 ║  |  "+ShowFindMyBuddy.PURPLE+"*"+ShowFindMyBuddy.GREEN+"Mythic"+ShowFindMyBuddy.RED+"-         ║<150║"+ShowFindMyBuddy.PURPLE+"                                                                                  ║ ");
        System.out.println(" ║ *"+ShowFindMyBuddy.GREEN+"Bronze"+ShowFindMyBuddy.RED+"-       ║<50 ║  |  "+ShowFindMyBuddy.PURPLE+"*"+ShowFindMyBuddy.GREEN+"Master"+ShowFindMyBuddy.RED+"-         ║<175║"+ShowFindMyBuddy.PURPLE+"                                                                                  ║ ");
        System.out.println(" ║ *"+ShowFindMyBuddy.GREEN+"Sliver"+ShowFindMyBuddy.RED+"-       ║<75 ║  |  "+ShowFindMyBuddy.PURPLE+"*"+ShowFindMyBuddy.GREEN+"GrandMaster"+ShowFindMyBuddy.RED+"-    ║>175║"+ShowFindMyBuddy.PURPLE+"                                                                                  ║ ");
        System.out.println(" ║ *"+ShowFindMyBuddy.GREEN+"Gold"+ShowFindMyBuddy.RED+"-         ║<100║  |"+ShowFindMyBuddy.PURPLE+"                                                                                                           ║ ");
        System.out.println(" ║ *"+ShowFindMyBuddy.GREEN+"Diamond"+ShowFindMyBuddy.RED+"-      ║<125║  | "+ShowFindMyBuddy.YELLOW+"██"+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.RED_BACKGROUND+" If You Enter Invalid Choice So In This Case You Considerd As Hacker Also You Will Get '-50'Marks."+ShowFindMyBuddy.BLACK_BACKGROUND+"      ║ ");
        System.out.println(" ╚════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝ ");
        System.out.println(" ╔════════════════════════════╗                                                                                                         ");
        System.out.println(" ║"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><>"+ShowFindMyBuddy.GREEN+"Start!"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><>"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚════════════════════════════╝                                                                                                          ");
        //this thread that  give conformation for Move Ahead
        GameStart.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
}
//this is a class for GameCenter That for GameOptions
class GameCenterPage{
    public static void getGameCenterPage(){
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);
        System.out.println();
        System.out.println(ShowFindMyBuddy.YELLOW+"   ╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println(ShowFindMyBuddy.YELLOW+"   ║                                                                                                                                ║");
        System.out.println(ShowFindMyBuddy.YELLOW+"   ║"+ShowFindMyBuddy.RED+"  ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗      ██████╗  █████╗ ███╗   ███╗███████╗  "+ShowFindMyBuddy.YELLOW+"║");
        System.out.println(ShowFindMyBuddy.YELLOW+"   ║"+ShowFindMyBuddy.RED+"  ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝  "+ShowFindMyBuddy.YELLOW+"║");
        System.out.println(ShowFindMyBuddy.YELLOW+"   ║"+ShowFindMyBuddy.RED+"  ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║    ██║  ███╗███████║██╔████╔██║█████╗    "+ShowFindMyBuddy.YELLOW+"║");
        System.out.println(ShowFindMyBuddy.YELLOW+"   ║"+ShowFindMyBuddy.RED+"  ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║    ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝    "+ShowFindMyBuddy.YELLOW+"║");
        System.out.println(ShowFindMyBuddy.YELLOW+"   ║"+ShowFindMyBuddy.RED+"  ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗  "+ShowFindMyBuddy.YELLOW+"║");
        System.out.println(ShowFindMyBuddy.YELLOW+"   ║"+ShowFindMyBuddy.RED+"   ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝      ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝  "+ShowFindMyBuddy.YELLOW+"║");
        System.out.println(ShowFindMyBuddy.YELLOW+"   ╚════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
		System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========     *     =========="+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+"                                                                                                                                      "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+" "+ShowFindMyBuddy.RED+"╔═════════════════════════╗                          ╔═════════════════════════╗                         ╔═════════════════════════╗ "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+" "+ShowFindMyBuddy.RED+"║ "+ShowFindMyBuddy.YELLOW+"1.PLAY"+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.RED+"║                          ║ "+ShowFindMyBuddy.YELLOW+"2.LEADERBOARD"+ShowFindMyBuddy.CYAN+"><><><"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.RED+"║                         ║ "+ShowFindMyBuddy.YELLOW+"3.GAME HISTORY"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><"+ShowFindMyBuddy.RED+"║ "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+" "+ShowFindMyBuddy.RED+"╚═════════════════════════╝                          ╚═════════════════════════╝                         ╚═════════════════════════╝ "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+"                                                                                                                                      "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+"                                                                                                                                      "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+" "+ShowFindMyBuddy.RED+"╔═════════════════════════╗                          ╔═════════════════════════╗                         ╔═════════════════════════╗ "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+" "+ShowFindMyBuddy.RED+"║ "+ShowFindMyBuddy.YELLOW+"4.PROFILE"+ShowFindMyBuddy.CYAN+"><><><><"+ShowFindMyBuddy.BLUE+"><><><>"+ShowFindMyBuddy.RED+"║                          ║ "+ShowFindMyBuddy.YELLOW+"5.SETTINGS"+ShowFindMyBuddy.BLUE+"><><><>"+ShowFindMyBuddy.CYAN+"<><><><"+ShowFindMyBuddy.RED+"║                         ║ "+ShowFindMyBuddy.YELLOW+"6.EXIT"+ShowFindMyBuddy.CYAN+"><><><><>"+ShowFindMyBuddy.BLUE+"<><><><><"+ShowFindMyBuddy.RED+"║ "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+" "+ShowFindMyBuddy.RED+"╚═════════════════════════╝                          ╚═════════════════════════╝                         ╚═════════════════════════╝ "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"="+ShowFindMyBuddy.BLACK_BACKGROUND+"                                                                                                                                      "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+"="+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========     *     ==========");
        System.out.println();

    }
}
//this a class madels for Game Madels System
//this class Contains methods for Madels Show Animation
class Madels{
    //this are methods for Promotion of madels
    //also Demotion and Madels textures
    public static void showPromotionForBronze() throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        GameSoundOptimiser.playGameRankUp();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleBronze();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        //this is a thread for Conformation  for ahead in this class All the threads Work for same purpose.
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showDemotionForBronze()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        Design1.printDesign01();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleBronze();
        Design1.printDesign02();
        Thread.sleep(3000);
        GameSoundOptimiser.playGameRankDown();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleBeginner();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showPromotionForSliver()throws Exception{

        Madels.Demotion();
        Thread.sleep(5000);
        GameSoundOptimiser.playGameRankUp();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleSliver();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showDemotionForSliver()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        Design1.printDesign01();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleSliver();
        Design1.printDesign02();
        Thread.sleep(3000);
        GameSoundOptimiser.playGameRankDown();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleBronze();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showPromotionForGold()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        GameSoundOptimiser.playGameRankUp();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleGold();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showDemotionForGold()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        Design1.printDesign01();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleGold();
        Design1.printDesign02();
        Thread.sleep(3000);
        GameSoundOptimiser.playGameRankDown();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleSliver();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showPromotionForDiamond()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        GameSoundOptimiser.playGameRankUp();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleDiamond();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showDemotionForDiamond()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        Design1.printDesign01();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleDiamond();
        Design1.printDesign02();
        Thread.sleep(3000);
        GameSoundOptimiser.playGameRankDown();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleGold();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showPromotionForMythic()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        GameSoundOptimiser.playGameRankUp();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleMythic();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showDemotionForMythic()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        Design1.printDesign01();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleMythic();
        Design1.printDesign02();
        Thread.sleep(3000);
        GameSoundOptimiser.playGameRankDown();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleDiamond();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showPromotionForMaster()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        GameSoundOptimiser.playGameRankUp();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleMaster();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showDemotionForMaster()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        Design1.printDesign01();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleMaster();
        Design1.printDesign02();
        Thread.sleep(3000);
        GameSoundOptimiser.playGameRankDown();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleMythic();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showPromotionForGrandMaster()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        GameSoundOptimiser.playGameRankUp();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleGrandMaster();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void showDemotionForGrandMaster()throws Exception{
        Madels.Demotion();
        Thread.sleep(5000);
        Design1.printDesign01();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleGrandMaster();
        Design1.printDesign02();
        Thread.sleep(3000);
        GameSoundOptimiser.playGameRankDown();
        Welcome.printWelcome();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD);
        Madels.MiddleMaster();
        Design1.printDesign02();
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+ShowFindMyBuddy.PURPLE);
        System.out.println(" ║ "+ShowFindMyBuddy.CYAN+"ENTER."+ShowFindMyBuddy.BLUE+"><><><><>"+ShowFindMyBuddy.CYAN+"<><><><><"+ShowFindMyBuddy.PURPLE+"║                                                                                                         ");
        System.out.println(" ╚═════════════════════════╝ ");
        EndGame.waitForEnter();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void Beginner(){
        System.out.println();
        System.out.println(ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"            Beginner            "+ShowFindMyBuddy.RESET);
        System.out.println();
    }
    public static void MiddleBeginner(){
        System.out.println();
        System.out.println("                                                   "+ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.CYAN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"            Beginner            "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
    }
    public static void Bronze(){
        System.out.println();
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"            Bronze              "+ShowFindMyBuddy.RESET);
        System.out.println();
    }
    public static void MiddleBronze(){
        System.out.println();
        System.out.println("                                                   "+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.GREEN_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"            Bronze              "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
    }
    public static void Sliver(){
        System.out.println();
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"            Sliver              "+ShowFindMyBuddy.RESET);
        System.out.println();
    }
    public static void MiddleSliver(){
        System.out.println();
        System.out.println("                                                   "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.WHITE_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"            Sliver              "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
    }
    public static void Gold(){
        System.out.println();
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"             Gold               "+ShowFindMyBuddy.RESET);
        System.out.println();
    }
    public static void MiddleGold(){
        System.out.println();
        System.out.println("                                                   "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.YELLOW_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"             Gold               "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
    }
    public static void Diamond(){
        System.out.println();
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"            Diamond             "+ShowFindMyBuddy.RESET);
        System.out.println();
    }
    public static void MiddleDiamond(){
        System.out.println();
        System.out.println("                                                   "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD+"            Diamond             "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
    }
    public static void Mythic(){
        System.out.println();
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"             Mythic             "+ShowFindMyBuddy.RESET);
        System.out.println();
    }
    public static void MiddleMythic(){
        System.out.println();
        System.out.println("                                                   "+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"             Mythic             "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
    }
    public static void Master(){
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"             Master             "+ShowFindMyBuddy.RESET);
        System.out.println();
    }
    public static void MiddleMaster(){
        System.out.println();
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD+"             Master             "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
    }
    public static void GrandMaster(){
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"          GrandMaster           "+ShowFindMyBuddy.RESET);
        System.out.println();
    }
    public static void MiddleGrandMaster(){
        System.out.println();
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ╔════════════════════════════╗ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║   █████╗ ██████╗ ██╗   ██╗ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██╔══██╗██╔══██╗██║   ██║ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ███████║██████╔╝ ██████╔╝ ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██╔══██║██╔══██╗   ██╔═╝  ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ██║  ██║██║  ██║   ██║    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ║  ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ║ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+" ╚════════════════════════════╝ "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println("                                                   "+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD+"          GrandMaster           "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND);
        System.out.println();
    }
    public static void Demotion(){
        System.out.println(ShowFindMyBuddy.RED_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                       ");
        System.out.println("                                                                  ╔══╗ ");
        System.out.println("                                                                  ║██║ ");
        System.out.println("                                                                  ║██║ ");
        System.out.println("                                                                  ║██║ ");
        System.out.println("                                                                  ║██║ ");
        System.out.println("                                                                  ║██║ ");
        System.out.println("                                                                  ╚══╝ ");
        System.out.println("                                                                  ╔══╗ ");
        System.out.println("                                                                  ╚══╝ ");
        System.out.println("                                                                       ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ShowFindMyBuddy.RESET);
    }
}
//this a class that contains special animation for cups with there all possibilites like winning, loseing,
//Or Not Answering also the class contains all the possibilites for Cup possition and Buddy Hiding
//this class also contains Threads for user Conformations.
class GameAnimation{
    public static void cupAnimation(String Chances,String win,String lose){
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD);
        

        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+" ╔═══════════════════════════════════╗ ");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+" ║"+ShowFindMyBuddy.CYAN+"Your Remaining Chances:-"+ShowFindMyBuddy.PURPLE+""+Chances+"         "+ShowFindMyBuddy.BLUE+"║ ");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+" ║"+ShowFindMyBuddy.CYAN+"Your Win:-"+ShowFindMyBuddy.PURPLE+""+win+"                       "+ShowFindMyBuddy.BLUE+"║ ");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+" ║"+ShowFindMyBuddy.CYAN+"Your Lose:-"+ShowFindMyBuddy.PURPLE+""+lose+"                      "+ShowFindMyBuddy.BLUE+"║ ");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD+" ╚═══════════════════════════════════╝ ");


        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD);
        System.out.println("                                                                                                       ");
        System.out.println("                                                                                                       ");
        System.out.println("                                       ╔═══════╗               ╔═══════╗               ╔═══════╗       ");
        System.out.println("                                      ╔╝███████╚╗             ╔╝███████╚╗             ╔╝███████╚╗      ");
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.CYAN+ShowFindMyBuddy.BOLD);
		System.out.println("                                    ╔═╝█████████╚═╗         ╔═╝█████████╚═╗         ╔═╝█████████╚═╗    ");
		System.out.println("                                    ║█████████████║         ║█████████████║         ║█████████████║    ");
		System.out.println("                                    ║█████████████║         ║█████████████║         ║█████████████║    ");
		System.out.println("                                    ║█████████████║         ║█████████████║         ║█████████████║    ");
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.YELLOW+ShowFindMyBuddy.BOLD);
		System.out.println("                                    ║█████████████║         ║█████████████║         ║█████████████║    ");
		System.out.println("                                   ╔╝█████<^>█████╚╗       ╔╝█████<^>█████╚╗       ╔╝█████<^>█████╚╗   ");
		System.out.println("                                 ╔═╝███████████████╚═╗   ╔═╝███████████████╚═╗   ╔═╝███████████████╚═╗ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"   "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"   "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+" ");
        System.out.print(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD);
		System.out.println("                                 ╚═══════════════════╝   ╚═══════════════════╝   ╚═══════════════════╝ ");
		System.out.println("                                                                                                       ");
		System.out.println("                                                                                                       ");
    }
    public static void buddyInFirstCupAnimationForWon(){
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD);
		System.out.println("                                          __     ______  _    _   __          _______ _   _ ");
        System.out.println("	                                  \\ \\   / / __ \\| |  | |  \\ \\        / /_   _| \\ | |");
        System.out.println("				           \\ \\_/ / |  | | |  | |   \\ \\  /\\  / /  | | |  \\| |");
        System.out.println("				            \\   /| |  | | |  | |    \\ \\/  \\/ /   | | | . ` |");
        System.out.println("				             | | | |__| | |__| |     \\  /\\  /   _| |_| |\\  |");
        System.out.println("			                     |_|  \\____/ \\____/       \\/  \\/   |_____|_| \\_|");
        System.out.println("                                                                                                       ");
        System.out.println("                                                                                                       ");
        System.out.println("                                       "+ShowFindMyBuddy.YELLOW+"╔═══════╗               "+ShowFindMyBuddy.PURPLE+"╔═══════╗               ╔═══════╗       ");
        System.out.println("                                      "+ShowFindMyBuddy.GREEN+"╔╝███████╚╗             "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗             ╔╝███████╚╗      ");
		System.out.println("                                    "+ShowFindMyBuddy.GREEN+"╔═╝"+ShowFindMyBuddy.YELLOW+"^^"+ShowFindMyBuddy.GREEN+"█████"+ShowFindMyBuddy.YELLOW+"^^"+ShowFindMyBuddy.GREEN+"╚═╗         "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗         ╔═╝█████████╚═╗    ");
		System.out.println("                                    "+ShowFindMyBuddy.GREEN+"║████"+ShowFindMyBuddy.YELLOW+"╔═══╗"+ShowFindMyBuddy.GREEN+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.GREEN+"║████"+ShowFindMyBuddy.YELLOW+"║ * ║"+ShowFindMyBuddy.GREEN+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.GREEN+"║████"+ShowFindMyBuddy.YELLOW+"╚═══╝"+ShowFindMyBuddy.GREEN+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.GREEN+"║█████████████║         "+ShowFindMyBuddy.YELLOW+"║█████████████║         ║█████████████║    ");
		System.out.println("                                   "+ShowFindMyBuddy.GREEN+"╔╝█████"+ShowFindMyBuddy.YELLOW+"<^>"+ShowFindMyBuddy.GREEN+"█████╚╗"+ShowFindMyBuddy.YELLOW+"       ╔╝█████<^>█████╚╗       ╔╝█████<^>█████╚╗   ");
		System.out.println("                                 "+ShowFindMyBuddy.GREEN+"╔═╝███████████████╚═╗   "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗   ╔═╝███████████████╚═╗ ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"║*█*█*█*█*█*█*█*█*█*║   "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   ║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║ ");
		System.out.println("                                 "+ShowFindMyBuddy.GREEN+"╚═█═█═█═█═█═█═█═█═█═╝   "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝   ╚═══════════════════╝ ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"  * * * * * * * * *                                                   ");
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╔═══════════════════╗");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RED+"Next Try"+ShowFindMyBuddy.GREEN+":-"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><"+ShowFindMyBuddy.YELLOW+"(");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╚═══════════════════╝");
        NextTry.EnterThread();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void buddyInSecondCupAnimationForWon(){
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD);
		System.out.println("                                          __     ______  _    _   __          _______ _   _ ");
        System.out.println("	                                  \\ \\   / / __ \\| |  | |  \\ \\        / /_   _| \\ | |");
        System.out.println("				           \\ \\_/ / |  | | |  | |   \\ \\  /\\  / /  | | |  \\| |");
        System.out.println("				            \\   /| |  | | |  | |    \\ \\/  \\/ /   | | | . ` |");
        System.out.println("				             | | | |__| | |__| |     \\  /\\  /   _| |_| |\\  |");
        System.out.println("			                     |_|  \\____/ \\____/       \\/  \\/   |_____|_| \\_|");
        System.out.println("                                                                                                       ");
        System.out.println("                                                                                                       ");
        System.out.println("                                       "+ShowFindMyBuddy.PURPLE+"╔═══════╗               "+ShowFindMyBuddy.YELLOW+"╔═══════╗               "+ShowFindMyBuddy.PURPLE+"╔═══════╗       ");
        System.out.println("                                      "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗             "+ShowFindMyBuddy.GREEN+"╔╝███████╚╗             "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗      ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗         "+ShowFindMyBuddy.GREEN+"╔═╝"+ShowFindMyBuddy.YELLOW+"^^"+ShowFindMyBuddy.GREEN+"█████"+ShowFindMyBuddy.YELLOW+"^^"+ShowFindMyBuddy.GREEN+"╚═╗         "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         "+ShowFindMyBuddy.GREEN+"║████"+ShowFindMyBuddy.YELLOW+"╔═══╗"+ShowFindMyBuddy.GREEN+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         "+ShowFindMyBuddy.GREEN+"║████"+ShowFindMyBuddy.YELLOW+"║ * ║"+ShowFindMyBuddy.GREEN+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         "+ShowFindMyBuddy.GREEN+"║████"+ShowFindMyBuddy.YELLOW+"╚═══╝"+ShowFindMyBuddy.GREEN+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.YELLOW+"║█████████████║         "+ShowFindMyBuddy.GREEN+"║█████████████║         "+ShowFindMyBuddy.YELLOW+"║█████████████║    ");
		System.out.println("                                   "+ShowFindMyBuddy.YELLOW+"╔╝█████<^>█████╚╗       "+ShowFindMyBuddy.GREEN+"╔╝█████"+ShowFindMyBuddy.YELLOW+"<^>"+ShowFindMyBuddy.GREEN+"█████╚╗       "+ShowFindMyBuddy.YELLOW+"╔╝█████<^>█████╚╗   ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗   "+ShowFindMyBuddy.GREEN+"╔═╝███████████████╚═╗   "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   "+ShowFindMyBuddy.YELLOW+"║*█*█*█*█*█*█*█*█*█*║   "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝   "+ShowFindMyBuddy.GREEN+"╚═█═█═█═█═█═█═█═█═█═╝   "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝ ");
		System.out.println("                                                          "+ShowFindMyBuddy.YELLOW+" * * * * * * * * *                           ");
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╔═══════════════════╗");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RED+"Next Try"+ShowFindMyBuddy.GREEN+":-"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><"+ShowFindMyBuddy.YELLOW+"(");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╚═══════════════════╝");
        NextTry.EnterThread();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void buddyInThirdCupAnimationForWon(){
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.GREEN+ShowFindMyBuddy.BOLD);
		System.out.println("                                          __     ______  _    _   __          _______ _   _ ");
        System.out.println("	                                  \\ \\   / / __ \\| |  | |  \\ \\        / /_   _| \\ | |");
        System.out.println("				           \\ \\_/ / |  | | |  | |   \\ \\  /\\  / /  | | |  \\| |");
        System.out.println("				            \\   /| |  | | |  | |    \\ \\/  \\/ /   | | | . ` |");
        System.out.println("				             | | | |__| | |__| |     \\  /\\  /   _| |_| |\\  |");
        System.out.println("			                     |_|  \\____/ \\____/       \\/  \\/   |_____|_| \\_|");
        System.out.println("                                                                                                       ");
        System.out.println("                                                                                                       ");
        System.out.println("                                       "+ShowFindMyBuddy.PURPLE+"╔═══════╗               ╔═══════╗               "+ShowFindMyBuddy.YELLOW+"╔═══════╗       ");
        System.out.println("                                      "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗             ╔╝███████╚╗             "+ShowFindMyBuddy.GREEN+"╔╝███████╚╗      ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗         ╔═╝█████████╚═╗         "+ShowFindMyBuddy.GREEN+"╔═╝"+ShowFindMyBuddy.YELLOW+"^^"+ShowFindMyBuddy.GREEN+"█████"+ShowFindMyBuddy.YELLOW+"^^"+ShowFindMyBuddy.GREEN+"╚═╗    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.GREEN+"║████"+ShowFindMyBuddy.YELLOW+"╔═══╗"+ShowFindMyBuddy.GREEN+"████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.GREEN+"║████"+ShowFindMyBuddy.YELLOW+"║ * ║"+ShowFindMyBuddy.GREEN+"████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.GREEN+"║████"+ShowFindMyBuddy.YELLOW+"╚═══╝"+ShowFindMyBuddy.GREEN+"████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.YELLOW+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.GREEN+"║█████████████║    ");
		System.out.println("                                   "+ShowFindMyBuddy.YELLOW+"╔╝█████<^>█████╚╗       ╔╝█████<^>█████╚╗       "+ShowFindMyBuddy.GREEN+"╔╝█████"+ShowFindMyBuddy.YELLOW+"<^>"+ShowFindMyBuddy.GREEN+"█████╚╗   ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗   ╔═╝███████████████╚═╗   "+ShowFindMyBuddy.GREEN+"╔═╝███████████████╚═╗ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   ║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   "+ShowFindMyBuddy.YELLOW+"║*█*█*█*█*█*█*█*█*█*║ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝   ╚═══════════════════╝   "+ShowFindMyBuddy.GREEN+"╚═█═█═█═█═█═█═█═█═█═╝ ");
		System.out.println("                                                                                  "+ShowFindMyBuddy.YELLOW+" * * * * * * * * *   ");
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╔═══════════════════╗");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RED+"Next Try"+ShowFindMyBuddy.GREEN+":-"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><"+ShowFindMyBuddy.YELLOW+"(");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╚═══════════════════╝");
        NextTry.EnterThread();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void buddyInFirstCupAnimationForLoose(){
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);
		System.out.println("                                          __     ______  _    _   _      ____   _____ ______ ");
        System.out.println("			                  \\ \\   / / __ \\| |  | | | |    / __ \\ / ____|  ____|");
        System.out.println("				           \\ \\_/ / |  | | |  | | | |   | |  | | (___ | |__   ");
        System.out.println("				            \\   /| |  | | |  | | | |   | |  | |\\___ \\|  __|  ");
        System.out.println("				             | | | |__| | |__| | | |___| |__| |____) | |____ ");
        System.out.println("					     |_|  \\____/ \\____/  |______\\____/|_____/|______|");
        System.out.println("                                                                                                       ");
        System.out.println("                                                                                                       ");
        System.out.println("                                       "+ShowFindMyBuddy.YELLOW+"╔═══════╗               "+ShowFindMyBuddy.PURPLE+"╔═══════╗               ╔═══════╗       ");
        System.out.println("                                      "+ShowFindMyBuddy.RED+"╔╝███████╚╗             "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗             ╔╝███████╚╗      ");
		System.out.println("                                    "+ShowFindMyBuddy.RED+"╔═╝"+ShowFindMyBuddy.YELLOW+"Xx"+ShowFindMyBuddy.RED+"█████"+ShowFindMyBuddy.YELLOW+"xX"+ShowFindMyBuddy.RED+"╚═╗         "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗         ╔═╝█████████╚═╗    ");
		System.out.println("                                    "+ShowFindMyBuddy.RED+"║████"+ShowFindMyBuddy.YELLOW+"╔═══╗"+ShowFindMyBuddy.RED+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.RED+"║████"+ShowFindMyBuddy.YELLOW+"║ * ║"+ShowFindMyBuddy.RED+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.RED+"║████"+ShowFindMyBuddy.YELLOW+"╚═══╝"+ShowFindMyBuddy.RED+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.RED+"║█████████████║         "+ShowFindMyBuddy.YELLOW+"║█████████████║         ║█████████████║    ");
		System.out.println("                                   "+ShowFindMyBuddy.RED+"╔╝█████"+ShowFindMyBuddy.YELLOW+"<^>"+ShowFindMyBuddy.RED+"█████╚╗"+ShowFindMyBuddy.YELLOW+"       ╔╝█████<^>█████╚╗       ╔╝█████<^>█████╚╗   ");
		System.out.println("                                 "+ShowFindMyBuddy.RED+"╔═╝███████████████╚═╗   "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗   ╔═╝███████████████╚═╗ ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"║*█*█*█*█*█*█*█*█*█*║   "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   ║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║ ");
		System.out.println("                                 "+ShowFindMyBuddy.RED+"╚═█═█═█═█═█═█═█═█═█═╝   "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝   ╚═══════════════════╝ ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"  * * * * * * * * *                                                   ");
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╔═══════════════════╗");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RED+"Next Try"+ShowFindMyBuddy.GREEN+":-"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><"+ShowFindMyBuddy.YELLOW+"(");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╚═══════════════════╝");
        NextTry.EnterThread();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void buddyInSecondCupAnimationForLoose(){
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);
		System.out.println("                                          __     ______  _    _   _      ____   _____ ______ ");
        System.out.println("			                  \\ \\   / / __ \\| |  | | | |    / __ \\ / ____|  ____|");
        System.out.println("				           \\ \\_/ / |  | | |  | | | |   | |  | | (___ | |__   ");
        System.out.println("				            \\   /| |  | | |  | | | |   | |  | |\\___ \\|  __|  ");
        System.out.println("				             | | | |__| | |__| | | |___| |__| |____) | |____ ");
        System.out.println("					     |_|  \\____/ \\____/  |______\\____/|_____/|______|");
        System.out.println("                                                                                                       ");
        System.out.println("                                                                                                       ");
        System.out.println("                                       "+ShowFindMyBuddy.PURPLE+"╔═══════╗               "+ShowFindMyBuddy.YELLOW+"╔═══════╗               "+ShowFindMyBuddy.PURPLE+"╔═══════╗       ");
        System.out.println("                                      "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗             "+ShowFindMyBuddy.RED+"╔╝███████╚╗             "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗      ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗         "+ShowFindMyBuddy.RED+"╔═╝"+ShowFindMyBuddy.YELLOW+"Xx"+ShowFindMyBuddy.RED+"█████"+ShowFindMyBuddy.YELLOW+"xX"+ShowFindMyBuddy.RED+"╚═╗         "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         "+ShowFindMyBuddy.RED+"║████"+ShowFindMyBuddy.YELLOW+"╔═══╗"+ShowFindMyBuddy.RED+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         "+ShowFindMyBuddy.RED+"║████"+ShowFindMyBuddy.YELLOW+"║ * ║"+ShowFindMyBuddy.RED+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         "+ShowFindMyBuddy.RED+"║████"+ShowFindMyBuddy.YELLOW+"╚═══╝"+ShowFindMyBuddy.RED+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.YELLOW+"║█████████████║         "+ShowFindMyBuddy.RED+"║█████████████║         "+ShowFindMyBuddy.YELLOW+"║█████████████║    ");
		System.out.println("                                   "+ShowFindMyBuddy.YELLOW+"╔╝█████<^>█████╚╗       "+ShowFindMyBuddy.RED+"╔╝█████"+ShowFindMyBuddy.YELLOW+"<^>"+ShowFindMyBuddy.RED+"█████╚╗       "+ShowFindMyBuddy.YELLOW+"╔╝█████<^>█████╚╗   ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗   "+ShowFindMyBuddy.RED+"╔═╝███████████████╚═╗   "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   "+ShowFindMyBuddy.YELLOW+"║*█*█*█*█*█*█*█*█*█*║   "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝   "+ShowFindMyBuddy.RED+"╚═█═█═█═█═█═█═█═█═█═╝   "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝ ");
		System.out.println("                                                          "+ShowFindMyBuddy.YELLOW+" * * * * * * * * *                           ");
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╔═══════════════════╗");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RED+"Next Try"+ShowFindMyBuddy.GREEN+":-"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><"+ShowFindMyBuddy.YELLOW+"(");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╚═══════════════════╝");
        NextTry.EnterThread();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void buddyInThirdCupAnimationForLoose(){
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);
		System.out.println("                                          __     ______  _    _   _      ____   _____ ______ ");
        System.out.println("			                  \\ \\   / / __ \\| |  | | | |    / __ \\ / ____|  ____|");
        System.out.println("				           \\ \\_/ / |  | | |  | | | |   | |  | | (___ | |__   ");
        System.out.println("				            \\   /| |  | | |  | | | |   | |  | |\\___ \\|  __|  ");
        System.out.println("				             | | | |__| | |__| | | |___| |__| |____) | |____ ");
        System.out.println("					     |_|  \\____/ \\____/  |______\\____/|_____/|______|");
        System.out.println("                                                                                                       ");
        System.out.println("                                                                                                       ");
        System.out.println("                                       "+ShowFindMyBuddy.PURPLE+"╔═══════╗               ╔═══════╗               "+ShowFindMyBuddy.YELLOW+"╔═══════╗       ");
        System.out.println("                                      "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗             ╔╝███████╚╗             "+ShowFindMyBuddy.RED+"╔╝███████╚╗      ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗         ╔═╝█████████╚═╗         "+ShowFindMyBuddy.RED+"╔═╝"+ShowFindMyBuddy.YELLOW+"Xx"+ShowFindMyBuddy.RED+"█████"+ShowFindMyBuddy.YELLOW+"xX"+ShowFindMyBuddy.RED+"╚═╗    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.RED+"║████"+ShowFindMyBuddy.YELLOW+"╔═══╗"+ShowFindMyBuddy.RED+"████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.RED+"║████"+ShowFindMyBuddy.YELLOW+"║ * ║"+ShowFindMyBuddy.RED+"████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.RED+"║████"+ShowFindMyBuddy.YELLOW+"╚═══╝"+ShowFindMyBuddy.RED+"████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.YELLOW+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.RED+"║█████████████║    ");
		System.out.println("                                   "+ShowFindMyBuddy.YELLOW+"╔╝█████<^>█████╚╗       ╔╝█████<^>█████╚╗       "+ShowFindMyBuddy.RED+"╔╝█████"+ShowFindMyBuddy.YELLOW+"<^>"+ShowFindMyBuddy.RED+"█████╚╗   ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗   ╔═╝███████████████╚═╗   "+ShowFindMyBuddy.RED+"╔═╝███████████████╚═╗ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   ║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   "+ShowFindMyBuddy.YELLOW+"║*█*█*█*█*█*█*█*█*█*║ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝   ╚═══════════════════╝   "+ShowFindMyBuddy.RED+"╚═█═█═█═█═█═█═█═█═█═╝ ");
		System.out.println("                                                                                  "+ShowFindMyBuddy.YELLOW+" * * * * * * * * *   ");
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╔═══════════════════╗");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RED+"Next Try"+ShowFindMyBuddy.GREEN+":-"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><"+ShowFindMyBuddy.YELLOW+"(");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╚═══════════════════╝");
        NextTry.EnterThread();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void buddyInFirstCupAnimationForNotRespond(){
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);
		System.out.println("                                          __     ______  _    _   _      ____   _____ ______ ");
        System.out.println("			                  \\ \\   / / __ \\| |  | | | |    / __ \\ / ____|  ____|");
        System.out.println("				           \\ \\_/ / |  | | |  | | | |   | |  | | (___ | |__   ");
        System.out.println("				            \\   /| |  | | |  | | | |   | |  | |\\___ \\|  __|  ");
        System.out.println("				             | | | |__| | |__| | | |___| |__| |____) | |____ ");
        System.out.println("					     |_|  \\____/ \\____/  |______\\____/|_____/|______|");
        System.out.println("                                                                                                       ");
        System.out.println("                                                                                                       ");
        System.out.println("                                       "+ShowFindMyBuddy.YELLOW+"╔═══════╗               "+ShowFindMyBuddy.PURPLE+"╔═══════╗               ╔═══════╗       ");
        System.out.println("                                      "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔╝███████╚╗             "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗             ╔╝███████╚╗      ");
		System.out.println("                                    "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔═╝"+ShowFindMyBuddy.YELLOW+"##"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"█████"+ShowFindMyBuddy.YELLOW+"##"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╚═╗         "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗         ╔═╝█████████╚═╗    ");
		System.out.println("                                    "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║████"+ShowFindMyBuddy.YELLOW+"╔═══╗"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║████"+ShowFindMyBuddy.YELLOW+"║ * ║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║████"+ShowFindMyBuddy.YELLOW+"╚═══╝"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║█████████████║         "+ShowFindMyBuddy.YELLOW+"║█████████████║         ║█████████████║    ");
		System.out.println("                                   "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔╝█████"+ShowFindMyBuddy.YELLOW+"<^>"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"█████╚╗"+ShowFindMyBuddy.YELLOW+"       ╔╝█████<^>█████╚╗       ╔╝█████<^>█████╚╗   ");
		System.out.println("                                 "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔═╝███████████████╚═╗   "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗   ╔═╝███████████████╚═╗ ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"║*█*█*█*█*█*█*█*█*█*║   "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   ║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║ ");
		System.out.println("                                 "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╚═█═█═█═█═█═█═█═█═█═╝   "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝   ╚═══════════════════╝ ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"  * * * * * * * * *                                                   ");
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╔═══════════════════╗");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RED+"Next Try"+ShowFindMyBuddy.GREEN+":-"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><"+ShowFindMyBuddy.YELLOW+"(");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╚═══════════════════╝");
        NextTry.EnterThread();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void buddyInSecondCupAnimationForNotRespond(){
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);
		System.out.println("                                          __     ______  _    _   _      ____   _____ ______ ");
        System.out.println("			                  \\ \\   / / __ \\| |  | | | |    / __ \\ / ____|  ____|");
        System.out.println("				           \\ \\_/ / |  | | |  | | | |   | |  | | (___ | |__   ");
        System.out.println("				            \\   /| |  | | |  | | | |   | |  | |\\___ \\|  __|  ");
        System.out.println("				             | | | |__| | |__| | | |___| |__| |____) | |____ ");
        System.out.println("					     |_|  \\____/ \\____/  |______\\____/|_____/|______|");
        System.out.println("                                                                                                       ");
        System.out.println("                                                                                                       ");
        System.out.println("                                       "+ShowFindMyBuddy.PURPLE+"╔═══════╗               "+ShowFindMyBuddy.YELLOW+"╔═══════╗               "+ShowFindMyBuddy.PURPLE+"╔═══════╗       ");
        System.out.println("                                      "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗             "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔╝███████╚╗             "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗      ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗         "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔═╝"+ShowFindMyBuddy.YELLOW+"##"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"█████"+ShowFindMyBuddy.YELLOW+"##"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╚═╗         "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║████"+ShowFindMyBuddy.YELLOW+"╔═══╗"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║████"+ShowFindMyBuddy.YELLOW+"║ * ║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║████"+ShowFindMyBuddy.YELLOW+"╚═══╝"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"████║         "+ShowFindMyBuddy.CYAN+"║█████████████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.YELLOW+"║█████████████║         "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║█████████████║         "+ShowFindMyBuddy.YELLOW+"║█████████████║    ");
		System.out.println("                                   "+ShowFindMyBuddy.YELLOW+"╔╝█████<^>█████╚╗       "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔╝█████"+ShowFindMyBuddy.YELLOW+"<^>"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"█████╚╗       "+ShowFindMyBuddy.YELLOW+"╔╝█████<^>█████╚╗   ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗   "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔═╝███████████████╚═╗   "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   "+ShowFindMyBuddy.YELLOW+"║*█*█*█*█*█*█*█*█*█*║   "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝   "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╚═█═█═█═█═█═█═█═█═█═╝   "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝ ");
		System.out.println("                                                          "+ShowFindMyBuddy.YELLOW+" * * * * * * * * *                           ");
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╔═══════════════════╗");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RED+"Next Try"+ShowFindMyBuddy.GREEN+":-"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><"+ShowFindMyBuddy.YELLOW+"(");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╚═══════════════════╝");
        NextTry.EnterThread();
        System.out.println(ShowFindMyBuddy.RESET);
    }
    public static void buddyInThirdCupAnimationForNotRespond(){
        System.out.print(ShowFindMyBuddy.MAGENTA_BACKGROUND+ShowFindMyBuddy.BLACK+ShowFindMyBuddy.BOLD+"========================================================================================================================================"+ShowFindMyBuddy.RESET);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BLUE+ShowFindMyBuddy.BOLD);
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.RED+ShowFindMyBuddy.BOLD);
		System.out.println("                                          __     ______  _    _   _      ____   _____ ______ ");
        System.out.println("			                  \\ \\   / / __ \\| |  | | | |    / __ \\ / ____|  ____|");
        System.out.println("				           \\ \\_/ / |  | | |  | | | |   | |  | | (___ | |__   ");
        System.out.println("				            \\   /| |  | | |  | | | |   | |  | |\\___ \\|  __|  ");
        System.out.println("				             | | | |__| | |__| | | |___| |__| |____) | |____ ");
        System.out.println("					     |_|  \\____/ \\____/  |______\\____/|_____/|______|");
        System.out.println("                                                                                                       ");
        System.out.println("                                                                                                       ");
        System.out.println("                                       "+ShowFindMyBuddy.PURPLE+"╔═══════╗               ╔═══════╗               "+ShowFindMyBuddy.YELLOW+"╔═══════╗       ");
        System.out.println("                                      "+ShowFindMyBuddy.PURPLE+"╔╝███████╚╗             ╔╝███████╚╗             "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔╝███████╚╗      ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"╔═╝█████████╚═╗         ╔═╝█████████╚═╗         "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔═╝"+ShowFindMyBuddy.YELLOW+"##"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"█████"+ShowFindMyBuddy.YELLOW+"##"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╚═╗    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║████"+ShowFindMyBuddy.YELLOW+"╔═══╗"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║████"+ShowFindMyBuddy.YELLOW+"║ * ║"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.CYAN+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║████"+ShowFindMyBuddy.YELLOW+"╚═══╝"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"████║    ");
		System.out.println("                                    "+ShowFindMyBuddy.YELLOW+"║█████████████║         ║█████████████║         "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"║█████████████║    ");
		System.out.println("                                   "+ShowFindMyBuddy.YELLOW+"╔╝█████<^>█████╚╗       ╔╝█████<^>█████╚╗       "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔╝█████"+ShowFindMyBuddy.YELLOW+"<^>"+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"█████╚╗   ");
		System.out.println("                                 "+ShowFindMyBuddy.YELLOW+"╔═╝███████████████╚═╗   ╔═╝███████████████╚═╗   "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╔═╝███████████████╚═╗ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   ║"+ShowFindMyBuddy.BLUE+"███████████████████"+ShowFindMyBuddy.PURPLE+"║   "+ShowFindMyBuddy.YELLOW+"║*█*█*█*█*█*█*█*█*█*║ ");
		System.out.println("                                 "+ShowFindMyBuddy.PURPLE+"╚═══════════════════╝   ╚═══════════════════╝   "+ShowFindMyBuddy.RESET+ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.BOLD+"╚═█═█═█═█═█═█═█═█═█═╝ ");
		System.out.println("                                                                                  "+ShowFindMyBuddy.YELLOW+" * * * * * * * * *   ");
        System.out.println();
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╔═══════════════════╗");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"║"+ShowFindMyBuddy.RED+"Next Try"+ShowFindMyBuddy.GREEN+":-"+ShowFindMyBuddy.BLUE+"><><>"+ShowFindMyBuddy.CYAN+"<><><"+ShowFindMyBuddy.YELLOW+"(");
        System.out.println(ShowFindMyBuddy.BLACK_BACKGROUND+ShowFindMyBuddy.PURPLE+ShowFindMyBuddy.BOLD+"╚═══════════════════╝");
        NextTry.EnterThread();
        System.out.println(ShowFindMyBuddy.RESET);
    }
}
