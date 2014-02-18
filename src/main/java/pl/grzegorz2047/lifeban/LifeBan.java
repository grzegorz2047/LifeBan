/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.grzegorz2047.lifeban;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import pl.grzegorz2047.lifeban.commands.LifeBanCommand;

/**
 *
 * @author Grzegorz
 */
public class LifeBan extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("LifeBan").setExecutor(new LifeBanCommand());
        System.out.println(this.getName()+" zostal wlaczony");
    }

    @Override
    public void onDisable() {
        System.out.println(this.getName()+" zostal wylaczony");
    }


    
    
    
}
