package me.thutson3876.soundplayer.commands;

import org.bukkit.command.TabExecutor;

public interface CommandInterface extends TabExecutor {
	  String getCommandName();
	  
	  String[] getAliases();
	  
	  boolean hasAliases();
	  
	  String getDescription();
}
