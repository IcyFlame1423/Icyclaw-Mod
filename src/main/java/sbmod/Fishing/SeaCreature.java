package sbmod.Fishing;


public class SeaCreature{
    //identifier of seacreature
    private String name;
    private String spawnMessage;
    private int fishLevelReq;

    //event conditions
    private boolean spooky;
    private boolean jerry;
    private boolean crimsonIsle;
    private boolean marina;
    //might add crystal hollows and oasis

    //water/lava condition
    private boolean lava;
    //add water if there exists a seacreature that could be caught in both lava or water

    //time condition
    private boolean night;
    private boolean day;

    //bait condition
    private String bait; //might remove bc only 2 have bait reg
    //additional variables for the conditions to fish it e.g. water/lava

    public SeaCreature(String nam, String spawnMessag, int fishLevelRe){
        name = nam;
        spawnMessage = spawnMessag;
        fishLevelReq=fishLevelRe;
        spooky=true;
        jerry=true;
        crimsonIsle = false;
        marina=true;
        lava=false;
        night=true;
        day=true;
        bait=null;
    }
    public SeaCreature(String nam, String spawnMessag, int fishLevelRe, boolean spook, boolean jerr, boolean crimsonIsl, boolean marin, boolean lav, boolean nigh, boolean da, String bai){
        name = nam;
        spawnMessage = spawnMessag;
        fishLevelReq=fishLevelRe;
        spooky=spook;
        jerry=jerr;
        crimsonIsle = crimsonIsl;
        marina=marin;
        lava=lav;
        night=nigh;
        day=da;
        bait=bai;
    }
    public SeaCreature(String nam, String spawnMessag, int fishLevelRe, boolean lav){
        name = nam;
        spawnMessage = spawnMessag;
        fishLevelReq=fishLevelRe;
        spooky=true;
        jerry=true;
        crimsonIsle = false;
        marina=true;
        lava=lav;
        night=true;
        day=true;
        bait=null;
    }

    public String setSpawnMessage(){
        return spawnMessage;
    }
    public String getName(){
        return name;
    }
    public int getFishLevelReq(){
        return fishLevelReq;
    }
    public boolean canCatch(){
        //returns whether or not sea creature can spawn
        return false;//place holder
    }

    public boolean detectSpawn(String formatted){
        //if statement for if the spawnmessage is said in chat, returns true if the spawn message is said.
        //code will be run 3 seconds after rod is pulled and checks the last 5 seconds of messages
        //subject to change because of potentially high runtime and requires to check all fishing mobs
        //may identify mods fishable under current conditions
        return formatted==spawnMessage;
    }


}