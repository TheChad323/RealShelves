package org.vortexport.realshelves;

import org.bukkit.Material;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.inventory.ItemStack;

public class RealShelvesPlayerListener extends PlayerListener
{
    private RealShelves plugin;
    public RealShelvesPlayerListener(RealShelves plugin)
    {
        this.plugin = plugin;
    }


    @Override
    public void onPlayerInteract(PlayerInteractEvent event)
    {
        if(!event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || !event.getClickedBlock().getType().equals(Material.BOOKSHELF)) return;

        event.getPlayer().setItemInHand(new ItemStack(Material.BOOK,1));

        event.getPlayer().sendMessage("You just pulled a book off the shelf");

    }

}