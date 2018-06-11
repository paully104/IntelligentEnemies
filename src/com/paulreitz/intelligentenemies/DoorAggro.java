package com.paulreitz.intelligentenemies;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.material.Door;

public class DoorAggro implements Listener {

    @EventHandler
    public void onDoorOpen(PlayerInteractEvent e)
    {

        if(e.getClickedBlock() == null)
        {

        }
        else if(e.getClickedBlock().toString().contains("DOOR"))
        {

           System.out.println("Door interaction");
            Player p = e.getPlayer();
            for(Entity en : p.getNearbyEntities(10,10,10))
            {
                if(en instanceof Monster)
                {

                    ((Monster) en).setTarget(p);

                }

            }


        }
        else
        {
            System.out.println(e.getClickedBlock().getType());

        }



    }

}
