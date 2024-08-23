package sbmod.Fishing;

import java.util.ArrayList;

public class SeaCreatureManagerClass {
    public static void seaCreatureManager(){
        ArrayList<SeaCreature> seaCreatures = new ArrayList<SeaCreature>();
        //Squid
        //Agarimoo
        //Sea_Walker
        //Night_Squid
        //Frozen_Steve
        //Sea_Guardian
        //Nurse_Shark
        //Frosty
        //Sea_Witch
        //Scarecrow
        //Sea_Archer
        //Oasis_Rabbit
        //Oasis_Sheep
        //Blue_Shark
        //Rider_of_the_Deep
        //Grinch
        //Catfish
        //Nightmare
        //Water_Worm
        //Carrot_King
        //Sea_Leech
        //Poisoned_Water_Worm
        //Guardian_Defender
        //Flaming_Worm
        //Water_Hydra
        //Lava_Blaze
        //Abyssal_Miner
        //Great_White_Shark
        //Yeti
        //Grim_Reaper
        //Magma_Slug
        //Moogma
        //Nutcracker
        //Lava_Leech
        //Pyroclastic_Worm
        //Lava_Flame
        //Fire_Eel
        //Taurus
        //Reindrake
        //Plhlegblast
        //Thunder
        //Lord_Jarvus

    }
    public ArrayList<SeaCreature> catchable(ArrayList<SeaCreature> input)
    {
        ArrayList<SeaCreature> holder = new ArrayList<SeaCreature>();
        for(SeaCreature i: input)
        {
            if (i.canCatch()){
                holder.add(i);
            }
        }
        return holder;
    }
    public static SeaCreature spawned(String chatmessage, ArrayList<SeaCreature> catchable){
        for(SeaCreature i: catchable)
        {
            if(i.detectSpawn(chatmessage))
            {
                return i;
            }
        }
        return null;
    }
}
